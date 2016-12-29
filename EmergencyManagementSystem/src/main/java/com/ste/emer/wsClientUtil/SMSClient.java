package com.ste.emer.wsClientUtil;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.ste.emer.client.SMSManagement.ISendMessageWS;
import com.ste.emer.client.SMSManagement.SendMessageWS;


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
 * <p>PackageName : com.ste.emer.WSClient </p>
 * <p>ClassName   : SMSClient.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-12-01</p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

public class SMSClient {

	    public final static QName sendMessageWS = new QName("http://impl.webService.SMSManagement.stee.com/", "SendMessageWS");
	    public static ISendMessageWS getSMSManagementClient(String wsdlUrl){
			URL wsdlURL = null;
			try {
	       	 	wsdlURL = new URL(wsdlUrl);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
	        return new SendMessageWS(wsdlURL, sendMessageWS).getSendMessageWSImplPort();
		}
}
