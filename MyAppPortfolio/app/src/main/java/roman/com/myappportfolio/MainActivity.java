package roman.com.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * this is my main activity
 */
public class MainActivity extends AppCompatActivity {

    //app buttons
    private Button mAppButton1;
    private Button mAppButton2;
    private Button mAppButton3;
    private Button mAppButton4;
    private Button mAppButton5;
    private Button mAppButton6;

    //fab
    private FloatingActionButton mFab;

    //fab animation
    private Animation mFabAnimation1;
    private Animation mFabAnimation2;


    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
        initClickListeners();
    }


    /**
     * boilerplate code ftw!
     */
    private void init() {
        mAppButton1 = (Button) findViewById(R.id.button_app1);
        mAppButton2 = (Button) findViewById(R.id.button_app2);
        mAppButton3 = (Button) findViewById(R.id.button_app3);
        mAppButton4 = (Button) findViewById(R.id.button_app4);
        mAppButton5 = (Button) findViewById(R.id.button_app5);
        mAppButton6 = (Button) findViewById(R.id.button_app6);
        mFab = (FloatingActionButton) findViewById(R.id.fab);
        mFabAnimation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_beat_up);
        mFabAnimation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_beat_down);
    }

    /**
     * more boilerplate code
     */
    private void initClickListeners() {
        mAppButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.app1), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mAppButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.app2), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mAppButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.app3), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mAppButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.app4), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mAppButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.app5), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mAppButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.app6), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //it's supposed to be a beating heart....
                mFab.startAnimation(mFabAnimation1);
                mFab.startAnimation(mFabAnimation2);
            }
        });
    }
}
