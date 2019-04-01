package com.example.opet.firebaseestudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StarWarsActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private TextView nomeUsuariologado, titulofilme, idepisodio, diretorfilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_wars);

        mAuth = FirebaseAuth.getInstance();
        nomeUsuariologado = findViewById(R.id.nomeUsuariologado);
        titulofilme = findViewById(R.id.titulofilme);
        idepisodio = findViewById(R.id.idepisodio);
        diretorfilme = findViewById(R.id.diretorfilme);

    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://swapi.co/api/films/";

        nomeUsuariologado.setText("Bem vindo, "+currentUser.getEmail());

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        StarWars filme = gson.fromJson(response,StarWars.class);

                        String titulo = filme.results.get(0).getNomeFilme();
                        Long id = filme.results.get(0).getID();
                        String diretor = filme.results.get(0).getNomeDiretor();

                        titulofilme.setText("Título: "+titulo);
                        idepisodio.setText("ID: "+String.valueOf(id));
                        diretorfilme.setText("Diretor: "+diretor);

                        /*titulofilme.setText("Titulo");
                        idepisodio.setText("01");
                        diretorfilme.setText("Diretor");*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(StarWarsActivity.this, "DEU RUIM MANE", Toast.LENGTH_SHORT).show();
                        Log.e("Tela logado debug", error.toString());
                    }
                });

        queue.add(stringRequest);
    }

    public void logout(View view) {
        mAuth.signOut();
        telaprincipal();
    }
    public void telaprincipal(){
        Intent principal = new Intent(this, MainActivity.class);
        startActivity(principal);
    }


}
