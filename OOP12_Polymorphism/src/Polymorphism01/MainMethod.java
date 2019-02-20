package Polymorphism01;

public class MainMethod {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        //Employee e = new Employee();
        p = new Employee();
        p.display();
        //Farmer f = new Farmer();
        p = new Farmer();
        p.display();
        //Student s = new Student();
        p = new Student();
        p.display();
    }
}
