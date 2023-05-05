package com.cursoandroid.app8aprendaingles.utils;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.annotation.NonNull;

public class TocarSom {
    public TocarSom(){

    }
    public static void executar(Context context, @NonNull Integer resId){
        MediaPlayer mediaPlayer = MediaPlayer.create(context,resId);
        if(mediaPlayer != null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(mp -> mediaPlayer.release());
        }
    }
}
