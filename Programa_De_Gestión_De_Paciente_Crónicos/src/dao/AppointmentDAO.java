package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import config.DAOConfig;
import java.util.ArrayList;
import model.Appointment;
import org.bson.Document;
import org.bson.conversions.Bson;

public class AppointmentDAO {
    private DAOConfig daoConfig = null;
    private MongoCollection<Document> collection = null;

    public AppointmentDAO() {
        daoConfig = new DAOConfig(""); //Put the name of the collection you wanna access
        collection = daoConfig.getCollection();
    }
	
    //This is for save one document, you have to create one document with all the fields you wanna save
    public void SaveApoinment(Appointment object){
        InsertOneResult result = collection.insertOne(new Document()
            .append("TypeDocument", object.getTypeDocument())
            .append("Document", object.getDocument())
            .append("Date", object.getDate())
            .append("Hour", object.getHour())
            .append("Consultory", object.getConsultory())
            .append("Doctor", object.getDoctor())
            .append("Diagnostic", "")
            .append("Impressions", ""));

        System.out.println("Success! Inserted document id: " + result.getInsertedId());
    }
	
    /*This is for find one document, you have to create one document with some of the information of the document you wanna find, then you have to
      use the method find() passing as paramether the document you created*/
    public Document FindDate(String TypeDocument, String Document, String Date){
        Document item = new Document();
        item.put("TypeDocument", TypeDocument);
        item.put("Document", Document);
        item.put("Date", Date);

        Document doc = null;

        try{
            doc = collection.find(item).first();
            System.out.println(doc.toJson());
        }catch(Exception e){
            System.out.println(e);
        }

        return doc;
    }
    
    //This is for update, first of all, you gotta have the document you wanna update, you can use the previous method for that
    public void SetImpressions(Document doc, String Diagnostic, String Impressions){
        Bson item = doc.toBsonDocument(); //Convert the Document to BsonDocument
        
	//Create one document with all new and old fields
        Document update = new Document()
            .append("TypeDocument", doc.get("TypeDocument"))
            .append("Document", doc.get("Document"))
            .append("Date", doc.get("Date"))
            .append("Hour", doc.get("Hour"))
            .append("Consultory", doc.get("Consultory"))
            .append("Doctor", doc.get("Doctor"))
            .append("Diagnostic", Diagnostic)
            .append("Impressions", Impressions);
        
        try{
            collection.findOneAndReplace(item, update); //Use the method findOneAndReplace passing as paramethers the BsonDocument and the updated Document
            System.out.println("Success! Impressions inserted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    //This is for return in an ArrayList all the documents of one collection
    public ArrayList<Document> getAllDates() {
        return collection.find().into(new ArrayList<Document>());
    }
}
