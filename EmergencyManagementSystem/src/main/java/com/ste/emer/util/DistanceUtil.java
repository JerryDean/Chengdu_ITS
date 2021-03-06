package com.ste.emer.util;


import java.text.NumberFormat;

/**
 * Created by hc on 2015/3/10.
 */
public class DistanceUtil {
    private static final double EARTH_RADIUS = 6378.137;
    private static double rad(double d){
        return d*Math.PI/180.0;
    }

    public static double GetDistance(double lat1,double lng1,double lat2,double lng2){
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s;
        s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) +
                Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
        s = s * EARTH_RADIUS;
//        DecimalFormat df = new DecimalFormat("#.0000");
//        df.format(s);

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMaximumFractionDigits(4);
        nf.format(s);
        return  s;
    }
}
