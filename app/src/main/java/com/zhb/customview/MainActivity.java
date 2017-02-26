package com.zhb.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity  implements SeekBar.OnSeekBarChangeListener{

    private CircleProgressBar mCircleProgressBar;
    private SeekBar mSeekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        initView();
    }
    private void initView(){
        mCircleProgressBar = (CircleProgressBar) findViewById(R.id.custom_progress_bar);
        mSeekBar = (SeekBar) findViewById(R.id.seekBar);
        mSeekBar.setOnSeekBarChangeListener(this);

        mCircleProgressBar.setProgress(mSeekBar.getProgress());
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        mCircleProgressBar.setProgress(progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
