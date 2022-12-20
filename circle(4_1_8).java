package ex4_1_8;
public class circle extends shape{
    protected double radius;
    public circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }
    public circle(double radius) {
        super();
        this.radius = radius;
    }
    public circle() {
        super();
        radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   // @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //@Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}
