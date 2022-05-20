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
        daoConfig = new DAOConfig("patients");
        collection = daoConfig.getCollection();
    }
	
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
            .append("Contact", new Document()
                .append("Name", object.getContact().getName())
                .append("Address", object.getContact().getAddress())
                .append("Phone", object.getContact().getPhone())
                .append("Relationship", object.getContact().getRelationship())));
        
        System.out.println("Success! Inserted document id: " + result.getInsertedId());
    }
	
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
	
    public boolean Modify(Document doc, Patient object){
        boolean Modified = false;
        
        Bson item = doc.toBsonDocument();
        
        Document update = new Document()
            .append("Name", object.getName())
            .append("Lastnames", object.getLastnames())
            .append("Age", object.getAge())
            .append("TypeDocument", object.getTypeDocument())
            .append("Document", object.getDocument())
            .append("Address", object.getAddress())
            .append("City", object.getCity())
            .append("Phone", object.getPhone())
            .append("Contact", new Document()
                .append("Name", object.getContact().getName())
                .append("Address", object.getContact().getAddress())
                .append("Phone", object.getContact().getPhone())
                .append("Relationship", object.getContact().getRelationship()));
        
        try{
            collection.findOneAndReplace(item, update);
            Modified = true;
            System.out.println("Success! Document updated");
        }catch(Exception e){
            System.out.println(e);
        }
        
        return Modified;
    }
	
    public boolean Delete(Document doc){
        boolean Deleted = false;
        
        Bson item = doc.toBsonDocument();
        
        try{
            collection.findOneAndDelete(item);
            Deleted = true;
            System.out.println("Success! Document deleted");
        }catch(Exception e){
            System.out.println(e);
        }
        
        return Deleted;
    }
	
    public ArrayList<Document> getAllPatients(){
        return collection.find().into(new ArrayList<Document>());
    }
}
