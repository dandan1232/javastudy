package collections;

/*      写一个配置文件，包括：
        1） id=你的学号 2）grade=你的java成绩 使用Properties访问对应的属性，得到对应的值。*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LDDProperties {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream(new File("d:/javastudy/StudentProperties.properties")));
    String name=properties.getProperty("name");
        System.out.println(name);

        String id=properties.getProperty("id");
        System.out.println(id);

        String grade=properties.getProperty("grade");
        System.out.println(grade);
    }
}
