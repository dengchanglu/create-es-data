package com.es.server;

import com.es.http.HttpClient;

/**
 * Created by perfection on 15-12-29.
 */
public class TheadsES extends Thread {
    @Override
    public void run(){
        CollectData collectData = new CollectData();
        HttpClient.get("http://192.168.1.3:27017",collectData.createAndroidData());
    }
}
