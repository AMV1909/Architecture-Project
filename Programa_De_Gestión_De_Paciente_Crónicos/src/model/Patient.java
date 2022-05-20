package model;

public class Patient {
    private String Name;
    private String Lastnames;
    private int Age;
    private String TypeDocument;
    private String Document;
    private String Address;
    private String City;
    private String Phone;
    private Contact Contact;

    public Patient() {}

    public Patient(String Name, String Lastnames, int Age, String TypeDocument, String Document, String Address, String City, String Phone, Contact Contact) {
        this.Name = Name;
        this.Lastnames = Lastnames;
        this.Age = Age;
        this.TypeDocument = TypeDocument;
        this.Document = Document;
        this.Address = Address;
        this.City = City;
        this.Phone = Phone;
        this.Contact = Contact;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastnames() {
        return Lastnames;
    }

    public void setLastnames(String Lastnames) {
        this.Lastnames = Lastnames;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Contact getContact() {
        return Contact;
    }

    public void setContact(Contact Contact) {
        this.Contact = Contact;
    }

    public String getTypeDocument() {
        return TypeDocument;
    }

    public void setTypeDocument(String TypeDocument) {
        this.TypeDocument = TypeDocument;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String Document) {
        this.Document = Document;
    }
}