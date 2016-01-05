package com.es.main;

import com.es.data.AndroidData;
import com.es.data.Ips;
import com.es.data.Locations;
import com.es.data.Time;
import com.es.http.HttpClient;
import com.es.server.CollectData;
import com.es.server.TheadsES;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by perfection on 15-12-25.
 */
public class Start {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Thread theadsES = new TheadsES();
        CollectData collectData ;
        for (int i = 0; i < 10000; i++) {
//            executorService.execute(new TheadsES());
            collectData = new CollectData();
            HttpClient.get("http://192.168.1.3:27017", collectData.createAndroidData());
        }
    }
}
