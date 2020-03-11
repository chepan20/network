package com.cp.network.bean;

public class Weather {
    WeatherInfo weatherinfo;
//    {
//        "weatherinfo":{
//        "city":"北京",
//                "cityid":"101010100",
//                "temp1":"18℃",
//                "temp2":"31℃",
//                "weather":"多云转阴",
//                "img1":"n1.gif",
//                "img2":"d2.gif",
//                "ptime":"18:00"
//    }
//    }

    public static  class WeatherInfo{
        private String city;
    }
}
