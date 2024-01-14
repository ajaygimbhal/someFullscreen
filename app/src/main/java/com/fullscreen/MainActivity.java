package com.fullscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;



public class MainActivity extends AppCompatActivity {

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Below Two Lines Use ... //
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        FullScreen fullscreen = new FullScreen(view, getWindow());

        // Status Bar Transparent View //
        fullscreen.transparentStatusBarAndNavigation();
        // Automatic Navigation Hidden //
        fullscreen.autoHiddenNavigationBar();



    }
}