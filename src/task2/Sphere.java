package task2;

public class Sphere extends ThreeDimensional {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4. / 3 * Math.pow(this.radius, 3) * Math.PI;
    }
}
