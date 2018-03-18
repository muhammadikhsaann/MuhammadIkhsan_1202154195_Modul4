package com.example.asus.muhammadikhsan_1202154195_modul4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click (View view){
        //ketika button di klik, memanggil perintah click
        int id = view.getId();
        //menangkap id yang disimpan kedalam View
        switch (id){ //membuat mpengkondisian untuk tiap button dengan kondisi yang diperhatikan yaitu id
            case R.id.btnMahasiswa: //jika memilih button list nama mahasiswa
                Intent mhs = new Intent(this,List_mahsiswa.class); //perpindahan dilakukan ke halaman list mahasiswa
                startActivity(mhs); //memulai intent
                break; //menghentikan proses ketika perintah telah dieksekusi
            case R.id.btnCari: //jika memilih button cari gambar
                Intent gbr = new Intent(this,Cari_gambar.class); //perpindahan dilakukan ke halaman cari gambar
                startActivity(gbr); //memulai intent
                break; //menghentikan proses ketika perintah telah dieksekusi
        }
    }
}
