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

public class Plastic extends AppCompatActivity {

    private Button btnPlastic,btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_plastic);

        //Grabar los datos de plastico reciclado
        Button btnPlastic=findViewById(R.id.button6);

        btnPlastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aca va el guardado de datos de plastico
                Toast.makeText(Plastic.this, "Datos guardados!", Toast.LENGTH_SHORT).show();
            }
        });

        //Volver a Categorias de reciclaje
        Button btnVolver=findViewById(R.id.button7);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IraCategorias = new Intent(Plastic.this, Categorias.class);
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