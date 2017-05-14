package com.example.android.miwok;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mbeev on 04/05/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColour;

    public WordAdapter(Context context, ArrayList<Word> words, int backgroundColour) {
        super(context, 0, words);
        mBackgroundColour = backgroundColour;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word Word = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the version name from the current Word object and
        // set this image on the Miwok ImageView
        if (Word.hasImage()) {

            miwokImageView.setImageResource(Word.getImageResourceId());
            miwokImageView.setVisibility(View.VISIBLE);
        }
        else {
            miwokImageView.setVisibility(View.GONE);
        }


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current Word object and
        // set this text on the Miwok TextView
        miwokTextView.setText(Word.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current Word object and
        // set this text on the Default TextView
        defaultTextView.setText(Word.getDefaultTranslation());


        // Tells the app which colour to display in the background
        View backgroundColour = listItemView.findViewById(R.id.text_box);
        // find the right colour for the view
        int color = ContextCompat.getColor(getContext(), mBackgroundColour);
        // set the background to the right colour
        backgroundColour.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
