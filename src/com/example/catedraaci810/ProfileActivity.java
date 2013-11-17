package com.example.catedraaci810;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;


public class ProfileActivity extends Activity {
	
	
	
	public final static String NAME_VALUE = "com.example.catedraACI810.NAME_VALUE";	
	public final static String USER_VALUE = "com.example.catedraACI810.USER_VALUE";
	public final static String EMAIL_VALUE = "com.example.catedraACI810.EMAIL_VALUE";	
	public final static String PASS_VALUE = "com.example.catedraACI810.PASS_VALUE";	
	public final static String TELEFONO_VALUE = "com.example.catedraACI810.TELEFONO_VALUE";	
	public final static String SWITCH_VALUE ="com.example.catedraACI810.SWITCH_VALUE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		
		SharedPreferences sharedPref = getSharedPreferences("app-data", Context.MODE_PRIVATE);	
		
		String name = sharedPref.getString(RegistrosActivity.NAME_VALUE, "not set");
		String user = sharedPref.getString(RegistrosActivity.USER_VALUE, "not set");
		String email = sharedPref.getString(RegistrosActivity.EMAIL_VALUE, "not set");
		String pass = sharedPref.getString(RegistrosActivity.PASS_VALUE, "not set");
		String telefono = sharedPref.getString(RegistrosActivity.TELEFONO_VALUE, "not set");
		Boolean switchEdit = (Boolean) sharedPref.getBoolean(RegistrosActivity.SWITCH_VALUE, true);
		
		
        
		
		
		EditText nameEditText = (EditText) findViewById(R.id.et01);
        nameEditText.setText(name);
        
        EditText userEditText = (EditText) findViewById(R.id.et02);
        userEditText.setText(user);
        
        EditText emailEditText = (EditText) findViewById(R.id.et03);
        emailEditText.setText(email);
        
        EditText passEditText = (EditText) findViewById(R.id.et04);
        passEditText.setText(pass);
        
        EditText telefonoEditText = (EditText) findViewById(R.id.et05);
        telefonoEditText.setText(telefono);
        
        Switch sw01  = (Switch) findViewById(R.id.switch01);
        sw01.setChecked(switchEdit);


    	
	}



	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.profile, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	
	


	
	
	
	public void onSave(View view) {		//esto hará la activacion de nuestro BUTTON
		//para eso "onClick" (se edita en el XML) debe llamarse como
		//el metodo "oneSubmitForm"



		

		EditText nameEditText = (EditText) findViewById(R.id.et01);
		String name = nameEditText.getText().toString();

		EditText userEditText = (EditText) findViewById(R.id.et02);
		String user = userEditText.getText().toString();
		
		EditText emailEditText = (EditText) findViewById(R.id.et03);
		String email = emailEditText.getText().toString();
		
		EditText passEditText = (EditText) findViewById(R.id.et04);
		String pass = passEditText.getText().toString();
		
		EditText telefonoEditText = (EditText) findViewById(R.id.et05);
		String telefono = telefonoEditText.getText().toString();
		
		Switch switchEditText = (Switch) findViewById(R.id.switch01);
		Boolean switchEditOn = switchEditText.isChecked();
		
		SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("app-data", Context.MODE_PRIVATE);  
		
		
		@SuppressWarnings("unused")
		Boolean bool = sharedPref.getBoolean("is_registered", false);
		
		SharedPreferences.Editor editor = sharedPref.edit();   
		
		editor.putBoolean("is_registered", true); 
		
		
		
		
		editor.putString(NAME_VALUE, name);
		editor.putString(USER_VALUE, user);	
		editor.putString(EMAIL_VALUE, email);
		editor.putString(PASS_VALUE, pass);	
		editor.putString(TELEFONO_VALUE, telefono);	
		editor.putBoolean(SWITCH_VALUE, switchEditOn);
		
		editor.commit();
		
		
		
		Toast.makeText(ProfileActivity.this,"Actualizado", Toast.LENGTH_LONG).show();
					
		}
	
	
	
	
	public void volver(View view) { 
		
		Intent comeBack = new Intent(this, ApliActivity.class);


		startActivity(comeBack);
		
	}
			

}	
	

