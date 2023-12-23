package com.example.byzovalexanderpr_21101variant22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Personal_areaActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView btn_setting;
    ImageView btn_exit;
    Button btn_link;
    Uri uriURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
        btn_setting = findViewById(R.id.btn_setting);
        btn_setting.setOnClickListener(this);
        btn_exit = findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(this);
        btn_link = findViewById(R.id.btn_link);
        btn_link.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_setting){
            startActivity(new Intent(this, SettingActivity.class));
        }else if (v.getId() == R.id.btn_exit){
            startActivity(new Intent(this, LoginActivity.class));
        }else if (v.getId() == R.id.btn_link){
            Uri uriUrl = Uri.parse("https://www.mtsbank.ru/");
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriURL);
            startActivity(launchBrowser);
        }

    }
}