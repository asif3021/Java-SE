package Polymorphism02;

public class Rectangle extends Shape {
    int height,weight;

    public Rectangle(int height,int weight) {
        this.height = height;
        this.weight = weight;

    }
    void show(){
        System.out.println("Show method");
        System.out.println("Area of rectangle: " + height*weight);
    }

    @Override
    void area() {
        //super.area();
        //System.out.println("Area of rectangle: " + height*weight);
        show();
    }

    /*
    float area() {
        //super.area();
        //System.out.println("Area of rectangle: " + height*weight);
        return (float)(height*weight);
    }
    */



}
