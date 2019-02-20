package MobileUser;

public class User {
    public static void main(String[] args) {
        MobileCompany[] user = new MobileCompany[5];
        user[0] = new GrameenPhone();
        user[0].call();

        user[1] = new Banglalink();
        user[1].call();

        user[2] = new GrameenPhone();
        user[2].call();
        user[2].sendMessage();

        user[3] = new GrameenPhone();
        user[3].call();

        user[4] = new Robi();
        user[4].call();

        user[0] = new Robi();
        user[0].call();




    }
}
