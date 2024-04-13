//package com.example.myapplication;
//
//import android.os.Bundle;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
//}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result;
        Button Btn_result;
        EditText user_weight,user_heightF,user_heighti;
        user_weight= findViewById(R.id.user_weight);
        user_heightF= findViewById(R.id.user_heightf);
        user_heighti= findViewById(R.id.user_heighti);
        Btn_result = findViewById(R.id.Btn_result);
        result=findViewById(R.id.result);

        Btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt= Integer.parseInt(user_weight.getText().toString());
                int hf= Integer.parseInt(user_heightF.getText().toString());
                int hi= Integer.parseInt(user_heighti.getText().toString());

                int totalIn= hf*12+hi;
                double totalCm = totalIn*2.53;
                double totalM= totalCm/100;
                double bmi= wt/Math.pow(totalM,2);

                if(bmi > 25)
                {
                    result.setText("You are over weight!!!!");
                    result.setBackgroundColor(getResources().getColor(R.color.red));
                }else if(bmi<18)
                {
                    result.setText("you are underWeight!!!");
                    result.setBackgroundColor(getResources().getColor(R.color.orange));
                }
                else{
                    result.setText("You are healthy!");
                    result.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }
        });
    }
}
