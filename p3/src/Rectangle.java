import org.w3c.dom.css.Rect;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.0F;
        width = 1.0F;
    }
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    public Rectangle (double l, double w, String c, boolean f) {
        length = l;
        width = w;
    }
    public double getLength() { return length; }
    public void setLength(double l) { length = l; }
    public double getWidth() { return width; }
    public void setWidth(double w) { width = w; }

    public double getArea() { return length * width; }
    public double getPerimeter() { return 2 * (length + width); }

    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
