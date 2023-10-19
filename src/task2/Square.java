package task2;

public class Square extends TwoDimensional {
    private final double firstSide;

    public Square(final double firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public double area() {

        return Math.pow(this.firstSide, 2);
    }
}

