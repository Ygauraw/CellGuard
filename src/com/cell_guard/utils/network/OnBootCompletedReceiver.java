package com.cell_guard.utils.network;



import com.cell_guard.utils.ui.Settings;

import com.cell_guard.utils.MySmsSender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;


public class OnBootCompletedReceiver extends BroadcastReceiver {
MySmsSender sender;
//CheckSim checkSim;
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		if("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()))
		{
			
			 Intent serviceLauncher = new Intent(context, OnSMSReceived.class);
		     context.startService(serviceLauncher);
		     Log.v("mit", " Background Service launched");
		     
		     sender=new MySmsSender(context);
			
			Settings setting=new Settings(context);
			TelephonyManager tmr=(TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
			String no=tmr.getLine1Number();
			if(no.equalsIgnoreCase(setting.getSimNo())){
				String cell_number="Your SIM Card is Changed The new Number is\n"+no;
			    sender.send(cell_number);
			}		
			
			//start service here
		
	}

}
}
