package com.aashna.excessproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterRestaurant extends RecyclerView.Adapter<AdapterRestaurant.FoodViewHolder> {
    Context context;
    ArrayList<RestaurantDataset> restaurantDatasets;

    public AdapterRestaurant(Context context, ArrayList<RestaurantDataset> restaurantDatasets) {
        this.context = context;
        this.restaurantDatasets = restaurantDatasets;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.food_itemview, viewGroup, false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int i) {
        Picasso.get()
                .load(restaurantDatasets.get(i).img)
                .into(foodViewHolder.foodIMG);
        foodViewHolder.name.setText(restaurantDatasets.get(i).name);
        foodViewHolder.ratingBAR.setRating(Float.parseFloat(restaurantDatasets.get(i).rating));
        foodViewHolder.status.setText(restaurantDatasets.get(i).status);
        foodViewHolder.distance.setText(restaurantDatasets.get(i).distance);
        foodViewHolder.offer.setText(restaurantDatasets.get(i).offer);


    }

    @Override
    public int getItemCount() {
        return restaurantDatasets.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{
        ImageView foodIMG;
        TextView name, status, distance, offer;
        RatingBar ratingBAR;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodIMG=itemView.findViewById(R.id.foodImg);
            name=itemView.findViewById(R.id.food_name_txt);
            status=itemView.findViewById(R.id.statusTxt);
            distance=itemView.findViewById(R.id.distanceTxt);
            offer=itemView.findViewById(R.id.offerTxt);
            ratingBAR=itemView.findViewById(R.id.ratingBar);
        }
    }
}
