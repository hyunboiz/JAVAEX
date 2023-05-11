package Java_Singleton;

public class Customer {
    private String userName;
    private static Customer instance = null;

    // Khoá ko cho phép tạo đối tượng từ bên ngoài
    private Customer(String userName) {
        this.userName = userName;
    }

    public static Customer getInstance() {
        if (instance == null) {
            instance = new Customer("Hyunboiz");
        }
        return instance;
    }

    public void datHang() {
        System.out.println("Username: " + userName + " dat hang");
    }

    public void thanhToan() {
        System.out.println("Username" + userName + " thanh toan don hang");
    }
}

