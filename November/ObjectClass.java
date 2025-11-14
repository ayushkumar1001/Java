import java.io.*;
public class ObjectClass {

    public static void main(String args[])
    {

     /* Create two objects using constructor */
    Employee empOne = new Employee("Gourav");
    Employee empTwo = new Employee("Harsh");
    Employee empThree = new Employee("Ayush");

     // Invoking methods for each object created
     empOne.empAge(25);
     empOne.empDesignation("Senior Software Engineer");
     empOne.empSalary(1000);
     empOne.printEmployee();


     empTwo.empAge(24);
     empTwo.empDesignation("System Engineer");
     empTwo.empSalary(8000);
     empTwo.printEmployee();

     empThree.empAge(23);
     empThree.empDesignation("Associate System Engineer");
     empThree.empSalary(400);
     empThree.printEmployee();
    
}
}
