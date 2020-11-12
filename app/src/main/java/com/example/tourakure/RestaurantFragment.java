package com.example.tourakure;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */

public class RestaurantFragment extends Fragment {

    private RecyclerView myRecyclerView;
    private View view;
    private List<TourList> tourLists;

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.restaurant_fragment, container, false);
        myRecyclerView= (RecyclerView) view.findViewById(R.id.restaurantrecycler);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(getContext(),tourLists, R.color.RestaurantColor);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tourLists = new ArrayList<>();

        tourLists.add(new TourList("Chicken Republic", "Alagbaka, St. Peter Bus Stop"));
        tourLists.add(new TourList("Tantalizer", "Akure mall at Alagbaka, Cathedral"));
        tourLists.add(new TourList("Crunchies", "Oyemekun Rd"));
        tourLists.add(new TourList("Shoprite", "Akure Mall at Alagbaka"));
        tourLists.add(new TourList("Captain Cook", "Alagbaka"));
        tourLists.add(new TourList("Bite More", "Akure mall at Alagbaka"));
        tourLists.add(new TourList("Mr Biggs", "Akure mall at Alagbaka"));
        tourLists.add(new TourList("Domino Pizza", "Akure mall at Alagbaka"));


    }

}


