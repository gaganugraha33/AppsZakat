package inc.angga.mobile.appszakat.menu_definisi_zakat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 2/3/2017.
 */

public class MenuZakatActivity extends AppCompatActivity {
    private Toolbar mToolBar;
    private CardView cvZakatFitrah, cvZakatProfesi, cvZakat, czZakatEmas, cvZakatTabungan, cvZakatTernak;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_zakat_activity_layout);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        cvZakatFitrah = (CardView) findViewById(R.id.cv_zakat_fitrah);
        cvZakatProfesi = (CardView) findViewById(R.id.cv_zakat_profesi);
        cvZakat = (CardView) findViewById(R.id.cv_zakat);
        czZakatEmas = (CardView) findViewById(R.id.cv_zakat_emas);
        cvZakatTabungan = (CardView) findViewById(R.id.cv_zakat_tabungan);
        cvZakatTernak = (CardView) findViewById(R.id.cv_zakat_ternak);

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cvZakatFitrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuZakatActivity.this, DefinisiZakatFitrahActivity.class);
                startActivity(intent);
            }
        });

        cvZakatProfesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuZakatActivity.this, DefinisiZakatProfesiActivity.class);
                startActivity(intent);
            }
        });

        cvZakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuZakatActivity.this, DefinisiZakatActivity.class);
                startActivity(intent);
            }
        });

        czZakatEmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuZakatActivity.this, DefinisiZakatEmasActivity.class);
                startActivity(intent);
            }
        });
        cvZakatTabungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuZakatActivity.this, DefinisiZakatTabunganActivity.class);
                startActivity(intent);
            }
        });

        cvZakatTernak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuZakatActivity.this, DefinisiZakatTernakActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
