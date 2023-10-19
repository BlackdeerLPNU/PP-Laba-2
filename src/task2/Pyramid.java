package task2;

public class Pyramid extends ThreeDimensional {
    private final Triangle basis;
    private final double height;

    public Pyramid(final double firstBasisSide, final double secondBasisSide, final double thirdBasisSide, final double height) {
        this.basis = new Triangle(firstBasisSide, secondBasisSide, thirdBasisSide);
        this.height = height;
    }

    @Override
    public double volume() {
        return 1./3 * this.basis.perimeter() * height;
    }
}
