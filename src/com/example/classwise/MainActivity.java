package com.example.classwise;


import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;


@SuppressWarnings("deprecation")
public class MainActivity extends android.support.v4.app.FragmentActivity implements ActionBar.TabListener {

	ActionBar actionBar;
    ViewPager viewPager;
    FragmentPageAdapter ft;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        ft = new FragmentPageAdapter(getSupportFragmentManager());
        actionBar = getActionBar();
        
        //ViewPager used the fragmentpage adapter to inflate itself with the data.
        viewPager.setAdapter(ft);
        
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Schedule").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("My Subjects").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Notices").setTabListener(this));
        
        // The onPageChangeListeners methods
        //Methods that will be invoked as per the situation.
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				//Whenevr we swipe to a different page, the corresponding navigation item is selected.
				actionBar.setSelectedNavigationItem(arg0);
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }
    
    
	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
		
		//Whenever a page is selected, view pager gets the position
		//The fragment adapter using this position pass the respective object.
		//The object, onCreateView is called, which inflates the screen with the layout
		viewPager.setCurrentItem(arg0.getPosition());
		
	}
	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
