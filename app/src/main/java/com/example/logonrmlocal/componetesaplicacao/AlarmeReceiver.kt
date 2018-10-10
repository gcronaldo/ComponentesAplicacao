package com.example.logonrmlocal.componetesaplicacao

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmeReceiver : BroadcastReceiver(){

    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, NotificationService::class.java)
        service.putExtra("MSG2", intent?.getStringExtra("MSG2"))
        context?.startService(service)
    }

}