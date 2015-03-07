package com.example.handlingbuttonclick;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener
{

	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		Toast.makeText(MainActivity.this,"U have Clicked a Button", Toast.LENGTH_LONG).show();
	}



}
