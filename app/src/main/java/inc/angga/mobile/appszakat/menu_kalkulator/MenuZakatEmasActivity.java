package inc.angga.mobile.appszakat.menu_kalkulator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 2/5/2017.
 */

public class MenuZakatEmasActivity extends AppCompatActivity{
    private EditText etHargaEmas;
    private EditText etEmasYgDimiliki;
    private EditText etEmasYgDisimpan;
    private EditText etNisanEmas;
    private EditText etTotalKeseluruhanEmas;
    private EditText etTotalZakatYgDikeluarkan;
    private TextView btHitung;
    private TextView btReset;
    private Double nisabEmas;
    private Double totalKeseluruhan;
    private Double totalZakatYgHarusDikeluarkan;
    private Double total;
    private Toolbar mToolBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_zakat_emas_activity_layout);

        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etHargaEmas = (EditText)findViewById(R.id.et_Harga_emas);
        etEmasYgDimiliki = (EditText)findViewById(R.id.et_Emas_yg_dimiliki);
        etEmasYgDisimpan = (EditText)findViewById(R.id.et_Emas_yg_disimpan);
        etNisanEmas = (EditText)findViewById(R.id.et_nisab_emas);
        etTotalKeseluruhanEmas = (EditText)findViewById(R.id.et_Total_keseluruhan_emas);
        etTotalZakatYgDikeluarkan = (EditText)findViewById(R.id.et_Total_zakat_yg_dikeluarkan);
        btHitung = (TextView) findViewById(R.id.bt_hitung);
        btReset = (TextView) findViewById(R.id.bt_reset);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!etHargaEmas.getText().toString().equals("")&&!etEmasYgDimiliki.getText().toString().equals("")&&!etEmasYgDisimpan.getText().toString().equals("")){

                    nisabEmas = Double.valueOf( etHargaEmas.getText().toString())*85;
                    totalKeseluruhan = Double.valueOf(etEmasYgDimiliki.getText().toString())+Double.valueOf(etEmasYgDisimpan.getText().toString());

                    total = Double.valueOf(etHargaEmas.getText().toString())*Double.valueOf(etEmasYgDisimpan.getText().toString());
                    totalZakatYgHarusDikeluarkan = total*0.025;

                    etNisanEmas.setText(String.valueOf(nisabEmas));
                    etTotalKeseluruhanEmas.setText(String.valueOf(totalKeseluruhan));
                    etTotalZakatYgDikeluarkan.setText(String.valueOf(totalZakatYgHarusDikeluarkan));

                }else {

                    Toast.makeText(getApplicationContext(),"kosong",Toast.LENGTH_SHORT).show();

                }

            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                etHargaEmas.setText(null);
                etEmasYgDimiliki.setText(null);
                etEmasYgDisimpan.setText(null);
                etNisanEmas.setText(null);
                etTotalKeseluruhanEmas.setText(null);
                etTotalZakatYgDikeluarkan.setText(null);

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
