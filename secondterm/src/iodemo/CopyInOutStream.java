package iodemo;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyInOutStream {
    @Test
    public void copyByteFile() {
        File file1 = new File("d:\\javastudy\\Case\\copy.jpg");
        File file2 = new File("d:\\javastudy\\Case\\io1\\copyed.jpg");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(file1); //创建一个输入流，负责对源文件的读取
            fos = new FileOutputStream(file2); //创建一个输出流，负责上面输入流读到的数据写入目标目录的相同文件名称中
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*
         * 一个流是读，一个是写
         */
        byte[] bytes = new byte[1024]; //创建中转站数组bytes，存放每次读取的内容
        int len = -1;
        try {
            while ((len = fis.read(bytes)) != -1) {  //通过循环实现文件读写
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fis != null) {  //关闭输入流
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fos != null) { //关闭输出流
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
