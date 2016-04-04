package com.example.asus.myfirstapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {

    private MediaPlayer player;

    public MyService() {
    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate(){
        //Uri myUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        player = MediaPlayer.create(this, R.raw.sonido);
        //player.setLooping(false);

    }

    @Override
    public void onDestroy(){
        player.stop();
    }

    @Override
    public void onStart(Intent intent, int startid){

        player.start();
    }
}
