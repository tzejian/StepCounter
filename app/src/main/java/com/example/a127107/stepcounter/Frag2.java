package com.example.a127107.stepcounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {
    WebView wv;


    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_frag2, container, false);
        wv = (WebView)view.findViewById(R.id.wv);
        wv.loadUrl("https://www.inbodyusa.com/blogs/inbodyblog/99465793-what-walking-10-000-steps-does-and-doesn-t-do-for-you");
        return view;
    }

}

