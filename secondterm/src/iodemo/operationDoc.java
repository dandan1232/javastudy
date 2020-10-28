package iodemo;

import java.io.File;
import java.io.IOException;
import org.junit.Test;


public class operationDoc {
    @Test
    public void CreatDirectory() {
        File dir1 = new File("D:\\Case\\myDir");
        if (dir1.exists()) {
            System.out.println("检测到多级目录存在，我将其删掉");
            dir1.delete();
        }
        if (!dir1.exists()) {
            System.out.println("检测到多级目录不存在，我新建了一个");
            dir1.mkdirs();
        }

        File file1 = new File("D:\\Case\\myDir\\我的青春我做主.txt");
        if (file1.exists()) {
            System.out.println("检测到文本文件已经存在，我将其删掉");
            file1.delete();
        }
        if (!file1.exists()) {
            System.out.println("检测到文件不存在，我新建了一个");
        }
        try {
            file1.createNewFile();
            System.out.println("绝对路径为：" + file1.getAbsolutePath());
            System.out.println("文件名：" + file1.getName());
            System.out.println("父路径为：" + file1.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }
         if (file1.exists()) {
                System.out.println("检测到文本文件已经存在，并完成了它的任务，我将其删掉");
                file1.delete();
            }
    }
}