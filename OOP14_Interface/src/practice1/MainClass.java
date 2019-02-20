package practice1;

public class MainClass {
    public static void main(String[] args) {
        Person p;
        p = new Student("Asif",23,"Dhaka","DIU","CSE");
        p.displayInfo();
        p = new Employee();
        System.out.println("------------------------------------");
        p.displayInfo();
    }
}
