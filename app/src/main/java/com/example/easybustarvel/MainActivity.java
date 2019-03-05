package com.example.easybustarvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText UserName;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = (EditText) findViewById(R.id.NameField);
        Password = (EditText)findViewById(R.id.PasswordField);
        Login = (Button) findViewById(R.id.LoginBtn);

        Login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                validate(UserName.getText().toString(), Password.getText().toString());

            }
        });
    }

    private void validate(String Name, String UserPassword){

            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
    }
}
