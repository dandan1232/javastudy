package commonclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1); // 当前时间
        Date date2 = new Date(2222222222222L);
        System.out.println(date2);
        //从日期到字符串Date==>String
        DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd a,HH:mm:ss #E",Locale.US);//不同国家语言
        String str = df1.format(date2);
        System.out.println(str);
        //从字符串生成一个日期Date；Strng==>String
        String str2="1990/01/16 AM,08:23:42 #Sun";
        Date date3 = null;
        try {
            date3 = df1.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date3);
    }
}
