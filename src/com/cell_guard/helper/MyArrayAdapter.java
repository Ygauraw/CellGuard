package com.cell_guard.helper;

import com.cell_guard.ui.R;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



public class MyArrayAdapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] values;
	private final String[] titles={"Alternate Number 1","Alternate Number 2","Text For Deleting Data","Text To Find Location","Text To Lock","Text To Ring"};
	public MyArrayAdapter(Context context,	String[] values) {
		super(context, R.layout.setup, values);
		this.context = context;
		this.values = values;
		
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.setup, parent, false);
		TextView textValue = (TextView) rowView.findViewById(R.id.value);
		TextView textTitle=(TextView)rowView.findViewById(R.id.title);
		textValue.setText(values[position]);
		textTitle.setText(titles[position]);
 
		Log.d("pos",""+position);
 
		return rowView;
	}

}
