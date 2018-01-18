package jp.palamfairy.project.android.palamfairygame;

import android.media.AudioManager;
import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mBgm;
    private ImageView petImage;
    private ImageView toile1 = (ImageView)findViewById(R.id.toileA);
    private ImageView toile2 = (ImageView)findViewById(R.id.toileB);
    private ImageView toile3 = (ImageView)findViewById(R.id.toileC);
    private ImageView toile4 = (ImageView)findViewById(R.id.toileD);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        トイレの表示
        toile1.setVisibility(View.INVISIBLE);
        toile2.setVisibility(View.INVISIBLE);
        toile3.setVisibility(View.INVISIBLE);
        toile4.setVisibility(View.INVISIBLE);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


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


    @Override
    protected void onStart() {
        super.onStart();
        sound();
//        AnimationPet mAnimationPet = new AnimationPet();
//        mAnimationPet.petSlide(petImage);
        petImage = (ImageView) findViewById(R.id.petViewImage);
        TranslateAnimation petMoveRight = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_SELF, -1,
                TranslateAnimation.RELATIVE_TO_SELF, 1,
                TranslateAnimation.RELATIVE_TO_SELF, 0,
                TranslateAnimation.RELATIVE_TO_SELF, 0
        );
        petMoveRight.setDuration(5000);
        petMoveRight.setRepeatMode(Animation.REVERSE);
        petMoveRight.setRepeatCount(Animation.INFINITE);
        petImage.startAnimation(petMoveRight);

        toile();
    }
//    private void petGrouMenu(){
//
//    }
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

    public void sound() {
        mBgm = MediaPlayer.create(this, R.raw.bgm);
        mBgm.start();
    }
    private void toile(){
//        toile1.setVisibility(View.INVISIBLE);
//        toile2.setVisibility(View.INVISIBLE);
//        toile3.setVisibility(View.INVISIBLE);
//        toile4.setVisibility(View.INVISIBLE);
        int random;
        Random randomInt = new Random();
        random = randomInt.nextInt(10000)+10000;
        Timer toileTime = new Timer();
        toileTime.schedule(new TimerTask(){
            @Override
            public void run(){
                for(int i = 1;i<=4;i++) {
                    String roop = String.valueOf(i);
                    if(roop =="1") {
                        toile1.setVisibility(View.VISIBLE);
                    }else if (roop == "2"){
                        toile2.setVisibility(View.VISIBLE);
                    }else if(roop == "3"){
                        toile3.setVisibility(View.VISIBLE);
                    }else if(roop == "4"){
                        toile4.setVisibility(View.VISIBLE);
                    }
                }
            }
        },random,random);
    }



}
