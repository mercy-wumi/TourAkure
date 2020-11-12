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
public class BankFragment extends Fragment {

    private RecyclerView myRecyclerView;
    private View view;
    private List<TourList> tourLists;

    public BankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.bank_fragment, container, false);
        myRecyclerView= (RecyclerView) view.findViewById(R.id.bankrecycler);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(getContext(),tourLists, R.color.BankColor);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
                return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    tourLists = new ArrayList<>();

        tourLists.add(new TourList("First Bank", "Alagbaka, Oba Adesida Street", R.drawable.f));
        tourLists.add(new TourList("Access Bank", "Oyemekun Rd, Oba Adesida Street", R.drawable.a));
        tourLists.add(new TourList("GT Bank", "Alagbaka, FUTA", R.drawable.gt));
        tourLists.add(new TourList("Polaris Bank", "Oyemekun Rd", R.drawable.p));
        tourLists.add(new TourList("Unity Bank", "Oyemekun Rd", R.drawable.un));
        tourLists.add(new TourList("Eco Bank", "Oba Ile Rd, Arakale Rd", R.drawable.e));
        tourLists.add(new TourList("FCMB", "Alagbaka", R.drawable.fcmb));
        tourLists.add(new TourList("Keystone Bank", "Owo Rd", R.drawable.k));
        tourLists.add(new TourList("Zenith Bank", "Alagbaka", R.drawable.z));
        tourLists.add(new TourList("Union Bank", "Alagbaka, Oba Adesida Rd", R.drawable.u));

    }

}
