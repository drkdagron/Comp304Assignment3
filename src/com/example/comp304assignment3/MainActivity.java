package com.example.comp304assignment3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Paint paint = new Paint();
		paint.setColor(Color.RED);
		Bitmap bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
		Canvas can = new Canvas(bg);
		
		can.drawRect(100, 100, 380, 150, paint);
		
		Path wallpath = new Path();
		wallpath.reset();
		wallpath.moveTo(100, 100);
		wallpath.lineTo(130, 70);
		wallpath.lineTo(260, 70);
		wallpath.lineTo(290, 100);
		wallpath.moveTo(100, 100);
		can.drawPath(wallpath, paint);
		
		can.drawCircle(160, 150, 30, paint);
		can.drawCircle(320, 150, 30, paint);
		
		LinearLayout l = (LinearLayout)findViewById(R.id.drawarea);
		l.setBackgroundDrawable(new BitmapDrawable(bg));
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
