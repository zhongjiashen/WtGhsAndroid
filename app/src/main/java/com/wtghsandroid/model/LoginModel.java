package com.wtghsandroid.model;

import android.app.Activity;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.wtghsandroid.activity.RegisterActivity;

/**
 * Created by Administrator on 2017/5/25.
 */

public class LoginModel extends BaseModel {
    private String account;
    private String pass;
    private EditText et_account;
    private EditText et_pass;

    public LoginModel(Activity activity) {
        super(activity);
    }


    public EditText getEt_account() {
        return et_account;
    }

    public void setEt_account(EditText et_account) {
        this.et_account = et_account;
    }

    public EditText getEt_pass() {
        return et_pass;
    }

    public void setEt_pass(EditText et_pass) {
        this.et_pass = et_pass;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    /**
     * 登陆按钮点击事件
     * @param view
     */
    public void login_click(View view){
        account=et_account.getText().toString();
        pass=et_pass.getText().toString();
        Toast.makeText(view.getContext(),account+ "__________" + pass,Toast.LENGTH_SHORT).show();
    }

    /**
     * 注册按钮点击事件
     * @param view
     */
    public void login_register(View view){
        activity.startActivity(new Intent(activity, RegisterActivity.class));
    }
}
