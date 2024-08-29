package com.example.eco_recicla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Reset extends AppCompatActivity {

    private Button btnSave,btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reset);

        //Obtener referencia al boton
        Button btnSave = findViewById(R.id.button8);
        Button btnVolver = findViewById(R.id.button9);

        //Escuchador para lanzar el intent
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aca va la logica para guardar datos con HashMap o ArrayList
                Toast.makeText(Reset.this, "Problemas tecnicos sorry", Toast.LENGTH_SHORT).show();
            }
        });
        //Esuchador de la logica
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cambio de pantalla (Intent)
                Intent IraInicio = new Intent(Reset.this, MainActivity.class);
                startActivity(IraInicio);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}