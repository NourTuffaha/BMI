package com.example.inclassacc_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calcButton;
    private Switch maleSwitch;
    private EditText weightText;
    private EditText heightText;
    private TextView resultText;
    int bmi = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalculateBMI();
    }


    private void CalculateBMI(){

        calcButton =findViewById(R.id.calcButton);
        maleSwitch =findViewById(R.id.maleSwitch);
        weightText =findViewById(R.id.weightText);
        heightText =findViewById(R.id.heightText);
        resultText =findViewById(R.id.resultText);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int weight = Integer.parseInt(weightText.getText().toString());
                int height = Integer.parseInt(heightText.getText().toString());
                if (weight > 0 && height > 0   ) {


                bmi = weight / height*height;
                    if (maleSwitch.equals(true)) {
                        bmi += (bmi * 5) / 100;
                    }

                    resultText.setText(bmi);
                    resultText.setVisibility(View.VISIBLE);


                }
            }
        });

    }

}