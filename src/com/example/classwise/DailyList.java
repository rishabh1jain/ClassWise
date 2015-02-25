package com.example.classwise;

import java.util.Arrays;
import java.util.List;

import subjectdetails.subjectdetail;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DailyList extends ListFragment {
	List<subjectdetail> subjects = Arrays.asList(new subjectdetail("EC 451","LHC 102", "1000-1100"), new subjectdetail("EC 465","LHC 102", "1100-1200"));
	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container,  Bundle savedInstanceState){
		Log.w("YOY","RISHABh");
		final View theInflatedView = inflater.inflate(R.layout.day, container, false);
		return theInflatedView;
	}
	
	@Override
	public void onStart() {
		super.onStart();
		DailyListAdapter daysListArrayAdapter = new DailyListAdapter(getActivity(), subjects);
		setListAdapter(daysListArrayAdapter);
	}
	
	public static DailyList newInstance(){
        Log.d("DailyList", "newInstance");
        DailyList fragment = new DailyList();
        return  fragment;
    }
}
