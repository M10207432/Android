package com.example.wayne.fragmentslide.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.wayne.fragmentslide.ListItem;
import com.example.wayne.fragmentslide.R;

public class All extends Fragment {
	
	public static final String ARG_PAGE="ARG_PAGE";
	private int mPage;
    private int tag=1;
	public static All newInstance (int page) {
		// TODO Auto-generated constructor stub
		Bundle args= new Bundle();
		args.putInt(ARG_PAGE, page);
		
		All fragment = new All();
		fragment.setArguments(args);
		return fragment;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mPage = getArguments().getInt(ARG_PAGE);
	}

    /*==========================================================
                            Assign Your List from the SQLite
     ==========================================================*/
    String[] listvalue = new String[]{
            "A","B","C"
    };
    Integer[] imageid={
        R.drawable.a,
        R.drawable.b,
        R.drawable.c
    };
    Integer[] groupid={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c
    };
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup containter, Bundle saveInstanceState){
		View view = inflater.inflate(R.layout.fragement_all, containter, false);

        ListView list=(ListView) view.findViewById(R.id.listView);
//        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,listvalue);//
        ListItem adapter = new ListItem(getActivity(), listvalue, imageid, groupid);
        list.setAdapter(adapter);

		return view;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
