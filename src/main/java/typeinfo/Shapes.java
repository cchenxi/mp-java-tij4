//: typeinfo/Shapes.java
package typeinfo; /* Added by Eclipse.py */

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("can");
        } else {
            System.out.println("can not");
        }
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for (Shape shape : shapeList) {
            shape.draw();
            rotate(shape);
        }

        Shape shape = new Rhomboid();
        Rhomboid r = (Rhomboid) shape;
//        Circle c = (Circle) shape;
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
        } else {
            System.out.println("not instanceof circle");
        }
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
