package com.example.eco_recicla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnLoggin,btnReset,btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Ingresar a la pantalla principal
        Button btnLoggin=findViewById(R.id.button20);

        btnLoggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraPrincipal = new Intent(MainActivity.this, Principal.class);
                startActivity(iraPrincipal);
            }
        });

        //Ingresar a la pantalla de reset
        Button btnReset=findViewById(R.id.button21);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraReset = new Intent(MainActivity.this, Reset.class);
                startActivity(iraReset);
            }
        });

        //Ingresar a la pantalla de registro
        Button btnRegister=findViewById(R.id.button22);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraRegistro = new Intent(MainActivity.this, Registro.class);
                startActivity(iraRegistro);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}