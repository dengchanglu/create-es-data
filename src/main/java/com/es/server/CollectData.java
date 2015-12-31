package com.es.server;

import com.es.data.AndroidData;
import com.es.data.Ips;
import com.es.data.Locations;
import com.es.data.Time;

/**
 * Created by perfection on 15-12-25.
 */
public class CollectData {
    public String createAndroidData() {
        String param = "";
        param = "ip=" + Ips.getIP()
                + "&lng=" + Locations.getLocations().get("lng")
                + "&lat=" + Locations.getLocations().get("lat")
                + "&city=" + Locations.getLocations().get("city")
                + "&time=" + Time.getTime()
                + "&version=android " + AndroidData.getPhoneVersion()
                + "&phoneType=" + AndroidData.getPhoneType()
                + "&locPage=" + AndroidData.getPageBelong()
                + "&btn=" + AndroidData.getBtnNumber();
        return param;
    }
}
