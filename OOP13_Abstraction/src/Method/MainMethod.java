package Method;

public class MainMethod {
    public static void main(String[] args) {
        Mathematics m = new Mathematics();
        m.add(20,30);


        Mathematics anonymousClass = new Mathematics(){
            @Override
            void add(int x, int y) {
                System.out.println("Main class");
                System.out.println(x+y);
            }
        };
        anonymousClass.add(100,80);


    }
}
