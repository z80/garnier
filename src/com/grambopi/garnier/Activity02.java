package com.grambopi.garnier;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Activity02 extends Activity {

	Intent intent;
	String age;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Fix landscape orientation.
		setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE );
		//Remove title bar
		requestWindowFeature( Window.FEATURE_NO_TITLE );
		//Remove notification bar
		getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );		
		
		age = getIntent().getStringExtra("age").toString();
		intent = new Intent(this, Activity03.class);
		intent.putExtra("age", age);

		if (age.contentEquals( "25" ) ) {
			setContentView(R.layout.activity_02_25);
		} else if (age.contentEquals( "35" ) ) {
			setContentView(R.layout.activity_02_35);
		} else if (age.contentEquals( "45" ) ) {
			setContentView(R.layout.activity_02_45);
		} else {
			setContentView(R.layout.activity_02_55);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity01, menu);
		return true;
	}

	public void onClick(View v) {
		startActivity(intent);
	}

}
