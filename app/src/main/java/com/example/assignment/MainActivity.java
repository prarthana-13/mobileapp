package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mname,memail,mpassword,mphone;
    Button mbutton;
    TextView loginbtn,textView1,textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mname=findViewById(R.id.name);
        memail=findViewById(R.id.email);
        mpassword=findViewById(R.id.password);
        mphone=findViewById(R.id.phone);
        mbutton=findViewById(R.id.rgbutton);
        loginbtn=findViewById(R.id.lgbutton);
        Bundle bundle=getIntent().getExtras();

        String em,name,phone,password;
        em=bundle.getString("email","Prarthana@gmail.com");
        name=bundle.getString("name","Prarthana");
        phone=bundle.getString("phone","9876543210");
        password=bundle.getString("address","1234567");

        memail.setText(em);
        mname.setText(name);
        mphone.setText(phone);
        mpassword.setText(password);
    }
}

