package org.example;


class GraphicsTester {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape pentagon = new Pentagon();

        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(square);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(pentagon);
    }
}