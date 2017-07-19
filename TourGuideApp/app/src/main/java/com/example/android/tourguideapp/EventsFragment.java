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
public class EventsFragment extends Fragment{


    public EventsFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_contents, container, false);

        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setDividerHeight(MainActivity.LIST_DIVIDER_HEIGHT);

        ArrayList<LocationInfo> arrayList = new ArrayList<>();

        LocationInfo info = new LocationInfo(R.drawable.native_fashion_image, R.string
                .native_fashion_heading, R.string.native_fashion_date,
                R.string.native_fashion_desc,
                R.string.native_fashion_address, LocationInfo.NO_PHONE_PROVIDED, R.string
                .native_fashion_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.sunset_wednesdays_image, R.string
                .sunset_wednesdays_heading,
                R.string.sunset_wednesdays_date,
                R.string.sunset_wednesdays_desc,
                R.string.sunset_wednesdays_address, LocationInfo.NO_PHONE_PROVIDED, R.string
                .sunset_wednesdays_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.interpid_movies_image, R.string.interpid_movies_heading,
                R.string.interpid_movies_date,
                R.string.interpid_movies_desc,
                R.string.interpid_movies_address, LocationInfo.NO_PHONE_PROVIDED, R.string
                .interpid_movies_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.chihuly_image, R.string.chihuly_heading,
                R.string.chihuly_date, R.string.chihuly_desc,
                R.string.chihuly_address, LocationInfo.NO_PHONE_PROVIDED, R.string
                .chihuly_web_link);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.bryant_park_image, R.string.bryant_park_heading,
                R.string.bryant_park_date, R.string.bryant_park_desc,
                R.string.bryant_park_address, LocationInfo.NO_PHONE_PROVIDED, R.string
                .bryant_park_web_link);
        arrayList.add(info);

        LocationInfoAdapter adapter = new LocationInfoAdapter(getActivity(),
                R.layout.list_item, arrayList);

        listView.setAdapter(adapter);

        LocationListListener listener = new LocationListListener(getActivity());
        listView.setOnItemClickListener(listener);

        return rootView;
    }

}
