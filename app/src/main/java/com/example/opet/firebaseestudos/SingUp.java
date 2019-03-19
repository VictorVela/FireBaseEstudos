package com.example.opet.firebaseestudos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SingUp extends AppCompatActivity {

    private TextView textNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        textNome = findViewById(R.id.usuarioEmail);

        Bundle dados = getIntent().getExtras();
        String nomeUsuario =dados.getString("login do usuario");

        textNome.setText(nomeUsuario);
    }
}
