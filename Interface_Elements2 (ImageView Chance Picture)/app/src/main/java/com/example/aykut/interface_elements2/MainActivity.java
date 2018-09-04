package com.example.aykut.interface_elements2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tikla();
    }

    public void tanimla() {
        img = (ImageView) findViewById(R.id.resim);
        btn = (Button) findViewById(R.id.degistir);
    }

    public void tikla() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = (int)(Math.random() * 8 + 1);
                System.out.println(""+rnd);
                degistir(rnd);

            }
        });
    }

    public void degistir(int sayi) {
        if (sayi == 1) {
            img.setImageResource(R.drawable.kedi_kopek);
        } else if (sayi == 2) {
            img.setImageResource(R.drawable.kurt);
        } else if (sayi == 3) {
            img.setImageResource(R.drawable.earth);
        } else if (sayi == 4) {
            img.setImageResource(R.drawable.manzara);
        } else if (sayi == 5) {
            img.setImageResource(R.drawable.manzara2);
        } else if (sayi == 6) {
            img.setImageResource(R.drawable.garden);
        } else if (sayi == 7) {
            img.setImageResource(R.drawable.araba);
        } else {
            img.setImageResource(R.drawable.teletabi);
        }

    }
}
