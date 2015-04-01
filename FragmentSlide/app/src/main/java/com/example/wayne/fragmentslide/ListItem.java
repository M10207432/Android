package com.example.wayne.fragmentslide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ESSLab on 2015/3/31.
 */

public class ListItem extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] name;
    private final Integer[] imageid;
    private final Integer[] groupid;

    public ListItem (Activity context, String[] name, Integer[] imageid , Integer[] groupid){
        super(context, R.layout.listitem_layout, name);

        this.context=context;
        this.name=name;
        this.imageid=imageid;
        this.groupid=groupid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View view = inflater.inflate(R.layout.listitem_layout, null, true);

        TextView tv = (TextView)view.findViewById(R.id.textView);
        ImageView img = (ImageView)view.findViewById(R.id.imageView);
        ImageView gimg = (ImageView)view.findViewById(R.id.imggroup);

        tv.setText(name[position]);
        img.setImageResource(imageid[position]);
        gimg.setImageResource(groupid[position]);

        return view;
    }
}
