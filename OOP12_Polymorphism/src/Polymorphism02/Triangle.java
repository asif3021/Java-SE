package Polymorphism02;

public class Triangle extends Shape {
    double base,height;

    public Triangle(double height,double base) {
        this.height = height;
        this.base = base;

    }


    @Override
    void area() {
        //super.showResult();
        System.out.println("Area of triangle: " + 0.5*base*height);
    }
    /*
    float area() {
        //super.showResult();
        //System.out.println("Area of triangle: " + 0.5*base*height);
        return (float)(0.5*base*height);
    }
     */




}
