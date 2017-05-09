package inc.angga.mobile.appszakat.menu_definisi_zakat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import inc.angga.mobile.appszakat.R;

/**
 * Created by Fajar on 2/15/2017.
 */

public class DefinisiZakatProfesiActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private TextView tvDefZakatProfesi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zakat_profesi_definisi_activity_layout);
        mToolbar = (Toolbar) findViewById(R.id.mainToolbar);

        tvDefZakatProfesi = (TextView)findViewById(R.id.tv_definisi_zakat_profesi);
        tvDefZakatProfesi.setText("1.\tPengertian Zakat Profesi\n" +
                "Yang dimaksud dengan zakat profesi adalah zakat dari penghasilan atau pendapatan yang di dapat dari keahlian tertentu, seperti dokter, arsitek, guru, penjahit, da'I, mubaligh, pengrajin tangan, pegawai negri dan swasta. Penghasilan seperti ini di dalam literatur  fiqh sering disebut dengan al- mal al mustafad ( harta yang didapat ).\n" +
                "Sebagian kalangan yang berpendapat bahwa zakat profesi itu tidak terdapat dalam ajaran Islam, mengatakan bahwa zakat profesi tidak ada pada zaman Rasulullah, yang ada adalah zakat mal ( zakat harta ). Kalau kita renungkan, sebenarnya zakat profesi dengan zakat mal itu hakikatnya sama, hanya beda dalam penyebutan. Karena siapa saja yang mempunyai harta dan memenuhi syarat-syaratnya, seperti lebih dari nishab dan berlangsung satu tahun, maka akan terkena kewajiban zakat. Baik harta itu didapat dari hadiah, hasil suatu pekerjaan ataupun dari sumber-sumber lain yang halal.    \n" +
                "Sebagian kalangan yang mengingkari adanya zakat profesi disebabkan mereka tidak setuju dengan cara penghitungannya yang mengqiyaskan zakat profesi dengan zakat pertanian. Padahal para ulama yang mewajibkan zakat profesi berbeda pendapat di dalam cara penghitungannya, tidak semuanya mengqiyaskan dengan zakat pertanian. Kalau mereka tidak setuju dengan satu cara, mestinya bisa memilih cara lain yaitu dengan mengqiyaskan dengan zakat emas, dan tidak perlu menolak mentah-mentah zakat profesi.\n" +
                "\n" +
                "2.\tDasar Zakat Profesi\n" +
                "Adapun dasar diwajibkan zakat profesi adalah firman Allah swt :\n" +
                "\n" +
                "وَفِي أَمْوَالِهِمْ حَقٌّ لِّلسَّائِلِ وَالْمَحْرُومِ\n" +
                "\n" +
                "\" Dan pada harta-harta mereka ada hak untuk orang – orang yang meminta dan orang-orang miskin yang tidak mendapatkan bagian . \" ( Qs Adz Dzariyat : 19 )\n" +
                "        Hal ini dikuatkan dengan firman Allah swt :  \n\n" +
                "يَا أَيُّهَا الَّذِينَ آمَنُواْ أَنفِقُواْ مِن طَيِّبَاتِ مَا كَسَبْتُمْ\n" +
                "\n" +
                "\" Wahai orang-orang yang beriman bersedekahlah ( keluarkanlah zakat ) dari apa yang baik- baik dari apa yang kalian usahakan “( Qs Al Baqarah : 267 )\n" +
                "Dalam Muktamar Internasional Pertama tentang Zakat di Kuwait pada tanggal 29 Rajab 1404 H, yang bertepatan dengan tanggal 30 April 1984 M, para peserta sepakat akan wajibnya zakat profesi jika sampai pada nishab, walaupun mereka berbeda pendapat tentang cara pelaksanaannya.\n\n3.\tPembagian Harta Penghasilan\n" +
                "Harta penghasilan bisa dibedakan menjadi dua bagian :\n" +
                "\n" +
                "a)\tPenghasilan yang berkembang dari kekayaan lain, misalnya uang hasil panen padi, dan telah dikeluarkan zakatnya 5% atau 10 %, maka harta tersebut tidak perlu dizakati kembali pada tahun yang sama, karena harta asalnya sudah dizakati, hal ini untuk mencegah terjadinya dua kali zakat.\n" +
                "\n" +
                "b)\tPenghasilan yang berasal dari pekerjaan tertentu yang belum dizakati, seperti gaji, upah, honor dan sejenisnya. Maka harta tersebut harus terkumpul selama satu tahun dan dikurangi kebutuhan pokok. Jika sampai nishab, maka wajib dikeluarkan zakatnya 2,5 % menurut pendapat yang lebih benar.\n\nCara menghitung zakat profesi \n" +
                "\n" +
                "(nisab total) Harga beras x 520=…….\n" +
                "\n" +
                "( total pendapatan keluarga perbulan )\n" +
                "Pendapatan suami perbulan +pendapatan isteri perbulan  + pendapatan anak perbulan=……..\n" +
                "\n" +
                "(Pendapatan tambahan)\n" +
                "Uang lembur kerja + kerja sampingaan + bonus lainya=…………..\n" +
                "\n" +
                "(pengeluaran keluarga perbulan)\n" +
                "Biya pendidikan anak 1+ Biya pendidikan anak 2+ Biya pendidikan anak 3+cicilan barang =…………\n" +
                "\n" +
                "Total Zakat =( total pendapatan keluarga perbulan )- (pengeluaran keluarga perbulan)- (Pendapatan tambahan)=……………\n" +
                "\n" +
                "(total zakat) Zakat = 0,025 x total zakat \n" +
                "\n" +
                "Jika total zakat kurang dari nisab maka tidak wajib mengeluarkan zakat\n");

        setSupportActionBar(mToolbar);
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
