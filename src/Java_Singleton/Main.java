package Java_Singleton;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = Customer.getInstance();
        customer1.datHang();
        customer1.thanhToan();
        System.out.println(customer1.hashCode());
    }
}
