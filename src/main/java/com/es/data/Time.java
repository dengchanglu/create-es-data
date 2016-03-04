package com.es.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
import java.util.logging.SimpleFormatter;

/**
 * Created by perfection on 15-12-29.
 */
public class Time {
    public long getTime() {
//        String times = "2016-01-"+(new Random().nextInt(31)+1)+" "+(new Random().nextInt(23))+":"+(new Random().nextInt(59))+":00";
        String times = "2016-03-03 " + (new Random().nextInt(23)) + ":" + (new Random().nextInt(59)) + ":" + (new Random().nextInt(59));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(times);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
