package com.learn.cashout;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CashFragment extends Fragment implements View.OnClickListener {

    private CashViewModel mViewModel;

    public static CashFragment newInstance() {
        return new CashFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.cash_fragment, container, false);
        View view = inflater.inflate(R.layout.cash_fragment, container, false);
        Button b = (Button) view.findViewById(R.id.updateButton);
        b.setOnClickListener(this);
        Log.d("view", "returning view");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CashViewModel.class);
        // TODO: Use the ViewModel
    }


    public void updateCash(View v){
        mViewModel.cash.setHundredBill(getInputFromView((EditText) getView().findViewById(R.id.hundredBillInput)));
        mViewModel.cash.setFiftyBill(getInputFromView((EditText) getView().findViewById(R.id.fiftyBillInput)));
        mViewModel.cash.setTwentyBill(getInputFromView((EditText) getView().findViewById(R.id.twentyBillInput)));
        mViewModel.cash.setTenBill(getInputFromView((EditText) getView().findViewById(R.id.tenBillInput)));
        mViewModel.cash.setFiveBill(getInputFromView((EditText) getView().findViewById(R.id.fiveBillInput)));
        mViewModel.cash.setTwoDollar(getInputFromView((EditText) getView().findViewById(R.id.twoDollarInput)));
        mViewModel.cash.setOneDollar(getInputFromView((EditText) getView().findViewById(R.id.oneDollarInput)));
        mViewModel.cash.setQuarter(getInputFromView((EditText) getView().findViewById(R.id.quarterInput)));

        TextView sumView = getView().findViewById(R.id.hundredSum);
        sumView.setText(getSumAsString(mViewModel.cash.getHundredBillSum()));

        sumView = getView().findViewById(R.id.fiftyBillSum);
        sumView.setText(getSumAsString(mViewModel.cash.getFiftyBillSum()));

        sumView = getView().findViewById(R.id.twentyBillSum);
        sumView.setText(getSumAsString(mViewModel.cash.getTwentyBillSum()));

        sumView = getView().findViewById(R.id.tenBillSum);
        sumView.setText(getSumAsString(mViewModel.cash.getTenBillSum()));

        sumView = getView().findViewById(R.id.fiveBillSum);
        sumView.setText(getSumAsString(mViewModel.cash.getFiveBillSum()));

        sumView = getView().findViewById(R.id.twoDollarSum);
        sumView.setText(getSumAsString(mViewModel.cash.getTwoDollarSum()));

        sumView = getView().findViewById(R.id.oneDollarSum);
        sumView.setText(getSumAsString(mViewModel.cash.getOneDollarSum()));

        sumView = getView().findViewById(R.id.quarterSum);
        sumView.setText(getSumAsString(mViewModel.cash.getQuarterSum()));
    }

    public int getInputFromView(EditText et){
        String value = et.getText().toString();
        return Integer.parseInt(value);
    }
    public String getSumAsString(double money){
        return String.valueOf(money);
    }


    @Override
    public void onClick(View v) {

        Button b = (Button) getView().findViewById(R.id.updateButton);
        b.setText("Pressed");
        Log.d("button", "clicked");
        switch (v.getId()) {
            case R.id.updateButton:
                updateCash(v);
                break;

        }
    }
}
