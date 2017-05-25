package com.wtghsandroid.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wtghsandroid.R;
import com.wtghsandroid.databinding.ActivityMainBinding;
import com.wtghsandroid.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user = new User();
        user.setName("刘世麟");
        user.setNickName("南尘");
        user.setEmail("liushilin@qq.com");
        user.setVip(true);
        user.setLevel(5);
        user.setIcon("http://qlogo1.store.qq.com/qzone/503233512/503233512/100?1311741184");
//        binding.setUser(user);

        User user1 = new User();
        user1.setName("春春儿");
        user1.setNickName(null);
        user1.setVip(false);
        user1.setEmail("nanchen@qq.com");
        user1.setLevel(1);
//        binding.setUser(user1);

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        binding.setUsers(list);
    }
}
