package com.wtghsandroid.viewbar;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.wtghsandroid.R;
import com.wtghsandroid.utils.DensityUtils;

/**
 * Created by 1363655717 on 2017-05-25.
 */

public class ErrorDialog extends Dialog {
    public Context context;

    public ErrorDialog(Context context) {
        super(context);
        this.context = context;
    }

    public ErrorDialog(Context context, int theme) {
        super(context, theme);
        this.context = context;
    }

    public ErrorDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = View.inflate(context, R.layout.dialog_loginerror, null);
        setContentView(view);

        setCanceledOnTouchOutside(false);

        Window win = getWindow();
        WindowManager.LayoutParams lp = win.getAttributes();
        lp.height = DensityUtils.dp2px(context, 250);
        lp.width = DensityUtils.dp2px(context, 300);
        win.setAttributes(lp);

        view.findViewById(R.id.btn_cancel).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }
}