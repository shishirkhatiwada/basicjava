// Polymorphism allows objects of different classes to be treated as objects of a common superclass.
// It enables method overriding, where a subclass provides its own implementation of a method defined in the superclass.

class Shape {
    void draw() {
        // Implementation for drawing
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        // Implementation for drawing a circle
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        // Implementation for drawing a rectangle
    }
}
