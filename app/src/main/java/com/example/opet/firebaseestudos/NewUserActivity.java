package com.example.opet.firebaseestudos;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class NewUserActivity extends AppCompatActivity {

    private EditText editLogin, editSenha, editSenha2;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        editLogin = findViewById(R.id.username);
        editSenha = findViewById(R.id.password);
        editSenha2 = findViewById(R.id.password2);
        mAuth = FirebaseAuth.getInstance();
    }

    public void novoUser(View view) {
        String login = editLogin.getText().toString();
        String senha = editSenha.getText().toString();
        String confirmaSenha = editSenha2.getText().toString();
        if(senha.length() >= 8){
            if(senha.equals(confirmaSenha)){
                mAuth.createUserWithEmailAndPassword(login, senha).addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(NewUserActivity.this, "Usuario criado", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }).addOnFailureListener(this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(NewUserActivity.this, "Erro ao logar", Toast.LENGTH_SHORT).show();
                    }
                });
            }else{
                Toast.makeText(this, "As senhas não conferem", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "A senha precisa ter no mínimo 8 caracteres", Toast.LENGTH_LONG).show();
        }


    }


}
