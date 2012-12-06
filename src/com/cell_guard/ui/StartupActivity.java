package com.cell_guard.ui;

import com.cell_guard.utils.ui.Settings;

import android.os.Bundle;
import android.content.Intent;
import android.telephony.TelephonyManager;


public class StartupActivity extends BaseActivity implements Runnable{
Settings settings;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        settings=new Settings(this);
        setContentView(R.layout.activity_main);
        
        if(settings.getSimNo().equals(settings.getDefaulta())){
        	TelephonyManager tmr=(TelephonyManager) this.getSystemService(StartupActivity.TELEPHONY_SERVICE);
        	settings.setSimNo(tmr.getLine1Number());
        	settings.setDelete("delete");
        	settings.setLocation("location");
        	settings.setLock("lock");
        	settings.setNumber1("5556");
        	settings.setNumber2("7385735373");
        	settings.setRing("ring");
        }
        Thread thread=new Thread(this);
        thread.start();
    }
 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
new Thread(new Runnable() {
	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				if(settings.getLocation().equals(settings.getDefaulta()))
				{
					Intent intent=new Intent(StartupActivity.this,InstructionsActivity.class);
					startActivity(intent);
				}
				else
				{
					Intent intent=new Intent(StartupActivity.this,SetupActivity.class);
					startActivity(intent);
				}
				//Intent i=new Intent(MainActivity.this,)
				
			}
		}).start();
	}

    
}
