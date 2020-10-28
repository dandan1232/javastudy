package commonclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Date1 {
    public static void main(String[] args) {
        Date date = new Date(119, 2, 13, 20, 52, 44);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy,a,HH:mm:ss", Locale.ENGLISH);
        String str = sdf.format(date);
        System.out.println(str);


        SimpleDateFormat sdf1 = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss");
        String str2 = "星期三,13 三月 2019 20:48:31";
        Date date1 = null;
        try {
            date1 = sdf1.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sdf1.format(date1));
    }
}
