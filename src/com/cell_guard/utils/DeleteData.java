package com.cell_guard.utils;

import java.io.File;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.ContactsContract;

public class DeleteData {
static Context sContext;
public DeleteData(Context c) {
	// TODO Auto-generated constructor stub
	DeleteData.sContext=c;
}
	public void deleteAll() {
		// TODO Auto-generated method stub
		
		ContentResolver contentResolver =sContext .getContentResolver();
        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        while (cursor.moveToNext()) {
            String lookupKey = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.LOOKUP_KEY));
            Uri uri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, lookupKey);
            contentResolver.delete(uri, null, null);
            
            
        }
        
        String state = Environment.getExternalStorageState();
		if(state.equals(Environment.MEDIA_MOUNTED))
		{
			File sdRoot = Environment.getExternalStorageDirectory();
			if(sdRoot != null)
			{
				deleteDir(sdRoot);
			}
		}
		
		
	}
	private static boolean deleteDir(File dir)
	{
		if (dir.isDirectory())
		{
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++)
			{
				boolean success = deleteDir(new File(dir, children[i]));
				if (!success)
				{
					return false;
				}
			}
		}

		// The directory is now empty so delete it
		return dir.delete();
	}

}
