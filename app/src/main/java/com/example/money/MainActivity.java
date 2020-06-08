package com.example.money;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText rubles;
    EditText dollar;
    EditText euro;
    EditText grivna;
    EditText pound;
    EditText bitcoin;
    TextView resr;
    TextView resd;
    TextView rese;
    TextView resg;
    TextView resp;
    TextView resb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         rubles = findViewById(R.id.editText);
         dollar = findViewById(R.id.editText2);
         euro = findViewById(R.id.editText3);
         grivna = findViewById(R.id.editText4);
        pound = findViewById(R.id.editText5);
        bitcoin = findViewById(R.id.editText6);
        resr = findViewById(R.id.textView);
        resd = findViewById(R.id.textView2);
        rese = findViewById(R.id.textView3);
        resg = findViewById(R.id.textView4);
        resp = findViewById(R.id.textView5);
        resb = findViewById(R.id.textView6);
        clear();
    }
    public void update(View v){
        setRuble();
        setDollar();
        setEuro();
        setGrivna();
        setPound();
        setBitcoin();
        resr.setVisibility(View.VISIBLE);
        resd.setVisibility(View.VISIBLE);
        rese.setVisibility(View.VISIBLE);
        resg.setVisibility(View.VISIBLE);
        resp.setVisibility(View.VISIBLE);
        resb.setVisibility(View.VISIBLE);
        rubles.setVisibility(View.INVISIBLE);
        dollar.setVisibility(View.INVISIBLE);
        euro.setVisibility(View.INVISIBLE);
        grivna.setVisibility(View.INVISIBLE);
        pound.setVisibility(View.INVISIBLE);
        bitcoin.setVisibility(View.INVISIBLE);
    }
    public void onClickclear(View v){clear();}
    public void clear(){
        rubles.setText("0");
        dollar.setText("0");
        euro.setText("0");
        grivna.setText("0");
        pound.setText("0");
        bitcoin.setText("0");
        resr.setText("0,00");
        resd.setText("0,00");
        rese.setText("0,00");
        resg.setText("0,00");
        resp.setText("0,00");
        resb.setText("0,00");
        rubles.setVisibility(View.VISIBLE);
        dollar.setVisibility(View.VISIBLE);
        euro.setVisibility(View.VISIBLE);
        grivna.setVisibility(View.VISIBLE);
        pound.setVisibility(View.VISIBLE);
        bitcoin.setVisibility(View.VISIBLE);
        resr.setVisibility(View.INVISIBLE);
        resd.setVisibility(View.INVISIBLE);
        rese.setVisibility(View.INVISIBLE);
        resg.setVisibility(View.INVISIBLE);
        resp.setVisibility(View.INVISIBLE);
        resb.setVisibility(View.INVISIBLE);
    }
    public void setRuble(){

      if(resr.getText().toString().equals("0,00")) {
       //    resr.setText(String.format("%.2f", (((Integer.parseInt(dollar.getText().toString())))));
         resr.setText(String.format("%.2f", (((Integer.parseInt(dollar.getText().toString())) * 68.72))));
        }
       if(resr.getText().toString().equals("0,00")){
            resr.setText(String.format("%.2f", ((Integer.valueOf(euro.getText().toString()) * 77.91))));
        }
        if(resr.getText().toString().equals("0,00")){
            resr.setText(String.format("%.2f", ((Integer.valueOf(grivna.getText().toString()) * 2.58))));
        }
        if(resr.getText().toString().equals("0,00")){
            resr.setText(String.format("%.2f", ((Integer.valueOf(pound.getText().toString()) * 86.34))));
        }
        if(resr.getText().toString().equals("0,00")){
            resr.setText(String.format("%.2f", ((Integer.valueOf(bitcoin.getText().toString()) * 664068.00))));
        }
        if(resr.getText().toString().equals("0,00")) {
            resr.setText(String.format("%.2f", ((Integer.valueOf(rubles.getText().toString()))*1.00)));
        }

    }
    public void setDollar(){
        if(resd.getText().toString().equals("0,00")){
            resd.setText(String.format("%.2f", ((Integer.valueOf(rubles.getText().toString()) / 68.72))));
        }
        if(resd.getText().toString().equals("0,00")){
            resd.setText(String.format("%.2f", ((Integer.valueOf(euro.getText().toString()) * 1.13))));
        }
        if(resd.getText().toString().equals("0,00")){
            resd.setText(String.format("%.2f", ((Integer.valueOf(grivna.getText().toString())/26.70))));
        }
        if(resd.getText().toString().equals("0,00")){
            resd.setText(String.format("%.2f", ((Integer.valueOf(pound.getText().toString())* 1.27))));
        }
        if(resd.getText().toString().equals("0,00")){
            resd.setText(String.format("%.2f", ((Integer.valueOf(bitcoin.getText().toString()) * 9687.56))));
        }
        if(resd.getText().toString().equals("0,00")){
            resd.setText(String.format("%.2f", ((Integer.valueOf(dollar.getText().toString()))*1.00)));
        }
    }
    public void setEuro(){
        if(rese.getText().toString().equals("0,00")){
            rese.setText(String.format("%.2f", ((Integer.valueOf(rubles.getText().toString())/77.33))));
        }
        if(rese.getText().toString().equals("0,00")){
            rese.setText(String.format("%.2f", ((Integer.valueOf(dollar.getText().toString()) / 1.13))));
        }
        if(rese.getText().toString().equals("0,00")){
            rese.setText(String.format("%.2f", ((Integer.valueOf(grivna.getText().toString()) / 30.00))));
        }
        if(rese.getText().toString().equals("0,00")){
            rese.setText(String.format("%.2f", ((Integer.valueOf(pound.getText().toString()) * 1.11))));
        }
        if(rese.getText().toString().equals("0,00")){
            rese.setText(String.format("%.2f", ((Integer.valueOf(bitcoin.getText().toString()) * 8536.14))));
        }
        if(rese.getText().toString().equals("0,00")){
            rese.setText(String.format("%.2f", ((Integer.valueOf(euro.getText().toString()))*1.00)));
        }
    }
    public void setGrivna(){
        if(resg.getText().toString().equals("0,00")){
            resg.setText(String.format("%.2f", ((Integer.valueOf(rubles.getText().toString())/2.58))));
        }
        if(resg.getText().toString().equals("0,00")){
            resg.setText(String.format("%.2f", ((Integer.valueOf(dollar.getText().toString()) * 26.70))));
        }
        if(resg.getText().toString().equals("0,00")){
            resg.setText(String.format("%.2f", ((Integer.valueOf(euro.getText().toString()) * 30.00))));
        }
        if(resg.getText().toString().equals("0,00")){
            resg.setText(String.format("%.2f", ((Integer.valueOf(pound.getText().toString()) * 33.48))));
        }
        if(resg.getText().toString().equals("0,00")){
            resg.setText(String.format("%.2f", ((Integer.valueOf(bitcoin.getText().toString()) * 257315.98))));
        }
        if(resg.getText().toString().equals("0,00")){
            resg.setText(String.format("%.2f", ((Integer.valueOf(grivna.getText().toString()))*1.00)));
        }
    }
    public void setPound(){
        if(resp.getText().toString().equals("0,00")){
            resp.setText(String.format("%.2f", ((Integer.valueOf(rubles.getText().toString())/86.34))));
        }
        if(resp.getText().toString().equals("0,00")){
            resp.setText(String.format("%.2f", ((Integer.valueOf(dollar.getText().toString()) / 1.27))));
        }
        if(resp.getText().toString().equals("0,00")){
            resp.setText(String.format("%.2f", ((Integer.valueOf(euro.getText().toString()) / 1.11))));
        }
        if(resp.getText().toString().equals("0,00")){
            resp.setText(String.format("%.2f", ((Integer.valueOf(grivna.getText().toString()) / 33.48))));
        }

        if(resp.getText().toString().equals("0,00")){
            resp.setText(String.format("%.2f", ((Integer.valueOf(bitcoin.getText().toString()) * 7646.38))));
        }
        if(resp.getText().toString().equals("0,00")){
            resp.setText(String.format("%.2f", ((Integer.valueOf(pound.getText().toString()))*1.00)));
        }
    }
    public void setBitcoin(){
        if(resb.getText().toString().equals("0,00")){
            resb.setText(String.format("%.2f", ((Integer.valueOf(rubles.getText().toString())/664068.00))));
        }
        if(resb.getText().toString().equals("0,00")){
            resb.setText(String.format("%.2f", ((Integer.valueOf(dollar.getText().toString()) / 9687.56))));
        }
        if(resb.getText().toString().equals("0,00")){
            resb.setText(String.format("%.2f", ((Integer.valueOf(euro.getText().toString()) / 8536.14))));
        }
        if(resb.getText().toString().equals("0,00")){
            resb.setText(String.format("%.2f", ((Integer.valueOf(grivna.getText().toString()) / 257315.98))));
        }
        if(resb.getText().toString().equals("0,00")){
            resb.setText(String.format("%.2f", ((Integer.valueOf(pound.getText().toString()) / 7646.38))));
        }
        if(resb.getText().toString().equals("0,00")){
            resb.setText(String.format("%.2f", ((Integer.valueOf(bitcoin.getText().toString()))*1.00)));
        }
    }
}
