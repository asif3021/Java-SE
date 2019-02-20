public class Employee {
    int count = 0;
    static int count1 = 0;

    Employee(){
        count++;
        count1++;
    }

    static void display(){
        //System.out.println("Count = " + count);
        System.out.println("Count = " + count1);
    }
}
