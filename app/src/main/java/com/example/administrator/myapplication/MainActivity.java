package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private TextView mTextView1;
    private TextView mTextView2;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void go1(View view){
            Toast.makeText(this, "点到了go1", Toast.LENGTH_SHORT).show();
        }

        public void go2(View view){
            Toast.makeText(this, "点到了go2", Toast.LENGTH_SHORT).show();
        }

        public void go3(View view){
            Toast.makeText(this, "点到了go3", Toast.LENGTH_SHORT).show();
        }

        public void go4(View view){
            Toast.makeText(this, "点到了go4", Toast.LENGTH_SHORT).show();
        }
}
