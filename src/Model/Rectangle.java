package Model;

final public class Rectangle {

    final private double width;
    final private double height;

    public Rectangle(double width,double lenght) {
        this.width = width;
        this.height = lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea()
    {
        return width * height;
    }

}
