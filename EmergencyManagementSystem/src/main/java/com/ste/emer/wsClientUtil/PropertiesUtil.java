package com.ste.emer.wsClientUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/** Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD
 * All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics Info-comm Systems PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or licence agreement with ST Electronics Info-comm Systems PTE. LTD.
 *
 * Project Name : emergency
 * <p>PackageName : com.ste.emer.wsClientUtil </p>
 * <p>ClassName   : PropertiesUtil.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-12-01</p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

public class PropertiesUtil {
	
	public static String wsdlUrl;
    
    static {
        Properties prop = new Properties();
        InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream("WS.properties");
        try {
            prop.load(is);
            wsdlUrl = prop.getProperty("wsdlUrl").trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
