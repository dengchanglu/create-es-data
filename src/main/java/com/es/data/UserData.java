package com.es.data;

import java.util.Random;

/**
 * Created by perfection on 16-1-5.
 */
public class UserData {
    public static String[] sexs = {"男", "女", "未知"};
    public static String[] ageRanges = {
            "0-17", "18-24", "25-29", "30-14", "35-39", "40-", "未知"
    };
    public static String[] educations = {
            "未知", "初中", "高中", "本科", "硕士", "博士"
    };
    public static String[] industries = {
            "电子网络", "金融保险", "行政高管", "医疗生化", "官员翻译", "销售客服", "物流采购", "教育科研", "媒体艺术",
            "服务业"
    };

    public String getSexData() {
        return sexs[(new Random().nextInt(3))];
    }

    public String getAgeRangeData() {
        return ageRanges[(new Random().nextInt(7))];
    }

    public String getEducationData() {
        return educations[(new Random().nextInt(6))];
    }

    public String getIndustryData() {
        return industries[(new Random().nextInt(10))];
    }
}
