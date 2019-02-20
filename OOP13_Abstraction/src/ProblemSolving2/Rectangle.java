package ProblemSolving2;

public class Rectangle extends Shape {
    private int height,weight;

    public Rectangle(int height,int weight) {
        this.height = height;
        this.weight = weight;
    }

    void show(){
        System.out.println("Area of rectangle: " + height*weight);
    }

    @Override
    void area() {
        show();
    }


}
