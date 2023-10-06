// Interfaces define a contract of methods that must be implemented by implementing classes.
// A class can implement multiple interfaces, allowing for a high degree of polymorphism.

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        // Implementation for drawing a circle
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        // Implementation for drawing a rectangle
    }
}
