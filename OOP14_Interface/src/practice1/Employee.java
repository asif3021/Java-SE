package practice1;

public class Employee extends Student {
    private String officeName;

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Current city: " + currentCity);
        System.out.println("Institute name: " + instituteName);
        System.out.println("Department: " + department);
        System.out.println("Graduation: " + getGraduation());
    }
}
