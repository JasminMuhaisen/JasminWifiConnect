package com.example.jasminwificonnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b_wifi;
    ConnectionWifi cw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_wifi = (Button) findViewById(R.id.b_wifi);
        cw = new ConnectionWifi(this);

        b_wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cw.isConnected()){
                    Toast.makeText(MainActivity.this,"Connected!"
                    ,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"not Connected!"
                            ,Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
