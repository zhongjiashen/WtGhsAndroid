package com.wtghsandroid.activity;

import com.wtghsandroid.R;
import com.wtghsandroid.databinding.RegisterActivityBinding;
import com.wtghsandroid.http.data.BaseBean;
import com.wtghsandroid.http.data.RegisterData;
import com.wtghsandroid.model.LoginModel;
import com.wtghsandroid.model.RegisterModel;

/**
 * Created by Administrator on 2017/5/25.
 */

public class RegisterActivity extends BaseActivity<RegisterActivityBinding,RegisterData>{
    @Override
    protected int Rlayout() {
        return R.layout.register_activity;
    }

    @Override
    protected void initialize() {
        RegisterModel registertModel=new RegisterModel(this);

        binding.setRegistert(registertModel);
    }


    @Override
    public void returnData(RegisterData data) {

    }
}
