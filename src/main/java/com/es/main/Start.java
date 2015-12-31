package com.es.main;

import com.es.data.AndroidData;
import com.es.data.Ips;
import com.es.data.Locations;
import com.es.data.Time;
import com.es.server.TheadsES;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by perfection on 15-12-25.
 */
public class Start {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100000; i++) {
            executorService.execute(new TheadsES());
        }
    }
}
