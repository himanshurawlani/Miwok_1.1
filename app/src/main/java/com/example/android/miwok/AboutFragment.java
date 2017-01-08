package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.activity_about,container,false);

        TextView aboutText=(TextView)rootView.findViewById(R.id.about_text_view);
        aboutText.setText(Html.fromHtml(getString(R.string.about_content)));
        return rootView;
    }

}
