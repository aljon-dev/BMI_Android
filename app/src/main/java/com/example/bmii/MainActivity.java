package com.example.bmii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Weight, Height;
    Button result;

    TextView BMI, Category;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Weight = findViewById(R.id.weight);
        Height = findViewById(R.id.height);

        // Button
        result = findViewById(R.id.Result);

        // Text View
        BMI = findViewById(R.id.total);
        Category = findViewById(R.id.BMIResult);


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    bmi();
            }
        });




    }
    public void bmi() {
                String weight = Weight.getText().toString();
                String height = Height.getText().toString();

                double fweight  = Double.parseDouble(weight);
                double fheight = Double.parseDouble(height);

                double total = (fweight) / (fheight * fheight);



                if(total < 18.5){
                    Category.setText("UnderWeight");
                    BMI.setText(String.valueOf(total));
                }
        else if(total < 24.5){
            Category.setText("NormalWeight");
            BMI.setText(String.valueOf(total));
        }

       else  if(total < 29.5){
            Category.setText("Obese");
            BMI.setText(String.valueOf(total));
        } else {
                    Category.setText("VeryObese");
                    BMI.setText(String.valueOf(total));

                }


    }
}