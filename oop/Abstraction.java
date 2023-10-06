// Abstraction is the process of simplifying complex systems by modeling classes based on their essential properties and behaviors.
// Abstract classes and interfaces provide a level of abstraction, and concrete classes implement the details.

abstract class Shape {
    abstract void draw(); // Abstract method
}

class Circle extends Shape {
    @Override
    void draw() {
        // Implementation for drawing a circle
    }
}
