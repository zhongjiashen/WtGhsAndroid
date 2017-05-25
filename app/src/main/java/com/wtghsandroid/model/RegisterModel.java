package com.wtghsandroid.model;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/5/25.
 */

public class RegisterModel extends BaseModel {
    private String phone;
    private String code;
    private EditText et_phone;
    private EditText et_code;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public RegisterModel(Activity activity) {
        super(activity);
    }

    public EditText getEt_phone() {
        return et_phone;
    }

    public void setEt_phone(EditText et_phone) {
        this.et_phone = et_phone;
    }

    public EditText getEt_code() {
        return et_code;
    }

    public void setEt_code(EditText et_code) {
        this.et_code = et_code;
    }

    /**
     * 获取验证码按钮点击事件
     * @param view
     */
    public void code_click(View view){

        Toast.makeText(view.getContext(),"__________" ,Toast.LENGTH_SHORT).show();
    }

    /**
     * 注册按钮点击事件
     * @param view
     */
    public void login_register(View view){
        Toast.makeText(view.getContext(), "注册点击事件" ,Toast.LENGTH_SHORT).show();
    }
}
