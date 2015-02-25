package com.example.classwise;

import java.util.Arrays;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Schedule extends ListFragment {
	List<String> days = Arrays.asList("Monday", "Tuesday", "Wednesday","Thursday","Friday");
	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container,  Bundle savedInstanceState){
		
		final View theInflatedView = inflater.inflate(R.layout.schedule, container, false);
		return theInflatedView;
	}
	
	@Override
	public void onStart() {
		super.onStart();
		ScheduleListAdapter daysListArrayAdapter = new ScheduleListAdapter(getActivity(), days);
		setListAdapter(daysListArrayAdapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// Passing data to the new activity called upon using the intent
		android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
		android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		DailyList fragment = new DailyList();
		fragmentTransaction.replace(R.layout.schedule, fragment);
		fragmentTransaction.addToBackStack(null);
		fragmentTransaction.commit();
	 }
}
