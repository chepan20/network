package com.cp.network.netWork;

import com.cp.network.interfaces.ICallBack;

import java.util.Map;

public interface  HttpProcessor {

    void post(String url, Map<String,Object> map,ICallBack callback);

    void get(String url,ICallBack callBack);


}
