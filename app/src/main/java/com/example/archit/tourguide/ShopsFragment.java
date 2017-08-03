package com.example.archit.tourguide;


import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopsFragment extends Fragment {


    public ShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.guide_list, container, false);
        ArrayList<data> contents = new ArrayList<data>();

        String[] name = getResources().getStringArray(R.array.shop_name);
        String[] desc = getResources().getStringArray(R.array.shop_desc);
        String[] contact = getResources().getStringArray(R.array.shop_contact);
        String[] address = getResources().getStringArray(R.array.shop_address);
        String[] timing = getResources().getStringArray(R.array.shop_timing);
        int[] img = new int[]{R.drawable.lifestyle, R.drawable.forever21, R.drawable.levis, R.drawable.pantaloons};

        for (int i = 0; i < desc.length; i++) {
            contents.add(new data(name[i], desc[i], contact[i], address[i], timing[i], img[i]));
        }


        DataAdapter adptr = new DataAdapter(getActivity(), contents);
        ListView list = rootView.findViewById(R.id.listview);
        list.setAdapter(adptr);

        return rootView;
    }

}
