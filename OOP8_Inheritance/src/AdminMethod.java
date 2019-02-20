public class AdminMethod {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo();

        System.out.println("************** Student 1 **************");
        student1.displayStudentInfo();

        student1.roll = 1;
        student1.c = 4;
        student1.name = "Ahmed Asif";
        student1.age = 7;
        student1.phone = "0257975";
        student1.address = "Dhaka";

        System.out.println("************** Student 2 **************");
        student1.displayStudentInfo();
    }
}
