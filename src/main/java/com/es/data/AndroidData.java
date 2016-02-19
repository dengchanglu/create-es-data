package com.es.data;

import java.util.Random;

/**
 * Created by perfection on 15-12-25.
 */
public class AndroidData {
    public static String[] androidVersions = {"4.1", "4.2", "4.3", "4.4", "5.0", "5.1", "6.0"};
    public static String[] androidTypes = {"galaxy s5mini", "galaxy note4", "galaxy s5", "Galaxy Grand", "Butterfly",
            "DROID DNA", "Edge"};
    public static String[] btn_number = {"登录", "注册", "退出", "实名认证", "购买", "查看", "切换", "帮助", "修改"};
    public static String[] pageBelong = {"登录页面", "注册页面", "个人中心页面", "购买页面","-"};
    public static Integer[] isStart = {0, 1};//0不是程序启动,1是程序启动

    public String getPhoneType() {
        return androidTypes[new Random().nextInt(7)];
    }

    public String getPhoneVersion() {
        return androidVersions[new Random().nextInt(7)];
    }

    public String getBtnNumber() {
        return btn_number[new Random().nextInt(9)];
    }

    public String getPageBelong() {
        return pageBelong[new Random().nextInt(5)];
    }

    public Integer getIsStart() {
        return isStart[(new Random().nextInt(2))];
    }
}
