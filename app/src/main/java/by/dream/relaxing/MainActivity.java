package by.dream.relaxing;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView sunImageView = (ImageView) findViewById(R.id.sun);

        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);

        sunImageView.startAnimation(sunRiseAnimation);


        // Получим ссылку на часы
        ImageView clockImageView = (ImageView) findViewById(R.id.clock);

        // анимация для вращения часов
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);

        clockImageView.startAnimation(clockTurnAnimation);

        // получим ссылку на часовую стрелку
        ImageView hourImageView = (ImageView) findViewById(R.id.hour_hand);

        // анимация для стрелки
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);

        // присоединяем анимацию
        hourImageView.startAnimation(hourTurnAnimation);

    }
}
