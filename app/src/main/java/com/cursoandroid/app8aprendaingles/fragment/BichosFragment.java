package com.cursoandroid.app8aprendaingles.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.cursoandroid.app8aprendaingles.R;
import com.cursoandroid.app8aprendaingles.utils.TocarSom;

public class BichosFragment extends Fragment implements View.OnClickListener {

    public BichosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bichos, container, false);
        ImageView buttonCao = view.findViewById(R.id.buttonCao);
        ImageView buttonGato = view.findViewById(R.id.buttonGato);
        ImageView buttonLeao = view.findViewById(R.id.buttonLeao);
        ImageView buttonMacaco = view.findViewById(R.id.buttonMacaco);
        ImageView buttonOvelha = view.findViewById(R.id.buttonOvelha);
        ImageView buttonVaca = view.findViewById(R.id.buttonVaca);

        buttonCao.setOnClickListener(this);
        buttonGato.setOnClickListener(this);
        buttonLeao.setOnClickListener(this);
        buttonMacaco.setOnClickListener(this);
        buttonOvelha.setOnClickListener(this);
        buttonVaca.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCao:
                TocarSom.executar(getActivity(), R.raw.dog);
                break;
            case R.id.buttonGato:
                TocarSom.executar(getActivity(), R.raw.cat);
                break;
            case R.id.buttonLeao:
                TocarSom.executar(getActivity(), R.raw.lion);
                break;
            case R.id.buttonMacaco:
                TocarSom.executar(getActivity(), R.raw.monkey);
                break;
            case R.id.buttonOvelha:
                TocarSom.executar(getActivity(), R.raw.sheep);
                break;
            case R.id.buttonVaca:
                TocarSom.executar(getActivity(), R.raw.cow);
                break;

        }
    }
}