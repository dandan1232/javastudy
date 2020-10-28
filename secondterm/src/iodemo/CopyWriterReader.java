package iodemo;

import org.junit.Test;

import java.io.*;

public class CopyWriterReader {
    @Test
    public void copyCharFile() {
        File file1 = new File("d:\\Case\\myDir\\我的青春我做主.txt");
        File file2 = new File("d:\\Case\\myDir\\我的青春我做主2.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            FileReader fr = null;
            FileWriter fw = null;

            try {
                fr = new FileReader(file1);
                try {
                    fw = new FileWriter(file2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            char[] chars = new char[128];
            int len = -1;
            try {
                while ((len = fr.read(chars)) != -1) {
                    System.out.println(new String(chars));
                    fw.write(chars, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

