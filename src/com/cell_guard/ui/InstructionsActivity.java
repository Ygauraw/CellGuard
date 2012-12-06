package com.cell_guard.ui;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class InstructionsActivity extends BaseActivity implements OnClickListener{
	Button btnNext,btnSkip;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.instructions);
	 btnNext=(Button) findViewById(R.id.next);
	 btnSkip=(Button) findViewById(R.id.skip);
	btnNext.setOnClickListener(this);
	btnSkip.setOnClickListener(this);
	
}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	if(v==btnNext) Toast.makeText(this, "Next", Toast.LENGTH_LONG).show();
	
	if(v==btnSkip){
		Intent intent=new Intent(InstructionsActivity.this,SetupActivity.class);
		startActivity(intent);
	}
	
}
}
