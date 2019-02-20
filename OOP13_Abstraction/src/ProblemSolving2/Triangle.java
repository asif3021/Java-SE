package ProblemSolving2;

public class Triangle extends Shape {
    private double base,height;

    Triangle(double height,double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    void area() {
        //super.showResult();
        System.out.println("Area of triangle: " + 0.5*base*height);
    }
}
