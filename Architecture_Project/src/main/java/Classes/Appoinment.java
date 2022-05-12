package Classes;

import java.util.Date;

public class Appoinment {
    private String TypeDocument;
    private String Document;
    private String Date;
    private String Hour;
    private int Consultory;
    private String Doctor;

    public Appoinment() {}

    public Appoinment(String TypeDocument, String Document, String Date, String Hour, int Consultory, String Doctor) {
        this.TypeDocument = TypeDocument;
        this.Document = Document;
        this.Date = Date;
        this.Hour = Hour;
        this.Consultory = Consultory;
        this.Doctor = Doctor;
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

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    public int getConsultory() {
        return Consultory;
    }

    public void setConsultory(int Consultory) {
        this.Consultory = Consultory;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }
}
