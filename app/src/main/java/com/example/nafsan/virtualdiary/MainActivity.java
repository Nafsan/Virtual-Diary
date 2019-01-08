package com.example.nafsan.virtualdiary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editText1,editText2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.emailId);
        editText2=findViewById(R.id.passwordId);
        button=findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString()==editText2.getText().toString())
                {
                    Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }
}
