package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    EditText uname, mobile, email, password, c_password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        uname = findViewById(R.id.uname);
        mobile = findViewById(R.id.mb);
        email = findViewById(R.id.email);
        password = findViewById(R.id.pwd);
        c_password = findViewById(R.id.cpwd);
        register = findViewById(R.id.reg);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = uname.getText().toString();
                String passward = password.getText().toString();
                String Email = email.getText().toString();
                String Mobile = mobile.getText().toString();
                String C_Password = c_password.getText().toString();

                if (username.isEmpty() || passward.isEmpty() || Email.isEmpty() || Mobile.isEmpty() || C_Password.isEmpty()) {
                    Toast.makeText(Registration.this, "All fields are required", Toast.LENGTH_SHORT).show();
                } else {
                    if (password.equals(C_Password)) {
                        Toast.makeText(Registration.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        // You may add logic to proceed with registration
                    } else {
                        Toast.makeText(Registration.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
