package com.wtghsandroid.model;

import android.app.Activity;
import android.databinding.BaseObservable;

/**
 * Created by Administrator on 2017/5/25.
 */

public abstract  class BaseModel extends BaseObservable {
    protected Activity activity;
    public BaseModel(Activity activity) {
        this.activity=activity;
    }
}
