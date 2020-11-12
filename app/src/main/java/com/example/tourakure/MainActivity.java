package com.example.tourakure;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        drawerLayout= findViewById(R.id.drawer_layout);
        NavigationView navigationView= findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_drawer_open,R.string.nav_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HotelFragment()).commit();
            navigationView.setCheckedItem(R.id.hotel);
        }
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.hotel:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HotelFragment()).commit();
                break;
            case R.id.restaurant:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RestaurantFragment()).commit();
                break;
            case R.id.grocery:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GroceryFragment()).commit();
                break;
            case R.id.bank:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BankFragment()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
