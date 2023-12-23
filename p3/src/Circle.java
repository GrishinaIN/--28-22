import java.lang.Math;
class Circle extends Shape {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public Circle(double r, String c, boolean filled) {
        radius = r;
        color = c;
    }

    public double getRadius() { return radius; }
    public void setRadius(double r) { radius = r; }
    public double getArea() { return radius*radius*Math.PI; }
    public double getPerimeter() { return 2*radius*Math.PI; }
    public String toString() { return "Circle[radius="+radius+", color="+color+"]"; }
}
