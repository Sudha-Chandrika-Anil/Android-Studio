package com.example.questionsix;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    RelativeLayout relativeLayout;
    Button buttonPopupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link those objects with their respective id's that we have given in .XML file
        textView = findViewById(R.id.textView);
        relativeLayout = findViewById(R.id.relLayout);
        buttonPopupMenu = findViewById(R.id.buttonPopupMenu);

        // Register a view for context menu
        registerForContextMenu(textView);

        // Set up the button to show the popup menu
        buttonPopupMenu.setOnClickListener(this::showPopupMenu);
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(item -> {
            int id = item.getItemId();
            String message = "";
            if (id == R.id.menu_yellow) {
                relativeLayout.setBackgroundColor(Color.YELLOW);
                message = "Yellow selected";
            } else if (id == R.id.menu_gray) {
                relativeLayout.setBackgroundColor(Color.GRAY);
                message = "Gray selected";
            } else if (id == R.id.menu_cyan) {
                relativeLayout.setBackgroundColor(Color.CYAN);
                message = "Cyan selected";
            }
            // Show the selected message
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            return true;
        });

        popupMenu.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        // you can set menu header with title icon etc
        menu.setHeaderTitle("Choose a color");
        // add menu items
        menu.add(0, v.getId(), 0, "Yellow");
        menu.add(0, v.getId(), 0, "Gray");
        menu.add(0, v.getId(), 0, "Cyan");
    }

    // menu item select listener
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (Objects.equals(item.getTitle(), "Yellow")) {
            relativeLayout.setBackgroundColor(Color.YELLOW);
            Toast.makeText(MainActivity.this, "Yellow selected", Toast.LENGTH_SHORT).show();
        } else if (Objects.requireNonNull(item.getTitle()).equals("Gray")) {
            relativeLayout.setBackgroundColor(Color.GRAY);
            Toast.makeText(MainActivity.this, "Gray selected", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle().equals("Cyan")) {
            relativeLayout.setBackgroundColor(Color.CYAN);
            Toast.makeText(MainActivity.this, "Cyan selected", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
