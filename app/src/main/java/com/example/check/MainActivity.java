package com.example.check;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final CheckBox chkAndroid=(CheckBox)findViewById(R.id.chkAndroid);
		final CheckBox chkIphone=(CheckBox)findViewById(R.id.chkIphone);
		Button bt=(Button)findViewById(R.id.bt);
		bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(chkAndroid.isChecked()==true && chkIphone.isChecked()==true){
				Toast.makeText(MainActivity.this,"you select Both",20000).show();
				}
				else if(chkAndroid.isChecked()==true){
					Toast.makeText(MainActivity.this,"you select Android",20000).show();
					}
				else if(chkIphone.isChecked()==true){
					Toast.makeText(MainActivity.this,"you select Iphone",20000).show();
					}
				else
					Toast.makeText(MainActivity.this,"Please select any option",20000).show();
					
				
				
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
