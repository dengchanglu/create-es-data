package com.es.data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

/**
 * Created by perfection on 15-12-29.
 */
public class Time {
    public static Integer getTime(){
        LocalDateTime localDateTime = LocalDateTime.of(2015,1,(new Random().nextInt(31)+1),12,0);
        Integer time = localDateTime.getSecond();
        return time;
    }
}
