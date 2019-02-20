public class EncapMain {
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();

        en.setName("Ahmed Asif");
        en.setAge(24);
        en.setDepartment("B.Sc. in CSE");

        System.out.println("Name: " + en.getName());
        System.out.println("Age: " + en.getAge());
        System.out.println("Department: " + en.getDepartment());

    }
}
