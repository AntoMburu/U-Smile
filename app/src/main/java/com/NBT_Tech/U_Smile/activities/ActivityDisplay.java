package com.NBT_Tech.U_Smile.activities;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.NBT_Tech.U_Smile.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 MBURU
 */
public class ActivityDisplay extends AppCompatActivity {
    private RecyclerView recyclerView;

    ScrollView scroll;
    LinearLayout layout;
    AssetManager assetManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_display);

        assetManager = getApplication().getAssets();
     layout = (LinearLayout)findViewById(R.id.list_activity);
        scroll = (ScrollView)findViewById(R.id.scroll_list);

        if(ChooseActivity.mediaType == "MUSIC")
        {
            String line;
            try {
                InputStream input = assetManager.open("MusicLinks.txt");
                BufferedReader in = new BufferedReader(new InputStreamReader(input));
                while((line = in.readLine()) != null) {
                    TextView text = new TextView(this);
                    text.setClickable(true);
                    text.setMovementMethod(LinkMovementMethod.getInstance());
                    String displayText = "<a href='"+line+"'> "+line+" </a>";
                    text.setText(Html.fromHtml(displayText));
                    layout.addView(text);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(ChooseActivity.mediaType == "PICTURES")
        {
            InputStream img;
            try {
                String[] files = assetManager.list("Pictures");
                for(int i = 0; i<files.length; i++)
                {
                    img = assetManager.open("Pictures/"+files[i]);
                    Drawable d = Drawable.createFromStream(img, null);
                    ImageView imgView = new ImageView(this);
                    imgView.setImageDrawable(d);
                    layout.addView(imgView);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(ChooseActivity.mediaType == "VIDEOS")
        {
            String line;
            try {
                InputStream input = assetManager.open("VideoLinks.txt");
                BufferedReader in = new BufferedReader(new InputStreamReader(input));
                while((line = in.readLine()) != null) {
                    TextView text = new TextView(this);
                    text.setClickable(true);
                    text.setMovementMethod(LinkMovementMethod.getInstance());
                    String displayText = "<a href='"+line+"'> "+line+" </a>";
                    text.setText(Html.fromHtml(displayText));
                    layout.addView(text);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(ChooseActivity.mediaType == "EXERCISES")
        {
            String line;
            try {
                InputStream input = assetManager.open("ExerciseList.txt");
                BufferedReader in = new BufferedReader(new InputStreamReader(input));
                while((line = in.readLine()) != null) {
                    TextView rowTextView = new TextView(this);
                    rowTextView.setText(line);
                    layout.addView(rowTextView);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        setUpRecyclerView();

    }

    private void setUpRecyclerView() {
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
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
