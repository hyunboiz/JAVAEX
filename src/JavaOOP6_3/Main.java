package JavaOOP6_3;

public class Main {
    public static void main(String[] args) {
        Movable move1 = new MovablePoint(2, 3, 4, 5);
        System.out.println(move1);
        move1.moveLeft();
        System.out.println(move1);
    }
}
