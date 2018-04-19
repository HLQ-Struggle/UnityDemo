package com.hlq.hlqlib.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.unity3d.player.UnityPlayerActivity;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/04/19
 * desc   : Unity启动页
 * version: 1.0
 */
public class LoadingActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(LoadingActivity.this, "Android Jar初始化完毕", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Unity传值 Android Jar 接收并显示
     *
     * @param unityText
     */
    public void setUnityText(String unityText) {
        Intent startIntent = new Intent(LoadingActivity.this, TestActivity.class);
        startIntent.putExtra("UnityTest", unityText);
        startActivity(startIntent);
    }

}
