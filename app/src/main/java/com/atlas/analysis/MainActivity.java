package com.atlas.analysis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ActivityGroupDelegate mActivityDelegate;
    private ViewGroup mActivityGroupContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        mActivityDelegate = new ActivityGroupDelegate(this, savedInstanceState);
        mActivityGroupContainer = (ViewGroup) findViewById(R.id.frame);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToActivity("home", "com.atlas.firstbundle.FirstBundleActivity");
            }
        });
    }

    public void switchToActivity(String key, String activityName) {
        Intent intent = new Intent();
        intent.setClassName(getBaseContext(), activityName);
        mActivityDelegate.startChildActivity(mActivityGroupContainer, key, intent);

    }

}
