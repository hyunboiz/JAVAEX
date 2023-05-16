package Java_FactoryMethodDatabase;

import java.sql.Connection;

public class main {
    public static void main(String[] args) {
            ConnectDB connectDB =  new ConnectDB();
            Connection conn = connectDB.getConnect();

    }
}
