package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import config.DAOConfig;
import model.Employee;
import org.bson.Document;

public class EmployeeDAO {
    private DAOConfig daoConfig = null;
    private MongoCollection<Document> collection = null;

    public EmployeeDAO() {
        daoConfig = new DAOConfig("employees"); //Put the name of the collection you wanna access
        collection = daoConfig.getCollection();
    }
	
    //This is for save one document, you have to create one document with all the fields you wanna save
    public void SaveEmployee(Employee object){
        InsertOneResult result = collection.insertOne(new Document()
            .append("Name", object.getName())
            .append("Document", object.getDocument())
            .append("User", object.getUser())
            .append("Password", object.getPassword()));
        
        System.out.println("Success! Inserted document id: " + result.getInsertedId());
    }
	
    //This method works like the method find, it's just pass the credentials of the employee and verify if someone has that credentials
    public boolean Login(String User, String Password){
        Document item = new Document();
        item.put("User", User);
        item.put("Password", Password);
            
        Document doc = null;
        
        try{
            doc = collection.find(item).first();
            System.out.println(doc.toJson());
        }catch(Exception e){
            System.out.println(e);
        }
        
        return doc != null;
    }
}
