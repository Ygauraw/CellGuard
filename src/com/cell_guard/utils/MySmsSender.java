package com.cell_guard.utils;

import com.cell_guard.utils.ui.Settings;

import android.content.Context;
import android.telephony.SmsManager;

/**
 * 
 * @author webwerks
 *
 */
public class MySmsSender {
	String sms;
	 Context context;
	static Settings setting;
	/**
	* @param c context is used for passing to the constructor of setting because setting 
	* uses SharedPreferences which requires context.
	* @return null
	*/

	public MySmsSender(Context c) {
		// TODO Auto-generated constructor stub
		this.context=c;
		setting=new Settings(context);
		
	}
	/**
	 * 
	 * @param sms will be send as the text in sms
	 * This method is responsible for sending the sms. 
	 */
	public static void send(String sms) {
		// TODO Auto-generated method stub
/**
 * creating the object of SmsManager class and using that we are sending the
 * text message.
 */
	    SmsManager smsmgr=SmsManager.getDefault();
	    smsmgr.sendTextMessage(setting.getNumber1(), null, sms, null, null);
	    //smsmgr.sendTextMessage(setting.getNumber2(), null, sms, null, null);
	}

}
