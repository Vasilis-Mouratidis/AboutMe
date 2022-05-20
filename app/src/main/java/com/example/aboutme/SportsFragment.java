package com.example.aboutme;

import android.app.GameManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.aboutme.databinding.ActivityMainBinding;

public class SportsFragment extends Fragment {
    View view;

    public static SportsFragment newInstance(String param1, String param2) {
        SportsFragment fragment = new SportsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_sports, container, false);

        return view;
    }
}