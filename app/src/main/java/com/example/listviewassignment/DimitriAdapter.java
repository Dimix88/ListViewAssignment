package com.example.listviewassignment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DimitriAdapter extends ArrayAdapter<String> {

    private String [] fruitName;
    private Integer [] fruitImage;
    private Activity context;

    public DimitriAdapter(Activity context, Integer [] fruitImage,String [] fruitName) {
        super(context, R.layout.activity_main,fruitName);

        this.context = context;
        this.fruitName = fruitName;
        this.fruitImage = fruitImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.layout,null,true);
        TextView text = (TextView) rowView.findViewById(R.id.textView);
        ImageView pics = (ImageView) rowView.findViewById(R.id.imageView);
        text.setText(fruitName[position]);
        pics.setImageResource(fruitImage[position]);
        return rowView;

    }
}
