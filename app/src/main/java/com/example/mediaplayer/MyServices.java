package com.example.mediaplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
//import android.os.Bundle;
import android.os.IBinder;

public class MyServices extends Service {

    MediaPlayer player;

    @Override

    public IBinder onBind(Intent intent){
        return null;

}

    @Override
    public void onCreate(){
        player = MediaPlayer.create(this, R.raw.song);
        //palyer.setLooping(true);
        player.start();

    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy(){
        player.release();
    }

}


