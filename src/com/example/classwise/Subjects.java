package com.example.classwise;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Subjects extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container,  Bundle savedInstanceState){
		
		final View theInflatedView = inflater.inflate(R.layout.schedule, container, false);
		return theInflatedView;
	}
	
	@Override
	public void onStart() {
		super.onStart();
	}

}
