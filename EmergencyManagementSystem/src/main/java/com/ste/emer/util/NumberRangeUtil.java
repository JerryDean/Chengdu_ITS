package com.ste.emer.util;

/**
 * Created by hc on 2015/3/10.
 */
public class NumberRangeUtil {

    private final static int l = Integer.parseInt(PropertiesUtil.l);
    public static int getNumber(int r){
        int max = r*r*l;
        return max;
    }
}
