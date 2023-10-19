package task2;

public class Main {
    public static void main(String[] args) {

        TwoDimensional triangle = new Triangle(5,5,5);
        System.out.println("Are triangle - " + triangle.area());

        TwoDimensional square = new Square(4);
        System.out.println("Are  square - " + square.area());

        TwoDimensional rectangle = new Rectangle(4,5);
        System.out.println("Are rectangle - " + rectangle.area());

        TwoDimensional circle = new Circle(3);
        System.out.println(circle.area());


        ThreeDimensional cube = new Cube(1);
        System.out.println("Volume cube - " + cube.volume());

        ThreeDimensional pyramid = new Pyramid(6,6,6,6);
        System.out.println("Volume pyramid -" + pyramid.volume());

        ThreeDimensional sphere = new Sphere(3);
        System.out.println("Volume sphere - " + sphere.volume());



    }
}
