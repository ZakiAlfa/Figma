package com.example.figma;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GabungKelas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gabung_kelas);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Handle navigation item clicks here
                if (item.getItemId() == R.id.navigation_home) {
                    startActivity(new Intent(GabungKelas.this, Home.class));
                } else if (item.getItemId() == R.id.navigation_tugas) {
                    startActivity(new Intent(GabungKelas.this, Tugas.class));
                } else if (item.getItemId() == R.id.navigation_buat_kelas) {
                    startActivity(new Intent(GabungKelas.this, BuatKelas.class));
                } else if (item.getItemId() == R.id.navigation_gabung_kelas) {
                    // Do nothing or handle differently, since you are already in GabungKelas activity
                }
                return true;
            }
        });
    }
}








