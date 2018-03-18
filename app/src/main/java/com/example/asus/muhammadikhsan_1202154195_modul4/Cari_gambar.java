package com.example.asus.muhammadikhsan_1202154195_modul4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class Cari_gambar extends AppCompatActivity {
    //mendeklarasikan semua variabel yang digunakan
    EditText crgbr;
    ImageView dptgbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_gambar);

        //membuat inisiasi pada masing-masing variabel
        crgbr = findViewById(R.id.mencari);
        dptgbr = findViewById(R.id.gbr);

    }
    public void tombol (View view){ //method yang di[anggil ketika button diklik
        Picasso.with(this).load(crgbr.getText().toString()) //menggunakan picaso untuk me-load gambar.
                //gambar yang diload akan didapatkan dari id mencari pada variabel crgbr
                .into(dptgbr, new Callback() { //membuat callback
                    @Override
                    public void onSuccess() { //jika nilai kembaliannya gambar dapat diload
                        Toast.makeText(Cari_gambar.this, "Gambar ditemukan", Toast.LENGTH_SHORT).show();
                        //membuat pesan toast
                    }

                    @Override
                    public void onError() { //jika nilai kembaliannya tidak dapat diload
                        Toast.makeText(Cari_gambar.this, "Gambar tidak ditemukan", Toast.LENGTH_SHORT).show();
                        //membuat pesan toast
                    }
                });
    }
}
