package com.example.general_software_framework.Fragment;

import android.util.Log;
import android.view.View;

import com.example.general_software_framework.Base.BaseFragment;
import com.example.general_software_framework.R;

public class fragment1 extends BaseFragment {
    @Override
    protected int initView() {
       // View view = View.inflate(mContext,R.layout.fragment1,null);
        return R.layout.fragment1;
    }

    @Override
    protected void initData() {

        Log.e("fragment1","fragment1 初始化了");
    }
}
