package com.crisspian.fragment_guide_01;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.crisspian.fragment_guide_01.databinding.ActivityMainBinding;
import com.crisspian.fragment_guide_01.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
private FragmentFirstBinding binding;
    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.RadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = binding.RadioGroup1.indexOfChild(binding.RadioGroup1.findViewById(checkedId));
                switch (index){
                    case 0:
                        binding.textFragmento1.setText("correcto");
                        break;
                    case 1:
                        binding.textFragmento1.setText("equivocado");
                        break;
                }
            }
        });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        binding =null;
    }
}