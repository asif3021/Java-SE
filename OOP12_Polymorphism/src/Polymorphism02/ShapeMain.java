package Polymorphism02;

public class ShapeMain {
    public static void main(String[] args) {
        Shape ob = new Shape();
        ob.area();
        //System.out.println(ob.area());
        ob = new Triangle(20,20);//dynamic method dispatch or run time polymorphism
        ob.area();
        //System.out.println(ob.area());
        ob = new Rectangle(20,20);//dynamic method dispatch or run time polymorphism
        ob.area();
        //ob.show();
        //System.out.println(ob.area());
    }
}
