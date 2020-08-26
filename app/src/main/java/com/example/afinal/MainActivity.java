package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
ImageView Imagemeun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        final DrawerLayout drawerLayout = findViewById (R.id.drawerLayout);
        Imagemeun= (ImageView) findViewById(R.id.imageMenu);
        Imagemeun.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer ( GravityCompat.START );
            }
        } );
        NavigationView navigationView = findViewById ( R.id.navigation);
        navigationView.setItemIconTintList ( null );

    }
}
