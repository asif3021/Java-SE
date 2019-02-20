package Polymorphism03Array;

public class ArrayObject {
    public static void main(String[] args) {
        Person[] p = new Person[10];

        p[0] = new Employee("Asif","Student","Dhaka","Student",50000);
        p[1] = new Employee("Asif","Student","Dhaka");

        p[0].displayInfo();
        System.out.println("--------------------------------");
        p[1].displayInfo();
        System.out.println("--------------------------------");
        p[2] = new Employee("","","","",0);
        p[2].displayInfo();

    }
}
