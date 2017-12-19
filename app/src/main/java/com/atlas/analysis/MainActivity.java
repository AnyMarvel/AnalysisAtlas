package com.atlas.analysis;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewGroup mActivityGroupContainer;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        TextView textView = (TextView) findViewById(R.id.textView);
        mActivityGroupContainer = (ViewGroup) findViewById(R.id.frame);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClassName(v.getContext(), "com.atlas.firstbundle.FirstBundle");
                startActivity(intent);//                switchToActivity("home", "com.atlas.firstbundle.FirstBundleActivity");
            }
        });
    }


}
