package com.cell_guard.ui;

import com.cell_guard.helper.MyArrayAdapter;
import com.cell_guard.utils.ui.Settings;



import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class SetupActivity extends ListActivity{
	static String[] values;
	Settings settings;
	EditText new_variable;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		settings=new Settings(this);
		 values = 
		            new String[] { 
				 settings.getNumber1(),
		         settings.getNumber2(),
				settings.getDelete(),
		            settings.getLocation(),
		            settings.getLock(),
		           
		            settings.getRing(),};
		setListAdapter(new MyArrayAdapter(this, values));
		

	}

@Override
protected void onListItemClick(ListView l, View v, int position, long id) {
	// TODO Auto-generated method stub
	switch (position) {
	case 1:
		Dialog dialog1 = new Dialog(this);
	     dialog1.setContentView(R.layout.setup_dialog);
	     dialog1.setTitle("SMS Text Changing Window");
	     dialog1.setCancelable(true);
	      new_variable=(EditText)dialog1.findViewById(R.id.new_value);
	     Button save1=(Button) dialog1.findViewById(R.id.dialog_save);
	     save1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				settings.setNumber1(new_variable.getText().toString());
				Intent intent=new Intent(SetupActivity.this,SetupActivity.class);
				startActivity(intent);
			}
		});
	     dialog1.show();
		break;
		
	case 2:
		Dialog dialog2 = new Dialog(this);
	     dialog2.setContentView(R.layout.setup_dialog);
	     dialog2.setTitle("SMS Text Changing Window");
	     dialog2.setCancelable(true);
	      new_variable=(EditText)dialog2.findViewById(R.id.new_value);
	     Button save=(Button) dialog2.findViewById(R.id.dialog_save);
	     save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				settings.setNumber2(new_variable.getText().toString());
				Intent intent=new Intent(SetupActivity.this,SetupActivity.class);
				startActivity(intent);
			}
		});
	     dialog2.show();
		break;
		
	case 3:
		Dialog dialog3 = new Dialog(this);
	     dialog3.setContentView(R.layout.setup_dialog);
	     dialog3.setTitle("SMS Text Changing Window");
	     dialog3.setCancelable(true);
	      new_variable=(EditText)dialog3.findViewById(R.id.new_value);
	     Button save3=(Button) dialog3.findViewById(R.id.dialog_save);
	     save3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				settings.setDelete(new_variable.getText().toString());
				Intent intent=new Intent(SetupActivity.this,SetupActivity.class);
				startActivity(intent);
			}
		});
	     dialog3.show();
		break;
		
	case 4:
		Dialog dialog4= new Dialog(this);
	     dialog4.setContentView(R.layout.setup_dialog);
	     dialog4.setTitle("SMS Text Changing Window");
	     dialog4.setCancelable(true);
	      new_variable=(EditText)dialog4.findViewById(R.id.new_value);
	     Button save4=(Button) dialog4.findViewById(R.id.dialog_save);
	     save4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				settings.setLocation(new_variable.getText().toString());
				Intent intent=new Intent(SetupActivity.this,SetupActivity.class);
				startActivity(intent);
			}
		});
	     dialog4.show();
		break;
		
	case 5:
		Dialog dialog5 = new Dialog(this);
	     dialog5.setContentView(R.layout.setup_dialog);
	     dialog5.setTitle("SMS Text Changing Window");
	     dialog5.setCancelable(true);
	      new_variable=(EditText)dialog5.findViewById(R.id.new_value);
	     Button save5=(Button) dialog5.findViewById(R.id.dialog_save);
	     save5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				settings.setLock(new_variable.getText().toString());
				Intent intent=new Intent(SetupActivity.this,SetupActivity.class);
				startActivity(intent);
			} 
		});
	     dialog5.show();
		break;
		
	case 6:
		Dialog dialog6 = new Dialog(this);
	     dialog6.setContentView(R.layout.setup_dialog);
	     dialog6.setTitle("SMS Text Changing Window");
	     dialog6.setCancelable(true);
	      new_variable=(EditText)dialog6.findViewById(R.id.new_value);
	     Button save6=(Button) dialog6.findViewById(R.id.dialog_save);
	     save6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				settings.setRing(new_variable.getText().toString());
				Intent intent=new Intent(SetupActivity.this,SetupActivity.class);
				startActivity(intent);
			}
		});
	     dialog6.show();
		break;

	default:
		break;
	}
	 
	super.onListItemClick(l, v, position, id);
}
}
