package com.example.classwise;

import java.util.List;

import subjectdetails.subjectdetail;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DailyListAdapter extends ArrayAdapter{
	List<subjectdetail> subjects = null;
	LayoutInflater inflater;
	@SuppressWarnings("unchecked")
	public DailyListAdapter(Activity activity, List<subjectdetail> subjects)
	{
		super(activity, R.layout.dayrow, subjects);
		this.subjects = subjects;
		inflater = activity.getWindow().getLayoutInflater();
	}
	
	@SuppressLint("ViewHolder") @Override
    public View getView(int position, View convertView, ViewGroup parent){
		View view = inflater.inflate(R.layout.dayrow, parent, false);
		 TextView subject = (TextView)view.findViewById(R.id.subject);
		 TextView venue = (TextView)view.findViewById(R.id.venue);
		 TextView time = (TextView)view.findViewById(R.id.time);
		 subject.setText(subjects.get(position).getName());
		 venue.setText(subjects.get(position).getVenue());
		 time.setText(subjects.get(position).getTime());
		 return view;
    }

}
