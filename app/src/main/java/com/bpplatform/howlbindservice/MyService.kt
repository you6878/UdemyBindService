package com.bpplatform.howlbindservice

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

/**
 * Created by myeongsic on 2018. 3. 2..
 */

class MyService : Service(){
    var message : String? = null
    override fun onCreate() {
        super.onCreate()
        message = "서비스가 작동 중 입니다."
    }

    inner class MyBinder : Binder(){
        fun getService() : MyService{
            return this@MyService
        }
    }

    override fun onBind(p0: Intent?): IBinder {
        return MyBinder()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}