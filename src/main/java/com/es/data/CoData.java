package com.es.data;

import java.util.Random;

/**
 * Created by perfection on 16-1-4.
 */
public class CoData {
    public static String[] carrierOperators = {
            "中国移动", "其它", "中国联通", "中国电信", "46011", "Vodafone NL", "PEOPLES", "302720", "CSL", "CTMGSM"
    };

    public String getCOData() {
        return carrierOperators[(new Random().nextInt(10))];
    }
}
