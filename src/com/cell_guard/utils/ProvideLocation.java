package com.cell_guard.utils;

import com.cell_guard.utils.MySmsSender;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

public class ProvideLocation implements LocationListener{

	 static Context context;
	MySmsSender sender;
	LocationManager locationManager;
    
    
	public ProvideLocation(Context c) {
		// TODO Auto-generated constructor stub
		ProvideLocation.context=c;
		sender=new MySmsSender(context);
		
		
	}
	
	
	public void getLocation() {
		// TODO Auto-generated method stub
		Log.v("in","getLocation");
		locationManager = (LocationManager)context. getSystemService(Context.LOCATION_SERVICE);
	    // Define the criteria how to select the locatioin provider -> use
	    // default
	    Criteria criteria = new Criteria();
	   String provider = locationManager.getBestProvider(criteria, false);
	    Location location = locationManager.getLastKnownLocation(provider);
Log.v("got", "last location");
	    // Initialize the location fields
	    if (location != null) {
	      System.out.println("Provider " + provider + " has been selected.");
	      onLocationChanged(location);
	    } else {
	      
	  sender.send("Location not available");
	  Log.v("should", "send failuare");
	    }
		
	}


	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		Log.d("sid", "onloc");
		if (location != null) {
			double lat = location.getLatitude();
			double lon = location.getLongitude();
			  Log.v("should", "send OK");
sender.send("Latitude="+lat+"\nLongitude="+lon);
		}
	}


	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}

}
