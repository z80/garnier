package com.grambopi.garnier;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Activity01 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity01, menu);
        return true;
    }
    
}
