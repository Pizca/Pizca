package com.hackunam.pizca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Acceso extends AppCompatActivity {
    Button LogIn;
    EditText Usuario;
    EditText Password;


    final String usuarioTrue = "vendedor";
    final String passTrue = "123";

    String usuario = "";
    String contrasena = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
        LogIn = (Button)findViewById(R.id.sign_btn_acceder);//Boton
        Usuario = (EditText)findViewById(R.id.sign_et_user);
        Password = (EditText)findViewById(R.id.sign_et_pass);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usuario = Usuario.getText().toString();
                contrasena = Password.getText() + "";
                if (!usuario.equals("") && usuario.equals(usuarioTrue)) {
                    if (!contrasena.equals("") && contrasena.equals(passTrue)) {
                        Toast.makeText(getApplicationContext(), "¡Bienvenido!", Toast.LENGTH_LONG).show();
                        //Intent para pasar a otra actv( de donde, hacia donde )
                        Intent intent = new Intent(getApplicationContext(),Perfil.class);

                        intent.putExtra("Llavecorreo", usuario);//enviar informacion de correo para iniciar el servicio
                        intent.putExtra("contraseña", contrasena);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Error datos inválidos", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "inválidos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
