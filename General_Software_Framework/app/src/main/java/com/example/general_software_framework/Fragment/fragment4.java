package com.example.general_software_framework.Fragment;

import android.util.Log;

import com.example.general_software_framework.Base.BaseFragment;
import com.example.general_software_framework.R;

public class fragment4 extends BaseFragment {
    @Override
    protected int initView() {
        return R.layout.fragment4;
    }

    @Override
    protected void initData() {

        Log.e("fragment4","fragment4 初始化了");
    }
}
