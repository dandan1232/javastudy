package iodemo;


import org.junit.Test;

import java.io.*;

public class CopyButteredIOStream {

    @Test
    public void copyByteFile() {
        File file1 = new File("d:\\Case\\myDir\\vedio.mp4");
        File file2 = new File("c:\\myFile\\vediocopy.mp4");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fis = null;
        FileOutputStream fos = null;

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            fis = new FileInputStream(file1);
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream(file2);
            bos = new BufferedOutputStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        long begin = System.currentTimeMillis();

        byte[] bytes = new byte[1024];
        int len = -1;
        try {
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("拷贝共用时："+(end-begin)+"毫秒");

        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (bis != null) {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (bos != null) {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
