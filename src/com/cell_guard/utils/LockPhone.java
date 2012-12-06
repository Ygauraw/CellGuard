package com.cell_guard.utils;




import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class LockPhone {
MySmsSender sender;
	static Context context;
	Intent intent;
	Notification notification;
	public LockPhone(Context c ,Intent i) {
		// TODO Auto-generated constructor stub
		this.context=c;
		this.intent=i;
		sender=new MySmsSender(context);
		
		
		
	}
	public void lock() {
		// TODO Auto-generated method stub
		
		
		NotificationManager mManager = (NotificationManager) context
				.getSystemService(Context.NOTIFICATION_SERVICE);
		 notification = new Notification(com.cell_guard.ui.R.drawable.ic_launcher,
				"Notify", System.currentTimeMillis());

	
						Toast.makeText(context, "Locking", Toast.LENGTH_SHORT).show();
						notification.setLatestEventInfo(context, "mit",
								"Phone Has been Lost or Stolen , Locking the Phone",PendingIntent.getActivity(context, 0, intent,
										PendingIntent.FLAG_CANCEL_CURRENT));
						mManager.notify(12345, notification);
						android.provider.Settings.System.putInt(context
								.getContentResolver(),
								android.provider.Settings.System.SCREEN_BRIGHTNESS, 0);
						android.provider.Settings.System.putInt(context.getContentResolver(),
								android.provider.Settings.System.SCREEN_OFF_TIMEOUT, 0);
						
		
					

}
}