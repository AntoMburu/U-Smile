package com.NBT_Tech.U_Smile.activities;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 MBURU
 */
public class readRawTextFile {
    public static ArrayList<String> readRawTextFile(Context ctx, int resId)
    {
        ArrayList<String> list = new ArrayList<String>();
        InputStream inputStream = ctx.getResources().openRawResource(resId);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            return null;
        }
        return list;
    }
}
