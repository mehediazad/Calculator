package com.example.editetextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText myEditText1, myEditText2;
    private Button   myButton1 , myButton2;
    private TextView myTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText1 = (EditText) findViewById(R.id.editTextId1);
        myEditText2 = (EditText) findViewById(R.id.editTextId2);

        myButton1 =(Button) findViewById(R.id.addButtonId);
        myButton2 =(Button) findViewById(R.id.subButtonId);

        myTextView =(TextView) findViewById(R.id.textViewId);

        myButton1.setOnClickListener(this);
        myButton2.setOnClickListener(this);

}
 @Override
   public void onClick(View v) {
       String number1 = myEditText1.getText().toString();
       String number2 = myEditText2.getText().toString();

       double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        if (v.getId() == R.id.addButtonId){
           double sum = num1 + num2;

            myTextView.setText("Result is: "+sum);

        }if (v.getId() == R.id.subButtonId){
            double sub = num1 - num2;

           myTextView.setText("Result is: "+sub);
        }
   }
}