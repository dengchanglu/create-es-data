package com.es.data;

import java.util.Random;

/**
 * Created by perfection on 15-12-29.
 */
public class Ips {
    public String getIP() {
        return new Random().nextInt(255) + "." + new Random().nextInt(255) + "." + new Random().nextInt(255);
    }
}
