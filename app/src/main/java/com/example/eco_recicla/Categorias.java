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

public class Categorias extends AppCompatActivity {

    private Button btnReciclaVidrio,btnReciclaPlastico,btnReciclaEwaste,btnReciclaMetal,btnReciclaPapel,btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_categorias);

        //Ingresar a la pantalla de Recicla Vidrio
        Button btnReciclaVidrio = findViewById(R.id.button10);

        btnReciclaVidrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraVidrio= new Intent(Categorias.this, Glass.class);
                startActivity(iraVidrio);
            }
        });

        //Ingresar a la pantalla de Recicla Plastico
        Button btnReciclaPlastico = findViewById(R.id.button11);

        btnReciclaPlastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraPlastico= new Intent(Categorias.this, Plastic.class);
                startActivity(iraPlastico);
            }
        });

        //Ingresar a la pantalla de Recicla E.waste
        Button btnReciclaEwaste = findViewById(R.id.button12);

        btnReciclaEwaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraElectriwaste= new Intent(Categorias.this, Ewaste.class);
                startActivity(iraElectriwaste);
            }
        });

        //Ingresar a la pantalla de Recicla Metal
        Button btnReciclaMetal=findViewById(R.id.button13);

        btnReciclaMetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraMetal= new Intent(Categorias.this, Metal.class);
                startActivity(iraMetal);
            }
        });

        //Ingresar a la pantalla de Recicla Papel
        Button btnReciclaPapel=findViewById(R.id.button14);

        btnReciclaPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraPaper= new Intent(Categorias.this, Papel.class);
                startActivity(iraPaper);
            }
        });

        //Devolverse a la pantalla principal
        Button btnVolver=findViewById(R.id.button15);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iraPrincipal= new Intent(Categorias.this, Principal.class);
                startActivity(iraPrincipal);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}