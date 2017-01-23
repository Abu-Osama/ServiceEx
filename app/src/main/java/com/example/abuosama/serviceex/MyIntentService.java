package com.example.abuosama.serviceex;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("bATCH 34");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        //u can't touch UI in handle method because thread under the worker thread
//        Toast.makeText(MyIntentService.this, "service is strated", Toast.LENGTH_SHORT).show();
        Log.d("batch34","service is started");

    }
}
