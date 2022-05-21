package config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import view.Login;

public class DAOConfig {
    private String uri = ""; //Put the link of the MongoDB Cluster where is hosted your database
    private MongoCollection<Document> collection;

    public DAOConfig(String Collection){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase(""); //Put the name of your database
        collection = database.getCollection(Collection);
    }
	
    public MongoCollection<Document> getCollection(){
        return collection;
    }
    
//I was programming in Netbeans, so, this is for initialize the application
    public static void main(String[] args) {
        Login Login = new Login();
        Login.setVisible(true);
    }
}
