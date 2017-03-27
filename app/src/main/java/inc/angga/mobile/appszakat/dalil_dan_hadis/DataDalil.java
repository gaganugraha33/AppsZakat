package inc.angga.mobile.appszakat.dalil_dan_hadis;

import java.util.ArrayList;
import java.util.HashMap;

import inc.angga.mobile.appszakat.base_data.Data;
import inc.angga.mobile.appszakat.dalil_dan_hadis.model.Dalil;
import inc.angga.mobile.appszakat.dalil_dan_hadis.model.DalilField;

/**
 * Created by ACER on 3/26/2017.
 */

public class DataDalil {

    public static ArrayList<String> getTitleDalil(){
        ArrayList<String> dataTitleDalil = new ArrayList<>();
        dataTitleDalil.add("Surat Al-Baqarah");
        dataTitleDalil.add("Surat An-Nisa");
        dataTitleDalil.add("Surat Al-Maidah");
        dataTitleDalil.add("Surat An-Na'aam");
        dataTitleDalil.add("Surat Al-A'Raf");
        dataTitleDalil.add("Surat At-Taubah");
        dataTitleDalil.add("Surat Maryam");
        dataTitleDalil.add("Surat Al-Anbiya");
        dataTitleDalil.add("Surat Al-Hajj");
        dataTitleDalil.add("Surat Al-Mu'Minun");
        dataTitleDalil.add("Surat An-Nuur");
        dataTitleDalil.add("Surat An-Naml");
        dataTitleDalil.add("Surat Ar-Ruum");
        dataTitleDalil.add("Surat Luqman");
        dataTitleDalil.add("Surat Al-Ahzab");
        dataTitleDalil.add("Surat Fuslihat");
        dataTitleDalil.add("Surat Al-Mujadilah");
        dataTitleDalil.add("Surat Al-Muzammil");
        dataTitleDalil.add("Surat Al-Bayyinah");

        return dataTitleDalil;
    }


    public static ArrayList<Data> getDetailSuratDalil(int position){

        ArrayList<Data> dataDetailSuratDalil = new ArrayList<>();
        if (position == 0){
            String[] noSurat = {"2:43", "2:83","2:110","2:117","2:277" };
            String[] noDetailSurat = {"Dan dirikanlah salat, tunaikanlah zakat dan rukuklah beserta orang-orang yang rukuk", "Dan (ingatlah), ketika Kami mengambil janji dari Bani Israel (yaitu): Janganlah kamu menyembah selain Allah, dan berbuat baiklah kepada ibu bapak, kaum kerabat, anak-anak yatim, dan orang-orang miskin, serta ucapkanlah kata-kata yang baik kepada manusia, dirikanlah salat dan tunaikanlah zakat. Kemudian kamu tidak memenuhi janji itu, kecuali sebahagian kecil daripada kamu, dan kamu selalu berpaling.","Dan dirikanlah salat dan tunaikanlah zakat. Dan kebaikan apa saja yang kamu usahakan bagi dirimu, tentu kamu akan mendapat pahalanya pada sisi Allah. Sesungguhnya Allah Maha Melihat apa-apa yang kamu kerjakan.","Bukanlah menghadapkan wajahmu ke arah timur dan barat itu suatu kebajikan, akan tetapi sesungguhnya kebajikan itu ialah beriman kepada Allah, hari kemudian, malaikat-malaikat, kitab-kitab, nabi-nabi dan memberikan harta yang dicintainya kepada kerabatnya, anak-anak yatim, orang-orang miskin, musafir (yang memerlukan pertolongan) dan orang-orang yang meminta-minta; dan  (memerdekakan) hamba sahaya, mendirikan salat, dan menunaikan zakat; dan orang-orang yang menepati janjinya apabila ia berjanji, dan orang-orang yang sabar dalam kesempitan, penderitaan dan dalam peperangan. Mereka itulah orang-orang yang benar (imannya); dan mereka itulah orang-orang yang bertakwa.","Sesungguhnya orang-orang yang beriman, mengerjakan amal saleh, mendirikan sembahyang dan menunaikan zakat, mereka mendapat pahala di sisi Tuhannya. Tidak ada kekhawatiran terhadap mereka dan tidak (pula) mereka bersedih hati." };

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 1){
            String[] noSurat = {"4:77", "4:162" };
            String[] noDetailSurat = {"Tidakkah kamu perhatikan orang-orang yang dikatakan kepada mereka: \"Tahanlah tanganmu (dari berperang), dirikanlah sembahyang dan tunaikanlah zakat!\" Setelah diwajibkan kepada mereka berperang, tiba-tiba sebahagian dari mereka (golongan munafik) takut kepada manusia (musuh), seperti takutnya kepada Allah, bahkan lebih sangat dari itu takutnya. Mereka berkata: \"Ya Tuhan kami, mengapa Engkau wajibkan berperang kepada kami? Mengapa tidak Engkau tangguhkan (kewajiban berperang) kepada kami beberapa waktu lagi?\" Katakanlah: \"Kesenangan di dunia ini hanya sebentar dan akhirat itu lebih baik untuk orang-orang yang bertakwa dan kamu tidak akan dianiaya sedikit pun.","Tetapi orang-orang yang mendalam ilmunya di antara mereka dan orang-orang mukmin, mereka beriman kepada apa yang telah diturunkan kepadamu (Al Qur'an), dan apa yang telah diturunkan sebelummu dan orang-orang yang mendirikan shalat, menunaikan zakat, dan yang beriman kepada Allah dan hari kemudian.  Orang-orang itulah yang akan Kami berikan kepada mereka pahala yang besar."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 2){
            String[] noSurat = {"5:12", "5:55" };
            String[] noDetailSurat = {"Dan sesungguhnya Allah telah mengambil perjanjian (dari) Bani Israel dan telah Kami angkat di antara mereka dua belas orang pemimpin dan Allah berfirman: \"Sesungguhnya Aku beserta kamu, sesungguhnya jika kamu mendirikan salat dan menunaikan zakat serta beriman kepada rasul-rasul-Ku dan kamu bantu mereka dan kamu pinjamkan kepada Allah pinjaman yang baik sesungguhnya Aku akan menghapus dosa-dosamu. Dan sesungguhnya kamu akan Kumasukkan ke dalam surga yang mengalir di dalamnya sungai-sungai.  Maka barang siapa yang kafir di antaramu sesudah itu, sesungguhnya ia telah tersesat dari jalan yang lurus\"", "Sesungguhnya penolong kamu hanyalah Allah, Rasul-Nya, dan orang-orang yang beriman, yang mendirikan salat dan menunaikan zakat, seraya mereka tunduk (kepada Allah)."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        } else if (position == 3){
            String[] noSurat = {"6:141" };
            String[] noDetailSurat = {"Dan Dialah yang menjadikan kebun-kebun yang berjunjung dan yang tidak berjunjung, pohon kurma, tanam-tanaman yang bermacam-macam buahnya, zaitun dan delima yang serupa (bentuk dan warnanya), dan tidak sama (rasanya). Makanlah dari buahnya (yang bermacam-macam itu) bila dia berbuah, dan tunaikanlah haknya di hari memetik hasilnya (dengan dikeluarkan zakatnya); dan janganlah kamu berlebih-lebihan.  Sesungguhnya Allah tidak menyukai orang-orang yang berlebih-lebihan."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 4){
            String[] noSurat = {"7:156" };
            String[] noDetailSurat = {"Dan tetapkanlah untuk kami kebajikan di dunia ini dan di akhirat; sesungguhnya kami kembali (bertobat) kepada Engkau. Allah berfirman: \"Siksa-Ku akan Kutimpakan kepada siapa yang Aku kehendaki dan rahmat-Ku meliputi segala sesuatu. Maka akan Aku tetapkan rahmat-Ku untuk orang-orang yang bertakwa, yang menunaikan zakat dan orang-orang yang beriman kepada ayat-ayat Kami\"."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 5){
            String[] noSurat = {"9:5","9:11","9:18","9:58","9:60","9:71","9:103","9:104"};
            String[] noDetailSurat = {"Apabila sudah habis bulan-bulan Haram itu, maka bunuhlah orang-orang musyrikin itu di mana saja kamu jumpai mereka, dan tangkaplah mereka. Kepunglah mereka dan intailah di tempat pengintaian. Jika mereka bertobat dan mendirikan salat dan menunaikan zakat, maka berilah kebebasan kepada mereka untuk berjalan. Sesungguhnya Allah Maha Pengampun lagi Maha Penyayang.","Jika mereka bertobat, mendirikan salat dan menunaikan zakat, maka (mereka itu) adalah saudara-saudaramu seagama. Dan Kami menjelaskan ayat-ayat itu bagi kaum yang mengetahui.","Hanyalah yang memakmurkan mesjid-mesjid Allah ialah orang-orang yang beriman kepada Allah dan hari kemudian, serta tetap mendirikan salat, menunaikan zakat dan tidak takut (kepada siapa pun) selain kepada Allah, maka merekalah orang-orang yang diharapkan termasuk golongan orang-orang yang mendapat petunjuk.","Dan di antara mereka ada orang yang mencelamu tentang (pembagian) zakat; jika mereka diberi sebahagian daripadanya, mereka bersenang hati, dan jika mereka tidak diberi sebahagian daripadanya, dengan serta merta mereka menjadi marah.","Sesungguhnya zakat-zakat itu, hanyalah untuk orang-orang fakir, orang-orang miskin, pengurus-pengurus zakat, para muallaf yang dibujuk hatinya, untuk (memerdekakan) budak, orang-orang yang berutang, untuk jalan Allah dan orang-orang yang sedang dalam perjalanan, sebagai sesuatu ketetapan yang diwajibkan Allah; dan Allah Maha Mengetahui lagi Maha Bijaksana.","Dan orang-orang yang beriman, lelaki dan perempuan, sebahagian mereka (adalah) menjadi penolong bagi sebahagian yang lain. Mereka menyuruh (mengerjakan) yang makruf, mencegah dari yang mungkar, mendirikan sembahyang, menunaikan zakat, dan mereka taat kepada Allah dan Rasul-Nya. Mereka itu akan diberi rahmat oleh Allah; sesungguhnya Allah Maha Perkasa lagi Maha Bijaksana.","Ambillah zakat dari sebagian harta mereka, dengan zakat itu kamu membersihkan dan mensucikan mereka, dan mendoalah untuk mereka. Sesungguhnya doa kamu itu (menjadi) ketenteraman jiwa bagi mereka. Dan Allah Maha Mendengar lagi Maha Mengetahui.","Tidakkah mereka mengetahui, bahwasanya Allah menerima tobat dari hamba-hamba-Nya dan menerima zakat, dan bahwasanya Allah Maha Penerima tobat lagi Maha Penyayang?"};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 6){
            String[] noSurat = {"19:31","19:55"};
            String[] noDetailSurat = {"Dan Dia menjadikan aku seorang yang diberkati di mana saja aku berada, dan Dia memerintahkan kepadaku (mendirikan) salat dan (menunaikan) zakat selama aku hidup.","Dan ia menyuruh ahlinya untuk bersembahyang dan menunaikan zakat, dan ia adalah seorang yang diridai di sisi Tuhannya."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 7){
            String[] noSurat = {"21:73"};
            String[] noDetailSurat = {" Kami telah menjadikan mereka itu sebagai pemimpin-pemimpin yang memberi petunjuk dengan perintah Kami dan telah Kami wahyukan kepada mereka mengerjakan kebajikan, mendirikan sembahyang, menunaikan zakat, dan hanya kepada Kami lah mereka selalu menyembah."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 8){
            String[] noSurat = {"22:41","22:78"};
            String[] noDetailSurat = {"(Yaitu) orang-orang yang jika Kami teguhkan kedudukan mereka di muka bumi, niscaya mereka mendirikan sembahyang, menunaikan zakat, menyuruh berbuat yang makruf dan mencegah dari perbuatan yang mungkar; dan kepada Allah-lah kembali segala urusan.",". Dan berjihadlah kamu pada jalan Allah dengan jihad yang sebenar-benarnya. Dia telah memilih kamu dan Dia sekali-kali tidak menjadikan untuk kamu dalam agama suatu kesempitan. (Ikutilah) agama orang tuamu Ibrahim. Dia (Allah) telah menamai kamu sekalian orang-orang muslim dari dahulu, dan (begitu pula) dalam (Al Qur'an) ini, supaya Rasul itu menjadi saksi atas dirimu dan supaya kamu semua menjadi saksi atas segenap manusia, maka dirikanlah sembahyang, tunaikanlah zakat dan berpeganglah kamu pada tali Allah. Dia adalah Pelindungmu, maka Dialah sebaik-baik Pelindung dan sebaik-baik Penolong."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 9){
            String[] noSurat = {"23:4"};
            String[] noDetailSurat = {"Dan orang-orang yang menunaikan zakat."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 10){
            String[] noSurat = {"24:37","24:56"};
            String[] noDetailSurat = {"Laki-laki yang tidak dilalaikan oleh perniagaan dan tidak (pula) oleh jual beli dari mengingat Allah, dan (dari) mendirikan sembahyang, dan (dari) membayarkan zakat. Mereka takut kepada suatu hari yang (di hari itu) hati dan penglihatan menjadi guncang.","Dan dirikanlah sembahyang, tunaikanlah zakat, dan taatlah kepada rasul, supaya kamu diberi rahmat."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 11){
            String[] noSurat = {"27:3"};
            String[] noDetailSurat = {"(Yaitu) orang-orang yang mendirikan sembahyang dan menunaikan zakat dan mereka yakin akan adanya negeri akhirat."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 12){
            String[] noSurat = {"30:39"};
            String[] noDetailSurat = {"Dan sesuatu riba (tambahan) yang kamu berikan agar dia bertambah pada harta manusia, maka riba itu tidak menambah pada sisi Allah. Dan apa yang kamu berikan berupa zakat yang kamu maksudkan untuk mencapai keridaan Allah, maka (yang berbuat demikian) itulah orang-orang yang melipat gandakan (pahalanya)."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 13){
            String[] noSurat = {"31:4"};
            String[] noDetailSurat = {"(Yaitu) orang-orang yang mendirikan salat, menunaikan zakat dan mereka yakin akan adanya negeri akhirat."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 14){
            String[] noSurat = {"33:3"};
            String[] noDetailSurat = {"Dan hendaklah kamu tetap di rumahmu dan janganlah kamu berhias dan bertingkah laku seperti orang-orang Jahiliyah yang dahulu dan dirikanlah salat, tunaikanlah zakat dan taatilah Allah dan Rasul-Nya. Sesungguhnya Allah bermaksud hendak menghilangkan dosa dari kamu, hai ahlul bait dan membersihkan kamu sebersih-bersihnya."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 15){
            String[] noSurat = {"41:7"};
            String[] noDetailSurat = {"(Yaitu) orang-orang yang tidak menunaikan zakat dan mereka kafir akan adanya (kehidupan) akhirat."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 16){
            String[] noSurat = {"58:13"};
            String[] noDetailSurat = {"Apakah kamu takut akan (menjadi miskin) karena kamu memberikan sedekah sebelum pembicaraan dengan Rasul? Maka jika kamu tiada memperbuatnya dan Allah telah memberi tobat kepadamu maka dirikanlah sembahyang, tunaikanlah zakat dan taatlah kepada Allah dan Rasul-Nya; dan Allah Maha Mengetahui apa yang kamu kerjakan."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 17){
            String[] noSurat = {"73:20"};
            String[] noDetailSurat = {"Sesungguhnya Tuhanmu mengetahui bahwasanya kamu berdiri (sembahyang) kurang dari dua pertiga malam, atau seperdua malam atau sepertiganya dan (demikian pula) segolongan dari orang-orang yang bersama kamu. Dan Allah menetapkan ukuran malam dan siang. Allah mengetahui bahwa kamu sekali-kali tidak dapat menentukan batas-batas waktu-waktu itu, maka Dia memberi keringanan kepadamu, karena itu bacalah apa yang mudah (bagimu) dari Al Qur'an. Dia mengetahui bahwa akan ada di antara kamu orang-orang yang sakit dan orang-orang yang berjalan di muka bumi mencari sebagian karunia Allah; dan orang-orang yang lain lagi yang berperang di jalan Allah, maka bacalah apa yang mudah (bagimu) dari Al Qur'an dan dirikanlah sembahyang, tunaikanlah zakat dan berikanlah pinjaman kepada Allah pinjaman yang baik. Dan kebaikan apa saja yang kamu perbuat untuk dirimu niscaya kamu memperoleh (balasan) nya di sisi Allah sebagai balasan yang paling baik dan yang paling besar pahalanya. Dan mohonlah ampunan kepada Allah; sesungguhnya Allah Maha Pengampun lagi Maha Penyayang."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }else if (position == 18){
            String[] noSurat = {"98:5"};
            String[] noDetailSurat = {"Padahal mereka tidak disuruh kecuali supaya menyembah Allah dengan memurnikan ketaatan kepada-Nya dalam (menjalankan) agama dengan lurus, dan supaya mereka mendirikan salat dan menunaikan zakat; dan yang demikian itulah agama yang lurus."};

            for (int i=0;i<noSurat.length;i++){
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(DalilField.noDalil.toString(),noSurat[i]);
                hashMap.put(DalilField.DetailDalil.toString(),noDetailSurat[i]);

                Dalil dalil = new Dalil(hashMap);
                dataDetailSuratDalil.add(dalil);
            }
        }


        return dataDetailSuratDalil;
    }

}
