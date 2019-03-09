package com.learn.cashout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NewCashoutActivity extends AppCompatActivity {
    Cash cash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_cashout_activity);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        cash = new Cash(0,0,0,0,0,0,0,0);
    }

    public void updateValues(View view) {
        cash.setHundredBill(getInputFromView((EditText) findViewById(R.id.hundredInput)));
        cash.setFiftyBill(getInputFromView((EditText) findViewById(R.id.fiftyInput)));
        cash.setTwentyBill(getInputFromView((EditText) findViewById(R.id.twentyInput)));
        cash.setTenBill(getInputFromView((EditText) findViewById(R.id.tenInput)));
        cash.setFiveBill(getInputFromView((EditText) findViewById(R.id.fiveInput)));
        cash.setTwoDollar(getInputFromView((EditText) findViewById(R.id.twoDollarInput)));
        cash.setOneDollar(getInputFromView((EditText) findViewById(R.id.oneDollarInput)));
        cash.setQuarter(getInputFromView((EditText) findViewById(R.id.quarterInput)));

        TextView sumView = findViewById(R.id.hundredSum);
        sumView.setText(getSumAsString(cash.getHundredBillSum()));

        sumView = findViewById(R.id.fiftyBillSum);
        sumView.setText(getSumAsString(cash.getFiftyBillSum()));

        sumView = findViewById(R.id.twentyBillSum);
        sumView.setText(getSumAsString(cash.getTwentyBillSum()));

        sumView = findViewById(R.id.tenBillSum);
        sumView.setText(getSumAsString(cash.getTenBillSum()));

        sumView = findViewById(R.id.fiveBillSum);
        sumView.setText(getSumAsString(cash.getFiveBillSum()));

        sumView = findViewById(R.id.twoDollarSum);
        sumView.setText(getSumAsString(cash.getTwoDollarSum()));

        sumView = findViewById(R.id.oneDollarSum);
        sumView.setText(getSumAsString(cash.getOneDollarSum()));

        sumView = findViewById(R.id.quarterSum);
        sumView.setText(getSumAsString(cash.getQuarterSum()));

//        EditText value = (EditText) findViewById(R.id.hundredInput);
////        String hundredNumber= value.getText().toString();
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(String.valueOf(cash.getHundredBill()));

    }


    public int getInputFromView(EditText et){
        String value = et.getText().toString();
        return Integer.parseInt(value);
    }
    public String getSumAsString(double money){
        return String.valueOf(money);
    }


}