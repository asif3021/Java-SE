package practice1;

/**
 * Human class properties are extended here
 */

public class Student extends HumanClass implements Person {
    public String name;
    public int age;
    public String currentCity;
    public String instituteName;
    public String department;
    private static final String graduation = "Yes";

    String getGraduation(){
        return graduation;
    }

/*
    Student(Person p,String instituteName,String department){
        this.person = p;
        this.instituteName = instituteName;
        this.department = department;
    }
    */
    Student(){

    }

    Student(String name,int age,String currentCity,String instituteName,String department){
        this.name = name;
        this.age = age;
        this.currentCity = currentCity;
        this.instituteName = instituteName;
        this.department = department;
    }



    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Current city: " + currentCity);
        System.out.println("Institute name: " + instituteName);
        System.out.println("Department: " + department);
        System.out.println("Graduation: " + graduation);
    }
}
