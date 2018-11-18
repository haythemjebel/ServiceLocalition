package com.proximedia.servicelocalition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ServiceMain extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_main);
        tv=(TextView)findViewById(R.id.TV);
    }
    protected void onStart(){
        super.onStart();
        startService(new Intent(ServiceMain.this,MyService.class));
    }
}
