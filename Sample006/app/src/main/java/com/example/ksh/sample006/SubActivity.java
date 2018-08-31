package com.example.ksh.sample006;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.actvity_sub);

        TextView nameText = (TextView)findViewById(R.id.nameText);

        Intent intent = getIntent();
        nameText.setText(intent.getStringExtra("nameText"));
    }
}
