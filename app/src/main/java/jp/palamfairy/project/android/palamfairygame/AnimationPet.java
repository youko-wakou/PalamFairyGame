package jp.palamfairy.project.android.palamfairygame;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/**
 * Created by appu2 on 2018/01/18.
 */

public class AnimationPet extends AppCompatActivity {
    private ImageView petImage;
    private TranslateAnimation petMoveRight;
    private TranslateAnimation petMoveLeft;

    public void petSlide(ImageView image){
        for (int i = 0; i < 1000; i++) {
//        右に動く
            petImage = image;
            Log.d("test", "aaaaaaaaaaa");
            TranslateAnimation petMoveRight = new TranslateAnimation(
                    TranslateAnimation.RELATIVE_TO_SELF, 0,
                    TranslateAnimation.ABSOLUTE, 1000,
                    TranslateAnimation.RELATIVE_TO_SELF, 0,
                    TranslateAnimation.RELATIVE_TO_SELF, 0
            );
            petMoveRight.setDuration(5000);
            petImage.startAnimation(petMoveRight);
//        左に動く
            TranslateAnimation petMoveLeft = new TranslateAnimation(0, -100, 0, 0);
            petMoveRight.setDuration(1000);
            petImage.startAnimation(petMoveLeft);
        }
    }
}
