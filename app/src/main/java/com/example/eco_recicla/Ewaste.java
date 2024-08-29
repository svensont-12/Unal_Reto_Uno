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

public class Ewaste extends AppCompatActivity {

    private Button btnElectric, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ewaste);

        //Obtener referencia a los botones
        Button btnElectric=findViewById(R.id.button24);
        Button btnVolver=findViewById(R.id.button25);

        btnElectric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Logica de Recicla electriWaste
                Toast.makeText(Ewaste.this, "Datos guardados!", Toast.LENGTH_SHORT).show();
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IraCategorias = new Intent(Ewaste.this, Categorias.class);
                startActivity(IraCategorias);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}