package com.example.fooddeliveryapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewFoodItems = findViewById(R.id.listViewFoodItems);

        // Create sample food items
        ArrayList<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new FoodItem("Burger", "Delicious burger with cheese and vegetables", 8.99, R.drawable.burger));
        foodItems.add(new FoodItem("Pizza", "Classic pizza with pepperoni and mushrooms", 12.99, R.drawable.pizza));
        foodItems.add(new FoodItem("Salad", "Healthy salad with fresh greens and dressing", 6.49, R.drawable.salad));
        foodItems.add(new FoodItem("Sushi", "Assorted sushi rolls with wasabi and soy sauce", 15.99, R.drawable.sushi));
        foodItems.add(new FoodItem("Pasta", "Spaghetti pasta with creamy tomato sauce", 10.49, R.drawable.pasta));

        // Create the adapter to convert the array to views
        FoodItemAdapter adapter = new FoodItemAdapter(this, R.layout.list_item_food, foodItems);

        // Attach the adapter to a ListView
        listViewFoodItems.setAdapter(adapter);
    }
}
