package com.example.aboutme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.aboutme.databinding.ActivityMainBinding;


public class MainMouratFragment extends Fragment {
    View view;
    Button sportsBut, educationBut, travelBut;
    Fragment sportsFragment;

    public MainMouratFragment() {
        // Required empty public constructor
    }

    public static MainMouratFragment newInstance(String param1, String param2) {
        MainMouratFragment fragment = new MainMouratFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_main_mourat, container, false);

        sportsFragment = new SportsFragment();

        view.findViewById(R.id.sportsBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm2 = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm2.beginTransaction();
                ft.replace(R.id.main_container,sportsFragment);
                ft.addToBackStack("NAME");
                ft.commit();
            }
        });

        return view;
    }
}