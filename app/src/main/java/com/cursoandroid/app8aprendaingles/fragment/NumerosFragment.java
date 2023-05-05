package com.cursoandroid.app8aprendaingles.fragment;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cursoandroid.app8aprendaingles.R;
import com.cursoandroid.app8aprendaingles.utils.TocarSom;

public class NumerosFragment extends Fragment implements View.OnClickListener {

    public NumerosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        ImageView button1 = view.findViewById(R.id.button1);
        ImageView button2 = view.findViewById(R.id.button2);
        ImageView button3 = view.findViewById(R.id.button3);
        ImageView button4 = view.findViewById(R.id.button4);
        ImageView button5 = view.findViewById(R.id.button5);
        ImageView button6 = view.findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                TocarSom.executar(getActivity(), R.raw.one);
                break;
            case R.id.button2:
                TocarSom.executar(getActivity(), R.raw.two);
                break;
            case R.id.button3:
                TocarSom.executar(getActivity(), R.raw.three);
                break;
            case R.id.button4:
                TocarSom.executar(getActivity(), R.raw.four);
                break;
            case R.id.button5:
                TocarSom.executar(getActivity(), R.raw.five);
                break;
            case R.id.button6:
                TocarSom.executar(getActivity(), R.raw.six);
                break;

        }
    }
}