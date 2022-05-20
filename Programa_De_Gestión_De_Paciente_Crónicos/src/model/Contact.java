package model;

public class Contact {
    private String Name;
    private String Address;
    private String Phone;
    private String Relationship;

    public Contact() {}

    public Contact(String Name, String Address, String Phone, String Relationship) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Relationship = Relationship;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getRelationship() {
        return Relationship;
    }

    public void setRelationship(String Relationship) {
        this.Relationship = Relationship;
    }
}