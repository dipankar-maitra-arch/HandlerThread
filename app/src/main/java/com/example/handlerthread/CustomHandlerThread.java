package com.example.handlerthread;

import android.os.Message;
import android.util.Log;

import android.os.Handler;

public class CustomHandlerThread extends android.os.HandlerThread {

    public static final String TAG= CustomHandlerThread.class.getSimpleName();
    public Handler handler;

    public CustomHandlerThread(String name) {
        super(name);
     }

     @Override
    protected void onLooperPrepared(){

        super.onLooperPrepared();
        handler = new Handler(getLooper()){

          @Override
          public void handleMessage(Message msg){
              super.handleMessage(msg);
              Log.d(TAG, "Thread is :" + Thread.currentThread().getName() + "Message: " +msg.obj);
               }
        };

     }
}
