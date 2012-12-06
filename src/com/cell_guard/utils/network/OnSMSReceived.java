package com.cell_guard.utils.network;

import com.cell_guard.utils.ui.Settings;
import com.cell_guard.utils.DeleteData;
import com.cell_guard.utils.LockPhone;
import com.cell_guard.utils.ProvideLocation;
import com.cell_guard.utils.Ringer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class OnSMSReceived extends BroadcastReceiver{
Settings setting;
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		setting=new Settings(context);
		Bundle bundle = intent.getExtras();
        SmsMessage[] msgs = null;
        String str = "";
        if (bundle != null)
        {
         
            Object[] pdus = (Object[]) bundle.get("pdus");
            msgs = new SmsMessage[pdus.length];
            for (int i=0; i<msgs.length; i++)
            {
                msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
                str += msgs[i].getMessageBody().toString();		                
            }
            
         
            
        }
        Log.d("message", str);
        if(str.equalsIgnoreCase(setting.getDelete()) || str.equalsIgnoreCase(setting.getLocation()) || str.equalsIgnoreCase(setting.getLock()) || str.equalsIgnoreCase(setting.getRing())){
        	this.abortBroadcast();
        }
        	
        
        if(str.equalsIgnoreCase(setting.getDelete()))
        {
        	DeleteData dd=new DeleteData(context);
        	dd.deleteAll();
        }
        else if(str.equalsIgnoreCase(setting.getLocation())){
        	ProvideLocation pl=new ProvideLocation(context);
        	pl.getLocation();
        }
        else if(str.equalsIgnoreCase(setting.getLock())){
        	LockPhone lp=new LockPhone(context,intent);
        	lp.lock();
        }
        else if(str.equalsIgnoreCase(setting.getRing())){ 
        	Ringer ringger=new Ringer(context);
        	ringger.ring();
        }
	}

}
