package com.procleus.brime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

/**
 * Created by Utkarsh on 07-07-2016.
 */
public class PublicFragment extends Fragment {
    final boolean isEmptyPublic = true;
    private View view;
    ImageView mImageView;	//reference to the ImageView
    int xDim, yDim;		//stores ImageView dimensions
    private bitmapCreate bitmap;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).setActionBarTitle("Public Notes");
        if(isEmptyPublic == true){
            view = inflater.inflate(R.layout.empty_notes, container, false);
            mImageView = (ImageView)view.findViewById(R.id.empty_avatar);
            xDim=300;
            yDim=300;
            mImageView.setImageBitmap(bitmap.decodeSampledBitmapFromResource(getResources(), R.drawable.empty_buddy, xDim, yDim));
            return view;
        }
        else {
            return inflater.inflate(R.layout.public_fragment, container, false);
        }



    }

}
