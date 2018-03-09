package com.example.lemonde;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 张广洁 on 2018/3/9.
 */

public class FragmentTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, TestFragment.newInstance())
                .commit();
    }

}
