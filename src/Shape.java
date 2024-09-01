public interface Shape {
    double calculatePerimeter();

    double calculateArea();

    String getFillColor();

    String getBorderColor();

    default void printDetails() {
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill Color: " + getFillColor());
        System.out.println("Border Color: " + getBorderColor());
        System.out.println();
    }
}