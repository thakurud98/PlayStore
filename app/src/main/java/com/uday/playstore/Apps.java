package com.uday.playstore;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.uday.playstore.RecyclerViewDataAdapter;
import com.uday.playstore.SectionDataModel;
import com.uday.playstore.SingleItemModel;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Apps extends Fragment {

    protected Context context;

    ArrayList<SectionDataModel> allSampleData;

    public Apps() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_apps, container, false);

        // Inflate the layout for this fragment
        Button btn1 =(Button) view.findViewById(R.id.btn1);
        Button btn2 =(Button) view.findViewById(R.id.btn2);
        Button btn3 =(Button) view.findViewById(R.id.btn3);
        Button btn4 =(Button) view.findViewById(R.id.btn4);
        Button btn5 =(Button) view.findViewById(R.id.btn5);
        Button btn6 =(Button) view.findViewById(R.id.btn6);

        CardView horicard1 =(CardView) view.findViewById(R.id.hori_card1);
        ImageView hori_card1_img =(ImageView) view.findViewById(R.id.hori_card1_img);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(new Intent(getContext(),Clg1.class));
            }
        });

//        hori_card1_img.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
////                    startActivity(new Intent(context, Clg1.class));
////                    Intent mintent = new Intent(getActivity(), Clg1.class);
////                     startActivity(mintent);
//
//                    Toast .makeText(getActivity(),"working",Toast.LENGTH_LONG).show();
//                }
//            });

        TextView text1 = (TextView)view.findViewById(R.id.text1);
        TextView text2= (TextView)view.findViewById(R.id.text2);
        Button btn7 =(Button) view.findViewById(R.id.btn7);

        allSampleData = new ArrayList<SectionDataModel>();

//        if (toolbar != null) {
//            setSupportActionBar(toolbar);
//            toolbar.setTitle("G PlayStore");
//
//        }



        createDummyData();


        RecyclerView my_recycler_view = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        my_recycler_view.setHasFixedSize(true);

        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(context, allSampleData);

        my_recycler_view.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));

        my_recycler_view.setAdapter(adapter);
        return view;

    }


    public void createDummyData() {
        for (int i = 1; i <= 1; i++) {

            SectionDataModel dm = new SectionDataModel();

            //text for vertical recycler data
            dm.setHeaderTitle("Contry " + i);

            ArrayList<SingleItemModel> singleItem = new ArrayList<SingleItemModel>();
            for (int j = 0; j <= 5; j++) {

                //text for image in row
                singleItem.add(new SingleItemModel("University", "URL " + j));
            }

            dm.setAllItemsInSection(singleItem);

            allSampleData.add(dm);

        }
    }


}
