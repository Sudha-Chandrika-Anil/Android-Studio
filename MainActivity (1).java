package com.example.menu;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();

        int id = item.getItemId();

        if (id == R.id.print_item) {
            // Handle search_item click
            return true;
        }
        else if (id == R.id.share_item) {
            // Handle share_item click
            return true;
        } else if (id == R.id.bookmark_item) {
            // Handle bookmark_item click
            return true;
        } else {
            return super.onOptionsItemSelected(item); // Fallback to default handling
        }
    }
}
