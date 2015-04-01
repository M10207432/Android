package com.example.wayne.fragmentslide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.wayne.fragmentslide.Fragment.All;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter{

	final int PAGE_COUNT=4;
	private String tabTitles[] = new String[]{"All", "Group1", "Group2","Other"};
	private Context context;
	
	public SampleFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
		this.context=context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int fragid) {
		// TODO Auto-generated method stub
        return All.newInstance(fragid);

//        return PageFragment.newInstance(fragid);
//		return null;
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
