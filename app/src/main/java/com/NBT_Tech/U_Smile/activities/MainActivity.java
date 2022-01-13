package com.NBT_Tech.U_Smile.activities;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.NBT_Tech.U_Smile.R;

import java.util.ArrayList;

/**
 MBURU
 */

public class MainActivity extends AppCompatActivity {

    @SuppressLint("StaticFieldLeak")
    static Button btnTimed, btnQuick;
    @SuppressLint("StaticFieldLeak")
    static Button  quote;
    TextView textViewQuote;

    ArrayList<String> quotes = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quotes = readRawTextFile.readRawTextFile(getApplicationContext(), R.raw.quotes);
        //look into Assets folder
        textViewQuote = (TextView) findViewById(R.id.textQuote);
        btnQuick = (Button) findViewById(R.id.btnQuick);
        quote= (Button) findViewById(R.id.quote);

        btnQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseActivity.class);
                startActivity(intent);
            }
        });




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
               /* Intent intentt = new Intent(Intent.ACTION_SEND);
                intentt.putExtra(Intent.EXTRA_COMPONENT_NAME,"this is my app");
                intentt.setType("text/plain");
                startActivity(Intent.createChooser(intentt,"share via"));

                */
               Toast.makeText(this,"COMING SOON",Toast.LENGTH_LONG).show();
                break;
            case R.id.Logout:
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                break;


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        textViewQuote.setText(quotes.get((int) (Math.random() * quotes.size())));

        quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
