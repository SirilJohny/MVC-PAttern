package com.example.mvcpattersz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView,textView1,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.textView1);
        textView3=findViewById(R.id.textView3);
        button=findViewById(R.id.button);

    }

    public Model GetAppFromModel() {
        return new Model("jinnu","jinnu@123","jinugmail.com");
    }

    public void DisplayText(View view) {
        textView.setText(GetAppFromModel().getName());
        textView1.setText(GetAppFromModel().getPassword());
        textView3.setText(GetAppFromModel().getMailId());


    }

}