package com.aashna.excessproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodTruck extends Fragment {
TextView txtV;

    public FoodTruck() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= LayoutInflater.from(container.getContext())
                .inflate(R.layout.fragment_food_truck,container, false);


        txtV= view.findViewById(R.id.txt);

        return view;}

}
