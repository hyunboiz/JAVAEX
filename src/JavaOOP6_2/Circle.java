package JavaOOP6_2;

public class Circle implements GeometricObject{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return (this.radius*2)*3.14;
    }

    @Override
    public String toString() {
        return "JavaOOP6_2.Circle{" +
                "radius=" + radius +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
