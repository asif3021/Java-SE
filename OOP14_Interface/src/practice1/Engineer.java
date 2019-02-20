package practice1;

public class Engineer extends Employee {
    String designation;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Designation: " + designation);
    }
}
