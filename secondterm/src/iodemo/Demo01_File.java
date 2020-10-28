package iodemo;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Demo01_File {
    @Test
//JUnit包，方便Java代码测试专门开发的包
    public  void TestFile(){
    //System.out.println("JUnit的第一个测试");
    File file1=new File("D:\\javastudy\\Case\\hello.txt");
if (file1.exists()){
    System.out.println("文件存在，我就将其删掉");
    file1.delete();
}
if (!file1.exists()){
    System.out.println("文件不存在，我就新创建一个");
    try {
        file1.createNewFile();
        System.out.println("绝对路径为："+file1.getAbsolutePath());
        System.out.println("文件名："+file1.getName());
        System.out.println("父路径为："+file1.getParent());

        file1.renameTo(new File("D:\\javastudy\\Case\\hello2.txt"));
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
    @Test
    public  void TestDirectory(){
        //System.out.println("JUnit的第一个测试");
        File dir1=new File("D:\\javastudy\\Case\\io1");
        if (dir1.exists()){
            System.out.println("目录存在，我就将其删掉");
            dir1.delete();
        }
        if (!dir1.exists()){
            System.out.println("目录不存在，我就新创建一个");
            dir1.mkdir();
        }

        File dir2=new File("D:\\javastudy\\Case\\io2\\io3\\io4");
        if (dir2.exists()){
            System.out.println("多级目录存在");
        }
        if (!dir2.exists()){
            System.out.println("多级目录不存在，我就新创建整个目录结构");
            dir2.mkdirs();
        }

    }

}
