package com.hammer.kunbi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Harshal on 11/11/2017.
 */

public class Home extends AppCompatActivity {
TextView text,text1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Session session=new Session(Home.this);
        text=(TextView) findViewById(R.id.text);


        text.setText("Welcome user= "+ session.getNAME()+ session.getPASS());



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.login:
                Toast.makeText(Home.this,"Login", Toast.LENGTH_SHORT).show();
                Intent n=new Intent(getApplicationContext(),MainActivity.class);
                return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
