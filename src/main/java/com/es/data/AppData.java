package com.es.data;

import java.util.Random;

/**
 * Created by perfection on 16-1-4.
 */
public class AppData {
    public static String[] appVersion = {
            "1.0.0", "1.1.0", "1.2.0", "2.1.0", "2.2.0", "3.0.0"
    };

    public String getAppVersion() {
        return appVersion[(new Random().nextInt(6))];
    }
}
