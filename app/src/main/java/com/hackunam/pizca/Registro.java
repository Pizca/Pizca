package com.hackunam.pizca;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Registro extends AppCompatActivity {

    EditText et_nombre, et_edad, et_email, et_celular;
    String sexo;

    public static String name;
    public static String edad;
    public static String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        et_nombre = (EditText) findViewById(R.id.registro_et_nombre);
        et_edad = (EditText) findViewById(R.id.registro_et_edad);
        et_email = (EditText) findViewById(R.id.registro_et_emal);
        et_email = (EditText) findViewById(R.id.registro_et_celular);
        RadioGroup rg_sexo = (RadioGroup) findViewById(R.id.reg_rg_sexo);


        rg_sexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb_sexo = (RadioButton) findViewById(checkedId);
                sexo = rb_sexo.getText().toString();
            }
        });

        FloatingActionButton guardar = (FloatingActionButton) findViewById(R.id.fab);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Perfil.class));
            }
        });
    }

}
