package JavaOOP6_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> geometric = new ArrayList<>();
        Circle c1 = new Circle(2);
        Rectangle r1 = new Rectangle(4, 5);
        geometric.add(c1);
        geometric.add(r1);

        for (GeometricObject data: geometric){
            System.out.println(data);
        }
    }
}
