package com.example.udemy3;

/**this app converts dollar into rupees**/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        EditText currency = (EditText)findViewById(R.id.currency);
        double rupee = Double.parseDouble(currency.getText().toString())  * 71.33;
        Toast.makeText(this, "" + rupee, Toast.LENGTH_SHORT).show();
    }


}
