package Connection;

import Classes.Employee;

public class Test {
    
    public static void main(String[] args) {
        MongoConnection mongo = new MongoConnection("employees");
        Employee Emp = new Employee("Axel", "1005234865", "amorales264", "1234");
        mongo.SaveEmployee(Emp);
    }
}
