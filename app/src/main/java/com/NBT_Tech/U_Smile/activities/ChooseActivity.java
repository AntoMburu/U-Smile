package com.NBT_Tech.U_Smile.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.NBT_Tech.U_Smile.R;


/**
 MBURU
 */
public class ChooseActivity extends AppCompatActivity {


    Button btnMusic, btnPic, btnVid, btnExercise, btnOwn,btng1,btng2,btng3,btnc;
    static String mediaType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);



        btnMusic = (Button) findViewById(R.id.buttonMusic);
        btnPic = (Button) findViewById(R.id.PicButton);
        btnVid = (Button) findViewById(R.id.VideoButton);
        btnExercise = (Button) findViewById(R.id.ExerciseButton);
        btnOwn = (Button) findViewById(R.id.OwnButton);
        btng1 = (Button) findViewById(R.id.btng1);
        btng2 = (Button) findViewById(R.id.btng2);
        btng3 = (Button) findViewById(R.id.btng3);
        btnc = (Button) findViewById(R.id.btnc);

        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseActivity.this, Music.class);
                startActivity(intent);

                  ///////////  Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
        btnPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this, Pic.class);
                startActivity(intent);

                  /////////////  Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
        btnVid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseActivity.this, Vid.class);
                startActivity(intent);
              ////// Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
        btnExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaType = "EXERCISES";
                Intent intent = new Intent(ChooseActivity.this, ActivityDisplay.class);
                startActivity(intent);

                   //// Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
 /////////////////////////

        btnOwn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseActivity.this, chat.class);
                startActivity(intent);

                //// Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
        //////////////////////////   button.setOnCLickListener(view->mSocket.emit(“kill”,poisonObject));
        /////////////////////////

        btng1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseActivity.this, game1.class);
                startActivity(intent);

                //// Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
        //////////////////////////   button.setOnCLickListener(view->mSocket.emit(“kill”,poisonObject));
        /////////////////////////

        btng2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseActivity.this, game2.class);
                startActivity(intent);

                //// Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
        //////////////////////////   button.setOnCLickListener(view->mSocket.emit(“kill”,poisonObject));
        /////////////////////////

        btng3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseActivity.this, game3.class);
                startActivity(intent);

                //// Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
        //////////////////////////   button.setOnCLickListener(view->mSocket.emit(“kill”,poisonObject));
        /////////////////////////

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseActivity.this, councill.class);
                startActivity(intent);

                //// Toast.makeText(getApplicationContext(), "Untimed break started!!!", Toast.LENGTH_LONG).show();
            }
        });
        //////////////////////////   button.setOnCLickListener(view->mSocket.emit(“kill”,poisonObject));


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
                Intent intent = new Intent(ChooseActivity.this, LoginActivity.class);
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
