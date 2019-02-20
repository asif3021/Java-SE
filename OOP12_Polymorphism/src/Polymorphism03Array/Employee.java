package Polymorphism03Array;

public class Employee extends Person {
    String designation = "Unemployed";
    int salary ;

    Employee(){


    }


    Employee(String name,String occupation,String city, String designation,int salary){
        super(name,occupation,city);
        this.designation = designation;
        this.salary = salary;
    }

    Employee(String name,String occupation,String city){
        super(name,occupation,city);
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
