package iodemo;

import org.junit.Test;

import java.io.*;

public class Demo03_FontConfig { //输入流
    @Test
    public void TestReader() {

       File file1 = new File("d:" +File.separator+"javastudy"+File.separator + "Case"
                + File.separator + "helloworld4.txt");
        /*
         *创建一个文件输入字符流（和源文件存储时使用的字符编码方式相关）,FileReader ISO-xxxx-1 编码（和ANST兼容）
         */
        FileReader fr = null;
        try {
            fr = new FileReader(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /*
         * 开始读文件
         */
        char[] chars=new char[30];
        int len = -1;

        try {
            while ((len = fr.read(chars)) != -1) {
                System.out.println("本次读出" + len + "个字符：");
                /*
                 *如果文件是UTF-8编码的，那么我需要转化
                 */
                String str=new String(chars);
                byte[] bytes=str.getBytes();
                str=new String(bytes,"UTF-8");
                System.out.println("转化后的汉字序列为："+str);


                for (int i = 0; i < len; i++) {
                    System.out.print(chars[i] + " ");
                }
                System.out.println("");
                //System.out.println(new String(bytes,0,end));
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        // 将对应的流关闭
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Test
    public void TestWrite() {//输出流
       // File file1 = new File("d:/javastudy/Case/helloworld2.txt");
        File file1 = new File("d:" +File.separator+"javastudy"+ File.separator + "Case"
                + File.separator + "helloworld5.txt");

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
        */FileWriter fw = null;

        try {
            fw = new FileWriter(file1);//new FileWriter(file1,true)将内容添加到文件的最后
        } catch (IOException e1) {
            e1.printStackTrace();
        }


        char[] chars=null;
        chars="我是一名学生，叫lindandan".toCharArray();

            try {
               // fos.write(98); //写的是ascll为98的字符，也就是b
                fw.write(chars);
                System.out.println("刚才我添加了"+new String(chars));
              //  fos.write(bytes,5,5); //第五个开始，长度为5
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    @Test
    public void copyCharFile(){
        //用字符流去拷贝字节文件（以字节为单位组织的文件（编过码的））是无法实现拷贝的，它只能处理文本文件。
/*        File file1 = new File("d:\\javastudy\\Case\\helloworld3.mp4" );
        File file2 = new File("d:\\javastudy\\Case\\helloworld3copyed.mp4");*/
        File file1 = new File("d:\\javastudy\\Case\\file1" );
        File file2 = new File("d:\\javastudy\\Case\\file2.txt");
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
        FileReader fis=null;
        FileWriter fos=null;

        try {
            fis=new FileReader(file1);
            try {
                fos=new FileWriter(file2);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*
         * 一个流是读，一个是写
         */
        char[] chars=new char[128];
        int len=-1;
        try {
            while ((len=fis.read(chars))!=-1) {
                System.out.println(new String(chars));
                fos.write(chars, 0, len);
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
