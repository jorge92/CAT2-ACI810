package com.example.catedraaci810;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	
		return true;
	}
	
	
	

	
	@SuppressWarnings("unused")
	public void onStart(){
       
        //Nuestro código a ejecutar en este momento
        Intent intent = new Intent(this, RegistrosActivity.class);
        Intent intent2 = new Intent(this, LoginActivity.class);

       
        if(RegistrosActivity.USER_VALUE == LoginActivity.USER_VALUE && RegistrosActivity.PASS_VALUE == LoginActivity.PASS_VALUE ){
        	 super.onStart();
        	startActivity(intent2);
        	
        }else{
        	 super.onStart();
        	startActivity(intent);
        }
        	
        	
        
        
    }
	
	
	
	
}	
	
