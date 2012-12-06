package com.cell_guard.ui;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class BaseActivity extends Activity{
	
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        //Used to put dark icons on light action bar
	     //   boolean isLight = R.style.Theme_Sherlock == R.style.Theme_Sherlock_Light;
	   
//	        menu.add("Save")
//	            .setIcon(isLight ? R.drawable.ic_launcher : R.drawable.ic_launcher)
//	            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
//	        
//	        menu.add("Refresh")
//	        .setIcon(isLight ? R.drawable.ic_launcher : R.drawable.ic_launcher)
//	        .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
//	      
//
//	       
//
//	        menu.add("Refresh")
//	            .setIcon(isLight ? R.drawable.ic_launcher : R.drawable.ic_launcher)
//	            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);

	        return true;
	    }
		public boolean onOptionsItemSelected(MenuItem item) {
		// CREATE MENU EVENTS
		return false;
		}
		


}
