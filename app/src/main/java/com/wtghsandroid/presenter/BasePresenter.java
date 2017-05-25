package com.wtghsandroid.presenter;

/**
 * Created by Administrator on 2017/5/25.
 */

public class BasePresenter<T> {
    public T mView;

    public void attach(T mView){
        this.mView = mView;
    }

    public void dettach(){
        mView = null;
    }
}
