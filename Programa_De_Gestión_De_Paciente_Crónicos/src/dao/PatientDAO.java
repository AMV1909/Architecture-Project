package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import config.DAOConfig;
import java.util.ArrayList;
import model.Patient;
import org.bson.Document;
import org.bson.conversions.Bson;

public class PatientDAO {
    private DAOConfig daoConfig = null;
    private MongoCollection<Document> collection = null;

    public PatientDAO() {
        daoConfig = new DAOConfig("patients"); //Put the name of the collection you wanna access
        collection = daoConfig.getCollection();
    }
	
    //This is for save one document, you have to create one document with all the fields you wanna save
    public void SavePatient(Patient object){
        InsertOneResult result = collection.insertOne(new Document()
            .append("Name", object.getName())
            .append("Lastnames", object.getLastnames())
            .append("Age", object.getAge())
            .append("TypeDocument", object.getTypeDocument())
            .append("Document", object.getDocument())
            .append("Address", object.getAddress())
            .append("City", object.getCity())
            .append("Phone", object.getPhone())
            .append("Contact", new Document() //You can create documents into another document
                .append("Name", object.getContact().getName())
                .append("Address", object.getContact().getAddress())
                .append("Phone", object.getContact().getPhone())
                .append("Relationship", object.getContact().getRelationship())));
        
        System.out.println("Success! Inserted document id: " + result.getInsertedId());
    }
	
    /*This is for find one document, you have to create one document with some of the information of the document you wanna find, then you have to
      use the method find() passing as paramether the document you created*/
    public Document Find(String TypeDocument, String Document){
        Document item = new Document();
        item.put("TypeDocument", TypeDocument);
        item.put("Document", Document);
        
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
    public boolean Modify(Document doc, Patient object){
        boolean Modified = false;
        
        Bson item = doc.toBsonDocument(); //Convert the Document to BsonDocument
        
	//Create one document with all new and old fields
        Document update = new Document()
            .append("Name", object.getName())
            .append("Lastnames", object.getLastnames())
            .append("Age", object.getAge())
            .append("TypeDocument", object.getTypeDocument())
            .append("Document", object.getDocument())
            .append("Address", object.getAddress())
            .append("City", object.getCity())
            .append("Phone", object.getPhone())
            .append("Contact", new Document() //You have to create also the documents into the document if you want the estructure be the same
                .append("Name", object.getContact().getName())
                .append("Address", object.getContact().getAddress())
                .append("Phone", object.getContact().getPhone())
                .append("Relationship", object.getContact().getRelationship()));
        
        try{
            collection.findOneAndReplace(item, update); //Use the method findOneAndReplace passing as paramethers the BsonDocument and the updated Document
            Modified = true;
            System.out.println("Success! Document updated");
        }catch(Exception e){
            System.out.println(e);
        }
        
        return Modified;
    }
	
    //This method is for delete on document, like update, you gotta have the document you wanna delete
    public boolean Delete(Document doc){
        boolean Deleted = false;
        
        Bson item = doc.toBsonDocument(); //Convert the Document to BsonDocument
        
        try{
            collection.findOneAndDelete(item); //Use the method findOneAndDelete passing as paramether the BsonDocument
            Deleted = true;
            System.out.println("Success! Document deleted");
        }catch(Exception e){
            System.out.println(e);
        }
        
        return Deleted;
    }
	
    //This is for return in an ArrayList all the documents of one collection
    public ArrayList<Document> getAllPatients(){
        return collection.find().into(new ArrayList<Document>());
    }
}
