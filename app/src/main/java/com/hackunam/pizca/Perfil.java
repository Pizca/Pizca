package com.hackunam.pizca;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Perfil extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inicio, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_prod) {
            startActivity(new Intent(getApplicationContext(), Inicio.class));
        } else if (id == R.id.nav_ofer) {
            //startActivity(new Intent(getApplicationContext(), CalSuenioActivity.class));
        } else if (id == R.id.nav_ubic) {
            //startActivity(new Intent(getApplicationContext(), CalSuenioActivity.class));
        } else if (id == R.id.nav_regi) {
            startActivity(new Intent(getApplicationContext(), Registro.class));
        } else if (id == R.id.nav_busq) {
            //startActivity(new Intent(getApplicationContext(), CalSuenioActivity.class));
        } else if (id == R.id.nav_perf) {
            startActivity(new Intent(getApplicationContext(), Perfil.class));
        }        else if (id == R.id.nav_hueEcol) {
            //startActivity(new Intent(getApplicationContext(), CalSuenioActivity.class));
        } else if (id == R.id.nav_Bien) {
            startActivity(new Intent(getApplicationContext(), Bienvenida.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
