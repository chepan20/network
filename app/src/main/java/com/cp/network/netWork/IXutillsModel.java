package com.cp.network.netWork;

import android.os.Handler;

import com.cp.network.bean.Weather;
import com.cp.network.interfaces.ICallBack;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.Map;

public class IXutillsModel implements HttpProcessor {
    @Override
    public void post(String url, Map<String, Object> map, ICallBack callback) {

    }

    @Override
    public void get(String url, final ICallBack callBack) {
        RequestParams params = new RequestParams(url);
        // params.setSslSocketFactory(...); // 如果需要自定义SSL
        //  params.addQueryStringParameter("wd", "xUtils");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
//                Gson gson =new Gson();
//               Weather weather= gson.fromJson(result, Weather.class);
                callBack.success(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                   callBack.failure();
            }

            @Override
            public void onCancelled(CancelledException cex) {
                callBack.failure();
            }

            @Override
            public void onFinished() {

            }
        });
    }


}
