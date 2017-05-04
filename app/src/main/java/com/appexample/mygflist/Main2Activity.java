package com.appexample.mygflist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public ImageView img1;
    public TextView textView1, textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String name=intent.getStringExtra("Name");
        int img_id=intent.getIntExtra("Image",R.mipmap.ic_launcher);
        String desc=intent.getStringExtra("Description");

        img1 = (ImageView) findViewById(R.id.imageView);
        textView1 = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        img1.setImageResource(img_id);
        textView1.setText(name);
        textView2.setText(desc);
    }
}
