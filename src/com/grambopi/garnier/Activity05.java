package com.grambopi.garnier;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Activity05 extends Activity {

	Intent intent;
	String age;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Remove title bar
		requestWindowFeature( Window.FEATURE_NO_TITLE );
		//Remove notification bar
		getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );		
		// Fix landscape orientation.
		setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE );
				
		setContentView(R.layout.activity_05);

		// age = getIntent().getStringExtra( "age" );
		intent = new Intent(this, Activity06.class);
		// intent.putExtra( "age", age );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity01, menu);
		return true;
	}

	public void onClick25(View v) {
		intent.putExtra("age", "25");
		startActivity(intent);
		finish();
	}

	public void onClick35(View v) {
		intent.putExtra("age", "35");
		startActivity(intent);
		finish();
	}

	public void onClick45(View v) {
		intent.putExtra("age", "45");
		startActivity(intent);
		finish();
	}

	public void onClick55(View v) {
		intent.putExtra("age", "55");
		startActivity(intent);
		finish();
	}

}
