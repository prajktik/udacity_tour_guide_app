package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


class LocationListListener implements AdapterView.OnItemClickListener{

    private Context mContext;
    private static final String GOOGLE_MAP_URL = "http://maps.google.co.in/maps?q=";

    public LocationListListener(Context context){
        mContext = context;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id){

        ListView list = (ListView) adapterView;
        LocationInfoAdapter adapter = (LocationInfoAdapter) list.getAdapter();
        LocationInfo info = adapter.getItem(position);

        String address;
        String url;
        int webId = info.getWebLinkId();
        if(webId == LocationInfo.NO_WEB_LINK_PROVIDED){
            address = mContext.getString(info.getAddressId());
            url = GOOGLE_MAP_URL + address;
        }else{
            url = mContext.getString(webId);
        }
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
        mContext.startActivity(intent);
    }
}
