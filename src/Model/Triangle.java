package Model;

//Guidelines for creating an immutable class (from Bloch, Effective Java, 2nd ed.)
//        1-All fields should be private and final. This keeps internals private and prevents data from changing once the object is created.
//        2-Provide getters but no setters for all fields. Not providing setters is essential for making the class immutable.
//        3-Make the class final. (This prevents users of the class from accessing the internals of the class in another way – to be discussed in Lesson 6.)
//        4-Make sure that getters do not return mutable objects.

final public class Triangle {

    final private double base;
    final private double height;
    private double height2;

    public Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double base,double height,double height2) {
        this.base = base;
        this.height = height;
        this.height2 = height2;
        double perimeter = (base + height + height2)/2;
        double area = Math.sqrt(perimeter*(perimeter-base)*(perimeter-height)*(perimeter-height2));
        height = 2 * (area/base);
    }

    public double getHeight2() {
        return height2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return 0.5 * base * height;
    }


}
