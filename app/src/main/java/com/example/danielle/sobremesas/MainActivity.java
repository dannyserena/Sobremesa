package com.example.danielle.sobremesas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Parametro para botão de doces
        final Button btn = (Button)findViewById(R.id. btnDoces);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("sobremesa", btn.getText().toString());
                startActivity(intent);


            }

        });

//  Parametro para botão de sorvetes
        final Button btn2 = (Button)findViewById(R.id. btnSorvetes);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("sobremesa", btn2.getText().toString());
                startActivity(intent);


            }

        });

        //  Parametro para botão de Salgado
        final Button btn3 = (Button)findViewById(R.id. btnSalgados);
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("sobremesa", btn3.getText().toString());
                startActivity(intent);


            }

        });

        //  Parametro para botão de doces
        final Button btn4 = (Button)findViewById(R.id. btnSalgados);
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("sobremesa", btn4.getText().toString());
                startActivity(intent);


            }

        });

        //  Parametro para botão de doces
        final Button btn5 = (Button)findViewById(R.id. btnGelada);
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("sobremesa", btn5.getText().toString());
                startActivity(intent);


            }

        });

        //  Parametro para botão de doces
        final Button btn6 = (Button)findViewById(R.id. btnCrepe);
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("sobremesa", btn6.getText().toString());
                startActivity(intent);


            }

        });
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
