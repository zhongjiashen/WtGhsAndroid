package com.wtghsandroid.activity;



import com.wtghsandroid.R;

import com.wtghsandroid.databinding.LoginActivityBinding;
import com.wtghsandroid.http.data.LoginData;
import com.wtghsandroid.model.LoginModel;
/**
 * Created by Administrator on 2017/5/25.
 * 登录页面
 */
public class LoginActivity extends BaseActivity<LoginActivityBinding,LoginData> {
    @Override
    protected int Rlayout() {
        return R.layout.login_activity;
    }

    @Override
    protected void initialize() {
        LoginModel loginModel=new LoginModel(this);
        loginModel.setEt_account(binding.etAccount);
        loginModel.setEt_pass(binding.etPass);
        binding.setLogin(loginModel);
    }

    @Override
    public void returnData(LoginData data) {

    }
}
