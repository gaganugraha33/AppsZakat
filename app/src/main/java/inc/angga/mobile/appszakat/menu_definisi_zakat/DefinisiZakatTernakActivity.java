package inc.angga.mobile.appszakat.menu_definisi_zakat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 4/24/2017.
 */

public class DefinisiZakatTernakActivity extends AppCompatActivity {
    private TextView tvDefZakatTernak;
    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definisi_zakat_ternak_activity_layout);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvDefZakatTernak = (TextView)findViewById(R.id.tv_definisi_zakat_ternak);
        tvDefZakatTernak.setText("1.\tPengertian Zakat Peternakan\n" +
                "Yaitu zakat yang harus dikeluarkan atas binatang ternak yang dimiliki. Para ulama’ sepakat dalam menentukan jenis dari binatang yang wajib dikeluarkan zakatnya, yaitu: unta, kerbau, sapi, kambing, domba, ayam, burung, ikan. Hewan lainnya seperti kuda, keledai, dan khimar memunculkan perbedaan pendapat dikalangan para ulama’ mengenai wajib atau tidaknya dikeluarkan zakat. Menurut pendapat jumhur ulama’ memandang bahwa tak ada zakat pada kuda, karena kuda sebagai tunggangan, kuda perang, ataupun kuda angkutan itu hanya dipelihara untuk mencukupi kebutuhan pemiliknya, yaitu dipelihara sebagai perhiasan atau digunakan tenaganya.[4]Sedangkan menurut Abu Hanifah bahwa kuda wajib dizakati, karena mengandung sifat subur, berkembang biak dengan jalan diternakkan. \n" +
                "Mengenai dalil diwajibkannya zakat binatang ternak ada pada surat An-Nahl ayat 66, yang berbunyi:\n\n" +
                "وَإِنَّ لَكُمْ فِي الأَنْعَامِ لَعِبْرَةً نُّسْقِيكُم مِّمَّا فِي بُطُونِهِ مِن بَيْنِ فَرْثٍ وَدَمٍ .لَّبَناً خَالِصاً سَآئِغاً لِلشَّارِبِينَ\n" +
                "Artinya:\n" +
                "“Dan sesungguhnya pada binatang ternak itu benar-benar terdapat pelajaran bagi kamu. Kami memberimu minum dari pada apa yang berada dalam perutnya (berupa) susu yang bersih antara tahi dan darah, yang mudah ditelan bagi orang-orang yang meminumnya”. (QS. An-Nahl: 66).\n" +
                "\n" +
                "2.\tSyarat dan Ketentuan Zakat Peternakan\n\n" +
                "1.\tSudah mencapai nishab. Pembagian-pembagian nishabnya adalah sebagai berikut:\n\n" +
                "a)\tNishab Unta. \n" +
                "\uF0D8\t5-9 ekor, zakatnya 1 ekor kambing\n" +
                "\uF0D8\t10-14 ekor, zakatnya 2 ekor kambing, dan seterusnya, setiap bertambah 5 ekor unta bertambah pula 1 ekor kambing yang harus dikeluarkan.\n" +
                "\uF0D8\t25-35 ekor, zakatnya 1 ekor unta bintu makhad, yaitu anak unta betina umur 1-2 tahun.\n" +
                "\uF0D8\t36-45 ekor, zakatnya 1 ekor unta bintu labun, yaitu anak unta betina umur 2-3 tahun.\n" +
                "\uF0D8\t46-60 ekor, zakatnya 1 ekor unta hiqqoh, yaitu anak unta betina umur 3-4 tahun.\n" +
                "\uF0D8\t61-75 ekor, zakatnya 1 ekor unta jadz’ah, yaitu anak unta betina umur 4-5 tahun.\n" +
                "\uF0D8\t 76-90 ekor zakatnya 2 ekor unta bintu labun.\n" +
                "\uF0D8\t 91-120 ekor, zakatnya 2 ekor unta hiqqoh.\n" +
                "\uF0D8\tSelanjutnya Jika jumlahnya lebih, maka setiap 40 ekor, zakatnya 1 ekor unta bintu labun dan setiap 50 ekor, 1 ekor unta hiqqoh.\n" +
                "\n" +
                "b)\tNishab Sapi atau kerbau\n" +
                "\uF0D8\t30-39 ekor, zakatnya 1 ekor sapi jantan atau betina umur 1-2 tahun. Tidak ada tambahan lain hingga banyaknya mencapai 60 ekor.\n" +
                "\uF0D8\t 60-69 ekor, zakatnya 2 ekor sapi jantan umur 1-2 tahun.\n" +
                "\uF0D8\t70-79 ekor, zakatnya 2 ekor sapi, 1 ekor betina berumur 2 tahun dan satu ekor jantan berumur 1 tahun.\n" +
                "\uF0D8\t 80-89 ekor, zakatnya 2 ekor sapi betina umur 2-3 tahun\n" +
                "\uF0D8\tSelanjutnya setiap bertambah 30 ekor sapi, zakatnya 1 ekor sapi jantan berumur 1 tahun lebih dan setiap bertambah 40 ekor maka zakatnya bertambah 1 ekor sapi betina berumur 2 tahun lebih.\n" +
                "\n" +
                "\n" +
                "c)\tNishab Kambing atau Domba\n" +
                "\uF0D8\t40-120 ekor, zakatnya ialah 1 ekor kambing\n" +
                "\uF0D8\t121-200 ekor, zakatnya ialah 2 ekor kambing\n" +
                "\uF0D8\t200-300 ekor, zakatnya ialah 3 ekor kambing betina.\n" +
                "\uF0D8\tSelanjutnya jika lebih dari 300 ekor, maka setiap 100, dikeluarkan 1 ekor kambing betina.\n\n" +
                "2.\t Mencukupi haul ( 1 tahun kepemilikan secara sempurna).\n\n" +
                "3.\tBinatang ternak digembalakan. Ulama’ berbeda pendapat lamanya waktu penggembalaan. Menurut Abu Hanifah dan Ahmad, binatang yang digembala dalam sebagian tahun, terhadapnya wajib zakat. Sedangkan menurut Imam Syafi’i, binatang yang wajib zakat adalah binatang yang dikembala sepanjang tahun. \n\n" +
                "4.\tBinatang ternak tidak dipakai untuk bekerja.\n" +
                "Kemudian binatang seperti ayam, bebek, ikan yang sifatnya dapat berkembang dan diternakkan menjadi banyak. Mengenai hal ini agak berbeda yaitu nishab yang digunakan bukan pada jumlahnya, namun dihitung berdasarkan skala usaha atau hasil yang diperoleh, dan nishabnya disetarakan dengan nilai 85 gram emas.\n\nCara menghitung zakat ternak :\n\n" +
                "Kambing/Domba :\n" +
                "Jika digembalakan selama 1 tahun dengan total :\n" +
                "-\t40 – 120 ekor maka zakatnya 1 ekor betina \n" +
                "-\t121 – 200 ekor maka zakatnya 2 ekor kambing betina\n" +
                "-\t201 – 300 ekor maka zakatnya 3 ekor kambing betina\n" +
                "-\tLebih dari 300 maka setiap 100 ekor dikeluarkan 1 ekor kambing betina\n\n" +
                "Sapi/Kerbau :\n" +
                "Jika digembalakan selama 1 tahun dengan total :\n" +
                "-\t30-39 ekor sapi maka zakatnya 1 ekor sapi berumur 1 tahun\n" +
                "-\t40-59 ekor sapi maka zakatnya 1 ekor sapi betina berumur 2 tahun\n" +
                "-\t60-69 ekor sapi maka zakatnya 2 ekor sapi berumur 1 tahun\n" +
                "-\t70 -79 ekor sapi maka zakatnya 1 ekor sapi betina 2 tahun dan 1 ekor sapi berumur 1 tahun\n");
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
