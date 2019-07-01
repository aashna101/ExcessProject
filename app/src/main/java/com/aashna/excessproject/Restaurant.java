package com.aashna.excessproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Restaurant extends Fragment {

    RecyclerView recyclerView;
    ArrayList<RestaurantDataset> datasets= new ArrayList<>();
    AdapterRestaurant adapterR;
    public Restaurant() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= LayoutInflater.from(container.getContext())
                .inflate(R.layout.fragment_restaurant,container, false);
            recyclerView=view.findViewById(R.id.foodRecyclerView);

            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
            recyclerView.addItemDecoration(new DividerItemDecoration(getActivity().getApplicationContext(),
                    DividerItemDecoration.VERTICAL));
            RestaurantDataset one=new RestaurantDataset("name1","open","0.5 km from you",
                    "4.5","30% offer",R.drawable.restaurant);
            datasets.add(one);

        one=new RestaurantDataset("name2","open","2 km from you",
                "3.5","50% offer",R.drawable.restaurant);
        datasets.add(one);

        one=new RestaurantDataset("name3","close","2.1 km from you",
                "3","20% offer",R.drawable.restaurant);
        datasets.add(one);

        one=new RestaurantDataset("name4","open","4.5 km from you",
                "2.5","10% offer",R.drawable.restaurant);
        datasets.add(one);

        one=new RestaurantDataset("name5","open","3 km from you",
                "4","5% offer",R.drawable.restaurant);
        datasets.add(one);

        one=new RestaurantDataset("name6","clase","1 km from you",
                "2.5","10% offer",R.drawable.restaurant);
        datasets.add(one);

        one=new RestaurantDataset("name7","open","5.2 km from you",
                "5","45% offer",R.drawable.restaurant);
        datasets.add(one);

        one=new RestaurantDataset("name8","open","2 km from you",
                "3.5","50% offer",R.drawable.restaurant);
        datasets.add(one);

        one=new RestaurantDataset("name9","close","2.1 km from you",
                "3","20% offer",R.drawable.restaurant);
        datasets.add(one);

        one=new RestaurantDataset("name10","open","4.5 km from you",
                "2.5","10% offer",R.drawable.restaurant);
        datasets.add(one);

        adapterR= new AdapterRestaurant(getActivity().getApplicationContext(),datasets);

        recyclerView.setAdapter(adapterR);

        return view;
    }

}
