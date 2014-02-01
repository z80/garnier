package com.grambopi.garnier;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Activity01 extends Activity {

	Intent intent;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
        
        //intent = new Intent(  );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity01, menu);
        return true;
    }

    public void onClick25(View v)
    {
    	//Intent i = new Intent( this, Activity02.class );
    	//i.set
    	//startService( i );
    }
    
    public void onClick35(View v)
    {
    }
    
    public void onClick45(View v)
    {
    }

    public void onClick55(View v)
    {
    }

}
