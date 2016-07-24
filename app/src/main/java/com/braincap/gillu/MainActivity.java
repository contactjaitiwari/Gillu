package com.braincap.gillu;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "Jai";
    @BindView(R.id.iv_board) ImageView displayBoard;
    @BindView(R.id.iv_number) ImageView numberBoard;
    @BindView(R.id.iv_garden) ImageView gardenHolder;
    @BindView(R.id.iv_gillu) ImageView gilluHolder;
    @BindView(R.id.ll_main) LinearLayout linearLayout;
    @BindView(R.id.btn_1) ImageView buttonOne;
    @BindView(R.id.btn_2) ImageView buttonTwo;
    @BindView(R.id.btn_3) ImageView buttonThree;
    @BindView(R.id.btn_4) ImageView buttonFour;
    @BindView(R.id.btn_5) ImageView buttonFive;
    @BindView(R.id.btn_6) ImageView buttonSix;
    @BindView(R.id.btn_7) ImageView buttonSeven;
    @BindView(R.id.btn_8) ImageView buttonEight;
    @BindView(R.id.btn_9) ImageView buttonNine;

    @BindView(R.id.iv_nut1) ImageView imageNut1;
    @BindView(R.id.iv_nut2) ImageView imageNut2;
    @BindView(R.id.iv_nut3) ImageView imageNut3;
    @BindView(R.id.iv_nut4) ImageView imageNut4;
    @BindView(R.id.iv_nut5) ImageView imageNut5;
    @BindView(R.id.iv_nut6) ImageView imageNut6;
    @BindView(R.id.iv_nut7) ImageView imageNut7;
    @BindView(R.id.iv_nut8) ImageView imageNut8;
    @BindView(R.id.iv_nut9) ImageView imageNut9;
    Animation anim;
    MediaPlayer mp;
    Interpolator interpolator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mp = null;

        Glide.with(this).load(R.drawable.board).fitCenter().into(displayBoard);
        Glide.with(this).load(R.drawable.bushes).fitCenter().into(gardenHolder);
        Glide.with(this).load(R.drawable.gillu).fitCenter().into(gilluHolder);

        Glide.with(this).load(R.drawable.one).fitCenter().into(buttonOne);
        Glide.with(this).load(R.drawable.two).fitCenter().into(buttonTwo);
        Glide.with(this).load(R.drawable.three).fitCenter().into(buttonThree);
        Glide.with(this).load(R.drawable.four).fitCenter().into(buttonFour);
        Glide.with(this).load(R.drawable.five).fitCenter().into(buttonFive);
        Glide.with(this).load(R.drawable.six).fitCenter().into(buttonSix);
        Glide.with(this).load(R.drawable.seven).fitCenter().into(buttonSeven);
        Glide.with(this).load(R.drawable.eight).fitCenter().into(buttonEight);
        Glide.with(this).load(R.drawable.nine).fitCenter().into(buttonNine);

        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut1);
        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut2);
        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut3);
        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut4);
        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut5);
        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut6);
        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut7);
        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut8);
        Glide.with(this).load(R.drawable.nuts).fitCenter().into(imageNut9);


        imageNut1.setVisibility(View.GONE);
        imageNut2.setVisibility(View.GONE);
        imageNut3.setVisibility(View.GONE);
        imageNut4.setVisibility(View.GONE);
        imageNut5.setVisibility(View.GONE);
        imageNut6.setVisibility(View.GONE);
        imageNut7.setVisibility(View.GONE);
        imageNut8.setVisibility(View.GONE);
        imageNut9.setVisibility(View.GONE);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);

        anim = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        interpolator = AnimationUtils.loadInterpolator(this, android.R.anim.bounce_interpolator);
        anim.setInterpolator(interpolator);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                Glide.with(this).load(R.drawable.one).fitCenter().into(numberBoard);
                play_sound(1);
                display_nuts(1);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.one));
                break;
            case R.id.btn_2:
                Glide.with(this).load(R.drawable.two).fitCenter().into(numberBoard);
                play_sound(2);
                display_nuts(2);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.two));
                break;
            case R.id.btn_3:
                Glide.with(this).load(R.drawable.three).fitCenter().into(numberBoard);
                play_sound(3);
                display_nuts(3);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.three));
                break;
            case R.id.btn_4:
                Glide.with(this).load(R.drawable.four).fitCenter().into(numberBoard);
                play_sound(4);
                display_nuts(4);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.four));
                break;
            case R.id.btn_5:
                Glide.with(this).load(R.drawable.five).fitCenter().into(numberBoard);
                play_sound(5);
                display_nuts(5);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.five));
                break;
            case R.id.btn_6:
                Glide.with(this).load(R.drawable.six).fitCenter().into(numberBoard);
                play_sound(6);
                display_nuts(6);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.six));
                break;
            case R.id.btn_7:
                Glide.with(this).load(R.drawable.seven).fitCenter().into(numberBoard);
                play_sound(7);
                display_nuts(7);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.seven));
                break;
            case R.id.btn_8:
                Glide.with(this).load(R.drawable.eight).fitCenter().into(numberBoard);
                play_sound(8);
                display_nuts(8);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.eight));
                break;
            case R.id.btn_9:
                Glide.with(this).load(R.drawable.nine).fitCenter().into(numberBoard);
                play_sound(9);
                display_nuts(9);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.nine));
                break;
        }
    }

    public void play_sound(int id) {

        if (mp != null) {
            mp.stop();
            mp.reset();
            mp.release();
        }

        switch (id) {
            case 1:
                mp = MediaPlayer.create(this, R.raw.one);
                break;
            case 2:
                mp = MediaPlayer.create(this, R.raw.two);
                Log.d(TAG, "play_sound: 2");
                break;
            case 3:
                mp = MediaPlayer.create(this, R.raw.three);
                break;
            case 4:
                mp = MediaPlayer.create(this, R.raw.four);
                break;
            case 5:
                mp = MediaPlayer.create(this, R.raw.five);
                break;
            case 6:
                mp = MediaPlayer.create(this, R.raw.six);
                break;
            case 7:
                mp = MediaPlayer.create(this, R.raw.seven);
                break;
            case 8:
                mp = MediaPlayer.create(this, R.raw.eight);
                break;
            case 9:
                mp = MediaPlayer.create(this, R.raw.nine);
                break;
        }

        if (mp != null) {
            mp.start();
            Log.d(TAG, "play_sound: ");
        }
    }

    public void display_nuts(int id) {
        switch (id) {
            case 1:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.GONE);
                imageNut3.setVisibility(View.GONE);
                imageNut4.setVisibility(View.GONE);
                imageNut5.setVisibility(View.GONE);
                imageNut6.setVisibility(View.GONE);
                imageNut7.setVisibility(View.GONE);
                imageNut8.setVisibility(View.GONE);
                imageNut9.setVisibility(View.GONE);
                break;
            case 2:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.VISIBLE);
                imageNut3.setVisibility(View.GONE);
                imageNut4.setVisibility(View.GONE);
                imageNut5.setVisibility(View.GONE);
                imageNut6.setVisibility(View.GONE);
                imageNut7.setVisibility(View.GONE);
                imageNut8.setVisibility(View.GONE);
                imageNut9.setVisibility(View.GONE);
                break;
            case 3:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.VISIBLE);
                imageNut3.setVisibility(View.VISIBLE);
                imageNut4.setVisibility(View.GONE);
                imageNut5.setVisibility(View.GONE);
                imageNut6.setVisibility(View.GONE);
                imageNut7.setVisibility(View.GONE);
                imageNut8.setVisibility(View.GONE);
                imageNut9.setVisibility(View.GONE);
                break;
            case 4:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.VISIBLE);
                imageNut3.setVisibility(View.VISIBLE);
                imageNut4.setVisibility(View.VISIBLE);
                imageNut5.setVisibility(View.GONE);
                imageNut6.setVisibility(View.GONE);
                imageNut7.setVisibility(View.GONE);
                imageNut8.setVisibility(View.GONE);
                imageNut9.setVisibility(View.GONE);
                break;
            case 5:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.VISIBLE);
                imageNut3.setVisibility(View.VISIBLE);
                imageNut4.setVisibility(View.VISIBLE);
                imageNut5.setVisibility(View.VISIBLE);
                imageNut6.setVisibility(View.GONE);
                imageNut7.setVisibility(View.GONE);
                imageNut8.setVisibility(View.GONE);
                imageNut9.setVisibility(View.GONE);
                break;
            case 6:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.VISIBLE);
                imageNut3.setVisibility(View.VISIBLE);
                imageNut4.setVisibility(View.VISIBLE);
                imageNut5.setVisibility(View.VISIBLE);
                imageNut6.setVisibility(View.VISIBLE);
                imageNut7.setVisibility(View.GONE);
                imageNut8.setVisibility(View.GONE);
                imageNut9.setVisibility(View.GONE);
                break;
            case 7:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.VISIBLE);
                imageNut3.setVisibility(View.VISIBLE);
                imageNut4.setVisibility(View.VISIBLE);
                imageNut5.setVisibility(View.VISIBLE);
                imageNut6.setVisibility(View.VISIBLE);
                imageNut7.setVisibility(View.VISIBLE);
                imageNut8.setVisibility(View.GONE);
                imageNut9.setVisibility(View.GONE);
                break;
            case 8:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.VISIBLE);
                imageNut3.setVisibility(View.VISIBLE);
                imageNut4.setVisibility(View.VISIBLE);
                imageNut5.setVisibility(View.VISIBLE);
                imageNut6.setVisibility(View.VISIBLE);
                imageNut7.setVisibility(View.VISIBLE);
                imageNut8.setVisibility(View.VISIBLE);
                imageNut9.setVisibility(View.GONE);
                break;
            case 9:
                imageNut1.setVisibility(View.VISIBLE);
                imageNut2.setVisibility(View.VISIBLE);
                imageNut3.setVisibility(View.VISIBLE);
                imageNut4.setVisibility(View.VISIBLE);
                imageNut5.setVisibility(View.VISIBLE);
                imageNut6.setVisibility(View.VISIBLE);
                imageNut7.setVisibility(View.VISIBLE);
                imageNut8.setVisibility(View.VISIBLE);
                imageNut9.setVisibility(View.VISIBLE);
                break;
        }
    }
}
