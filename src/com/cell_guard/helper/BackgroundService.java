package com.cell_guard.helper;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BackgroundService extends Service{

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
@Override
public int onStartCommand(Intent intent, int flags, int startId) {
	// TODO Auto-generated method stub
	//do what ever u want
	return super.onStartCommand(intent, flags, startId);
	
}
}
