package com.example.catedraaci810;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	
	
	public final static String USER_VALUE = "com.example.catedraACI810.USER_VALUE";
	public final static String PASS_VALUE = "com.example.catedraACI810.PASS_VALUE";	
	
	public String user;
	public String pass;
	
	
	public Button botonLogin;
	public EditText userText, passText;
	SharedPreferences sharedPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		
		SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("app-data", Context.MODE_PRIVATE);   
		
		  user = sharedPreferences.getString(USER_VALUE,"");
	      pass = sharedPreferences.getString(PASS_VALUE,"");
	
	      userText = (EditText) findViewById(R.id.et001);
	      passText = (EditText) findViewById(R.id.et002);
	 
	      botonLogin = (Button) findViewById(R.id.button03);
		
	

	botonLogin.setOnClickListener(new View.OnClickListener(){
  	  
		  public void onClick(View view){	 
	          if(Correcto()){
	             Intent i = new Intent(LoginActivity.this,ApliActivity.class);
	             startActivity(i);
	          }else{
	             Toast toast1 = Toast.makeText(getApplicationContext(),"User/pass incorrectos", Toast.LENGTH_SHORT);
	             toast1.show();
	          }
	        
	        }
			private boolean Correcto()  {
			boolean ok = false;
		      String nt, pt;
		      
		      nt = userText.getText().toString();
		      pt = passText.getText().toString();
		      Log.d("onlclick",nt + " " + pt);
		      Log.d("onlclick",user + " " + pass);
		     
		      if((user != "")&&(pass != "")&&(nt.equals(user)&&pt.equals(pass))){
		         ok = true;
		      }
		      return ok;
		    }
	     });



}

}