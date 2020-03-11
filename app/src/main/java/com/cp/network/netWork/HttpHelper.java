package com.cp.network.netWork;

import com.cp.network.interfaces.ICallBack;

import java.util.Map;

public class HttpHelper  {
    HttpProcessor processor;
     private static volatile HttpHelper instance;
     private HttpHelper(){

     }

    public static HttpHelper getInstance(){
         if(instance==null){
             synchronized (HttpHelper.class){
                 if(instance==null){
                     instance=new HttpHelper();
                 }
             }
         }
         return instance;
    }

    public void init(HttpProcessor httpProcessor){
         this.processor =httpProcessor;
    }



    public void post(String url, Map<String, Object> map, ICallBack callback) {

    }

    public void get(String url, ICallBack callBack) {
           processor.get(url,callBack);
    }
}
