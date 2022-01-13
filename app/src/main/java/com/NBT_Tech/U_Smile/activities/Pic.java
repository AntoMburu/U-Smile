package com.NBT_Tech.U_Smile.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.NBT_Tech.U_Smile.R;


/**
 MBURU
 */
public class Pic extends AppCompatActivity {
    ImageView i1, i2, i3;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
setContentView(R.layout.pic);
       i1 = (ImageView) findViewById(R.id.video_view);

        i1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

              Intent intent = new Intent(Pic.this, Music.class);
                startActivity(intent);

          Toast.makeText(getApplicationContext(), "BUTTON I1 CLICKED", Toast.LENGTH_LONG).show();
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
}