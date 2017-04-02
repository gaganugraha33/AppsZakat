package inc.angga.mobile.appszakat.menu_info_lembaga_zakat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 3/26/2017.
 */

public class InfoLembagaZakat extends AppCompatActivity implements View.OnClickListener {
    private Toolbar mToolBar;
    private TextView tvBaznas;
    private TextView tvBazisDKI;
    private TextView tvDompetDhuafa;
    private TextView tvPKPU;
    private TextView tvPortalInfaq;
    private TextView tvRumahzakat;
    private TextView tvRumahDPU_DT;
    private TextView tvBAZJawaTimur;
    private TextView tvYDSF;
    private TextView tvLAZSwadayahUmah;
    private TextView tvLAZISNU;
    private TextView tvLAZISMU;
    private TextView tvLAZAlAzhar;
    private TextView tvBMH;
    private TextView tvBMM;
    private TextView tvBSM;
    private TextView tvRumahAmalSalman;
    private TextView tvMERC;
    private TextView tvRumahYatim;
    private TextView tvPPPA;
    private TextView tvBulanSabitMerah;
    private TextView tvKISPA;
    private TextView tvBarbeku;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_lembaga_zakat_layout);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        tvBaznas = (TextView)findViewById(R.id.tv_Baznas);
        tvBazisDKI = (TextView)findViewById(R.id.tv_Bazis_DKI);
        tvDompetDhuafa = (TextView)findViewById(R.id.tv_Dompet_dhuafa);
        tvPortalInfaq = (TextView)findViewById(R.id.tv_Portal_Infaq);
        tvPKPU = (TextView)findViewById(R.id.tv_PKPU);
        tvRumahzakat = (TextView)findViewById(R.id.tv_Rumah_zakat);
        tvRumahDPU_DT = (TextView)findViewById(R.id.tv_Rumah_DPU_DT);
        tvBAZJawaTimur = (TextView)findViewById(R.id.tv_BAZ_Jawa_Timur);
        tvYDSF = (TextView)findViewById(R.id.tv_YDSF);
        tvLAZSwadayahUmah = (TextView)findViewById(R.id.tv_LAZ_Swadayah_Umah);
        tvLAZISNU = (TextView)findViewById(R.id.tv_LAZIS_NU);
        tvLAZISMU = (TextView)findViewById(R.id.tv_LAZIS_MU);
        tvLAZAlAzhar = (TextView)findViewById(R.id.tv_LAZ_Al_Azhar);
        tvBMH = (TextView)findViewById(R.id.tv_BMH);
        tvBMM = (TextView)findViewById(R.id.tv_BMM);
        tvBSM = (TextView)findViewById(R.id.tv_BSM);
        tvRumahAmalSalman = (TextView)findViewById(R.id.tv_Rumah_amal_salman);
        tvMERC = (TextView)findViewById(R.id.tv_MER_C);
        tvRumahYatim = (TextView)findViewById(R.id.tv_Rumah_Yatim);
        tvPPPA = (TextView)findViewById(R.id.tv_PPPA);
        tvBulanSabitMerah = (TextView)findViewById(R.id.tv_Bulan_sabit_merah);
        tvKISPA = (TextView)findViewById(R.id.tv_KISPA);
        tvBarbeku = (TextView)findViewById(R.id.tv_Barbeku);

        tvBaznas.setOnClickListener(this);
        tvBazisDKI.setOnClickListener(this);
        tvDompetDhuafa.setOnClickListener(this);
        tvPKPU.setOnClickListener(this);
        tvPortalInfaq.setOnClickListener(this);
        tvRumahzakat.setOnClickListener(this);
        tvRumahDPU_DT.setOnClickListener(this);
        tvBAZJawaTimur.setOnClickListener(this);
        tvYDSF.setOnClickListener(this);
        tvLAZSwadayahUmah.setOnClickListener(this);
        tvLAZISNU.setOnClickListener(this);
        tvLAZISMU.setOnClickListener(this);
        tvLAZAlAzhar.setOnClickListener(this);
        tvBMH.setOnClickListener(this);
        tvBMM.setOnClickListener(this);
        tvBSM.setOnClickListener(this);
        tvRumahAmalSalman.setOnClickListener(this);
        tvMERC.setOnClickListener(this);
        tvRumahYatim.setOnClickListener(this);
        tvPPPA.setOnClickListener(this);
        tvBulanSabitMerah.setOnClickListener(this);
        tvKISPA.setOnClickListener(this);
        tvBarbeku.setOnClickListener(this);

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

    @Override
    public void onClick(View view) {
        String url;
        Intent i;
        switch(view.getId()) {

            case R.id.tv_Baznas:
                // Do something
                url = "http://www.baznas.or.id";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;

            case R.id.tv_Bazis_DKI:
                // Do something
                 url = "http://www.bazisdki.go.id";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;

            case R.id.tv_Dompet_dhuafa:
                // Do something
                 url = "http://www.dompetdhuafa.or.id";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;

            case R.id.tv_PKPU:
                // Do something
                 url = "http://www.pkpu.or.id";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_Portal_Infaq:
                // Do something
                 url = "http://www.portalinfaq.org";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_Rumah_zakat:
                // Do something
                 url = "http://www.rumahzakat.org";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_Rumah_DPU_DT:
                // Do something
                 url = "http://www.dpu-online.com";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_BAZ_Jawa_Timur:
                // Do something
                 url = "http://www.bazjatim.or.id";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_YDSF:
                // Do something
                 url = "http://www.ydsf.or.id";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_LAZ_Swadayah_Umah:
                // Do something
                 url = "http://www.swadayaummah.or.id";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_LAZIS_NU:
                // Do something
                 url = "http://www.lazisnu.com";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_LAZIS_MU:
                // Do something
                 url = "http://www.lazismuh.org";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_LAZ_Al_Azhar:
                // Do something
                 url = "http://www.al-azharpeduli.com";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_BMH:
                // Do something
                 url = "http://www.bmh.or.id";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_BMM:
                // Do something
                 url = "http://www.baitulmaal.net";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_BSM:
                // Do something
                 url = "http://www.syariahmandiri.co.id/lazbsmumat/profil.php";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_Rumah_amal_salman:
                // Do something
                 url = "http://www.rumahamalsalman.org";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_MER_C:
                // Do something
                 url = "http://www.mer-c.org";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_Rumah_Yatim:
                // Do something
                 url = "http://www.rumah-yatim.org";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_PPPA:
                // Do something
                 url = "http://www.wisatahati.com";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_Bulan_sabit_merah:
                // Do something
                 url = "http://www.bsmipusat.net";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_KISPA:
                // Do something
                 url = "http://www.kispa.org";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.tv_Barbeku:
                // Do something
                 url = "http://www.yasmin-barbeku.org";

                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
        }

    }
}
