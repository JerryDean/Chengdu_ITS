package com.ste.emer.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xuzemin on 2015/3/6.
 */
public class PropertiesUtil {
    
//	public static List<Map<String, String>> list;
	public static String x;
    public static String y;
    public static String r;
    public static String l;
    static {
        Properties prop = new Properties();
        InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream("place.properties");
        try {
            prop.load(is);
            x = prop.getProperty("X").trim();
            y = prop.getProperty("Y").trim();
            r = prop.getProperty("R").trim();
            l = prop.getProperty("L").trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
