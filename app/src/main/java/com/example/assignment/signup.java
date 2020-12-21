package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    EditText mname,memail,mpassword,mphone;
    Button mbutton;
    TextView loginbtn,textView1,textview2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mname=findViewById(R.id.name);
        memail=findViewById(R.id.email);
        mpassword=findViewById(R.id.password);
        mphone=findViewById(R.id.phone);
        mbutton=findViewById(R.id.rgbutton);
        loginbtn=findViewById(R.id.lgbutton);



        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = memail.getText().toString().trim();
                String password = mpassword.getText().toString().trim();
                String phone = mphone.getText().toString().trim()
                String name = mname.getText().toString().trim()

                Bundle bundle = new Bundle();
                bundle.putString("email", email);
                bundle.putString("username", name);
                bundle.putString("phone", phone);
                Intent intent = new Intent(signup.this, MainActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }

        });
    }

}