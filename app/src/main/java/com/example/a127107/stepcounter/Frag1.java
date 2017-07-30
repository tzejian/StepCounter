package com.example.a127107.stepcounter;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {
    TextView tv1;
    int getStep;

    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag1, container, false);

        /*if(getStep != null){
            getStep = getArguments().getDouble("step");
            tv1.setText(String.valueOf(getStep));
        }*/
        /*SharedPreferences prefs = this.getActivity().getSharedPreferences("myPref", Context.MODE_PRIVATE);
        getStep = prefs.getInt("step",0);
        tv1.setText(String.valueOf(getStep));*/




        return view;
    }

}
