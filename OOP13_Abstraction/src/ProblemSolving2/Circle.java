package ProblemSolving2;

class Circle extends Shape {
    private static int radius;


    Circle(){

    }
    Circle(int radius){
        this.radius = radius;

    }

    @Override
    void area(){
        if (radius == 0){
            System.out.println("Radius doesn't initialized.");
        }
        else {
            double d = Math.round(Math.PI * Math.pow(radius,2));
            System.out.printf("Circle area is: %.2f\n",d);
            radius = 0;
        }
    }

    static void setRadius(int r){
        radius = r;
    }



}
