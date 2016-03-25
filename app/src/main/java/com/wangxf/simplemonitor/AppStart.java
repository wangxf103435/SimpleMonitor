package com.wangxf.simplemonitor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;

import com.wangxf.simplemonitor.ui.MainActivity;

public class AppStart extends Activity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View view = View.inflate(this, R.layout.activity_app_start, null);
        setContentView(view);
//        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
//        alphaAnimation.setDuration(3 * 1000);
//        view.startAnimation(alphaAnimation);
//        alphaAnimation.setAnimationListener(this);

//        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0.1f, 1f);
//        valueAnimator.setDuration(3000);
//        valueAnimator.addListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                Intent intent = new Intent(AppStart.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float alpha = Float.valueOf(animation.getAnimatedValue().toString());
//                view.setAlpha(alpha);
//            }
//        });
//        valueAnimator.start();

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0.3f, 1f);
        objectAnimator.setDuration(3000);
        objectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                Intent intent = new Intent(AppStart.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        objectAnimator.start();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
    }
}
