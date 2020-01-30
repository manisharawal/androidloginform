package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";

    Context context;
    EditText user,password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        user=findViewById(R.id.text_username);
        Log.d(TAG, "Username  Edittext bound ");
        password=findViewById(R.id.text_password);
        Log.d(TAG,"password binded");
        context = this;


        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Clicked on Button");
//               String s=user.getText().toString()+" " +password.getText().toString();
//               Toast.makeText(MainActivity.this,user.getText().toString() + " " + password.getText().toString(),Toast.LENGTH_LONG).show();
                if(user.getText().toString().equals("manisha")&&password.getText().toString().equals("rawal")){
                    Toast.makeText(context,"User name and password is right",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(context,MainPage.class);
                    startActivity(i);
                }else {
                    Toast.makeText(context,"User name and password is wrong",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
