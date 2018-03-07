package com.example.aditi.simpleasynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by aditi on 7/3/18.
 */

public class SImpleAsyncTask extends AsyncTask<Void,Void,String> {

    TextView mTextView;

    @Override
    protected String doInBackground(Void... voids) {
        Random r = new Random();
        int n = r.nextInt(11);

        int s = n*200;

        try{
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return "Awake at Last After sleeping for"+s+"milliseconds";
    }

    public SImpleAsyncTask(TextView tv){
        mTextView=tv;
    }
}
