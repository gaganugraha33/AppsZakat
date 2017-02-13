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

public class MenuZakatTabunganActivity extends AppCompatActivity {
    private EditText etHargaemas;
    private EditText etTabunganBank;
    private EditText etTabunganKoperasi;
    private EditText etNisabEmas;
    private EditText etTotalkeseluruhantabungan;
    private EditText etTotalzakatygdikeluarkan;
    private TextView btHitung;
    private TextView btReset;
    private Double nisabEmas;
    private Double totalKeseluruhanTabungan;
    private Double totalZakatYgDiKeluarkan;
    private Toolbar mToolBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_zakat_tabungan_activity_layout);

        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etHargaemas = (EditText)findViewById(R.id.et_Harga_emas);
        etTabunganBank = (EditText)findViewById(R.id.et_tabungan_bank);
        etTabunganKoperasi= (EditText)findViewById(R.id.et_tabungan_koperasi);
        etNisabEmas= (EditText)findViewById(R.id.et_nisab_emas);
        etTotalkeseluruhantabungan= (EditText)findViewById(R.id.et_Total_keseluruhan_tabungan);
        etTotalzakatygdikeluarkan= (EditText)findViewById(R.id.et_Total_zakat_yg_dikeluarkan);
        btHitung= (TextView)findViewById(R.id.bt_hitung);
        btReset= (TextView)findViewById(R.id.bt_reset);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!etHargaemas.getText().toString().equals("")&&!etTabunganBank.getText().toString().equals("")&&!etTabunganKoperasi.getText().toString().equals("")){
                    nisabEmas = Double.valueOf(etHargaemas.getText().toString())*85;

                    totalKeseluruhanTabungan = Double.valueOf(etTabunganBank.getText().toString())+Double.valueOf(etTabunganKoperasi.getText().toString());

                    totalZakatYgDiKeluarkan = totalKeseluruhanTabungan*0.025;

                    etNisabEmas.setText(String.valueOf(nisabEmas));
                    etTotalkeseluruhantabungan.setText(String.valueOf(totalKeseluruhanTabungan));
                    etTotalzakatygdikeluarkan.setText(String.valueOf(totalZakatYgDiKeluarkan));

                }else {
                    Toast.makeText(getApplicationContext(), "kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etHargaemas.setText(null);
                etTabunganBank.setText(null);
                etTabunganKoperasi.setText(null);
                etNisabEmas.setText(null);
                etTotalkeseluruhantabungan.setText(null);
                etTotalzakatygdikeluarkan.setText(null);
            }
        });
    }

    private void testUpload(){
        int i = 1+1;

        int j = 1+1;
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
