package com.example.catedraaci810;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;


public class ApliActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.apli);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.apli, menu);
		return true;
	}

	public void onApp1(View view) {		


Intent profile = new Intent(this, ProfileActivity.class);


startActivity(profile);


}
	public void onApp2(View view) {		


		Intent login = new Intent(this, LoginActivity.class);


		startActivity(login);



		}
		


}
