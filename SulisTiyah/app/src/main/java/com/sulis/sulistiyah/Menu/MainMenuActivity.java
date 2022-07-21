package com.sulis.sulistiyah.Menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.sulis.sulistiyah.MainActivity;
import com.sulis.sulistiyah.R;
import com.sulis.sulistiyah.RecyclerView.HPActivity;
import com.sulis.sulistiyah.RecyclerView.LaptopActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_logOut:
                startActivity(new Intent(this, MainActivity.class));
                return true;

            case R.id.id_laptop:
                startActivity(new Intent(this, LaptopActivity.class));
                return true;

            case R.id.id_hp:
                startActivity(new Intent(this, HPActivity.class));
                return true;

            default:
                super.onOptionsItemSelected(item);

        }
        return true;
    }
}