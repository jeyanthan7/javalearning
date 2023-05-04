package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class dbConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/muthu");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("select * from entity");

        while (result.next()) {
            System.out.println(result.getString(2));
        }

        FileInputStream stream = new FileInputStream("config.properties");
        Properties properties = new Properties();
        properties.load(stream);
        String name = properties.getProperty("son");
        System.out.println("son Name in property is " + name);

        ResultSet result1 = statement.executeQuery("select * from bank_acc where acc=" + properties.getProperty("acc"));
        while (result1.next()) {
            System.out.println(result1.getString(1));
        }


    }
}
