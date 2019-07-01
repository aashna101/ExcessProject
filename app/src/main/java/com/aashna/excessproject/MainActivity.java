package com.aashna.excessproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.aashna.excessproject.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
   static Spinner categorySpiner;
    ViewPager viewPager;
    TabLayout tabs;
    SectionsPagerAdapter sectionsPagerAdapter;
    String item;
    public static String selected_item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         viewPager = findViewById(R.id.view_pager);
        tabs = findViewById(R.id.tabs);
        categorySpiner=findViewById(R.id.spinner);
        List<String> categories = new ArrayList<String>();
        categories.add("Food & Beverages");
        categories.add("Entertainment");
        categories.add("Salon & Spa");
        categories.add("Shopping");
        categories.add("Sports & Dance");
        categories.add("Fitness & gym");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        categorySpiner.setAdapter(dataAdapter);

       // categorySpiner.setSelection(0);


        selected_item = categorySpiner.getItemAtPosition(0).toString();
        sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs.setupWithViewPager(viewPager);
        categorySpiner.setOnItemSelectedListener(this);
        /*tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d("<<<<<<<<<<<<<<<<<<", "onTabSelected: "+ tab.getText());
               // int i= tab.getPosition()
              //  if()

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

         selected_item = parent.getItemAtPosition(position).toString();
        sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(sectionsPagerAdapter);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}