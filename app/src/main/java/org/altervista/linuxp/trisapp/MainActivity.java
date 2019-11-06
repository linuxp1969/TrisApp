package org.altervista.linuxp.trisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> giocatore1 = new ArrayList<>();
    List<Integer> giocatore2 = new ArrayList<>();
    int turnogiocatore = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickBottone(View view) {
        Button bottone = (Button) view;
        int id = bottone.getId();
        int cella = 0;

        switch (id) {
            case R.id.b1:
                cella = 1;
                break;
            case R.id.b2:
                cella = 2;
                break;
            case R.id.b3:
                cella = 3;
                break;
            case R.id.b4:
                cella = 4;
                break;
            case R.id.b5:
                cella = 5;
                break;
            case R.id.b6:
                cella = 6;
                break;
            case R.id.b7:
                cella = 7;
                break;
            case R.id.b8:
                cella = 8;
                break;
            case R.id.b9:
                cella = 9;
                break;
        }

        startGame(cella, bottone);
    }



    private void startGame(int cella, Button bottone) {
        if (turnogiocatore == 1) {
            bottone.setText("X");
            bottone.setBackgroundColor(Color.RED);
            giocatore1.add(cella);
            turnogiocatore = 2;
        }else {
            bottone.setText("O");
            bottone.setBackgroundColor(Color.BLUE);
            giocatore2.add(cella);
            turnogiocatore = 1;
        }
        bottone.setEnabled(false);
    }
}
