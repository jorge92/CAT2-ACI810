package com.example.catedraaci810;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SettActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sett);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sett, menu);
		return true;
	}

}
