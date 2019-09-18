package com.example.general_software_framework.Fragment;

import android.util.Log;

import com.example.general_software_framework.Base.BaseFragment;
import com.example.general_software_framework.R;

public class fragment3 extends BaseFragment {
    @Override
    protected int initView() {
        return R.layout.fragment3;
    }

    @Override
    protected void initData() {

        Log.e("fragment3","fragment3 初始化了");
    }
}
