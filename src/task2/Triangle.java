package task2;

public class Triangle extends TwoDimensional {
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(final double firstSide, final double secondSide, final double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double perimeter() {
        return (this.firstSide + this.secondSide + this.thirdSide);
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.firstSide) *
                (halfPerimeter - this.secondSide) * (halfPerimeter - this.thirdSide));
    }
}
