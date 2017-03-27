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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_lembaga_zakat_layout);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        tvBaznas = (TextView)findViewById(R.id.tv_Baznas);
        tvBazisDKI = (TextView)findViewById(R.id.tv_Bazis_DKI);
        tvDompetDhuafa = (TextView)findViewById(R.id.tv_Dompet_dhuafa);
        tvPKPU = (TextView)findViewById(R.id.tv_PKPU);

        tvBaznas.setOnClickListener(this);
        tvBazisDKI.setOnClickListener(this);
        tvDompetDhuafa.setOnClickListener(this);
        tvPKPU.setOnClickListener(this);

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
        }

    }
}
