package com.cell_guard.utils.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class Settings {
	Context context;
	SharedPreferences preferences;
	String LOCATION="location";
	String DELETE="mem_delete";
	String LOCK="cell_lock";
	String RING="ring";
	String PASSWORD="passwd";
	String NUMBER1="number1";
	String NUMBER2="number2";
	String OLD_SIM_NO="simno";
	String DEFAULT="-1";
	
	public Settings(Context context){
		this.context=context;
		 preferences=PreferenceManager.getDefaultSharedPreferences(context);
	}
	public void clear()
	{
		preferences.edit().clear();
		preferences.edit().commit();
	}
	
	public void setLocation(String location)
	{
		Editor editor = preferences.edit();
		editor.putString(this.LOCATION, location);
		editor.commit();
	}
	public void setDelete(String delete)
	{
		Editor editor = preferences.edit();
		editor.putString(this.DELETE, delete);
		editor.commit();
	}
	public void setLock(String lock)
	{
		Editor editor = preferences.edit();
		editor.putString(this.LOCK, lock);
		editor.commit();
	}
	public void setRing(String ring)
	{
		Editor editor = preferences.edit();
		editor.putString(this.RING, ring);
		editor.commit();
	}
	public void setNumber1(String no1)
	{
		Editor editor=preferences.edit();
		editor.putString(this.NUMBER1, no1);
		editor.commit();
	}
	
	public void setNumber2(String no2)
	{
		Editor editor=preferences.edit();
		editor.putString(this.NUMBER2, no2);
		editor.commit();
	}
	
	public void setSimNo(String simno)
	{
		Editor editor=preferences.edit();
		editor.putString(this.OLD_SIM_NO, simno);
		editor.commit();
	}
	
	public String getLocation()
	{
		return preferences.getString(LOCATION, DEFAULT);
	}
	public String getDelete()
	{
		return preferences.getString(DELETE,DEFAULT);
	}
	public String getLock()
	{
		return preferences.getString(LOCK,DEFAULT);
	}
	public String getRing()
	{
		return preferences.getString(RING,DEFAULT);
	}
	public String getNumber1()
	{
		return preferences.getString(NUMBER1, DEFAULT);
	}
	public String getNumber2()
	{
		return preferences.getString(NUMBER2, DEFAULT);
	}
	public String getSimNo()
	{
		return preferences.getString(OLD_SIM_NO, DEFAULT);
	}
	public String getDefaulta()
	{
		return  DEFAULT;
	}
}
