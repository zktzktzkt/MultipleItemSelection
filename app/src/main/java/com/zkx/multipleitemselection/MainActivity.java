package com.zkx.multipleitemselection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListDataScreenView mListDataScreenView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListDataScreenView = (ListDataScreenView) findViewById(R.id.list_data_screen_view);
        mListDataScreenView.setAdapter(new ListScreenMenuAdapter(this));
    }

    public void click(View view){
        Toast.makeText(this,"111", Toast.LENGTH_LONG).show();
    }
}
