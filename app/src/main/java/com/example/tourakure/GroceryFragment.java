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
public class GroceryFragment extends Fragment {

    private RecyclerView myRecyclerView;
    private View view;
    private List<TourList> tourLists;

    public GroceryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.grocery_fragment, container, false);
        myRecyclerView= (RecyclerView) view.findViewById(R.id.groceryrecycler);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(getContext(),tourLists, R.color.GroceryColor);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tourLists = new ArrayList<>();

        tourLists.add(new TourList("Shop Rite", "Alagbaka"));
        tourLists.add(new TourList("Afoyem", "Alagbaka"));
        tourLists.add(new TourList("Ceci", "Alagbaka"));
        tourLists.add(new TourList("God's Love", "Oyemekun Road"));


    }

}

