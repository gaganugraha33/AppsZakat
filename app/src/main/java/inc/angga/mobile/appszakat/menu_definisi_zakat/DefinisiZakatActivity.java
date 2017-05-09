package inc.angga.mobile.appszakat.menu_definisi_zakat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 4/2/2017.
 */

public class DefinisiZakatActivity extends AppCompatActivity {
    private Toolbar mToolBar;
    private TextView tvDefinisiZakat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definisi_zakat_activity_layout);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        tvDefinisiZakat = (TextView)findViewById(R.id.tv_definisi_zakat);

        tvDefinisiZakat.setText("a)\tZakat\n" +
                "Zakat adalah bagian tertentu dari kekayaah yang Allah perintahkan untuk dikeluarkan dan diberikan kepada yang berhak (mustahiq). Disebut pula shadaqah seperti dalam firman Allah di surat At-Taubah ayat 60. Yang dimaksudkan shadaqah dalam ayat itu adalah zakat wajib, bukan shadaqah sunnah. Al-Mawardi berkata, “Shadaqah adalah zakat, dan zakat adalah shadaqah. Beda nama tapi satu makna.”\n\n" +
                "b)\tSejarah Zakat\n" +
                "Zakat menjadi kewajiban secara utuh di Madinah dengan ditentukan nishab, ukuran, jenis kekayaan, dan distribusinya. Negara Madinah juga telah mengatur dan menata sistem zakat dengan mengirim para petugas untuk memungut dan mendistribusiannya. Sebenarnya, prinsip zakat sudah diwajibkan sejak fase Makkah dengan banyaknya ayat-ayat yang menerangkan sifat-sifat orang beriman dan menyertakan “membayar zakat” sebagai salah satunya. Misalnya seperti ayat yang menjadi dalil kewajiban zakat tanaman, “Makanlah dari buahnya ketika berbuah, dan berikan haknya pada hari panennya; Dan jangan berlebihan, sesungguhnya Allah tidak menyukai orang yang berlebihan.” (Al-An’am: 141). Ayat ini adalah ayat Makkiyah.\n\n" +
                "c)\tTujuan Zakat\nZakat yang dikeluarkan karena ketaatan pada Allah akan mensucikannya jiwa dari segala kotoran dan dosa, dan terutama kotornya sifat kikir. Penyakit kikir ini telah menjadi tabiat manusia, yang juga diperingatkan Rasulullah SAW sebagai penyakit yang dapat merusak manusia (HR Thabrani), dan pe¬nya¬kit yang dapat memutuskan tali persaudaraan (HR Abu Daud dan Nasai).  Sehingga alang-kah berbahagianya orang yang bisa menghilangkan kekikiran.  \"Barangsiapa yang dipeliha¬ra dari kekikiran dirinya, maka mereka itulah orang-orang yang beruntung\".  Zakat yang mensucikan dari sifat kikir ditentukan oleh kemurahannya dan kegembiraan ketika mengeluarkan harta semata karena Allah.  Zakat yang mensucikan jiwa juga berfungsi membebaskan jiwa manusia dari ketergantungan dan ketundukan terhadap harta benda dan dari kecelakaan menyembah harta.");

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
}
