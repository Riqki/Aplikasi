package com.Riqki.wtcbatanghari;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView cfc=(ImageView)findViewById(R.id.imageView1);
        cfc.setOnClickListener (new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),CfcActivity.class);
				startActivity(i);
			}
		});
        
        ImageView bakmi=(ImageView)findViewById(R.id.imageView2);
        bakmi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent  i = new Intent(getApplicationContext(),BakmiActivity.class);
				startActivity(i);
			}
		});
        
        ImageView shida = (ImageView)findViewById(R.id.imageView3);
        shida.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent (getApplicationContext(),ShidaActivity.class);
				startActivity(i);
			}
		});
     }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
