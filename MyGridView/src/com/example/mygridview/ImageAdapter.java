package com.example.mygridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ImageAdapter extends ArrayAdapter<Integer> {

	Context context;
	Integer[] images;
	LayoutInflater inflater;

	public ImageAdapter(Context context, Integer[] objects) {
		super(context, 0, objects);

		this.context = context;
		images = objects;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	class ViewHolder {
		ImageView imageView;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// TODO Auto-generated method stub

		ViewHolder holder;

		if (view == null) {

			view = inflater.inflate(R.layout.row, null);
			holder = new ViewHolder();
			holder.imageView = (ImageView) view.findViewById(R.id.imageView1);
			view.setTag(holder);
		} else {

			holder = (ViewHolder) view.getTag();
		}

		holder.imageView.setImageResource(images[position]);

		return view;
	}
}
