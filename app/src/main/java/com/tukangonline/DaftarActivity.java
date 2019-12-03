package com.tukangonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DaftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        Button btnMasuk = (Button)findViewById(R.id.masuk_slide);
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(DaftarActivity.this,MasukActivity.class);
                startActivity(masuk);
            }
        });
        TextView masuk = (TextView)findViewById(R.id.masukakun);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buatAkun = new Intent(DaftarActivity.this,MasukActivity.class);
                startActivity(buatAkun);
            }
        });
    }
}
