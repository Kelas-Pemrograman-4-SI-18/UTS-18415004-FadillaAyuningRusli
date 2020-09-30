package com.fadilla.uts_18415004_fadillaayuningrusli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
   EditText edtNama, edtgolongan;
   Button btnHitung;
   TextView txtgapok, txttunjangan, txtpajak, txtgajibersih, txttampilnama,txttampilgol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNama = (EditText) findViewById(R.id.edtNama);
        edtgolongan = (EditText) findViewById(R.id.edtGolongan);
        txttampilnama = (TextView) findViewById(R.id.txtnama);
        txttampilgol = (TextView) findViewById(R.id.txtgol);
        txtgapok = (TextView) findViewById(R.id.txtgapok);
        txttunjangan = (TextView) findViewById(R.id.txttunjangan);
        txtpajak = (TextView) findViewById(R.id.txtpajak);
        txtgajibersih = (TextView) findViewById(R.id.txtgajibersih);
        btnHitung = (Button) findViewById(R.id.btnHitung);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NamaKaryawan, golongan;
                double gapok = 0, tunjangan = 0, pajak = 0, gajibersih;

                NamaKaryawan = edtNama.getText().toString();
                golongan = edtgolongan.getText().toString();

                if (golongan.equals("1")) {
                    gapok = 1500000;
                    tunjangan = 1000000;
                    pajak = (gapok + tunjangan) * 0.01;
                } else if (golongan.equals("2")) {
                    gapok = 2000000;
                    tunjangan = 1500000;
                    pajak = (gapok + tunjangan) * 0.02;
                } else if (golongan.equals("3")) {
                    gapok = 2500000;
                    tunjangan = 2000000;
                    pajak = (gapok + tunjangan) * 0.03;
                } else if (golongan.equals("4")) {
                    gapok = 3000000;
                    tunjangan = 2500000;
                    pajak = (gapok + tunjangan) * 0.04;
                }
                gajibersih = gapok + tunjangan - pajak;

                String strnama = edtNama.getText().toString();
                String strgolongan = edtgolongan.getText().toString();

                txttampilnama.setText("Nama Karyawan : " + strnama);
                txttampilgol.setText("Golongan : " + strgolongan);

                txtgapok.setText("Gaji Pokok : " + String.valueOf(gapok));
                txttunjangan.setText("Tunjangan : " + String.valueOf(tunjangan));
                txtpajak.setText("Pajak : " + String.valueOf(pajak));
                txtgajibersih.setText("Gaji Bersih: " + String.valueOf(gajibersih));

            }
        });
    }
}