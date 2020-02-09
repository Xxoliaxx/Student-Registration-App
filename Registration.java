package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.gen_spin);
        String[] items = new String[] {"Male", "Female", "Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        mySpinner.setAdapter(adapter);

    }

    public void printResults(View view){
        EditText name = (EditText) findViewById(R.id.name1);
        String fname = name.getText().toString();
        Log.i("info", fname);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.g1);

        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        View radioButton = radioGroup.findViewById(radioButtonID);
        int idx = radioGroup.indexOfChild(radioButton);

        RadioButton r = (RadioButton) radioGroup.getChildAt(idx);
        String selectedText = r.getText().toString();
        Log.i("info", selectedText);

        Spinner mySpinner = (Spinner) findViewById(R.id.gen_spin);
        String text = mySpinner.getSelectedItem().toString();
        Log.i("str", text);

        RatingBar myrat = (RatingBar) findViewById(R.id.rbar);
        float rating = myrat.getRating();
//        Log.i("rat",);

        EditText dobx = (EditText) findViewById(R.id.dob);
        String dob = dobx.getText().toString();
        Log.i("dob", dob);

        TextView ans = (TextView) findViewById(R.id.answer);
        String result = "Name: " + fname + "\n" + "DOB: "+ dob + " \n" + "Gender: " + text +"\n" +"Dep: " + selectedText + "\n" + "Raiting: "+rating;
        ans.setText(result);

    }


}
