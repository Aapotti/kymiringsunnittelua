package com.example.aapotti.kymiringsunnittelua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void menu(View view)
    {
        Button menuButton = (Button) findViewById(R.id.menuButton);
        ScrollView menuScrollView = (ScrollView) findViewById(R.id.menuScrollView);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);

        if(textView1.getScaleY() < 1) {
            menuButton.animate().translationXBy(390f).setDuration(200);
            menuScrollView.animate().translationXBy(390f).setDuration(200);
            textView1.animate().scaleY(1).setDuration(200);
            textView2.animate().scaleY(1).setDuration(200);
            textView3.animate().scaleY(1).setDuration(200);
            textView4.animate().scaleY(1).setDuration(200);
            textView5.animate().scaleY(1).setDuration(200);
            textView6.animate().scaleY(1).setDuration(200);
            textView7.animate().scaleY(1).setDuration(200);
        }
        else
        {
            menuButton.animate().translationXBy(-390f).setDuration(200);
            menuScrollView.animate().translationXBy(-390f).setDuration(200);
            textView1.animate().scaleY(0).setDuration(200);
            textView2.animate().scaleY(0).setDuration(200);
            textView3.animate().scaleY(0).setDuration(200);
            textView4.animate().scaleY(0).setDuration(200);
            textView5.animate().scaleY(0).setDuration(200);
            textView6.animate().scaleY(0).setDuration(200);
            textView7.animate().scaleY(0).setDuration(200);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);

        textView1.setScaleY(0);
        textView2.setScaleY(0);
        textView3.setScaleY(0);
        textView4.setScaleY(0);
        textView5.setScaleY(0);
        textView6.setScaleY(0);
        textView7.setScaleY(0);
    }
}
