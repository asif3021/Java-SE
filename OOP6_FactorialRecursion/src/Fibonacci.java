public class Fibonacci {
    void fibonacciView(int num){
        int a = 0, b = 1,f = 0;
        while (f < num){
            System.out.print(f + " ");
            f = a + b;
            b = a;
            a = f;
        }
    }
}
