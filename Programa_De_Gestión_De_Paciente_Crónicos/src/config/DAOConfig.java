package config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import view.Login;

public class DAOConfig {
    private String uri = "mongodb+srv://taller:prueba@cluster0.n3abd.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
    private MongoCollection<Document> collection;

    public DAOConfig(String Collection){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("applicationDB");
        collection = database.getCollection(Collection);
    }
	
    public MongoCollection<Document> getCollection(){
        return collection;
    }
    
    public static void main(String[] args) {
        Login Login = new Login();
        Login.setVisible(true);
    }
}
