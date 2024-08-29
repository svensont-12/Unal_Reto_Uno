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

public class Principal extends AppCompatActivity {

    private Button btnCategorias,btnEstadisticas,btnConsejos,btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);

        //Ingresar a la pantalla de Categorias
        Button btnCategorias=findViewById(R.id.button16);

        btnCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraCategorias = new Intent(Principal.this, Categorias.class);
                startActivity(iraCategorias);
            }
        });

        //Ingresar a la pantalla de Estadisticas
        Button btnEstadisticas=findViewById(R.id.button17);

        btnEstadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraEstadisticas = new Intent(Principal.this, Estadisticas.class);
                startActivity(iraEstadisticas);
            }
        });

        //Ingresar a la pantalla de Consejos
        Button btnConsejos=findViewById(R.id.button18);

        btnConsejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraConsejos = new Intent(Principal.this, Consejos.class);
                startActivity(iraConsejos);
            }
        });

        //Cerrar la sesion y devolverse a la pantalla inicial
        Button btnLogout=findViewById(R.id.button19);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraInicioSesion = new Intent(Principal.this, MainActivity.class);
                startActivity(iraInicioSesion);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}