package inc.angga.mobile.appszakat.menu_definisi_zakat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 4/24/2017.
 */

public class DefinisiZakatTabunganActivity extends AppCompatActivity {
    private TextView tvDefZakatTabungan;
    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definisi_zakat_tabungan_layout_activity);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvDefZakatTabungan = (TextView)findViewById(R.id.tv_definisi_zakat_tabungan);
        tvDefZakatTabungan.setText("Merupakan zakat yang dikeluarkan apabila tabungan tersebut telah mencapai haul (1 tahun) dan telah mencapai nisab. Adapun nisabnya yakni setara dengan 85 gram emas. Rasulullah saw bersabda yang artinya “Tiadalah bagi pemilik harta simpanan yang tidak menunaikan zakatnya, kecuali dibakar didalam neraka jahannam”. (HR. Muslim)\n" +
                "Menurut pendapat ulama Hanafiyah dan Malikiyah, zakat uang merupakan zakat emas dan perak karena uang pada zaman rosul terbuat dari emas dan perak. Jika pada saat ini Negara Indonesia memberlakukan uang kertas dan logam, dalam jumlah tertentu tetap dianggap senilai dengan uang emas dan perak sehingga kewajiban zakat tetap berlaku.\n" +
                "Menurut ulama’ Syafi’iyah, “tidak wajib zakat karena uang kertas adalah hawalah (tanda penukaran) yang tidak shahih, karena tidak ada ijab dan qabul, kecuali apabila telah ditukar dengan emas atau perak dan telah berlalu waktu setahun”. Menurut ulama’ Hanbaliyah, “tidak wajib zakat melainkan apabila telah ditukar dengan emas atau perak”. Pendapat yang tidak mewajibkan zakat berdasarkan ‘illat (alasan hukum) yang mereka kemukakan, yakni tak ada ijab dan qabul yang sangat lemah itu, mengakibatkan hak fakir miskin dari tumpukan kekayaan orang-orang kaya terambil atau tertahan di kantong orang-orang kaya. (As-Shiddieqy. hlm: 95-96)\n" +
                "Zakat uang wajib dikeluarkan jika sudah mencapai nishab dan haul. Nishab uang adalah seharga 90 gram atau perak seharga 600 gram dan kadar zakatnya 2,5%, yang dikeluarkan tiap satu tahun sekali.\n\n\tCara menghitung Zakat tabungan\n" +
                "\n" +
                "(Nisab Emas) \n" +
                "harga emas/gram x 85=……….\n" +
                "\n" +
                "(total keseluruhan tabungan)\n" +
                "Tabungan yang di miliki di bank + tabungan yang di miliki di koprasi=……………\n" +
                "\n" +
                "(total Zakat yang di keluwarkan)\n" +
                "(total keseluruhan Tabungan) * 0.025=…………..\n" +
                "\n" +
                "Jika total zakat kurang nisab emas maka tidak wajib mengeluarkan emas \n");
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
