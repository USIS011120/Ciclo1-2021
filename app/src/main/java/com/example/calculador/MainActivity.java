package com.example.calculador;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;import android.os.Bundle;
import android.database.Cursor;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnAgregarPeliculas);
        btn.setOnClickListener(v->{
});
    }
    private void AgregarPeliculas(String accion, String[] datos){
        try {
            Bundle parametrosAmigos = new Bundle();
            parametrosAmigos.putString("accion", accion);
            parametrosAmigos.putStringArray("datos", datos);

            Intent agregarAmigos = new Intent(getApplicationContext(), AgregarPeliculas.class);
            agregarAmigos.putExtras(parametrosAmigos);
            startActivity(agregarAmigos);
        }catch (Exception e){
            mostrarMsgToask(e.getMessage());
        }
    }

    private void mostrarMsgToask(String message) {
    }
}