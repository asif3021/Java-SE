public class Students {

    String name;
    String Department;
    int age;
    String gender;
    String address;
    String phone;


    void CreateList(String n,String d,int a,String g,String ad,String ph){
        name = n;
        Department = d;
        age = a;
        gender = g;
        address = ad;
        phone = ph;
    }


    void DisplayList(String n){
        if (n.equals("")){
            System.out.println("Name: " + name);
        }
        else {
            name = n;
            System.out.println("Name: " + name);
        }

        System.out.println("Department: " + Department);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("****************************************");
    }

}
