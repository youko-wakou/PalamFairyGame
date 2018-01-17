package jp.palamfairy.project.android.palamfairygame;

import android.media.MediaActionSound;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView petImage;
    private TranslateAnimation petMoveRight;
    private TranslateAnimation petMoveLeft;
    private SoundPool mBgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        sound();
        for(int i = 0;i<1000;i++) {
//        右に動く
            ImageView petImage = (ImageView) findViewById(R.id.petViewImage);
            TranslateAnimation petMoveRight = new TranslateAnimation(0, 100, 0, 0);
            petMoveRight.setDuration(1000);
            petImage.startAnimation(petMoveRight);
//        左に動く
            TranslateAnimation petMoveLeft = new TranslateAnimation(0, -100, 0, 0);
            petMoveRight.setDuration(1000);
            petImage.startAnimation(petMoveLeft);
        }
//        ボタン
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
    public void sound(){
        int soundID =mBgm.load("@ras/bgm",1);
        mBgm.play(soundID,1.0f,1.0f,1,0,1.0f);
    }
}
