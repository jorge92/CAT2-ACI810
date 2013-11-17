package com.example.catedraaci810;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;


public class RegistrosActivity extends Activity {
	
	
	public final static String NAME_VALUE = "com.example.catedraACI810.NAME_VALUE";	
	public final static String USER_VALUE = "com.example.catedraACI810.USER_VALUE";
	public final static String EMAIL_VALUE = "com.example.catedraACI810.EMAIL_VALUE";	
	public final static String PASS_VALUE = "com.example.catedraACI810.PASS_VALUE";	
	public final static String TELEFONO_VALUE = "com.example.catedraACI810.TELEFONO_VALUE";	
	public final static String SWITCH_VALUE ="com.example.catedraACI810.SWITCH_VALUE";
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registros);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registros, menu);
		return true;
	}
	
	
	

	public void onRegistro(View view) {		//esto hará la activacion de nuestro BUTTON
												//para eso "onClick" (se edita en el XML) debe llamarse como
												//el metodo "oneSubmitForm"
		
		
		
		 Intent registro = new Intent(this, ApliActivity.class);
		
        EditText nameEditText = (EditText) findViewById(R.id.et1);
        String name = nameEditText.getText().toString();
        
        EditText userEditText = (EditText) findViewById(R.id.et2);
        String user = userEditText.getText().toString();
        
        EditText emailEditText = (EditText) findViewById(R.id.et3);
        String email = emailEditText.getText().toString();
        
        EditText passEditText = (EditText) findViewById(R.id.et4);
        String pass = passEditText.getText().toString();
        
        EditText telefonoEditText = (EditText) findViewById(R.id.et5);
        String telefono = telefonoEditText.getText().toString();
        
        Switch switchEditText = (Switch) findViewById(R.id.switch1);
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
        
        
        
        Toast.makeText(RegistrosActivity.this,"Registrado", Toast.LENGTH_LONG).show();
        
       
        startActivity(registro);
        
        

	}
	
	
	
	
	
	
	
	
	
}