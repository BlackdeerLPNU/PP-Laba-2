package task2;

public class Circle  extends TwoDimensional{
    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI* Math.pow(this.radius,2);
    }
}
