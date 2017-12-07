package com.lsf.tea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Bug3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug3);
        int imageId = getIntent().getIntExtra("teacher_pic", 0);
        String desc = getIntent().getStringExtra("teacher_name");

        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        TextView textView = (TextView) findViewById(R.id.textView2);

        imageView.setImageResource(imageId);
        textView.setText(desc);
    }

}
