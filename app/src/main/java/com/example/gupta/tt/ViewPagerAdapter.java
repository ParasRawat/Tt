package com.example.gupta.tt;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
    String[] timings;
    Spinner wday;

    public ViewPagerAdapter(Context context,Spinner wday) {
        this.context = context;
        timings=context.getResources().getStringArray(R.array.slots);
        this.wday=wday;
    }

    @Override
    public int getCount() {
        return timings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        TextView head;
        Spinner sub,teach,room;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.viewpager_item, container,
                false);

        head = (TextView) itemView.findViewById(R.id.head);
        sub=(Spinner) itemView.findViewById(R.id.sub);
        teach=(Spinner) itemView.findViewById(R.id.teach);
        room=(Spinner) itemView.findViewById(R.id.room);

        head.setText("| "+(String)wday.getSelectedItem()+"   "+timings[position]+" | ");
        ArrayAdapter<CharSequence> sub_adapter=ArrayAdapter.createFromResource(this.context,R.array.subjects,android.R.layout.simple_spinner_item);
        sub_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sub.setAdapter(sub_adapter);
        ArrayAdapter<CharSequence> teach_adapter=ArrayAdapter.createFromResource(this.context,R.array.teachers,android.R.layout.simple_spinner_item);
        teach_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        teach.setAdapter(teach_adapter);
        ArrayAdapter<CharSequence> room_adapter=ArrayAdapter.createFromResource(this.context,R.array.rooms,android.R.layout.simple_spinner_item);
        room_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        room.setAdapter(room_adapter);

        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((RelativeLayout) object);
    }

    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
