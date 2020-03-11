package com.cp.network;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cp.network.bean.Weather;
import com.cp.network.interfaces.ICallBack;
import com.cp.network.netWork.HttpHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpHelper.getInstance().get("http://www.weather.com.cn/data/cityinfo/101010100.html", new ICallBack<String>() {

                    @Override
                    public void success(String s) {
                        System.out.println("chenpan=="+s);
                    }

                    @Override
                    public void failure() {
                        System.out.println("chenpan==failure");
                    }
                });
            }
        });
    }
}
