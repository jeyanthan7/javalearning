package basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyCheck {
    public static void main(String[] args) throws IOException {
        Properties defaultProps = new Properties();
        FileInputStream in = new FileInputStream("config.properties");
        defaultProps.load(in);
        in.close();
        System.out.println(defaultProps.getProperty("son"));
    }
    }