package com.example.opet.firebaseestudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingUp extends AppCompatActivity {

    private TextView textNome;

    private Button buttonStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        buttonStar = findViewById(R.id.buttonStar);

        textNome = findViewById(R.id.usuarioEmail);

        Bundle dados = getIntent().getExtras();
        String nomeUsuario =dados.getString("login do usuario");

        textNome.setText(nomeUsuario);
    }

    public void star_wars(View view) {
        Intent intent = new Intent(getApplicationContext(), StarWarsActivity.class);
        startActivity(intent);
    }
}
