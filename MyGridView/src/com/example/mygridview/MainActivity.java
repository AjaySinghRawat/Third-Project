package com.example.mygridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {

	Integer[] images = { R.drawable.a, R.drawable.b, R.drawable.c,
			R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.h,
			R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l,
			R.drawable.m, R.drawable.n, R.drawable.o };

	/*
	 * static final String[] numbers = new String[] { "A", "B", "C", "D", "E",
	 * "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
	 * "T", "U", "V", "W", "X", "Y", "Z" };
	 */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		GridView gridView = (GridView) findViewById(R.id.gridView1);

		/*
		 * ArrayAdapter<String> adapter = new ArrayAdapter<String>(
		 * getApplicationContext(), android.R.layout.simple_list_item_1,
		 * numbers);
		 */

		ImageAdapter adapter = new ImageAdapter(getApplicationContext(), images);
		gridView.setAdapter(adapter);

	}

}
