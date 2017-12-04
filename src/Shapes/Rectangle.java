package Shapes;


public class Rectangle {

    protected  double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;


    }
        public double area() {
            return this.length * this.width;
    }


    public double perimeter() {
        return this.length * 2 + this.width * 2;
    }




}
