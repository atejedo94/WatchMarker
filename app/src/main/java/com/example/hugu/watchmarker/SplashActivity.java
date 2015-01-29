package com.example.hugu.watchmarker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);

        View baloon = (View) findViewById(R.id.balon);
        baloon.setAnimation(loadAnimation());
    }

    private Animation loadAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.balon);
        animation.setAnimationListener(new Animation.AnimationListener() {

            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashActivity.this, MainMenu.class));
                SplashActivity.this.finish();
            }

            public void onAnimationStart(Animation animation) {

            }

            public void onAnimationRepeat(Animation animation) {

            }
        });

        return animation;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
