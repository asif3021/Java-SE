public class MainMethod {
    public static void main(String[] args) {
        Engineer en = new Engineer();
        Parrot p = new Parrot();

        /*
        en.display4();
        System.out.println("******************************");
        p.display5();
        */
        Person per = new Person();

        System.out.println("Engineer instanceof Animal : " + (en instanceof Animal));
        System.out.println("Person instanceof Animal : " + (per instanceof Animal));

    }
}
