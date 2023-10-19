package task2;

public class Cube extends ThreeDimensional {
    private final double side;

    public Cube(final double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(this.side, 3);
    }
}
