package com.hammer.kunbi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button b1;
    Session session;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        session=new Session(MainActivity.this);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        b1=(Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(getApplicationContext(),Home.class);
                session.setNAME(username.getText().toString(),password.getText().toString());

                startActivity(n);
            }
        });

    }
}
