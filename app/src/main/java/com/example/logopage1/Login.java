package com.example.logopage1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.colors,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.re:
                Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ye:
                Toast.makeText(this, "Yellow", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.gr:
                Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.bl:
                Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}