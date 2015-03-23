package com.example.pd_tabslide;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {
	
	public static final String ARG_PAGE="ARG_PAGE";
	private int mPage;

	public static PageFragment newInstance (int page) {
		// TODO Auto-generated constructor stub
		Bundle args= new Bundle();
		args.putInt(ARG_PAGE, page);
		
		PageFragment fragment = new PageFragment();
		fragment.setArguments(args);
		return fragment;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mPage = getArguments().getInt(ARG_PAGE);
	}
	
	public View OnCreateView(LayoutInflater inflater, ViewGroup containter, Bundle saveInstanceState){
		View view = inflater.inflate(R.layout.fragment_page, containter, false);
		TextView tv=(TextView) view;
		tv.setText("FRAGMENT # "+mPage);
		return view;
		
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
