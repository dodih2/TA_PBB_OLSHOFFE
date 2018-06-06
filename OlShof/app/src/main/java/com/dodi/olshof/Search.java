package com.dodi.olshof;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class Search extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        String [] texts = {"Redmi 4A","Redmi 4X"};
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.idAutoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, texts);
        autoCompleteTextView.setAdapter(adapter);

        String [] text2 = {"Handphone","Laptop"};
        spinner = (Spinner) findViewById(R.id.idSpiner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, text2);
        spinner.setAdapter(adapter2);

    }
}
