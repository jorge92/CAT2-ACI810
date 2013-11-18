package com.example.catedraaci810;

import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	




	public void onStart(){
       
        //Nuestro código a ejecutar en este momento
		
		
			
		
        Intent intent = new Intent(this, RegistrosActivity.class);
        	 super.onStart();
        	startActivity(intent);
        	
        	
		
			
		}
	
	//if((RegistrosActivity.USER_VALUE!=LoginActivity.USER_VALUE) && (RegistrosActivity.PASS_VALUE!=LoginActivity.PASS_VALUE)){
			
			

    
	
	
	
	
	
}
	
	/*
	
	 public void onStop(){
	        super.onStop();
	        Intent intent3 = new Intent(this, LoginActivity.class);
	        
	    	
	      	 super.onStart();
	      	startActivity(intent3);
	   	
	   	}
	
	 
	 public void onRestart(){
	        super.onRestart();
	        Intent intent4 = new Intent(this, RegistrosActivity.class);
	        
	    	
	      	 super.onStart();
	      	startActivity(intent4);
	   	
	   	}
	 
	 
	 public void onDestroy(){
	        super.onDestroy();
	        Intent intent5 = new Intent(this, LoginActivity.class);
	        
	    	
	      	 super.onStart();
	      	startActivity(intent5);
	   	
	   	}
	 
	
}
	*/
