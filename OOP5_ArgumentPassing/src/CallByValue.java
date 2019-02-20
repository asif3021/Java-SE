public class CallByValue {
    String name = "Asif";
    static String city = "Dhaka";


    void display(String n){
        n = "Nahid";

        System.out.println("Name : " + name);
        System.out.println("City : " + city);
    }
}
