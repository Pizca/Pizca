package com.hackunam.pizca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bienvenida extends AppCompatActivity {
    Button btn_Iniciar, btn_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        btn_Iniciar = (Button) findViewById(R.id.bienve_btn_iniciar);
        btn_registro = (Button) findViewById(R.id.bienve_btn_registrar);

        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Registro.class));
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.right);

            }
        });

        btn_Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Acceso.class));
                overridePendingTransition(R.anim.left, R.anim.zoom_forward_in);
            }
        });
    }
}
