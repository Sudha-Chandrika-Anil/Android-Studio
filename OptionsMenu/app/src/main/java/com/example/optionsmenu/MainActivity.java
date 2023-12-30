package com.example.optionsmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.t1);
        setSupportActionBar(toolbar);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }
public boolean onOptionItemSelected(MenuItem item)
{
    if(item.getItemId()==R.id.itm1)
        Toast.makeText(this, "create a new project", Toast.LENGTH_SHORT).show();
    if(item.getItemId()==R.id.t1)
        Toast.makeText(this, "open a project", Toast.LENGTH_SHORT).show();
    return super.onOptionsItemSelected(item);

}

}