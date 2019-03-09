package com.learn.cashout;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateCashout extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_cashout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_cashout, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_create_cashout, container, false);
//            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
//            return rootView;
//        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.cash_fragment, container, false);
            return rootView;
        }


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }

//    public void updateCash(View v){
//        mViewModel.cash.setHundredBill(getInputFromView((EditText) getView().findViewById(R.id.hundredBillInput)));
//        mViewModel.cash.setFiftyBill(getInputFromView((EditText) getView().findViewById(R.id.fiftyBillInput)));
//        mViewModel.cash.setTwentyBill(getInputFromView((EditText) getView().findViewById(R.id.twentyBillInput)));
//        mViewModel.cash.setTenBill(getInputFromView((EditText) getView().findViewById(R.id.tenBillInput)));
//        mViewModel.cash.setFiveBill(getInputFromView((EditText) getView().findViewById(R.id.fiveBillInput)));
//        mViewModel.cash.setTwoDollar(getInputFromView((EditText) getView().findViewById(R.id.twoDollarInput)));
//        mViewModel.cash.setOneDollar(getInputFromView((EditText) getView().findViewById(R.id.oneDollarInput)));
//        mViewModel.cash.setQuarter(getInputFromView((EditText) getView().findViewById(R.id.quarterInput)));
//
//        TextView sumView = getView().findViewById(R.id.hundredSum);
//        sumView.setText(getSumAsString(mViewModel.cash.getHundredBillSum()));
//
//        sumView = getView().findViewById(R.id.fiftyBillSum);
//        sumView.setText(getSumAsString(mViewModel.cash.getFiftyBillSum()));
//
//        sumView = getView().findViewById(R.id.twentyBillSum);
//        sumView.setText(getSumAsString(mViewModel.cash.getTwentyBillSum()));
//
//        sumView = getView().findViewById(R.id.tenBillSum);
//        sumView.setText(getSumAsString(mViewModel.cash.getTenBillSum()));
//
//        sumView = getView().findViewById(R.id.fiveBillSum);
//        sumView.setText(getSumAsString(mViewModel.cash.getFiveBillSum()));
//
//        sumView = getView().findViewById(R.id.twoDollarSum);
//        sumView.setText(getSumAsString(mViewModel.cash.getTwoDollarSum()));
//
//        sumView = getView().findViewById(R.id.oneDollarSum);
//        sumView.setText(getSumAsString(mViewModel.cash.getOneDollarSum()));
//
//        sumView = getView().findViewById(R.id.quarterSum);
//        sumView.setText(getSumAsString(mViewModel.cash.getQuarterSum()));
//    }

    public int getInputFromView(EditText et){
        String value = et.getText().toString();
        return Integer.parseInt(value);
    }
    public String getSumAsString(double money){
        return String.valueOf(money);
    }

    CashFragment CashFragment;
    public void onClick(View v) {
        CashFragment.onClick(v);

    }
}
