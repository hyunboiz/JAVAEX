package JavaBuilder;

public class Main {
    public static void main(String[] args) {
        Order ord1 = new Order.Builder()
                .setBun(1)
                .setTraDa(1)
                .create();
        ord1.Bill();
    }
}
