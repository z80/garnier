package com.grambopi.garnier;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Activity08 extends Activity {

	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Remove title bar
		requestWindowFeature( Window.FEATURE_NO_TITLE );
		//Remove notification bar
		getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );		
		// Fix landscape orientation.
		setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE );
				
		setContentView(R.layout.activity_08);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity01, menu);
		return true;
	}
	
	@Override
    public void onBackPressed() {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Выход из приложения")
		       .setCancelable(false)
		       .setPositiveButton("Да", new DialogInterface.OnClickListener()
		       							{
		           							public void onClick(DialogInterface dialog, int id)
		           			                {
		           								// do things
		           								//finish();
		           								Intent intent = new Intent(Intent.ACTION_MAIN);
		           								intent.addCategory(Intent.CATEGORY_HOME);
		           								intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		           								startActivity(intent);
											finish();
                                                                                        
		           			                }
		                                }
		                         );
		AlertDialog alert = builder.create();
		alert.show();


    }   

}
