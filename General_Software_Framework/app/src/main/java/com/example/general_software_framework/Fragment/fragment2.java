package com.example.general_software_framework.Fragment;

import android.util.Log;

import com.example.general_software_framework.Base.BaseFragment;
import com.example.general_software_framework.R;

public class fragment2 extends BaseFragment {
    @Override
    protected int initView() {
        return R.layout.fragment2;
    }

    @Override
    protected void initData() {

        Log.e("fragment2","fragment2 初始化了");
    }
}
