package com.robop.soundpoolapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainSActivity extends AppCompatActivity {

    SoundPool sp1;
    int soundId;            //音声ファイルをロードしたものを格納

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_s);


        //soundPoolのインスタンスを生成
        sp1 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        //new SoundPool(ロードするファイル数, ストリームタイプ（STREAM_MUSICは音楽音）,サンプリングレートのクオリティ(デフォルトは０));

        //音声ファイルをロード
        soundId = sp1.load(this, R.raw.clapping_short2, 1);




    }
}
