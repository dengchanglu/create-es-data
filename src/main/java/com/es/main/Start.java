package com.es.main;

import com.es.data.AndroidData;
import com.es.data.Ips;
import com.es.data.Locations;
import com.es.data.Time;
import com.es.http.HttpClient;
import com.es.server.CollectData;
import com.es.server.TheadsES;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by perfection on 15-12-25.
 */
public class Start {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Thread theadsES = new TheadsES();


        for (int k = 0; k < 5000; k++) {
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                public void run() {
                    CollectData collectData;
//                    for (long i = 0; i < 10000; i++) {
//            executorService.execute(new TheadsES());
                    collectData = new CollectData();
                    HttpClient.get("http://192.168.2.48:27017", collectData.createAndroidData());
//                    }
                }
            };
            timer.scheduleAtFixedRate(task, new Date(), 1000);
        }
//        CollectClient.createAndroidData("http://192.168.1.32:27017", "pageBelong", "localPage", "city", 0, "phoneType",
//                "btnNumber", "srData", "neData", "coData", "appVersion",
//                "cmData", true, "sessionKey", "uuid", "phoneVersion",
//                "192.168.1.1", "12", "12", "sex", null, "education", "industry");
    }
}
