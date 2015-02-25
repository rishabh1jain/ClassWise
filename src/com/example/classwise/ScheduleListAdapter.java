package com.example.classwise;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ScheduleListAdapter extends ArrayAdapter {
	List<String> days = null;
	LayoutInflater inflater;
	@SuppressWarnings("unchecked")
	public ScheduleListAdapter(Activity activity, List<String> days)
	{
		super(activity, R.layout.schedulerow, days);
		this.days = days;
		inflater = activity.getWindow().getLayoutInflater();
	}
	
	@SuppressLint("ViewHolder") @Override
    public View getView(int position, View convertView, ViewGroup parent){
		View view = inflater.inflate(R.layout.schedulerow, parent, false);
		 TextView title = (TextView)view.findViewById(R.id.day);
		 TextView load = (TextView)view.findViewById(R.id.workload);
		 title.setText(days.get(position));
		 load.setText("Workload : 5");
		 return view;
    }
}
