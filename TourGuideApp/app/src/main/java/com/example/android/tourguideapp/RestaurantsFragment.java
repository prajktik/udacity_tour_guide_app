package com.example.android.tourguideapp;

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
public class RestaurantsFragment extends Fragment{

    public RestaurantsFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_contents, container, false);

        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setDividerHeight(MainActivity.LIST_DIVIDER_HEIGHT);

        ArrayList<LocationInfo> arrayList = new ArrayList<>();

        LocationInfo info = new LocationInfo(R.drawable.stk_image, R.string
                .stk_heading, LocationInfo.NO_DATE_PROVIDED,
                R.string.stk_desc,
                R.string.stk_address, R.string.stk_phone, R.string.stk_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.macondo_image, R.string
                .macondo_heading, LocationInfo.NO_DATE_PROVIDED,
                R.string.macondo_desc,
                R.string.macondo_address, R.string.macondo_phone, R.string.macondo_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.scaletta_image, R.string
                .scaletta_heading, LocationInfo.NO_DATE_PROVIDED,
                R.string.scaletta_desc,
                R.string.scaletta_address, R.string.scaletta_phone, R.string.scaletta_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.michaels_image, R.string
                .michaels_heading, LocationInfo.NO_DATE_PROVIDED,
                R.string.michaels_desc,
                R.string.michaels_address, R.string.michaels_phone, R.string.michaels_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.morgan_image, R.string
                .morgan_heading, LocationInfo.NO_DATE_PROVIDED,
                R.string.morgan_desc,
                R.string.morgan_address, R.string.morgan_phone, R.string.morgan_web_link);
        arrayList.add(info);


        LocationInfoAdapter adapter = new LocationInfoAdapter(getActivity(),
                R.layout.list_item, arrayList);

        listView.setAdapter(adapter);

        LocationListListener listener = new LocationListListener(getActivity());
        listView.setOnItemClickListener(listener);

        return rootView;
    }

}
