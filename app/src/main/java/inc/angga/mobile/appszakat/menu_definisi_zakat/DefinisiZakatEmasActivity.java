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

public class DefinisiZakatEmasActivity extends AppCompatActivity{
    private TextView tvDefZakatEmas;
    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definisi_zakat_emas_activity_layout);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        tvDefZakatEmas = (TextView)findViewById(R.id.tv_definisi_zakat_emas);
        tvDefZakatEmas.setText("1.\tZakat Emas dan Perak\n" +
                "Zakat harta adalah bagian harta yang disisihkan oleh seorang muslim atau badan yang dimiliki oleh orang muslim sesuai dengan ketentuan agama untuk diberikan kepada yang berhak menerimanya.\n" +
                "Emas dan perak mencakup segala sesuatu yang terbuat dari keduanya, seperti uang logam, perhiasan , lempengan-lempengan dari keduanya, dan sejenisnya. Emas dan perak disebut juga dengan mata uang, karena kedua jenis logam inilah yang menjadi standart  uang internasional terutama emas. Kewajiban zakat atas emas dan perak ini ditegaskan dalam Al-Quran, As-Sunnah dan ijma’. (Saleh al-Fauzan, hlm: 264)\n" +
                "Emas dan perak yang dimiliki seseorang wajib dikeluarkan zakatnya, telah dijelaskan dalam alqur’an pada surat at-Taubah ayat 34-35:\n\n" +
                "وَالَّذِينَ يَكْنِزُونَ الذَّهَبَ وَالْفِضَّةَ وَلاَ يُنفِقُونَهَا فِي سَبِيلِ اللّهِ فَبَشِّرْهُم بِعَذَابٍ أَلِيمٍ\u06DD يَوْمَ يُحْمَى عَلَيْهَا فِي نَارِ جَهَنَّمَ فَتُكْوَى بِهَا جِبَاهُهُمْ وَجُنوبُهُمْ وَظُهُورُهُمْ هَـذَا مَا كَنَزْتُمْ لأَنفُسِكُمْ فَذُوقُواْ مَا كُنتُمْ تَكْنِزُونَ\u06DD\n" +
                "\n“…Dan orang-orang yang menyimpan emas dan perak dan tidak menafkahkannya pada jalan Allâh, maka beritahukanlah kepada mereka (bahwa mereka akan mendapat) siksa yang pedih. Pada hari dipanaskan emas dan perak itu dalam neraka Jahannam, lalu dahi, lambung dan punggung mereka dibakar dengannya, (lalu dikatakan) kepada mereka: “Inilah harta bendamu yang kamu simpan untuk dirimu sendiri, maka rasakanlah sekarang (akibat dari) apa yang kamu simpan itu”. (QS. at-Taubah/9:34-35)\n" +
                "Dalam salah satu hadis diriwayatkan oleh Muslim dari Abu Hurairah, Nabi Muhammad SAW bersabda:\n" +
                "\n\n" +
                "مَا مِنْ صَاحِبِ ذَهَبٍ وَلاَ فِضَّةٍ لاَ يُؤَدِّى مِنْهَا حَقَّهَا إِلاَّ إِذَا كَانَ يَوْمُ الْقِيَامَةِ صُفِّحَتْ لَهُ صَفَائِحَ مِنْ نَارٍ فَأُحْمِىَ عَلَيْهَا فِى نَارِ جَهَنَّمَ فَيُكْوَى بِهَا جَنْبُهُ وَجَبِينُهُ وَظَهْرُهُ كُلَّمَا بَرَدَتْ أُعِيدَتْ لَهُ فِى يَوْمٍ كَانَ مِقْدَارُهُ خَمْسِينَ أَلْفَ سَنَةٍ حَتَّى يُقْضَى بَيْنَ الْعِبَادِ فَيُرَى سَبِيلُهُ إِمَّا إِلَى الْجَنَّةِ وَإِمَّا إِلَى النَّارِ\n" +
                "\n“Tidaklah pemilik emas dan pemilik perak yang tidak menunaikan haknya (emas dan perak) darinya (yaitu zakat), kecuali jika telah terjadi hari kiamat (emas dan perak, pent) dijadikan lempengan-lempengan di neraka, kemudian dipanaskan di dalam neraka Jahannam, lalu dibakarlah dahinya, lambungnya dan punggungnya. Setiap kali lempengan itu dingin, dikembalikan (dipanaskan di dalam Jahannam) untuk (menyiksa)nya. (Itu dilakukan pada hari kiamat), yang satu hari ukurannya 50 ribu tahun, sehingga diputuskan (hukuman) di antara seluruh hamba. Kemudian dia akan melihat (atau: akan diperlihatkan) jalannya, kemungkinan menuju surga, dan kemungkinan menuju neraka”. (HR Muslim)\n" +
                "            Dari keterangan diatas sudah jelas, bahwa pemilik emas dan perak wajib mengeluarkan zakat karena jika tidak, ancaman dari Allah SWT sangat keras.\n\n" +
                "2.\tNishab dan Syarat Zakat Emas dan Perak\n" +
                "a)\tNishab zakat emas dan perak\n" +
                "Nishab emas sebesar 20 dinar (90 gram) dan nishab perak sebesar 200 dirham (600 gram), sedangkan kadar zakatnya sebanyak 2,5%. Zakat emas ini dikeluarkan jika sudah mencapai haul (setahun sekali). (Dr. H. Ahmad Hasan Ridwan, M.Ag. hlm:163)\n" +
                "Dalam hadist nabi Muhammad SAW bersabda:\n\n" +
                "فَإِذَا كَانَتْ لَكَ مِائَتَا دِرْهَمٍ وَحَالَ عَلَيْهَا الْحَوْلُ فَفِيْهَا خَمْسَةُ دَرَاهِمٍ وَلَيْسَ عَلَيْكَ شَيْءٍ  يَعْنِى فِى الذَّهَبِ حَتًّى يَكُوْنَ لَكَ عِشْرُوْنَ دِيْنَارًا فَإِذَا كَانَ لَكَ عِشْرُوْنَ دِيْنَارًا وَحَالَ عَلَيْهَا الْحَوْلُ فَفِيْهَا نِصْفُ دِيْنَارٍ فَمَا زَادَ فَحِسَابُ ذٰلِكَ .\n" +
                "\n\"Bila Anda memiliki dua ratus dirham dan satu tahun telah berlalu (karena Anda memiliki satu), maka Anda akan dikenakan zakat kepadanya selama lima dirham. Dan Anda tidak diwajibkan untuk membayar zakat sedikit pun emas sampai -maksudnya Anda memiliki dua puluh dinar. Jika Anda sudah memiliki dua puluh dinar dan satu tahun telah berlalu (karena Anda memiliki satu), maka Anda akan dikenakan zakat kepadanya setengah dinar. Dan kelebihan dari (nishob), maka zakat disesuaikan dengan menghitungnya. (H.R. Abu Dawud).\n" +
                "Dirham dan dinar yang dimaksudkan dalam hadist tersebut ialah: satuan mata uang perak dan emas, yang merupakan standrat  zakat  perak dan emas di dalam syari’at islam. Pengertian dinar ini, disebut  juga dengan mitskal. Jadi 20 dinar, sama dengan 20 mitskal, dan istilah mitskal inilah yang sering kita jumpai di dalam kitab-kitab Fiqih mengenai zakat emas.\n" +
                "\n" +
                "3.\tSyarat zakat emas dan perak.\n" +
                "Untuk syarat dari Zakat Emas dan perak :\n" +
                "a)\tMilik orang islam\n" +
                "b)\tMencapai haul\n" +
                "c)\tMencapai nishab\n" +
                "d)\tBesar zakat 2,5 %\n" +
                "e)\t Harus berupa emas murni atau perak murni (24K/99%), bukan campuran. Jika campuran, walaupun mencapai nishob, maka tidak ada kewajiban zakatnya, sebab berat aslinya kurang dari itu.\n" +
                "(Ma’rifatun, S.Pd.I )\n\n\tCara menghitung zakat emas \n" +
                "(Nisab Emas) \n" +
                "harga emas/gram x 85=……….\n" +
                "\n" +
                "(total keseluruhan emas)\n" +
                "Emas yang di miliki + emas yang di simpan=……………\n" +
                "\n" +
                "(total zakat yang di keluawarkan)\n" +
                "(total)Harga emas  * emas yang di simpan=………………….\n" +
                "Total (total zakat yang di keluawarkan)= total *0.025=………………………\n" +
                "\n" +
                "Jika total zakat kurang dari Nisab maka tidak wajib mengeluarkan zakat \n");
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
