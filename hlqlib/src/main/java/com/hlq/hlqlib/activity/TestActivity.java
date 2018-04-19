package com.hlq.hlqlib.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hlq.hlqlib.R;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/4/19
 * desc   : 测试在nity中跳转
 * version: 1.0
 */
public class TestActivity extends AppCompatActivity {

    private Button mShowBtn;
    private TextView mUnityInfoShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        String msg = getIntent().getStringExtra("UnityTest");
        if (!TextUtils.isEmpty(msg)) {
            setUnityText(msg);
        }
    }

    private void initView() {
        mShowBtn = findViewById(R.id.btn_show);
        mUnityInfoShow = findViewById(R.id.tv_unity_info_show);
        initEvent();
    }

    private void initEvent() {
        mShowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(TestActivity.this, "Unity触发Jar按钮事件", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    /**
     * Unity传值 Android Jar 接收并显示
     *
     * @param unityText
     */
    public void setUnityText(String unityText) {
        mUnityInfoShow.setText(unityText);
    }

}
