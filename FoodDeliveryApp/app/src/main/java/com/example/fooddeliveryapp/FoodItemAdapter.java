package com.example.fooddeliveryapp;
// FoodItemAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class FoodItemAdapter extends ArrayAdapter<FoodItem> {

    private Context mContext;
    private int mResource;

    public FoodItemAdapter(@NonNull Context context, int resource, @NonNull List<FoodItem> foodItems) {
        super(context, resource, foodItems);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        }

        FoodItem currentFoodItem = getItem(position);

        ImageView imageViewFood = listItem.findViewById(R.id.imageViewFood);
        imageViewFood.setImageResource(currentFoodItem.getImageResource());

        TextView textViewName = listItem.findViewById(R.id.textViewName);
        textViewName.setText(currentFoodItem.getName());

        TextView textViewDescription = listItem.findViewById(R.id.textViewDescription);
        textViewDescription.setText(currentFoodItem.getDescription());

        TextView textViewPrice = listItem.findViewById(R.id.textViewPrice);
        textViewPrice.setText("$ " + String.format("%.2f", currentFoodItem.getPrice()));

        return listItem;
    }
}

