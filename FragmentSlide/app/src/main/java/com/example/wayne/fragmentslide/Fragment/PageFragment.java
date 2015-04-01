package com.example.wayne.fragmentslide.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wayne.fragmentslide.R;

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
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup containter, Bundle saveInstanceState){
		View view = inflater.inflate(R.layout.fragment_page, containter, false);
		TextView tv=(TextView) view;
		tv.setText("Hi # "+mPage);
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
