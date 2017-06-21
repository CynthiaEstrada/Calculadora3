package com.example.cyndi.calculadora3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double numero1, numero2, resultado;
    String operador;

    public void onClickBtn0(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "0");
    }

    public void onClickBtn1(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "1");
    }
    public void onClickBtn2(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "2");
    }
    public void onClickBtn3(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "3");
    }
    public void onClickBtn4(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "4");
    }
    public void onClickBtn5(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "5");
    }
    public void onClickBtn6(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "6");
    }
    public void onClickBtn7(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "7");
    }
    public void onClickBtn8(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "8");
    }
    public void onClickBtn9(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + "9");
    }

    public void onClickBtnPunto(View view){

        TextView tv = (TextView) findViewById(R.id.textNumero);
        tv.setText(tv.getText() + ".");
    }

    public void onClickDivision(View view){

        operador="/";
        TextView tv = (TextView) findViewById(R.id.textNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickMultiplicacion(View view){

        operador="*";
        TextView tv = (TextView) findViewById(R.id.textNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }
    public void onClickSuma(View view){

        operador="+";
        TextView tv = (TextView) findViewById(R.id.textNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }
    public void onClickResta(View view){

        operador="-";
        TextView tv = (TextView) findViewById(R.id.textNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickBtnBorrar(View view){
        TextView tv = (TextView) findViewById(R.id.textNumero) ;
        tv.setText("");

    }

    public void onClickIgual(View view)
    {
        TextView tv = (TextView) findViewById(R.id.textNumero) ;
        numero2 = Double.parseDouble(tv.getText().toString());
        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(String.valueOf(resultado));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
