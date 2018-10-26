import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

public class Main {

    public static void main(String[] args) {

        Triangle myTriangle = new Triangle(3.0, 5.0);
        System.out.println("Area of Triangle is " + myTriangle.computeArea());

        Triangle myTriangleWithThreeSides = new Triangle(8.0, 5.0, 3.0);
        System.out.println("Area of Triangle with three sides " + myTriangleWithThreeSides.computeArea());

        Rectangle myRectangle = new Rectangle(4.0, 4.0);
        System.out.println("Area of Rectangle is " + myRectangle.computeArea());

        Circle myCircle = new Circle(6.0);
        System.out.println("Area of Circle is " + myCircle.computeArea());
    }
}
