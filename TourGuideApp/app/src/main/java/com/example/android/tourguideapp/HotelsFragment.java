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
public class HotelsFragment extends Fragment{

    public HotelsFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_contents, container, false);

        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setDividerHeight(MainActivity.LIST_DIVIDER_HEIGHT);

        ArrayList<LocationInfo> arrayList = new ArrayList<>();

        LocationInfo info = new LocationInfo(R.drawable.plaza_image, R.string
                .plaza_heading, LocationInfo.NO_DATE_PROVIDED,
                LocationInfo.NO_DESC_PROVIDED,
                R.string.plaza_address, R.string.plaza_phone, R.string.plaza_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.holiday_inn_image, R.string
                .holiday_inn_heading, LocationInfo.NO_DATE_PROVIDED,
                LocationInfo.NO_DESC_PROVIDED,
                R.string.holiday_inn_address, R.string.holiday_inn_phone, R.string
                .holiday_inn_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.skyline_image, R.string
                .skyline_heading, LocationInfo.NO_DATE_PROVIDED,
                LocationInfo.NO_DESC_PROVIDED,
                R.string.skyline_address, R.string.skyline_phone, R.string.skyline_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.grace_image, R.string
                .grace_heading, LocationInfo.NO_DATE_PROVIDED,
                LocationInfo.NO_DESC_PROVIDED,
                R.string.grace_address, R.string.grace_phone, R.string.grace_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.row_image, R.string
                .row_heading, LocationInfo.NO_DATE_PROVIDED,
                LocationInfo.NO_DESC_PROVIDED,
                R.string.row_address, R.string.row_phone, R.string.row_web_link);
        arrayList.add(info);

        LocationInfoAdapter adapter = new LocationInfoAdapter(getActivity(),
                R.layout.list_item, arrayList);

        listView.setAdapter(adapter);

        LocationListListener listener = new LocationListListener(getActivity());
        listView.setOnItemClickListener(listener);

        return rootView;
    }

}
