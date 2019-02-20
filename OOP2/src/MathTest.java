import java.util.Scanner;


public class MathTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mathematics object1 = new Mathematics();


        System.out.print("Enter any two integer number for addition: ");
        object1.addition(input.nextInt(),input.nextInt());
        object1.viewResult();

    }
}
