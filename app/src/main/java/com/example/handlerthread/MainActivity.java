package com.example.handlerthread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    CustomHandlerThread hthread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hthread = new CustomHandlerThread("Test");
        hthread.start();

    }
    public void onClickButton (View v){

    Button btn =(Button)findViewById(R.id.btn);
    hthread.handler.sendMessage(getMessageWithCount("Hello"));




   /* Intent i = new Intent(MainActivity.this, HandlerThread.class);
    i.putExtra("name", "test");
    startActivity(i);*/
    }

    private Message getMessageWithCount(String str){
        Message  msg = new Message();
        msg.obj = ""+str;
        return msg;
    }

}
