package com.uday.playstore;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimaryFragment extends Fragment {

    private Context context;

    public PrimaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_primary, container, false);
        CardView cardexplore =(CardView) view.findViewById(R.id.card_explore);
        CardView cardsearch =(CardView) view.findViewById(R.id.card_search);




        return view;
    }


}
