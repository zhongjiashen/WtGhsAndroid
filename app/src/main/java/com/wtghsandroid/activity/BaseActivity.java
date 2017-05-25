package com.wtghsandroid.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import com.wtghsandroid.http.data.BaseBean;
import com.wtghsandroid.view.BaseView;

/**
 * * Created by Administrator on 2017/5/25.
 * @param <T>   ViewDataBinding
 * @param <T1> 网路数据返回实体类
 */

public abstract class BaseActivity<T extends ViewDataBinding,T1 extends BaseBean>  extends AppCompatActivity implements BaseView<T1> {
    protected T binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,Rlayout());
        initialize();
    }

    /**
     * 引用布局
     * @return 布局
     */
    protected abstract int Rlayout();

    /**
     * 初始化方法
     */
    protected abstract void initialize();
    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
