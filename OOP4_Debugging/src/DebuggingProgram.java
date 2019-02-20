public class DebuggingProgram {
    public static void main(String[] args) {
        int sum = 0, i;

        for (i = 1;i <= 10;i=i+1){
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
        System.out.println("i is " + i);

    }
}
