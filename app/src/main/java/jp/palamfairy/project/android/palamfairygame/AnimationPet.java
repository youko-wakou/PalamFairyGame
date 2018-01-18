//package jp.palamfairy.project.android.palamfairygame;
//
//import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.view.animation.Animation;
//import android.view.animation.AnimationSet;
//import android.view.animation.TranslateAnimation;
//import android.widget.ImageView;
//
///**
// * Created by appu2 on 2018/01/18.
// */
//
//public class AnimationPet extends AppCompatActivity {
//    private ImageView petImage;
//    private TranslateAnimation petMoveRight;
//    private TranslateAnimation petMoveLeft;
//
//        public void petSlide (ImageView image){
////            AnimationSet petAnime = new AnimationSet(true);
////            for (int i = 0; i < 1000; i++) {
////        右に動く
//                petImage = image;
//                Log.d("test", "aaaaaaaaaaa");
//                TranslateAnimation petMoveRight = new TranslateAnimation(
//                        TranslateAnimation.RELATIVE_TO_SELF, -1,
//                        TranslateAnimation.ABSOLUTE, 1,
//                        TranslateAnimation.RELATIVE_TO_SELF, 0,
//                        TranslateAnimation.RELATIVE_TO_SELF, 0
//                );
//            petMoveRight.setDuration(5000);
//            petMoveRight.setRepeatMode(Animation.REVERSE);
//            petMoveRight.setRepeatCount(Animation.INFINITE);
//            petImage.startAnimation(petMoveRight);
////                petAnime.addAnimation(petMoveRight);
////        左に動く
////                TranslateAnimation petMoveLeft = new TranslateAnimation(0, -100, 0, 0);
////            petMoveLeft.setDuration(1000);
////            petImage.startAnimation(petMoveLeft);
////                petAnime.addAnimation(petMoveLeft);
////                petAnime.setDuration(5000);
////                onCreateView().startAnimation(petAnime);
////            }
//        }
//}
//
