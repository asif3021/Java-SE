public class MainMethod {
    public static void main(String[] args) {
        Factorial num = new Factorial();
        int n;

        n = num.fact(5);
        System.out.println("Factorial of 5 is " + n);

        Fibonacci f = new Fibonacci();

        System.out.print("Fibonacci series: ");
        f.fibonacciView(2000);


    }
}
