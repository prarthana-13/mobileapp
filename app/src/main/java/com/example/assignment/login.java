package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText mname,mpassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mname=findViewById(R.id.name);
        mpassword=findViewById(R.id.password);
        login=findViewById(R.id.submit);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String em,pass;
                em=mname.getText().toString().trim();
                pass=mpassword.getText().toString().trim();
                if(!(em.isEmpty()) && !(pass.isEmpty())){
                    if(em.equals("Prarthana") && pass.equals("1234567")){
                        startActivity(new Intent(login.this,MainActivity.class));
                    }
                    else{
                        Toast.makeText(login.this,"Email or password wrong!!!",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(login.this,"Empty fields are not allowed!!",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
