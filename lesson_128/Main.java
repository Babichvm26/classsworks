package lesson_128;

import java.text.DateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
//        86399
    }


    public static String makeReadable(int seconds) {
        int h = seconds % 3600 % 24;
        String hh = Integer.toString(h);
        hh = hh.length() == 1 ? "0" + hh : hh;
        int m = (seconds - h * 24 * 60) % 60;
        String mm = Integer.toString(m);
        mm = mm.length() == 1 ? "0" + mm : mm;
        int s = (seconds - h * 24 * 60 - m * 60) % 60;
        String ss = Integer.toString(s);
        ss = ss.length() == 1 ? "0" + ss : ss;

        //System.out.println(ss);

        String result = hh + ":" + mm + ":" + ss;
        return result;



    }
   public static  String calc (int t){
       String hh = Integer.toString(t);
        return  hh.length() == 1 ? "0" + hh : hh;
}


        // Date now = new Date();
        // System.out.println(((Date) now).getTime());

        //now.setTime(((Date) now).getTime());
      /*
      System.out.println(now.getTime());
        //////
        DateFormat format = new DateFormat("mm:ss") ;
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        result= format.format(new Date(time*1000));
        return;Integer.toString(seconds);

        Clock clock = Clock.system(ZoneId.systemDefault());
        System.out.println(clock.toString());
        System.out.println(clock.instant());

        Duration d = Duration.ofHours(1);
        System.out.println(d.getSeconds());
        */

    }
