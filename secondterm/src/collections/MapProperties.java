package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MapProperties {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();

        properties.load(new FileInputStream(new File("d:/javastudy/conf.properties")));

        String user=properties.getProperty("user");
        System.out.println(user);

        String password=properties.getProperty("password");
        System.out.println(password);

        properties.setProperty("user","wangermazi");
        properties.setProperty("alias","wanger");

        properties.list(System.out);

        properties.store(new FileOutputStream(new File("d:/javastudy/conf.txt")),"ldd modified");


    }
}
