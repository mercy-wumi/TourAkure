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
public class HotelFragment extends Fragment {

    private RecyclerView myRecyclerView;
    private View view;
    private List<TourList> tourLists;

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.hotel_fragment, container, false);
        myRecyclerView= (RecyclerView) view.findViewById(R.id.hotelrecycler);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(getContext(),tourLists, R.color.HotelColor);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tourLists = new ArrayList<>();

        tourLists.add(new TourList("Sun View Hotel", "Alagbaka"));
        tourLists.add(new TourList("Grand Capital Hotel", "Alagbaka"));
        tourLists.add(new TourList("Stateline Hotel", "FUTA Rd"));
        tourLists.add(new TourList("Royal Birds Hotel & Tower", "Alagbaka"));
        tourLists.add(new TourList("Royal Birds Motel", "Ijapo Estate"));
        tourLists.add(new TourList("Fontel Luxury Hotel", "Industrial Estate, Akure"));
        tourLists.add(new TourList("Ade Super Hotel", "Ilesha Expressway"));
        tourLists.add(new TourList("Flourish", "Alagbaka"));
        tourLists.add(new TourList("Bliss World Resorts and Hotel", "Ijapo Estate"));
        tourLists.add(new TourList("Solton International Hotel", "Ijapo Estate"));

    }

}

