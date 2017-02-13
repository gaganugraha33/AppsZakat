package inc.angga.mobile.appszakat.menu_kalkulator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 2/4/2017.
 */

public class MenuZakatFitrahActivity extends AppCompatActivity {

    private Toolbar mToolBar;
    private EditText etHargaberas;
    private EditText etTotalAnggotaKeluarga;
    private EditText etZakatPeranggotaKeluarga;
    private EditText etTotalzakatygdikeluarkan;
    private float hargaBeras=0;
    private double totalAnggotaKeluarga=0;
    private double totalZakatPeranggotaKeluarga=0;
    private double totalZakatYgDikeluarkan=0;
    private TextView btHitung;
    private TextView btReset;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_zakat_fitrah_activity_layout);


        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etHargaberas = (EditText)findViewById(R.id.et_Harga_beras);
        etTotalAnggotaKeluarga = (EditText)findViewById(R.id.et_Total_anggota_keluarga);
        etZakatPeranggotaKeluarga = (EditText)findViewById(R.id.et_zakat_peranggota_keluarga);
        etTotalzakatygdikeluarkan = (EditText)findViewById(R.id.et_Total_zakat_yg_dikeluarkan);

        btHitung = (TextView)findViewById(R.id.bt_hitung);
        btReset = (TextView)findViewById(R.id.bt_reset);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!etHargaberas.getText().toString().equals("")&&!etTotalAnggotaKeluarga.getText().toString().equals("")){
                    hargaBeras = Integer.parseInt(etHargaberas.getText().toString());
                    totalAnggotaKeluarga = Integer.parseInt(etTotalAnggotaKeluarga.getText().toString());

                    totalZakatPeranggotaKeluarga = (hargaBeras*2.5);
                    totalZakatYgDikeluarkan = totalZakatPeranggotaKeluarga*totalAnggotaKeluarga;

                    etZakatPeranggotaKeluarga.setText(String.valueOf(totalZakatPeranggotaKeluarga));
                    etTotalzakatygdikeluarkan.setText(String.valueOf(totalZakatYgDikeluarkan));

                    Log.d("Cekkk","total Zakat peranggota Keluarga "+totalZakatPeranggotaKeluarga+" total zakat yg dikeluarkan "+totalZakatYgDikeluarkan );

                }else {
                    Toast.makeText(getApplicationContext(), "Mohon untuk mengisi harga beras dan total anggota keluarga", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etHargaberas.setText(null);
                etTotalAnggotaKeluarga.setText(null);
                etZakatPeranggotaKeluarga.setText(null);
                etTotalzakatygdikeluarkan.setText(null);
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
