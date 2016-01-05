package com.es.server;

import com.es.data.*;

/**
 * Created by perfection on 15-12-25.
 */
public class CollectData {
    Ips ips;
    //    = new Ips();
    Locations locations;
    //    = new Locations();
    Time time;
    //        = new Time();
    AndroidData androidData;
    //    = new AndroidData();
    SrData srData;
    //    = new SrData();
    NeData neData;
    //    = new NeData();
    CoData coData;
    //    = new CoData();
    AppData appData;
    //    = new AppData();
    CmData cmData;
    UserData userData;

    public String createAndroidData() {
        ips = new Ips();
        locations = new Locations();
        time = new Time();
        androidData = new AndroidData();
        srData = new SrData();
        neData = new NeData();
        coData = new CoData();
        appData = new AppData();
        cmData = new CmData();
        userData = new UserData();

        String param = "";
        String page = androidData.getPageBelong();
        param = "ip=" + ips.getIP()//IP地址数据
                + "&lng=" + locations.getLocations().get("lng")//地理位置信息：维度
                + "&lat=" + locations.getLocations().get("lat")//地理位置信息：经度
                + "&city=" + locations.getLocations().get("city")//城市数据
                + "&time=" + time.getTime()//时间数据
                + "&version=android " + androidData.getPhoneVersion()//版本信息
                + "&phoneType=" + androidData.getPhoneType()//手机型号数据
                + "&locPage=" + page//当前页面数据
                + "&btn=" + androidData.getBtnNumber()//按钮编号数据
                + "&sr=" + srData.getSRData()//手机屏幕分辨率型号数据
                + "&ne=" + neData.getNEData()//网络环境数据
                + "&co=" + coData.getCOData()//运营商数据
                + "&av=" + appData.getAppVersion()//app版本数据
                + "&cm=" + cmData.getCMData()//渠道标记数据
                + "&sex=" + userData.getSexData()//性别数据
                + "&ar=" + userData.getAgeRangeData()//年龄范围数据
                + "&edu=" + userData.getEducationData()//学历数据
                + "&ind=" + userData.getIndustryData() //行业数据
                + "&bp=" + getData(page)//来源页面数据
        ;
        return param;
    }

    public String getData(String data) {
        androidData = new AndroidData();
        while (true) {
            String page1 = androidData.getPageBelong();
            if (!data.equals(page1)) {
                return page1;
            }
        }
    }
}
