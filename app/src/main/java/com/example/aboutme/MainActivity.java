package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.aboutme.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    View view;
    ActivityMainBinding binding;
    FrameLayout mouratFrameLayout;
    Fragment mouratFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        mouratFrameLayout = binding.mainContainer;
        mouratFragment = new MainMouratFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(mouratFrameLayout.getId(),mouratFragment);
        //ft.addToBackStack("name");
        ft.commit();

        setContentView(view);

    }
}