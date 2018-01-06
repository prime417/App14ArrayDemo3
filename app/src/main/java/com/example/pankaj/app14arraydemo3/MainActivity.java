package com.example.pankaj.app14arraydemo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTotal = findViewById(R.id.txtTotal);
        TextView txtCalculation = findViewById(R.id.txtCalculation);

        String oldText;

        int[] integerArray = {2,54,34,76,23,4,7,86,4,65};
        int totalValue = 0;

        for(int index = 0; index < integerArray.length; index++){

            // totalValue = totalValue + integerArray[index];
            oldText = txtCalculation.getText().toString();
//0+0 "+" 2 "=" totalvalue = 0 + 2
            //2 + 2 "+" + 54 "=" totalValue = 56
            txtCalculation.setText(oldText + totalValue + "+" + integerArray[index] + "=" +
                    (totalValue += integerArray[index] ) + "\n");
        }

        txtTotal.setText(totalValue + "");

    }
}
