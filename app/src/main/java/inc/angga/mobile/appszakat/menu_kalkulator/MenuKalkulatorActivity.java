package inc.angga.mobile.appszakat.menu_kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 2/4/2017.
 */

public class MenuKalkulatorActivity extends AppCompatActivity {
    private Toolbar mToolBar;
    private CardView cvZakatFitrah;
    private CardView cvZakatEmas;
    private CardView cvZakatTabungan;
    private CardView cvZakatTernak;
    private CardView cvZakatProfesi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_kalkulator_activity_layout);

        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cvZakatFitrah = (CardView)findViewById(R.id.cv_zakat_fitrah);
        cvZakatEmas = (CardView)findViewById(R.id.cv_zakat_emas);
        cvZakatTabungan = (CardView)findViewById(R.id.cv_zakat_tabungan);
        cvZakatTernak = (CardView)findViewById(R.id.cv_zakat_ternak);
        cvZakatProfesi = (CardView)findViewById(R.id.cv_zakat_profesi);

        cvZakatFitrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuKalkulatorActivity.this, MenuZakatFitrahActivity.class);
                startActivity(intent);
            }
        });

        cvZakatEmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuKalkulatorActivity.this, MenuZakatEmasActivity.class);
                startActivity(intent);
            }
        });

        cvZakatTabungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuKalkulatorActivity.this, MenuZakatTabunganActivity.class);
                startActivity(intent);
            }
        });

        cvZakatTernak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuKalkulatorActivity.this, MenuZakatTernakActivity.class);
                startActivity(intent);
            }
        });

        cvZakatProfesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuKalkulatorActivity.this, MenuZakatProfesiActivity.class);
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
