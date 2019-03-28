package com.learn.cashout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class CreateCashout3 extends AppCompatActivity {

    private static final String FRAGMENT_TAG = "fragment_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_cashout3);
        CashFragment fragment = new CashFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder, fragment, FRAGMENT_TAG)
                .commit();
    }
    // create an action bar button
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_create_cashout3, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_next) {
            ReceiptFragment fragment = new ReceiptFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.placeholder, fragment, FRAGMENT_TAG)
                    .commit();
        }
        return super.onOptionsItemSelected(item);
    }
}
