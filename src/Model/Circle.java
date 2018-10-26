package Model;

final public class Circle {

    final private double radius;

    public Circle(double radious) {
        this.radius = radious;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea()
    {
        return Math.PI * radius * radius;
    }

}
