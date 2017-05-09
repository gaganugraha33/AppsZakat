package inc.angga.mobile.appszakat.menu_kalkulator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 2/15/2017.
 */

public class MenuZakatProfesiActivity extends AppCompatActivity {

    private Toolbar mToolBar;
    private EditText etHargaemas;
    private EditText etTotalNisab;
    private EditText etPendapatanSuamiPerbulan;
    private EditText etPendapatanIstriPerbulan;
    private EditText etPendapatanAnakPerbulan;
    private EditText etPendapatanKeluargaPerbulan;
    private EditText etUangLlemburKerja;
    private EditText etKerjaSampingan;
    private EditText etBonusLainnya;
    private EditText etPendapatanTambahan;
    private EditText etBiayaPendidikanAnak1;
    private EditText etBiayaPendidikanAnak2;
    private EditText etBiayaPendidikanAnak3;
    private EditText etCicilanBarang;
    private EditText etTotalPengeluaranKeluargaPerbulan;
    private EditText etTotalZakat;
    private TextView btHitung;
    private TextView btReset;
    private int totalNisab;
    private int totalPendapatanKeluargaPerbulan;
    private int totalPendapatanTambahan;
    private int totalPengeluaranKeluargaPerbulan;
    private double totalZakat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_zakat_profesi_activity);

        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etHargaemas = (EditText)findViewById(R.id.et_Harga_emas);
        etTotalNisab = (EditText)findViewById(R.id.et_total_nisab);
        etPendapatanSuamiPerbulan = (EditText)findViewById(R.id.et_pendapatan_suami_perbulan);
        etPendapatanIstriPerbulan = (EditText)findViewById(R.id.et_pendapatan_istri_perbulan);
        etPendapatanAnakPerbulan = (EditText)findViewById(R.id.et_pendapatan_anak_perbulan);
        etPendapatanKeluargaPerbulan = (EditText)findViewById(R.id.et_total_pendapatan_keluarga_perbulan);
        etBonusLainnya = (EditText)findViewById(R.id.et_bonus_lainnya);
        etKerjaSampingan = (EditText)findViewById(R.id.et_kerja_sampingan);
        etUangLlemburKerja = (EditText)findViewById(R.id.et_uang_lembur_kerja);
        etPendapatanTambahan = (EditText)findViewById(R.id.et_pendapatan_tambahan);
        etBiayaPendidikanAnak1 = (EditText)findViewById(R.id.et_biaya_pendidikan_anak_1);
        etBiayaPendidikanAnak2 = (EditText)findViewById(R.id.et_biaya_pendidikan_anak_2);
        etBiayaPendidikanAnak3 = (EditText)findViewById(R.id.et_biaya_pendidikan_anak_3);
        etCicilanBarang = (EditText)findViewById(R.id.et_cicilan_barang);
        etTotalPengeluaranKeluargaPerbulan = (EditText)findViewById(R.id.et_total_pengeluaran_keluarga_perbulan);
        etTotalZakat = (EditText)findViewById(R.id.et_total_zakat);
        btHitung = (TextView)findViewById(R.id.bt_hitung);
        btReset = (TextView)findViewById(R.id.bt_reset);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etHargaemas.getText().toString().equals("")&&!etPendapatanSuamiPerbulan.getText().toString().equals("")&&!etPendapatanIstriPerbulan.getText().toString().equals("")&&!etPendapatanAnakPerbulan.getText().toString().equals("")&&!etUangLlemburKerja.getText().toString().equals("")&&!etKerjaSampingan.getText().toString().equals("")&& !etBonusLainnya.getText().toString().equals("")&&!etBiayaPendidikanAnak1.getText().toString().equals("")&&!etBiayaPendidikanAnak2.getText().toString().equals("")&& !etBiayaPendidikanAnak3.getText().toString().equals("")&& !etCicilanBarang.getText().toString().equals("")){
                    totalNisab = Integer.parseInt(etHargaemas.getText().toString())*520;
                    etTotalNisab.setText(String.valueOf(totalNisab));

                    //hitung total pendapatan perbulan
                    totalPendapatanKeluargaPerbulan = Integer.parseInt(etPendapatanSuamiPerbulan.getText().toString())+Integer.parseInt(etPendapatanIstriPerbulan.getText().toString())+Integer.parseInt(etPendapatanAnakPerbulan.getText().toString());
                    etPendapatanKeluargaPerbulan.setText(String.valueOf(totalPendapatanKeluargaPerbulan));

                    //hitung total pendapatan tambahan
                    totalPendapatanTambahan = Integer.parseInt(etUangLlemburKerja.getText().toString())+Integer.parseInt(etKerjaSampingan.getText().toString())+Integer.parseInt(etBonusLainnya.getText().toString());
                    etPendapatanTambahan.setText(String.valueOf(totalPendapatanTambahan));

                    //hitung total pengeluran perbulan
                    totalPengeluaranKeluargaPerbulan = Integer.parseInt(etBiayaPendidikanAnak1.getText().toString())+Integer.parseInt(etBiayaPendidikanAnak2.getText().toString())+Integer.parseInt(etBiayaPendidikanAnak3.getText().toString())+Integer.parseInt(etCicilanBarang.getText().toString());
                    etTotalPengeluaranKeluargaPerbulan.setText(String.valueOf(totalPengeluaranKeluargaPerbulan));

                    //hitung total zakat
                    totalZakat = (totalPendapatanKeluargaPerbulan-totalPendapatanTambahan-totalPengeluaranKeluargaPerbulan)*0.025;
                    int convertZakat = (int) totalZakat;
                    etTotalZakat.setText(String.valueOf(convertZakat));
                }
                else {
                    Toast.makeText(getApplicationContext(), "Maaf anda harus mengisi data secara keseluruhan", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etHargaemas.setText(null);
                etTotalNisab.setText(null);
                etPendapatanSuamiPerbulan.setText(null);
                etPendapatanIstriPerbulan.setText(null);
                etPendapatanAnakPerbulan.setText(null);
                etPendapatanKeluargaPerbulan.setText(null);
                etUangLlemburKerja.setText(null);
                etKerjaSampingan.setText(null);
                etBonusLainnya.setText(null);
                etPendapatanTambahan.setText(null);
                etBiayaPendidikanAnak1.setText(null);
                etBiayaPendidikanAnak2.setText(null);
                etBiayaPendidikanAnak3.setText(null);
                etCicilanBarang.setText(null);
                etTotalPengeluaranKeluargaPerbulan.setText(null);
                etTotalZakat.setText(null);
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
