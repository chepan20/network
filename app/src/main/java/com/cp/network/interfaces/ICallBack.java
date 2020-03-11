package com.cp.network.interfaces;

import java.util.Map;

public interface ICallBack<T> {
   void success(T s);
   void failure();
}
