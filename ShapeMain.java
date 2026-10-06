public class ShapeMain {
    static class Shape { String name; Shape(String name) { this.name = name; } void displayShapeName() { System.out.println("Shape: " + name); } }
    static class Rectangle extends Shape { double length, width; Rectangle(String name, double length, double width) { super(name); this.length = length; this.width = width; } double calculateArea() { return length * width; } }
    static class Circle extends Shape { double radius; Circle(String name, double radius) { super(name); this.radius = radius; } double calculateArea() { return Math.PI * radius * radius; } }
    static class ShapeManager {
        void displayAreas(Shape[] shapes) {
            for (int i = 0; i < shapes.length; i++) {
                shapes[i].displayShapeName();
                if (shapes[i] instanceof Rectangle) System.out.println("Area: " + ((Rectangle) shapes[i]).calculateArea());
                else if (shapes[i] instanceof Circle) System.out.println("Area: " + ((Circle) shapes[i]).calculateArea());
            }
        }
    }
    public static void main(String[] args) { Shape[] shapes = { new Rectangle("Rectangle", 10, 5), new Circle("Circle", 4) }; new ShapeManager().displayAreas(shapes); }
}
