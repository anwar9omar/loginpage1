package com.example.logopage1.R.id;

import static com.example.logopage1.R.id;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.logopage1.Login;
import com.example.logopage1.R;

public class MainActivity extends AppCompatActivity {
    TextView edtusername=(TextView)findViewById(id.edtusername) ;
    EditText edpassword=(EditText)findViewById(id.edpassword) ;

    Button log1=(Button)findViewById(id.log1) ;
    private String msg="Good";

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usern = edtusername.getText().toString();
                String passn = edpassword.getText().toString();
                if (usern.equals("") && passn.equals("")) {
                    edtusername.setError("Empty username!!");
                    edpassword.setError("Empty password!!");}
                else {
                    if (!usern.equals("") && passn.equals("")) {
                        edpassword.setError("Empty password!!");
                    } else {
                        if (usern.equals("anwar") && passn.equals("1234")) {
                        }
                        Intent intt = new Intent();
                        startActivity(intt);
                    }

                }
            }
        });

    }

    public void log(View view) {

        Intent in=new Intent(this, Login.class);
        startActivity(in);
    }
    }
