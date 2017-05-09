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

public class DefinisiZakatFitrahActivity extends AppCompatActivity {
    private Toolbar mToolBar;
    private TextView tvDefZakatFitrah;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zakat_fitrah_definisi_activity_layout);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvDefZakatFitrah = (TextView)findViewById(R.id.tv_definisi_zakat_fitrah);
        tvDefZakatFitrah.setText("1.\tPengertian Zakat Fitrah \nadalah zakat atau jumlah harta tertentu yang wajib dikeluarkan oleh setiap muslim yang berkecukupan baik lelaki atau perempuan pada saat bulan Ramadhan dengan syarat-syarat yang telah di tetapkan, adapun yang berhak menerima zakat secara umum terdapat 8 golonagan yaitu fakir, miskin, amil, muallaf, hamba sahaya, gharimin, fisabilillah, ibnu sabil, tetapi menurut beberapa ulama khusu untuk zakat fitrah harus didahulukan kepada dua golongan yaitu fakir dan miskin.\n\n2.\tWaktu pengeluaran Zakat Fitrah\n" +
                "Waktu pengeluaran Zakat Fitrah yaitu pada bulan Ramdhan paling lambat sebelum umat muslim menyelesaikan Sholat Ied, dan jika terlambat dalam penyerahannya maka sejumlah harta yang diserahkan tersebut tidak termasuk zakat fitrah melainkan hanya sedekah biasa, umumnya umat muslim melakukan zakat fitrah jelang dua atau satu hari sebelum hari raya Idul Fitri tiba, dan untuk besarnya harta yang di keluarkan, menurut para ulama adalah sesuai dengan penafsiran terhadap hadits yaitu sebesar satu sha atau kira-kira 3,5 liter atau 2,7 kg makanan pokok yang sesuai dikonsumsi di daerah bersangkutan.\n\n3.\tBacaan Doa Niat Zakat Fitrah\n" +
                "Bacaan do’a niat zakat fitrah sebaiknya telah diketahui sebelum melakukan penyerahan zakat, seperti ibadah pada umumnya zakat fitrah juga harus di awali dengan niat, meski nantinya kita di bimbing oleh panitia pengurus zakat fitrah namun alangkah baiknya kita telah hafal bacaan do’a niat zakat fitrah, mungkin sebagain banyak telah mengentahuinya namun bagi yang mengetahui bisa melihatnya dan menghafalkannya, berikut bacaan do’a niat zakat fitrah.\n\na)\tBacaan Doa Niat Zakat Fitrah untuk diri sendiri dan keluarga\n\n \"Nawaitu an uhrija zakat fitri anna wa 'an jami'i maa yalzamuni nafqaatuhum syar'an fardholillahi ta'ala\".\n" +
                "\nArtinya : Saya niat mengeluarkan zakat atas diri saya dan atas sekalian yang saya wajibkan memberi nafkah pada mereka secara syari'at, fardhu karena Allah ta'ala\".\n\nb)\tBacaan Doa Niat Zakat Fitrah untuk diri sendiri\n" +
                " \n" +
                "Baca : \"Nawaitu an ahroja zakat fitri annafsi fardholillahi ta'ala\"\n\n" +
                "Artinya : Saya berniat mengeluarkan zakat fitrah atas diri sendiri saya sendiri, fardhu karna Allah Ta'ala\n\nc)\tBacaan Doa Niat Zakat Fitrah untuk istri\n" +
                " \n" +
                "Baca : \"Nawaitu an-uhrizakat fitri an zaw jati fardzolillahita 'ala\".\n\n" +
                "Artinya : \"Saya berniat mengeluarkan zakat fitrah atas istri saya, fardhu karena Allah Ta'ala.\n" +
                "\n" +
                "d)\tBacaan Doa Niat Zakat Fitrah untuk anak laki-laki\n" +
                " \n" +
                "Baca : \"Nawaitu an uhrija zakat fitri (.....) fardzolillahi ta'ala\".\n\n" +
                "Artinya : \"Saya berniat mengeluarkan zakat fitrah atas anak laki-laki saya (sebut namanya) fardhu karena Allah Ta'ala\".\n" +
                "\n" +
                "e)\tBacaan Doa Niat Zakat Fitrah untuk anak perempuan\n" +
                " \n" +
                "Baca : \"Nawaitu an uhrija zakat fitri ambinti (.......) fardzolillahita'ala\".\n\n" +
                "Artinya : \"Saya berniat mengeluarkan zakat fitrah atas anak perempuan saya (sebut namanya), fardhu karena Allah ta'ala\".\n\n" +
                "4.\tTujuan Utama Zakat Fitrah\n" +
                "Diwajibkannya Zakat Fitrah atas umat muslim yang telah memenuhi persyaratan bukannya tanpa tujuan dan alasan, tujuan utama zakat fitrah adalah agar setiap muslim yang kurang beruntung atau belum termasuk sebagai kategori wajib membayar zakat fitrah dapat ikut merayakan hari raya dan saling berbagi sesama umat, namun ada juga yang berpendapat bahwa keutamaan zakat fitrah sebagai pembersih harta, melatih diri untuk bersikap dermawan, sebagai ungkapan syukur kepada Allah yang telah memberikan rezeki-Nya, menjalin silaturrahim antara yang mampu dan kurang mampu, serta yang lainnya.\n\nCara menghitung zakat fitrah\n" +
                "\n" +
                "(zakat peranggota keluarga) Harga beras  x 2,5=………..\n" +
                "total anggota keluarga=……………..\n" +
                "(total  zakat yang harus di keluarkan) total anggota keluarga x zakat per anggota keluarga=………\n");


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
