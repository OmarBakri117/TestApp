package edu.cs.birzeit.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText theName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theName = findViewById(R.id.theName);

    }

    public void btnShow_OnClick(View view) {
        String name = theName.getText().toString().trim();
        if(!name.isEmpty()){
            Toast.makeText( this , name , Toast.LENGTH_SHORT).show();
        }
    }
}