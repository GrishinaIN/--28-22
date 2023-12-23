public abstract class Shape {
    public String color;
    public boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

    public double getRadius() { return 0; }

    public double getLength() {
        return 0;
    }

    public double getSide() {
        return 0;
    }
}