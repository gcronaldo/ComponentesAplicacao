package com.example.logonrmlocal.componetesaplicacao

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService(){

    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        Log.d("NOTIFICACAO_BODY", "Message Notification Body: " + p0?.getNotification()?.getBody());
        Log.d("NOTIFICACAO_TITULO", "Message Notification Title: " + p0?.getNotification()?.title);

        NotificationUtils.showNotification(this,
                525252,
                "Push",
                "Push",
                p0?.notification?.title!!,
                p0?.notification?.body!!)
    }
}