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
           // imageView.setImageResource(R.drawable.id.imageView);
            textViewIngredientes.setText("" +
                    "                    2 colheres ( sopa) de margarina \n"+
                    "                    2 colheres (sopa) de óleo\n" +
                    "                    1 ovo inteiro\n" +
                    "                    2 colheres rasas (sopa) de açúcar\n" +
                    "                    1 pitada de sal\n" +
                    "                    1 colher rasa (sopa) de fermento em pó\n" +
                    "                    Farinha de trigo até a massa desgrudar da mão.");
            textViewModoPreparo.setText("Em primeiro lugar faça a gelatina conforme o modo de preparo, e deixe-a na geladeira porque na hora do uso ela deve estar em ponto de clara de ovo pois se estiver líquida, a gelatina penetrará na massa, depois faça o creme, junte todos os ingredientes e mexa até levantar fervura e você ver que ele está bem cremoso, cuidado para não deixar empelotar ou grudar no fundo da panela, mexa bastante sem parar. Na hora do uso ele deve estar já frio ou levemente morno, agora faça a massa junte todos os ingredientes e quando ela estiver no ponto forre um pirex de médio a grande, os mais fundos são melhores fure a massa com um garfo e asse em fogo médio entre 10 a 15 minutos, quando dourar está boa, cuidado para não deixar queimar pois a massa fica fina.\n" +
                    "Para a Montagem:  Massa assada no pirex, deixe esfriar um pouco coloque o creme\n" +
                    "Os morangos cortados na transversal, coloque eles sobre todo o creme, agora coloque a gelatina já em ponto de clara, assim ela ficará na superfície\n" +
                    "Levar à geladeira por no mínimo 4 horas.");

            String valorSobremesa = getIntent().getExtras().getString("sobremesa");

        if (valorSobremesa.equals("btnCrepe")) {

        } else if (valorSobremesa.equals("doces")) {

        } else if(valorSobremesa.equals("doces")){

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
