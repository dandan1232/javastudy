package iodemo;

import org.junit.Test;

import java.io.*;

public class Demo02_FileInputOutputStream { //输入流
    @Test
    public void TestFileInputStream() {

        // File file1 = new File("d:\\javastudy\\Case\\helloworld2.txt");
         // File file1 = new File("d:/javastudy/Case/helloworld2.txt");
       File file1 = new File("d:" +File.separator+"javastudy"+File.separator + "Case"
                + File.separator + "helloworld2.txt");
        /*
         *创建一个文件输入字节流
         */
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file1);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*
         * 开始读文件
         */
        byte[] bytes = new byte[6];
        int len = -1;
/*        do {
            try {
                end=fis.read(bytes);
                System.out.println("本次读出"+end+"个字节：");
                if (end==-1){
                    break;
                }
                System.out.println(new String(bytes,0,end));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (end!=-1);*/
        try {
            while ((len = fis.read(bytes)) != -1) {
                System.out.println("本次读出" + len + "个字节：");
                for (int i = 0; i < len; i++) {
                    System.out.print(bytes[i] + " ");
                }
                System.out.println("");
                //System.out.println(new String(bytes,0,end));
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        // 将对应的流关闭
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Test
    public void TestOutputStream() {//输出流
       // File file1 = new File("d:/javastudy/Case/helloworld2.txt");
        File file1 = new File("d:" +File.separator+"javastudy"+ File.separator + "Case"
                + File.separator + "helloworld3.txt");

        if(!file1.exists()){
                try {
                    file1.createNewFile();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        /*
        生成输出流
        */
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        byte[] bytes=null;
        bytes="abcdefghijklmn".getBytes();

            try {
               // fos.write(98); //写的是ascll为98的字符，也就是b
                fos.write(bytes);
              //  fos.write(bytes,5,5); //第五个开始，长度为5
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    @Test
    public void copyByteFile(){
        File file1 = new File("d:\\javastudy\\Case\\helloworld3.txt");
        File file2 = new File("d:\\javastudy\\Case\\helloworld3copyed.txt");
        if(!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        /*
         * 生成两个流
         */
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {
            fis=new FileInputStream(file1);
            fos=new FileOutputStream(file2);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*
         * 一个流是读，一个是写
         */
        byte[] bytes=new byte[1024];
        int len=-1;
        try {
            while ((len=fis.read(bytes))!=-1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if(fis!=null){
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(fos!=null){
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    }
