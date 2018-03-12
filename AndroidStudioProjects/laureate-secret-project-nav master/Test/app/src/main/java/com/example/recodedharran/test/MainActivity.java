package com.example.recodedharran.test;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;

import com.gelitenight.waveview.library.WaveView;

import butterknife.BindView;
import butterknife.ButterKnife;

import me.itangqi.waveloadingview.WaveLoadingView;

public class MainActivity extends AppCompatActivity {

    private int mBorderColor ;
    private int mBorderWidth = 10;
    private int backColor;
    private int frontcolor;
    private WaveHelper mWaveHelper;
    //@BindView(R.id.seek_bar)
    //SeekBar seekBar;
    //@BindView(R.id.wave_loading_view)
   // WaveLoadingView waveLoadingView;
   ///// WaveLoadingView waveLoadingView;
//    SeekBar seekBar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final WaveView waveView = (WaveView) findViewById(R.id.wave);
        waveView.setBorder(mBorderWidth, mBorderColor);
        mWaveHelper = new WaveHelper(waveView);

//        waveView.setShapeType(WaveView.ShapeType.CIRCLE);
        backColor=Color.parseColor("#FFAB91");
        frontcolor=Color.parseColor("#f15f26");
        waveView.setWaveColor(backColor,frontcolor);
        mBorderColor = Color.parseColor("#f15f26");
        waveView.setBorder(mBorderWidth, mBorderColor);
//        int progress=70;
//        waveView.setWaterLevelRatio(progress);



    }
//
//        //ButterKnife.bind(this);
//        waveLoadingView= findViewById(R.id.wave_loading_view);
////        seekBar=(SeekBar) findViewById(R.id.seek_bar);
//        waveLoadingView.setProgressValue(0);
//        waveLoadingView.setTopTitle("fdgfh");
////
////        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
////            @Override
////            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//        int progress=70;
//                waveLoadingView.setProgressValue(progress);
//                if(progress<50){
//                    waveLoadingView.setBottomTitle(String.format("%d%%",progress));
//                    waveLoadingView.setCenterTitle("");
//                    waveLoadingView.setTopTitle("");
//
//                }
//                else if(progress<80){
//                    waveLoadingView.setBottomTitle("");
//                    waveLoadingView.setCenterTitle(String.format("%d%%",progress));
//                    waveLoadingView.setTopTitle("");
//                }
//                else {
//
//                    waveLoadingView.setBottomTitle("");
//                    waveLoadingView.setCenterTitle("");
//                    waveLoadingView.setTopTitle(String.format("%d%%",progress));
//                }
//
//
//
//            }
//
//
//
////        });

    @Override
    protected void onPause() {
        super.onPause();
        mWaveHelper.cancel();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mWaveHelper.start();
    }
    }

