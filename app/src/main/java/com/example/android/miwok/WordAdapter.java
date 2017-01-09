package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Himanshu on 27/12/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mbackgroundColor;

    public WordAdapter(Activity context,ArrayList<Word> word,int backgroundColor)
    {
        super(context,0, word);
        mbackgroundColor=backgroundColor;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word listItem=getItem(position);
        TextView miwok_text=(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwok_text.setText(listItem.getMiwokTranslation());

        TextView default_text =(TextView)listItemView.findViewById(R.id.default_text_view);
        default_text.setText(listItem.getDefaultTranslation());

        ImageView listIcon = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        listIcon.setImageResource(listItem.getListIcon());
        /*if(listItem.hasImage()) {
            listIcon.setImageResource(listItem.getListIcon());
        }*/

        View textViewGroup = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mbackgroundColor);
        textViewGroup.setBackgroundColor(color);

        return listItemView;
    }
}
