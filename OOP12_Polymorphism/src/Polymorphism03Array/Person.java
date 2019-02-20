package Polymorphism03Array;

public class Person {
    String name;
    String occupation;
    String city;

    Person(){


    }
    Person(String name,String occupation,String city){
        this.name = name;
        this.occupation = occupation;
        this.city = city;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Occupation: " + occupation);
        System.out.println("City: " + city);
    }

}
