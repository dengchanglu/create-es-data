package com.es.data;

import java.util.Random;

/**
 * Created by perfection on 16-1-4.
 */
public class SrData {
    public static String[] screenResolutions = {
            "720*1280", "1080*1776", "1080*1920", "480*854", "540*960", "480*800", "1080*1812", "1080*1800",
            "720*1184", "1440*2560"
    };

    public String getSRData() {
        return screenResolutions[(new Random().nextInt(10))];
    }
}
