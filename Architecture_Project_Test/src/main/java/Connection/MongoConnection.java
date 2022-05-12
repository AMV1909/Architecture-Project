package Connection;

import Classes.Appoinment;
import Classes.Contact;
import Classes.Employee;
import Classes.Patient;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import java.awt.List;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class MongoConnection {
    private String  uri = "mongodb+srv://taller:prueba@cluster0.n3abd.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
    private MongoCollection<Document> collection;
    
    public MongoConnection(String Collection){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("applicationDB");
        collection = database.getCollection(Collection);
    }
    
    public void SaveEmployee(Employee object){
        InsertOneResult result = collection.insertOne(new Document()
            .append("Name", object.getName())
            .append("Document", object.getDocument())
            .append("User", object.getUser())
            .append("Password", object.getPassword()));
        
        System.out.println("Success! Inserted document id: " + result.getInsertedId());
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
    
    public boolean Login(boolean Admin, String User, String Password){
        boolean login = false;
        
        if(Admin){
            Document item = new Document();
            item.put("User", User);
            item.put("Password", Password);
            
            Document doc = null;
            
            try{
                doc = collection.find(item).first();
                System.out.println(doc.toJson());
                login = true;
            }catch(Exception e){
                System.out.println(e);
            }
        }else{
            Document item = new Document();
            item.put("User", User);
            item.put("Password", Password);
            
            Document doc = null;
            
            try{
                doc = collection.find(item).first();
                System.out.println(doc.toJson());
                login = true;
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
        return login;
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
    
    public boolean Mofidy(Document doc, Patient object){
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
    
    public void SaveApoinment(Appoinment object){
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
    
    public void SetImpressions(Document doc, String Diagnostic, String Impressions){
        Bson item = doc.toBsonDocument();
        
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
            collection.findOneAndReplace(item, update);
            System.out.println("Success! Impressions inserted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public ArrayList<Document> getAllPatients(){
        return collection.find().into(new ArrayList<Document>());
    }

    public ArrayList<Document> getAllDates() {
        return collection.find().into(new ArrayList<Document>());
    }
}