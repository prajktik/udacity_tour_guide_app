package com.example.android.tourguideapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


final class LocationInfoAdapter extends ArrayAdapter<LocationInfo>{

    private Context mContext;

    public LocationInfoAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List
            objects){
        super(context, resource, objects);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        LocationInfo info = getItem(position);
        ImageView locationImage = listItemView.findViewById(R.id.iv_location_image);
        locationImage.setImageResource(info.getImageId());

        TextView tvHeading = listItemView.findViewById(R.id.tv_location_heading);
        tvHeading.setText(info.getHeadingId());

        TextView tvDate = listItemView.findViewById(R.id.tv_location_date);
        int dateId = info.getDateId();
        if(dateId == LocationInfo.NO_DATE_PROVIDED){
            tvDate.setVisibility(View.GONE);
        }else{
            tvDate.setText(dateId);
        }

        TextView tvDescription = listItemView.findViewById(R.id.tv_location_description);
        int descId = info.getDescriptionId();
        if(descId == LocationInfo.NO_DESC_PROVIDED){
            tvDescription.setVisibility(View.GONE);
        }else{
            tvDescription.setText(descId);
        }

        TextView tvAddress = listItemView.findViewById(R.id.tv_location_address);
        tvAddress.setText(info.getAddressId());

        TextView tvPhone = listItemView.findViewById(R.id.tv_location_phone);
        final int phoneId = info.getPhoneId();
        if(phoneId == LocationInfo.NO_PHONE_PROVIDED){
            tvPhone.setVisibility(View.GONE);
        }else{
            tvPhone.setText(phoneId);
            tvPhone.setClickable(true);
            tvPhone.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    int permissionCheck = ContextCompat.checkSelfPermission(mContext,
                            Manifest.permission.CALL_PHONE);
                    if(permissionCheck == PackageManager.PERMISSION_GRANTED){
                        String phoneNumber = "tel:" + mContext.getString(phoneId);
                        Intent sIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber));
                        sIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(sIntent);
                    }else{
                        //Do nothing
                        Log.i("TOUR_GUIDE_APP", "Permission denied!!!");
                    }

                }
            });
        }


        return listItemView;
    }
}
