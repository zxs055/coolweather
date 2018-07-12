package com.zxs.coolweather.gson;


/**
 * Created by Administrator on 2018/7/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
