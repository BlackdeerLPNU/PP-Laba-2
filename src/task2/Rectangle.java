package task2;

public class Rectangle extends TwoDimensional {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(final double firstSide, final double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return this.firstSide * this.secondSide;
    }
}
