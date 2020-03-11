package com.cp.network;

import com.cp.network.netWork.HttpHelper;
import com.cp.network.netWork.HttpOkIModel;
import com.cp.network.netWork.IXutillsModel;

import org.xutils.x;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
        HttpHelper.getInstance().init(new HttpOkIModel());
    }
}
