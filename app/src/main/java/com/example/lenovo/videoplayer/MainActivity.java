package com.example.lenovo.videoplayer;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=(VideoView)findViewById(R.id.videoView);
        String path= Environment.getExternalStorageDirectory().getAbsolutePath()+"/monkey.mp4";
        videoView.setVideoPath(path);         /*本地*/

      //videoView.setVideoURI(Uri.parse("http://221.228.226.23/6/n/a/y/l/naylspkwvsujoltcqursegarxzowax/hd.yinyuetai.com/C02F015B377EA255563C19FBEF88B071.mp4"));       /* 网络*/

        MediaController controller=new MediaController(this);
    /*实用MediaC 控制视频播放*/
        videoView.setMediaController(controller);
    controller.setMediaPlayer(videoView);

    }
}
