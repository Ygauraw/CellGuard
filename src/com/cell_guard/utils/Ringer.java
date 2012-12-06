package com.cell_guard.utils;



import com.cell_guard.ui.R;

import android.app.Dialog;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ringer {

	static Context context;
	MediaPlayer player;
	public Ringer(Context c) {
		// TODO Auto-generated constructor stub
		Ringer.context=c;
	}
	public void ring() {
		// TODO Auto-generated method stub
		AudioManager am=(AudioManager) context.getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
		if(am.getRingerMode() == AudioManager.RINGER_MODE_SILENT || am.getRingerMode()==AudioManager.RINGER_MODE_VIBRATE) {
            am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
            }
		else
			am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
		 player = MediaPlayer.create(context,Settings.System.DEFAULT_RINGTONE_URI);
			try {
				player.prepare();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Log.d("Audio", ""+e.toString());
				
			} 
			player.start();
			
			 Dialog dialog = new Dialog(context);
             dialog.setContentView(R.layout.ring_dialog);
             dialog.setTitle("This is my custom dialog box");
             dialog.setCancelable(true);
          
             Button cancel=(Button) dialog.findViewById(R.id.ring_button);
             cancel.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					player.stop();
					
				}
			});
dialog.show();
             //set up text
//             TextView text = (TextView) dialog.findViewById(R.id.TextView01);
//             text.setText(R.string.lots_of_text);
}
}