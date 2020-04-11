package com.compass.abdelrahmantarek.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView name;
    EditText msg;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name_tv);
        msg = findViewById(R.id.name_et);
        click = findViewById(R.id.click_btn);

        click.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.click_btn:
                Toast.makeText(this,msg.getText(),Toast.LENGTH_SHORT).show();
                Log.d("S'mores", "onClick: "+msg.getText());
                break;
        }
    }
}
