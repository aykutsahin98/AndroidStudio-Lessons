package com.example.aykut.interface_elements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn; //Buton sınıfna ait bir nesne türettik
    TextView txtf; //Textview ürettik
    TextView text;
    Button button;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //ilk çalıştığında oncreate methodu devreye girer.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla(); //button fonksiyonunu çagırdık
        islem(); //yapacağı işlemi çağırdık.
        metin(); //metini çağırdım"
        goster("aykutsahin"); //göster fonksiyonuna veri atadım
        tanım_edittext();
        islem2();


    }

    private void tanimla() {
        btn = (Button) findViewById(R.id.buton_bir); //button özelliğini tanımladık

    }


    private void islem() {
        btn.setOnClickListener(new View.OnClickListener() { //Butona tıklanıldığında çalışacak eylem metodu
            @Override
            public void onClick(View v) {  //buttona tıklanıldığında, ekrana mesaj vermesini sağladık.
                System.out.println("Butona Tıklanıldı");
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////
    }

    private void metin() { //metin sınıfını çağırdım
        txtf = findViewById(R.id.metin);
    }

    private void goster(String kullanici_ad) { //burada ise girilen kullanıcı adını fonksşşyon ile alarak ekranda gösterdim
        txtf.setText(kullanici_ad); //text içine gönderiyorum.
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private void tanım_edittext() {
        edit = findViewById(R.id.edit);
        text = findViewById(R.id.sonuc);
        button = findViewById(R.id.hesapla);
    }

    private void islem2() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deger = edit.getText().toString(); //texttbox dan değeri string olarak al
                int faktoriyel = Integer.parseInt(deger); //alınan string değeri int çevir
                int hesaplanan = faktoriyel(faktoriyel);

                text.setText("Sonuç: "+hesaplanan); //hesaplanan değeri ekrana bas
            }
        });
    }

    private int faktoriyel(int sayi) {
        int a = 1;
        int sonuc = 1;
        for (int i = sayi; i > 1; i--) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }
}
