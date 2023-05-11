package JavaOOP6_2;

public class Rectangle implements GeometricObject{
    double width, length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width*this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "JavaOOP6_2.Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
