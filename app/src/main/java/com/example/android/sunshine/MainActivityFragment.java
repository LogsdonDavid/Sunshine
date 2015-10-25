package com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_main, container, false);
        String[] forcastAray ={
                "Today-Sunny-80/69",
                "Tomorow-Cloudy-80/64",
                "Wed-Rainy-80/65",
                "Thur-Hot-99/98",
                "Fri-Cold-21/25",
                "Sat-Eclipse-100/20",
                "Sun-Flame-150/100"
        };
        List<String> weekForcast = new ArrayList<String>(Arrays.asList(forcastAray));
        ArrayAdapter mForcastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forcast,
                R.id.list_item_textview,
                weekForcast
                );
        ListView myView = (ListView)container.findViewById(R.id.listview_forcast);
        myView.setAdapter(mForcastAdapter);
        return rootView;
    }
}
