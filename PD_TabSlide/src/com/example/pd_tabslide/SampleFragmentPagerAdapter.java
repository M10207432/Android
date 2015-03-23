package com.example.pd_tabslide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter{

	final int PAGE_COUNT=3;
	private String tabTitles[] = new String[]{"Tab1", "Tab2", "Tab3"};
	private Context context;
	
	public SampleFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
		this.context=context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return PageFragment.newInstance(arg0+1);
	}
	
	public CharSequence getPageTitle(int position){
		return tabTitles[position];
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return PAGE_COUNT;
	}
	

}
