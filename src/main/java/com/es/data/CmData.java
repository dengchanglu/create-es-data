package com.es.data;

import java.util.Random;

/**
 * Created by perfection on 16-1-5.
 */
public class CmData {
    public static String[] channelMarker = {
            "OpenPlatform", "yingyongbao", "未知", "oppo", "guanwang", "xiaomi", "huaweineizhi", "baidushoujizhushou", "play", "zhihuiyun"
    };

    public String getCMData() {
        return channelMarker[new Random().nextInt(10)];
    }
}
