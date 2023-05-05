package com.cursoandroid.app8aprendaingles;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.cursoandroid.app8aprendaingles.fragment.BichosFragment;
import com.cursoandroid.app8aprendaingles.fragment.NumerosFragment;
import com.cursoandroid.app8aprendaingles.fragment.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar() != null){
            getSupportActionBar().setElevation(0);
        }
        SmartTabLayout smartTabLayout = findViewById(R.id.viewpagertab);
        ViewPager viewPager = findViewById(R.id.viewpager);
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add(R.string.bichos, BichosFragment.class)
                        .add(R.string.numeros, NumerosFragment.class)
                        .add(R.string.vogais, VogaisFragment.class)
                        .create());
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}