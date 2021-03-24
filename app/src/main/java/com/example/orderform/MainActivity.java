package com.example.orderform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText tbName = (EditText)findViewById(R.id.yourName);
        String name = tbName.getText().toString();

        EditText tbPhone = (EditText)findViewById(R.id.phoneInput);
        String phone = tbPhone.getText().toString();


        Spinner size = (Spinner)findViewById(R.id.spinner);
        String sizeString = size.getSelectedItem().toString();

        CharSequence message = "Pizza order for: "+name+" submitted.\n Phone number: "+phone+"\n Pizza Size: "+size;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this,message,duration);
        toast.show();
    }

}