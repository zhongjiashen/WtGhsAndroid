package com.wtghsandroid.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.wtghsandroid.R;

/**
 * Created by 1363655717 on 2017-05-24.
 */

public class Utils {
    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView, String url) {

        imageView.setImageResource(R.mipmap.ic_launcher);

    }
}