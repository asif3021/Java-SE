package ProblemSolving2;


public class ShapeMain {
    public static void main(String[] args) {
/*
        double number = 0.9999999999999;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println(numberFormat.format(number));
*/
        Shape ob;
        /**
        ob = new Triangle(20,20);
        ob.area();
        ob = new Rectangle(20,20);
        ob.area();
         */


        ob = new Circle();
        ob.area();
        Circle.setRadius(5);
        ob.area();
        ob = new Circle(20);
        ob.area();

    }
}
