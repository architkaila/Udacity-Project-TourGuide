package com.example.archit.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SightSeeingFragment extends Fragment {


    public SightSeeingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.guide_list, container, false);
        ArrayList<data> contents = new ArrayList<data>();

        String[] name = getResources().getStringArray(R.array.sight_name);
        String[] desc = getResources().getStringArray(R.array.sight_desc);
        String[] contact = getResources().getStringArray(R.array.sight_contact);
        String[] address = getResources().getStringArray(R.array.sight_address);
        String[] timing = getResources().getStringArray(R.array.sight_timing);
        int[] img = new int[]{R.drawable.red_fort, R.drawable.qutub_minar, R.drawable.akshardham, R.drawable.safdarjung_road};

        for (int i = 0; i < desc.length; i++) {
            contents.add(new data(name[i], desc[i], contact[i], address[i], timing[i], img[i]));
        }

        DataAdapter adptr = new DataAdapter(getActivity(), contents);
        ListView list = rootView.findViewById(R.id.listview);
        list.setAdapter(adptr);

        return rootView;
    }

}
