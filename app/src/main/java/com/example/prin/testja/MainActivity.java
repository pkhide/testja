package com.example.prin.testja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText getTxt;
    private Button btnOK;

    private String txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind widget
        getTxt = findViewById(R.id.txtName);
        btnOK = findViewById(R.id.btnOK);

        // create event listener on button OK
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName = getTxt.getText().toString();

                // display text in alert dialog
                Toast.makeText(MainActivity.this, txtName, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
