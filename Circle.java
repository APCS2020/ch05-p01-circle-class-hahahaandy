public class Circle {
    private String color = "red";
    private double radius = 1.0;

    public String getColor() {
        return color;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public Circle() {
        color = "red";
        radius = 1.0;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
