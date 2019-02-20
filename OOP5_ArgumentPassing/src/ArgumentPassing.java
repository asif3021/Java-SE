public class ArgumentPassing {
    public static void main(String[] args) {
        //Call by value
        CallByValue p1 = new CallByValue();
        System.out.println("Before argument passing: ");
        System.out.println(p1.name);
        System.out.println(CallByValue.city);

        System.out.println("After argument passing: ");
        p1.display("DaDa");

        //call by reference
        CallByReference cr = new CallByReference();

        cr.display(cr);
        System.out.println(cr.varsity);



    }
}
