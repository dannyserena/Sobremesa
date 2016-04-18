package com.example.danielle.sobremesas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalheActivity extends AppCompatActivity {

    TextView textViewTitulo, textViewIngredientes,textViewModoPreparo;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        textViewTitulo = (TextView)findViewById(R.id.textViewTitulo);
        textViewIngredientes = (TextView)findViewById(R.id.textViewIngredientes);
        textViewModoPreparo = (TextView)findViewById(R.id.textViewModoPreparo);
        imageView = (ImageView)findViewById(R.id.imageView);
        Intent intent = getIntent();

        //pegando dinamicamente a descrição e imagem da receita
      //  if(imageView == id){
            imageView.setImageResource(R.drawable.morango);
            textViewIngredientes.setText("Acucar, farinha");
            textViewModoPreparo.setText("Misture os ingredientes");

            String valorSobremesa = getIntent().getExtras().getString("sobremesa");

        if (valorSobremesa.equals("crepe")) {

        } else if (valorSobremesa.equals("doces")) {

        }


      //  }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
