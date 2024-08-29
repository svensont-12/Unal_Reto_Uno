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

public class Metal extends AppCompatActivity {

    private Button btnIron, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_metal);

        //Obtener referencia a la interfaz
        Button btnIron=findViewById(R.id.button2);
        Button btnVolver=findViewById(R.id.button3);

        btnIron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aca va la logica
                Toast.makeText(Metal.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IraCategorias = new Intent(Metal.this, Categorias.class);
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