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
public class AttractionsFragment extends Fragment{

    public AttractionsFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_contents, container, false);

        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setDividerHeight(MainActivity.LIST_DIVIDER_HEIGHT);

        ArrayList<LocationInfo> arrayList = new ArrayList<>();
        LocationInfo info = new LocationInfo(R.drawable.empire_state_building_image, R.string
                .empire_state_heading,
                R.string.empire_state_desc,
                R.string.empire_state_address);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.brooklyn_bridge_image, R.string.brooklyn_bridge_heading,
                R.string.brooklyn_bridge_desc,
                R.string.brooklyn_bridge_address);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.one_world_image, R.string.one_world_heading,
                R.string.one_world_desc,
                R.string.one_world_address);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.statue_of_liberty_image, R.string.liberty_heading,
                R.string.liberty_desc,
                R.string.liberty_address);
        arrayList.add(info);

        info = new LocationInfo(R.drawable.central_park_image, R.string.central_park_heading,
                R.string.central_park_desc,
                R.string.central_park_address);
        arrayList.add(info);

        LocationInfoAdapter adapter = new LocationInfoAdapter(getActivity(),
                R.layout.list_item, arrayList);

        listView.setAdapter(adapter);

        LocationListListener listener = new LocationListListener(getActivity());
        listView.setOnItemClickListener(listener);

        return rootView;
    }

}
