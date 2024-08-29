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

public class Papel extends AppCompatActivity {

    private Button btnPaper, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_papel);

        //Enviar datos de papel a Estadisticas
        Button btnPaper=findViewById(R.id.button4);

        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aca va la logica para guardar datos de papel
                Toast.makeText(Papel.this, "Saved Dats!", Toast.LENGTH_SHORT).show();
            }
        });

        //Regresarse a categorias
        Button btnVolver=findViewById(R.id.button5);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IraCategorias = new Intent(Papel.this, Categorias.class);
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