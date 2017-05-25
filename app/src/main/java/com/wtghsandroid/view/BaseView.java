package com.wtghsandroid.view;

import android.databinding.ViewDataBinding;

import com.wtghsandroid.http.data.BaseBean;

/**
 * Created by Administrator on 2017/5/25.
 */

public interface BaseView<T extends BaseBean> {

    void showLoading();
    void hideLoading();

    /**
     * 网路请求返回数据
     * @param data 数据
     */
    void returnData(T data);

}