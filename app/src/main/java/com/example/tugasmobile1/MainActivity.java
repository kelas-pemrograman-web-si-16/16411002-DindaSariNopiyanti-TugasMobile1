package com.example.tugasmobile1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnama, txtnpm, txtttl, txtalamat, txthobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnama.setText("Nama   : Dinda Sari Nopiyanti");

        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtnpm.setText("NPM : 16411002");

        txtttl = (TextView) findViewById(R.id.txtttl);
        txtttl.setText("TTL : Bumi, 06 November 1998");

        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtalamat.setText("Alamat   : Jln. ST badaruddin Gang Jati No.64");

        txthobi = (TextView) findViewById(R.id.txthobi);
        txthobi.setText("Hobi   : Tidur, Travelling, Makan");
    }
}
