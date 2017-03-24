package br.com.fiap.exercicios.drawerandfragments.RM77722;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FrameLayout frameContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
      frameContainer = (FrameLayout) findViewById(R.id.fragment_container);

        setSupportActionBar(toolbar);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.abrir, R.string.fechar);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.navigationview);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.fusca){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FuscaFragment()).addToBackStack(null).commit();
                }else if (item.getItemId() == R.id.porshe){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PorsheFragment()).addToBackStack(null).commit();
                }else if (item.getItemId() == R.id.opala){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new OpalaFragment()).addToBackStack(null).commit();
                }else if (item.getItemId() == R.id.dogChar){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DodgeFragment()).addToBackStack(null).commit();
                }else if (item.getItemId() == R.id.coshe){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CobraFragment()).addToBackStack(null).commit();
                }else if (item.getItemId() == R.id.rural){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RuralFragment()).addToBackStack(null).commit();
                }
                drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
                drawerLayout.closeDrawer(GravityCompat.START);

                return false;
            }
        });


    }


}
