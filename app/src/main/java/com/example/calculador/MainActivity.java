package com.example.calculador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText panel;
    public double operan1, operan2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel = (EditText)findViewById(R.id.panel);
    }

    //metodos para los numeros
    public void b1 (View num1){
        String cap = panel.getText().toString();
        cap = cap + "1";
        panel.setText(cap);
    }

    public void b2 (View num2){
        String cap = panel.getText().toString();
        cap = cap + "2";
        panel.setText(cap);
    }

    public void b3 (View num3){
        String cap = panel.getText().toString();
        cap = cap + "3";
        panel.setText(cap);
    }
    public void b4 (View num4){
        String cap = panel.getText().toString();
        cap = cap + "4";
        panel.setText(cap);
    }

    public void b5 (View num5){
        String cap = panel.getText().toString();
        cap = cap + "5";
        panel.setText(cap);
    }
    public void b6 (View num6){
        String cap = panel.getText().toString();
        cap = cap + "6";
        panel.setText(cap);
    }
    public void b7 (View num7){
        String cap = panel.getText().toString();
        cap = cap + "7";
        panel.setText(cap);
    }

    public void b8 (View num8){
        String cap = panel.getText().toString();
        cap = cap + "8";
        panel.setText(cap);
    }
    public void b9 (View num9){
        String cap = panel.getText().toString();
        cap = cap + "9";
        panel.setText(cap);
    }
    public void b0 (View num0){
        String cap = panel.getText().toString();
        cap = cap + "0";
        panel.setText(cap);
    }
    public void punto (View bpunto){
        String cap = panel.getText().toString();
        cap = cap + ".";
        panel.setText(cap);
    }

    //metodo suma
    public void suma (View s){
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        panel.setText("");
        ope = 1;
    }
    public void Mayor (View s){
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        panel.setText("");
        ope = 9;
    }
    //metodo resta
    public void resta (View r){
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        panel.setText("");
        ope = 2;
    }
    //metodo multiplicacion
    public void multiplicacion (View m){
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        panel.setText("");
        ope = 3;
    }
    //metodo division
    public void division (View d){
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        panel.setText("");
        ope = 4;
    }
    //metodo potencia
    public void potencia (View p) {
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe) {
        }
        panel.setText("");
        ope = 5;
    }
    public void porcentaje (View p){
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        panel.setText("");
        ope = 6;
    }
    //metodo modulo
    public void Mod (View p) {
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe) {
        }
        panel.setText("");
        ope = 7;
    }
    public void factorial (View fac){
        try {
            String aux = panel.getText().toString();
            operan1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        panel.setText("");
        ope = 8;
    }
    //metdodo igual
    public void igual (View ig){
        try {
            String aux2 = panel.getText().toString();
            operan2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe){}
        panel.setText("");

        if (ope == 1){
            res = operan1 + operan2;
        } else if (ope == 2){
            res = operan1 - operan2;
        } else if (ope == 3){
            res = operan1 * operan2;
        } else if (ope == 4){
            if (operan2 == 0){
                panel.setText("No se puede dividir entre 0");
            }  else {
                res = operan1 / operan2;
            }
        } else if (ope == 5) {
            res = Math.pow(operan1, operan2);
        } else if (ope == 6){
            res = operan2 * (operan1 / 100);
        } else if (ope == 7) {
            res = operan1 % operan2;
            res = 1;
            for (double i = operan1; i >= 1; i--){
                res = res * i;
            }
        }else if (ope == 9) {
            if (operan1<operan2){
                res = operan2;
            }else {
                res = operan1;

            }
        }else if (ope == 8) {
        }
        panel.setText("" + res);
        operan1 = res;
    }
    public void limpiar (View lim) {
        panel.setText("");
        res = 0.0;
        operan1 = 0.0;
        operan2 = 0.0;
    }
    public void borrar (View bor) {
        if (!panel.getText().toString().equals("")){
            panel.setText(panel.getText().subSequence(0, panel.getText().length() - 1) + "");
        }
    }
    public void mayor (View bor) {
        if (!panel.getText().toString().equals("")){
            panel.setText(panel.getText().subSequence(0, panel.getText().length() - 1) + "");
        }
    }
}
