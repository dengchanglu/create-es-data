package com.es.data;

import java.util.Random;

/**
 * Created by perfection on 16-1-4.
 */
public class NeData {
    public static String[] networkEnvironment = {
            "WIFI", "其它", "离线使用", "4G", "3G", "2G"
    };

    public String getNEData() {
        return networkEnvironment[(new Random().nextInt(6))];
    }
}
