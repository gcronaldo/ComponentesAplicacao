package com.example.logonrmlocal.componetesaplicacao

import android.app.IntentService
import android.content.Intent
import android.util.Log

class NotificationService : IntentService(""){

    override fun onHandleIntent(intent: Intent?) {
        Log.i("RCG", "SERVICO SEND CHAMADO")
        Log.i("RCG2", intent?.getStringExtra("RCG2"))
    }

}