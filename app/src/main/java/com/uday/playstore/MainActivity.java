package com.uday.playstore;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.HashMap;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;
    TabLayout tl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vp);
        tl = (TabLayout) findViewById(R.id.tl);

        CardView mainCard = (CardView) findViewById(R.id.main_card);

        final EditText serchtext = (EditText) findViewById(R.id.serchtext);
//        serchtext.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//
//            public void onFocusChange(View v, boolean hasFocus) {
//
//                if(hasFocus){
//                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//                    imm.hideSoftInputFromWindow(serchtext.getWindowToken(), 0);
//                }
//            }
//        });

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tl.setupWithViewPager(viewPager);


//        serchtext.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
//                    performSearch();
//                    return true;
//                }
//                return false;
//            }
//        });
    }

    class MyAdapter extends FragmentStatePagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment f = null;
            if (position == 0) {
                f = new Apps();

            }
            if (position == 1) {
                f = new Movies();
            }
//            if(position==2)
//            {
//                f= new ContactFragment();
//            }
            return f;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String name = null;
            if (position == 0) {
                name = "APPS & GAMES";
            }

            if (position == 1) {
                name = "MOVIES,MUSIC\nBOOKS";
            }

//            if(position==2)
//            {
//                name= "ContactFragment";
//            }
//            if(position==3)
//            {
//                name= "Map";
//            }
            return name;

        }


    }
    public void clg1(View view){

        Intent intent = new Intent(this, Clg1.class);
        startActivity(intent);

    }

}
