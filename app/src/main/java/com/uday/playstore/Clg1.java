package com.uday.playstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Clg1 extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clg1);

        Button readmore=(Button) findViewById(R.id.readmore);
        readmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Clg1.this, ReadMore.class));

                Toast .makeText(getApplicationContext(),"working",Toast.LENGTH_SHORT).show();
            }
        });

        Button clg1_apply =(Button) findViewById(R.id.clg1_apply);
        clg1_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Clg1.this, SignUpPage.class));
                Toast .makeText(getApplicationContext(), "Apply Here",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
