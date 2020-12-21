package com.crisspian.fragment_guide_01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.crisspian.fragment_guide_01.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {
private FragmentSecondBinding binding;
    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.RadioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = binding.RadioGroup2.indexOfChild(binding.RadioGroup2.findViewById(checkedId));
                switch (index){
                    case 0:
                        String url = "https://www.youtube.com";
                        Intent mIntent = new Intent(Intent.ACTION_VIEW);
                        mIntent.setData(Uri.parse(url));
                        startActivity(mIntent);
                        break;
                    case 1:

                        binding.textFragamento2.setText("ok");
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}