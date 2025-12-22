public class Employee {

    String firstName;
    String lastName;
    byte age;
    char gender;

    public Employee() {
        this.firstName = "Jhon";
        this.lastName = "Doe";
        this.age = 30;
        this.gender = 'M';
        System.out.println("Object is getting crated.... ");
    }

    public Employee(String firstName, String lastName, byte age, char gender) {
        
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

}
