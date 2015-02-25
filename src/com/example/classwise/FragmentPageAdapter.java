package com.example.classwise;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentPageAdapter extends FragmentPagerAdapter {

	public FragmentPageAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Fragment getItem(int arg0)
	{
		switch(arg0){
		case 0:
			return new Schedule();
		case 1:
			return new Subjects();	
		default:
			break;	
		}
		return null;
	}
	
	@Override
	public int getCount()
	{
		return 2;
	}

}

