package com.example.wayne.fragmentslide;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

//    private ViewPager vp;
//    private TabPagerAdapter tabAdapter;
//    private ActionBar actbar;
//    private String[] tabname={"ALL", "Group1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp=(ViewPager)findViewById(R.id.viewpager);
        vp.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager()));

        SlidingTabLayout slidingTabLatout= (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        slidingTabLatout.setDistributeEvenly(true);
        slidingTabLatout.setViewPager(vp);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
