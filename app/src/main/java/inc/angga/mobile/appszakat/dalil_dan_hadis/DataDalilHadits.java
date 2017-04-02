package inc.angga.mobile.appszakat.dalil_dan_hadis;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import inc.angga.mobile.appszakat.base_data.Data;
import inc.angga.mobile.appszakat.dalil_dan_hadis.model.Dalil;
import inc.angga.mobile.appszakat.dalil_dan_hadis.model.DalilField;

/**
 * Created by ACER on 3/26/2017.
 */

public class DataDalilHadits {


    public static ArrayList<String> getTitleHadits(){
        ArrayList<String> dataTitleHadits = new ArrayList<>();
        dataTitleHadits.add("Tidak ada kewajiban zakat budak dan kuda bagi seorang muslim");
        dataTitleHadits.add("Tentang mendahulukan zakat dan keengganan mengeluarkannya");
        dataTitleHadits.add("Zakat fitrah wajib atas orang-orang muslim, berupa kurma dan gandum");
        dataTitleHadits.add("Perintah mengelurkan zakat fitrah sebelum salat ied");
        dataTitleHadits.add("Dosa orang yang enggan membayar zakat");
        dataTitleHadits.add("Hukuman keras bagi orang yang tidak mau membayar zakat");
        dataTitleHadits.add("Tentang orang yang menimbun harta dan kecaman keras terhadap mereka");
        dataTitleHadits.add("Dorongan membelanjakan harta dan pemberian kabar gembira kepada orang yang membelanjakan harta dengan gantinya");
        dataTitleHadits.add("Memulai nafkah pada diri sendiri lalu pada keluarganya kemudian pada kerabat");
        dataTitleHadits.add("Keutamaan nafkah dan sedekah kepada kaum kerabat, istri, anak-anak dan kedua orang tua meskipun mereka adalah orang-orang musyrik");
        dataTitleHadits.add("Pahala sedekah sampai untuk mayit");
        dataTitleHadits.add("Menerangkan bahwa sebutan sedekah juga dapat diterapkan pada setiap macam kebaikan");
        dataTitleHadits.add("Tentang orang yang berinfak dan orang yang enggan berinfak");
        dataTitleHadits.add("Ajakan bersedekah sebelum datang masa di mana ia tidak menemukan orang yang menerimanya (akhir zaman)");
        dataTitleHadits.add("Penerimaan sedekah adalah dari hasil usaha yang baik dan pengembangan yang baik pula");
        dataTitleHadits.add("Sunat bersedekah walau hanya separoh kurma atau perkataan yang baik dan sedekah merupakan tabir dari api neraka");
        dataTitleHadits.add("Kuli angkut mendapat pahala dari upah yang disedekahkan dan larangan keras menolak merendahkan orang yang bersedekah sedikit");
        dataTitleHadits.add("Keutamaan meminjamkan unta perah");
        dataTitleHadits.add("Perumpamaan orang yang berinfak dan orang kikir");
        dataTitleHadits.add("Pahala orang yang bersedekah tetap, meskipun sedekahnya jatuh ke tangan orang yang tak berhak");
        dataTitleHadits.add("Pahala bendahara yang tepercaya dan wanita yang bersedekah dari rumah suaminya sesuatu yang belum rusak, baik dengan izin yang jelas maupun secara adat");
        dataTitleHadits.add("Orang yang mengumpulkan sedekah dan amal-amal kebaikan");
        dataTitleHadits.add("Anjuran berinfak dan makruh menghitung-hitungnya");
        dataTitleHadits.add("Anjuran bersedekah walau sedikit dan jangan enggan bersedekah karena meremehkan yang sedikit");
        dataTitleHadits.add("Keutamaan merahasiakan sedekah");
        dataTitleHadits.add("Menerangkan bahwa sedekah yang paling utama ialah sedekah orang yang sehat yang kikir");
        dataTitleHadits.add("Menerangkan bahwa tangan yang di atas lebih baik dari tangan yang di bawah dan tangan yang di atas adalah yang memberi dan tangan yang di bawah adalah yang menerima");
        dataTitleHadits.add("Larangan meminta");
        dataTitleHadits.add("Orang miskin adalah orang yang tidak berkecukupan dan tidak diketahui, lalu ia diberi sedekah");
        dataTitleHadits.add("Tidak disukai meminta kepada orang lain");
        dataTitleHadits.add("Orang yang diberi tanpa meminta boleh mengambil secukupnya, tanpa berlebihan");
        dataTitleHadits.add("Tidak disukai loba kepada harta dunia");
        dataTitleHadits.add("Seandainya anak cucu Adam mempunyai dua lembah harta, tentu ia masih menginginkan yang ketiga");
        dataTitleHadits.add("Kaya itu bukanlah karena banyak harta");
        dataTitleHadits.add("Kekhawatiran terhadap keindahan dunia");
        dataTitleHadits.add("Keutamaan sifat iffah dan sabar");
        dataTitleHadits.add("Tentang merasa cukup dan menerima apa adanya");
        dataTitleHadits.add("Memberi orang yang meminta dengan kata-kata kotor dan kasar");
        dataTitleHadits.add("Memberi orang yang baru memeluk Islam dan menyabarkan orang yang kuat imannya");
        dataTitleHadits.add("Menyebutkan golongan Khawarij dan sifat mereka");
        dataTitleHadits.add("Anjuran untuk membunuh orang-orang Khawarij");
        dataTitleHadits.add("Golongan Khawarij adalah seburuk-buruk manusia");
        dataTitleHadits.add("Larangan berzakat kepada Rasulullah saw., keluarganya, Bani Hasyim dan Bani Muthalib");
        dataTitleHadits.add("Nabi saw., Bani Hasyim dan Bani Muthalib diperbolehkan menerima hadiah, meskipun pemberi hadiah mendapatkannya dari sedekah serta menerangkan bahwa apabila sedekah telah diterima oleh orang yang diberi sedekah, maka hilanglah sifat sedekah dan menjadi halal bagi setiap orang yang semula haram menerimanya");
        dataTitleHadits.add("Nabi saw. menerima hadiah dan menolak sedekah (zakat)");
        dataTitleHadits.add("Doa untuk orang yang datang membawa sedekah");

        return dataTitleHadits;
    }

    public static String getDetailHadits(int position){

        ArrayList<String> dataDetailHadits = new ArrayList<>();
        dataDetailHadits.add("a)\tHadis riwayat Abu Said Al-Khudri: ia berkata:\n" +
                "Dari Nabi, beliau bersabda: Tidak ada zakat pada hasil bumi yang kurang dari lima Wasaq (tiga ratus sha'), tidak ada zakat pada unta yang kurang dari lima ekor, tidak ada zakat pada perak yang kurang dari lima uqiyah. (Shahih Muslim No.1625)\n\n" +
                "b)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Bahwa Rasulullah saw. bersabda: Tidak ada kewajiban zakat budak dan kuda bagi seorang muslim. (Shahih Muslim No.1631)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Rasulullah saw. mengutus Umar untuk menarik zakat. Lalu dikatakan bahwa Ibnu Jamil, Khalid bin Walid dan Abbas, paman Nabi saw. enggan mengeluarkan zakat. Lalu Rasulullah saw. bersabda: Penolakan Ibnu Jamil tidak lain hanyalah pengingkaran terhadap nikmat, dahulu ia melarat, lalu Allah menjadikannya kaya. Adapun Khalid, maka kalianlah yang menganiaya Khalid. Dia telah mewakafkan baju besi dan peralatan perangnya pada jalan Allah. Sedangkan Abbas, maka zakatnya menjadi tanggunganku begitu pula zakat semisalnya. Kemudian beliau bersabda: Hai Umar, tidakkah engkau merasa bahwa paman seseorang itu mewakili ayahnya?. (Shahih Muslim No.1634)\n");
        dataDetailHadits.add("a)\tHadis riwayat Ibnu Umar ra.:\n" +
                "Bahwa Rasulullah saw. mewajibkan zakat fitrah dari bulan Ramadan kepada manusia, yaitu satu sha` (gantang) kurma atau satu sha` gandum atas setiap muslim, merdeka atau budak, lelaki maupun wanita. (Shahih Muslim No.1635)\n\n" +
                "b)\tHadis riwayat Abu Said Al-Khudri ra., ia berkata:\n" +
                "Kami selalu mengeluarkan zakat fitrah satu sha` makanan atau satu sha` gandum atau satu sha` kurma atau satu sha` keju atau satu sha` anggur. (Shahih Muslim No.1640)\n");
        dataDetailHadits.add("a)\tHadis riwayat Ibnu Umar ra.:\n" +
                "Bahwa Rasulullah saw. memerintahkan agar zakat fitrah diberikan sebelum manusia berangkat untuk salat Ied. (Shahih Muslim No.1645)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Setiap pemilik emas atau perak yang tidak mau memenuhi haknya (tidak mau membayar zakat), pada hari kiamat pasti ia akan diratakan dengan lempengan-lempengan bagaikan api, lalu lempengan-lempengan itu dipanaskan di neraka Jahanam, kemudian lambungnya diseterika dengan lempengan itu, juga dahi dan punggungnya. Setiap kali lempengan itu mendingin, akan dipanaskan kembali. Hal itu terjadi dalam sehari yang lamanya sama dengan lima puluh ribu tahun. Hal ini berlangung terus sampai selesai keputusan untuk tiap hamba. Lalu ditampakkan jalannya, ke surga atau ke neraka. Ada yang bertanya: Wahai Rasulullah, bagaimana dengan unta? Rasulullah saw. bersabda: Begitu pula pemilik unta yang tidak mau memenuhi haknya. Di antara haknya adalah (zakat) susunya pada waktu keluar. Pada hari kiamat, pasti unta-unta itu dibiarkan di padang terbuka, sebanyak yang ada, tidak berkurang seekor anak unta pun dari unta-untanya itu. Dengan tapak kakinya, unta-unta itu akan menginjak-injak pemiliknya dan dengan mulutnya, mereka menggigit pemilik itu. Setelah unta yang pertama telah melewatinya, maka unta yang lain kembali kepadanya. Ini terjadi dalam satu hari yang lamanya sama dengan lima puluh ribu tahun, sampai selesai keputusan untuk tiap hamba, ke surga atau ke neraka. Ada yang bertanya: Wahai Rasulullah, bagaimana dengan sapi dan kambing? Rasulullah saw. bersabda: Demikian juga pemilik sapi dan kambing yang tidak mau memenuhi hak sapi dan kambing miliknya itu. Pada hari kiamat, tentu sapi dan kambing itu akan dilepas di suatu padang yang rata, tidak kurang seekor pun. Sapi-sapi dan kambing-kambing itu tidak ada yang bengkok, pecah atau hilang tanduknya. Semuanya menanduk orang itu dengan tanduk-tanduknya dan menginjak-injak dengan tapak-kaki tapak-kakinya. Setiap lewat yang pertama, maka kembalilah yang lain. Demikian terus-menerus dalam satu hari yang sama dengan lima puluh ribu tahun, sampai selesai keputusan untuk tiap hamba, ke surga atau ke neraka. Ditanyakan: Wahai Rasulullah, bagaimana dengan kuda? Beliau bersabda: Kuda itu ada tiga macam; menjadi dosa bagi seseorang, menjadi tameng bagi seseorang dan menjadi ganjaran bagi seseorang. Adapun kuda yang menjadi dosa bagi seseorang adalah kuda yang diikat dengan maksud pamer, bermegah-megahan dan memusuhi penduduk Islam, maka kuda itu bagi pemiliknya merupakan dosa. Adapun yang menjadi tameng bagi seseorang adalah kuda yang diikat pemiliknya untuk berjuang di jalan Allah, kemudian pemilik itu tidak melupakan hak Allah yang terdapat pada punggung dan leher kuda, maka kuda itu menjadi tameng bagi pemiliknya (penghalang dari api neraka). Adapun kuda yang menjadi ganjaran bagi pemiliknya adalah kuda yang diikat untuk berjuang di jalan Allah, untuk penduduk Islam pada tanah yang subur dan taman. Maka sesuatu yang dimakan oleh kuda itu pada tanah subur atau taman tersebut, pasti dicatat untuk pemiliknya sebagai kebaikan sejumlah yang telah dimakan oleh kuda dan dicatat pula untuk pemiliknya kebaikan sejumlah kotoran dan air kencingnya. Bila tali pengikat terputus, lalu kuda itu membedal, lari sekali atau dua kali, maka Allah akan mencatat untuk pemiliknya kebaikan sejumlah langkah-langkah dan kotoran-kotorannya. Dan jika pemilik kuda itu melewatkan kudanya pada sungai, kemudian kuda itu minum dari air sungai tersebut, padahal ia tidak hendak memberi minum kudanya itu, maka Allah pasti mencatat untuknya kebaikan sejumlah apa yang telah diminum kudanya. Ditanyakan: Wahai Rasulullah, bagaimana dengan keledai? Rasulullah saw. bersabda: Tidak ada wahyu yang diturunkan kepadaku tentang keledai kecuali satu ayat yang unik dan menyeluruh ini: Barang siapa mengerjakan kebaikan seberat dzarrahpun, niscaya ia akan melihat balasannya. Dan barang siapa mengerjakan kejahatan seberat dzarrahpun, niscaya ia akan melihat balasannya. (Shahih Muslim No.1647)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Zar ra., ia berkata:\n" +
                "Aku menghampiri Nabi saw. yang sedang duduk di bawah bayang-bayang Kakbah. Ketika beliau melihatku beliau bersabda: Mereka benar-benar merugi, demi Tuhan Kakbah! Kemudian aku duduk, tetapi tidak tenang, maka aku segera bertanya: Wahai Rasulullah, demi ayah dan ibuku sebagai tebusanmu, siapakah mereka? Rasulullah saw. menjawab: Mereka adalah orang-orang yang paling banyak harta, kecuali yang berkata begini, begini dan begini (beliau memberi isyarat ke depan, ke belakang, ke kanan dan ke kiri). Mereka yang mau berbuat demikian sangat sedikit. Setiap pemilik unta atau sapi atau kambing yang tidak mau membayar zakatnya, pasti nanti pada hari kiamat, hewan-hewan itu akan datang dalam keadaan lebih besar dan lebih gemuk dari sebelumnya, menanduki pemiliknya dengan tanduk-tanduknya dan menginjak-injak dengan telapak kaki-telapak kakinya. Setiap kali yang lain telah selesai, datang lagi yang pertama sampai diputuskan di hadapan seluruh manusia. (Shahih Muslim No.1652)\n\n" +
                "b)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Bahwa Nabi saw. bersabda: Tidak akan membuat aku senang jika aku mempunyai emas sebesar gunung Uhud, bahkan ditambah lagi (gunung) kedua dan ketiga, kecuali satu dinar milikku yang aku sisakan untuk membayar utang tanggunganku. (Shahih Muslim No.1653)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Zar ra.\n" +
                "Dari Ahnaf bin Qais, ia berkata: Aku datang ke Madinah. Ketika sampai di suatu halaqah (majlis taklim), di dalamnya terdapat beberapa pemuka Quraisy, tiba-tiba datang seorang lelaki yang kasar pakaiannya, kasar badannya dan buruk wajahnya, ia berhenti pada mereka dan berkata: Kabarkan kepada orang-orang yang menimbun harta (dan tidak mau mengeluarkan zakat) dengan batu bara yang akan dipanaskan di dalam neraka Jahanam, lalu diletakkan pada puting buah dada salah seorang di antara mereka kemudian menembus sampai tulang rawan di ujung kedua bahunya dan diletakkan pada tulang rawan di ujung kedua bahunya hingga tembus sampai puting buah dadanya sambil bergetar-getar. Ia (Ahnaf) berkata: Maka mereka semua tertunduk malu (karena ucapan tersebut). Aku tidak melihat seorang pun di antara mereka yang memandangnya kembali. Lalu orang itu pergi. Aku mengikutinya sampai ia berhenti pada sebuah rombongan. Aku berkata: Aku tidak melihat pada mereka, kecuali ketidaksukaan terhadap apa yang engkau katakan kepada mereka. Orang itu berkata: Orang-orang itu tidak tahu apa-apa. Dahulu orang yang kucintai, Abul Qasim (Rasulullah) saw. memanggilku, lalu aku memenuhi panggilannya. Beliau bertanya: Apakah engkau melihat gunung Uhud? Aku (orang itu) memandang matahari yang menyengatku, aku menyangka bahwa beliau (Rasulullah saw.) akan mengutusku untuk suatu keperluan. Aku menjawab: Aku melihatnya. Rasulullah saw. bersabda: Tidak membuat aku senang seandainya aku mempunyai emas sebesar (gunung Uhud) itu yang aku belanjakan seluruhnya, kecuali tiga dinar. Kemudian orang-orang itu mengumpulkan dunia, mereka tidak memikirkan apa-apa. Katanya (Ahnaf): Aku bertanya: Ada masalah apa antara engkau dengan saudara-saudaramu dari Quraisy? Kenapa engkau tidak mendatangi dan meminta kepada mereka lalu engkau mendapatkan bagian dari mereka? Orang itu berkata: Tidak, demi Tuhanmu, aku tidak akan meminta dunia kepada mereka dan tidak akan meminta fatwa agama kepada mereka sampai aku bertemu Allah dan Rasul-Nya. (Shahih Muslim No.1656)\n");
        dataDetailHadits.add("Hadis riwayat Abu Hurairah ra.\n" +
                "Bahwa Nabi saw. bersabda: Allah Taala berfirman: Hai anak cucu Adam, berinfaklah kalian, maka Aku akan memberi ganti kepadamu. Rasulullah saw. bersabda: Anugerah Allah itu penuh dan deras. Ibnu Numair berkata: (Maksud dari) mal'aan adalah pemberian yang banyak dan mendatangkan keberkahan, tidak mungkin terkurangi oleh apapun di waktu malam dan siang. (Shahih Muslim No.1658)\n");
        dataDetailHadits.add("a)\tHadis riwayat Jabir ra., ia berkata:\n" +
                "Seorang dari Bani Udzrah memerdekakan budaknya dengan syarat kematiannya (misalnya dengan mengatakan: Engkau merdeka, jika aku meninggal). Hal itu sampai kepada Rasulullah saw. lalu beliau bertanya: Apakah engkau mempunyai harta lain? Orang itu menjawab: Tidak. Rasulullah saw. bersabda: Siapakah yang mau membelinya dariku? Nu'aim bin Abdullah Al-Adawi membelinya dengan harga delapan ratus dirham. Lalu Rasulullah saw. membawa harga jual budak itu dan membayarkannya kepada orang tersebut (pemiliknya). Kemudian bersabda: Mulailah untuk dirimu, bersedekahlah untuk dirimu. Jika masih tersisa, maka berinfaklah kepada keluargamu dan jika masih tersisa, maka berinfaklah kepada kerabatmu. Bila dari kerabatmu masih tersisa, maka begini dan begini. Ia (Jabir) menjelaskan: Tetangga depanmu, tetangga kananmu dan tetangga kirimu. (Shahih Muslim No.1663)\n");
        dataDetailHadits.add("a)\tHadis riwayat Anas bin Malik ra., ia berkata:\n" +
                "Abu Thalhah adalah seorang sahabat Ansar yang paling banyak harta di Madinah. Dan harta yang paling ia sukai adalah kebun Bairaha. Kebun itu menghadap ke mesjid Nabawi. Rasulullah saw. biasa masuk ke kebun itu untuk minum airnya yang tawar. Anas berkata: Ketika turun ayat ini: Sekali-kali kalian tidak sampai kepada kebaikan (yang sempurna) sebelum kalian menafkahkan sebagian harta yang kalian cintai. Abu Thalhah datang kepada Rasulullah saw. dan berkata: Allah telah berfirman dalam kitab-Nya: Sekali-kali kalian tidak sampai kepada kebaikan (yang sempurna) sebelum kalian menafkahkan sebagian harta yang kalian cintai, sedangkan harta yang paling aku cintai adalah kebun Bairaha, maka kebun itu aku sedekahkan karena Allah. Aku mengharapkan kebaikan dan simpanannya (pahalanya di akhirat) di sisi Allah. Oleh sebab itu, pergunakanlah kebun itu, wahai Rasulullah, sekehendakmu. Rasulullah saw. bersabda: Bagus! Itu adalah harta yang menguntungkan, itu adalah harta yang menguntungkan. Aku telah mendengar apa yang engkau katakan mengenai kebun itu. Dan aku berpendapat, hendaknya kebun itu engkau berikan kepada kaum kerabatmu. Lalu Abu Thalhah membagi-bagi kebun itu dan memberikannya kepada kaum kerabat dan anak-anak pamannya. (Shahih Muslim No.1664)\n\n" +
                "b)\tHadis riwayat Maimunah binti Harits ra.:\n" +
                "Bahwa ia memerdekakan seorang budak pada zaman Rasulullah saw. Ketika hal itu ia tuturkan kepada Rasulullah saw, beliau bersabda: Seandainya budak itu engkau berikan kepada bibi-bibimu, tentu lebih besar lagi pahalamu. (Shahih Muslim No.1666)\n\n" +
                "c)\tHadis riwayat Zainab ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Bersedekahlah kalian, wahai kaum wanita, meskipun dari perhiasan kalian! Kemudian aku (Zainab) kembali kepada Abdullah, dan berkata: Engkau adalah seorang lelaki yang tidak banyak harta, sedangkan Rasulullah saw. telah memerintahkan kita untuk bersedekah, maka datanglah kepada beliau untuk menanyakan apakah cukup sedekahku aku berikan kepadamu. Jika tidak, aku akan berikan kepada selain engkau. Abdullah berkata: Engkau sajalah yang datang menemui beliau. Lalu berangkat, ternyata di depan pintu rumah Rasulullah saw. sudah ada seorang wanita Ansar yang sama keperluannya dengan keperluanku. Pada saat itu Rasulullah saw. sedang merasa segan, lalu Bilal keluar menemui kami. Kami berkata kepadanya: Temuilah Rasulullah saw. beritahukan kepada beliau bahwa ada dua orang wanita di depan pintu yang ingin bertanya: Apakah cukup sedekah keduanya diberikan kepada suami mereka dan kepada anak-anak yatim yang berada dalam tanggungan mereka? Tapi jangan katakan siapa kami. Lalu Bilal masuk menemui Rasulullah saw. dan bertanya kepada beliau. Rasulullah saw. bertanya: Siapakah mereka berdua? Bilal menjawab: Seorang wanita Ansar dan Zainab. Rasulullah saw. bertanya: Zainab yang mana? Bilal menjawab: Istri Abdullah. Rasulullah saw. bersabda kepada Bilal: Mereka berdua mendapatkan dua pahala, pahala kerabat dan pahala sedekah. (Shahih Muslim No.1667)\n\n" +
                "d)\tHadis riwayat Ummu Salamah ra., ia berkata:\n" +
                "Aku pernah bertanya kepada Rasulullah saw.: Wahai Rasulullah, Apakah aku mendapatkan pahala bila aku memberi nafkah kepada anak-anak Abu Salamah, aku tidak dapat membiarkan mereka ke sana ke mari (mencari rezeki), bagaimanapun mereka juga anak-anakku. Rasulullah saw. bersabda: Ya, engkau mendapatkan pahala apa yang engkau nafkahkan kepada mereka. (Shahih Muslim No.1668)\n\n" +
                "e)\tHadis riwayat Abu Masud Al-Badri ra.:\n" +
                "Dari Nabi saw., beliau bersabda: Sesungguhnya seorang muslim, jika memberikan nafkah kepada keluarganya dan ia mengharap pahala darinya, maka nafkahnya itu menjadi sedekah baginya. (Shahih Muslim No.1669)\n\n" +
                "f)\tHadis riwayat Asma ra., ia berkata:\n" +
                "Aku bertanya kepada Rasulullah saw.: Wahai Rasulullah, ibuku (seorang musyrik) datang kepadaku mengharap bakti dariku. Apakah aku harus berbakti kepadanya? Rasulullah saw. bersabda: Ya. (Shahih Muslim No.1670)\n");
        dataDetailHadits.add("a)\tHadis riwayat Aisyah ra.:\n" +
                "Bahwa seorang lelaki datang kepada Nabi saw. dan berkata: Wahai Rasulullah, ibuku meninggal dunia mendadak dan tidak sempat berwasiat. Tetapi aku menduga seandainya ia dapat berbicara, tentu ia akan bersedekah. Apakah ia mendapat pahala jika aku bersedekah untuknya? Rasulullah saw. bersabda: Ya. (Shahih Muslim No.1672)\n");
        dataDetailHadits.add("Hadis riwayat Abu Musa ra.:\n" +
                "Dari Nabi saw., beliau bersabda: Setiap muslim wajib bersedekah. Ditanyakan: Apa pendapatmu jika ia tidak mempunyai sesuatu (untuk bersedekah)? Rasulullah saw. bersabda: Dia bekerja dengan kedua tangannya, sehingga ia dapat memberi manfaat dirinya dan bersedekah. Ditanyakan pula: Apa pendapatmu, jika ia tidak mampu? Rasulullah saw. bersabda: Dia dapat membantu orang dalam keperluan mendesak. Ditanyakan lagi: Apa pendapatmu, bila tidak mampu? Rasulullah saw. bersabda: Dia dapat memerintahkan kebaikan. Masih ditanyakan lagi: Apa pendapatmu jika ia tidak melakukannya? Rasulullah saw. bersabda: Dia dapat menahan diri dari berbuat kejahatan, karena itu adalah sedekah. (Shahih Muslim No.1676)\n\n" +
                "b)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Setiap ruas tulang manusia wajib bersedekah setiap hari, di mana matahari terbit. Selanjutnya beliau bersabda: Berlaku adil antara dua orang adalah sedekah, membantu seseorang (yang kesulitan menaikkan barang) pada hewan tunggangannya, lalu ia membantu menaikkannya ke atas punggung hewan tunggangannya atau mengangkatkan barang-barangnya adalah sedekah. Rasulullah saw. juga bersabda: Perkataan yang baik adalah sedekah, setiap langkah yang dikerahkan menuju salat adalah sedekah dan menyingkirkan duri dari jalan adalah sedekah. (Shahih Muslim No.1677)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Setiap hari, di mana para hamba memasuki waktu pagi, pasti ada dua malaikat yang turun. Satu di antara keduanya berdoa: \"Ya Allah, berikanlah ganti kepada orang yang berinfak\", dan yang satu lagi berdoa: \"Ya Allah, berikanlah kemusnahan (kerugian) kepada orang yang enggan berinfak\". (Shahih Muslim No.1678)\n");
        dataDetailHadits.add("a)\tHadis riwayat Haritsah bin Wahab ra., ia berkata:\n" +
                "Aku mendengar Rasulullah saw. bersabda: Bersedekahlah kalian, karena hampir saja seseorang berjalan membawa sedekahnya, lalu orang yang hendak diberi sedekah berkata: Seandainya engkau memberikan kepadaku kemarin, tentu aku menerimanya. Sekarang aku tidak lagi memerlukannya. Orang itu tidak menemukan orang yang mau menerima sedekahnya. (Shahih Muslim No.1679)\n\n" +
                "b)\tHadis riwayat Abu Musa ra.:\n" +
                "Dari Nabi saw., beliau bersabda: Pasti akan datang kepada manusia suatu zaman, di mana seseorang berkeliling membawa sedekah emas, lalu ia tidak menemukan seorang pun yang mau mengambilnya. Dan terlihat seseorang diikuti oleh empat puluh orang wanita yang berlindung kepadanya karena sedikitnya kaum lelaki dan banyaknya kaum wanita. (Shahih Muslim No.1680)\n\n" +
                "c)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Bahwa Rasulullah saw. bersabda: Tidak akan terjadi hari kiamat sebelum harta menjadi banyak dan melimpah, sampai-sampai seseorang yang hendak mengeluarkan zakat hartanya tidak mendapati orang yang mau menerimanya dan sampai tanah Arab kembali menjadi padang gembala dan sungai-sungai. (Shahih Muslim No.1681)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Tidaklah seorang yang bersedekah dengan harta yang baik, Allah tidak menerima kecuali yang baik, kecuali (Allah) Yang Maha Pengasih akan menerima sedekah itu dengan tangan kanan-Nya. Jika sedekah itu berupa sebuah kurma, maka di tangan Allah yang Maha Pengasih, sedekah itu akan bertambah sampai menjadi lebih besar dari gunung, sebagaimana seseorang di antara kalian membesarkan anak kudanya atau anak untanya. (Shahih Muslim No.1684).\n");
        dataDetailHadits.add("a)\tHadis riwayat Adi bin Hatim ra., ia berkata:\n" +
                "Aku mendengar Nabi saw. bersabda: Barang siapa di antara kalian mampu berlindung dari neraka walau hanya dengan separoh kurma, maka hendaklah ia melakukannya (bersedekah). (Shahih Muslim No.1687)\n");
        dataDetailHadits.add("Hadis riwayat Abu Masud ra., ia berkata:\n" +
                "Ketika kami diperintahkan untuk bersedekah, kami menjadi kuli angkut (dan kami bersedekah dari upah pekerjaan itu). Abu Aqil bersedekah dengan setengah sha`. Seseorang membawa sedekah sedikit lebih banyak darinya. Orang-orang munafik berkata: Sesungguhnya Allah tidak butuh sedekah orang ini, orang ini melakukan hal itu hanya untuk pamer. Lalu turunlah ayat: yaitu orang-orang yang mencela orang-orang mukmin yang memberi sedekah dengan sukarela dan mencela orang-orang yang tidak mendapatkan \"sesuatu untuk disedekahkan\" selain sekedar jerih payahnya. (Shahih Muslim No.1692)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Bahwa Nabi saw. bersabda: Ingatlah, bahwa seseorang yang memberikan unta perah kepada anggota keluarganya, yang dapat menghasilkan sepanci besar susu setiap keluar di pagi dan sore, maka pahalanya sungguh sangat besar. (Shahih Muslim No.1693)\n\n" +
                "b)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Dari Nabi saw. bahwa beliau melarang beberapa hal lalu menyebutkan beberapa perangai dan bersabda: Barang siapa memberi pinjaman unta, maka unta itu memasuki waktu pagi dengan sedekah dan memasuki waktu sore dengan sedekah, yakni susunya di pagi hari dan di sore hari itu. (Shahih Muslim No.1694)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Dari Nabi saw., beliau bersabda: Perumpamaan orang yang berinfak dan orang yang bersedekah adalah seperti seorang lelaki yang mengenakan dua jubah atau dua baju besi mulai dadanya sampai ke atas. Apabila orang yang berinfak hendak berinfak, (dalam riwayat lain) Apabila orang yang bersedekah hendak bersedekah, maka baju itu menjadi longgar padanya. Dan kalau orang bakhil hendak berinfak, maka baju itu menjadi sesak dan terasa kecil, sehingga dapat menutupi jari-jarinya dan menghapus jejaknya. Lalu ia berkata: Kata Abu Hurairah ra.: Kemudian beliau bersabda: Orang yang bakhil ingin melonggarkan pakaiannya, tetapi tidak longgar. (Shahih Muslim No.1695)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Dari Nabi saw., beliau bersabda: Seorang lelaki berkata: Sungguh aku akan mengeluarkan sedekah pada malam ini. Lalu ia keluar membawa sedekahnya dan jatuh ke tangan seorang wanita pezina. Pada pagi harinya, orang banyak membicarakan: Tadi malam, seorang wanita pezina mendapatkan sedekah. Lelaki itu mengucap: Ya Allah, hanya bagi-Mu segala puji, (sedekahku jatuh pada wanita pezina). Aku akan bersedekah lagi. Dia keluar membawa sedekahnya dan jatuh ke tangan orang kaya. Pada pagi harinya, orang banyak membicarakan: Sedekah diberikan kepada orang kaya. Orang itu mengucap: Ya Allah, hanya bagi-Mu segala puji, (sedekahku jatuh pada orang kaya). Aku akan bersedekah lagi. Kemudian ia keluar membawa sedekah dan jatuh ke tangan pencuri. Pada pagi harinya, orang banyak membicarakan: Sedekah diberikan kepada pencuri. Orang itu mengucap: Ya Allah, hanya bagi-Mu segala puji, sedekahku ternyata jatuh pada wanita pezina, pada orang kaya dan pada pencuri. Lalu ia didatangi (malaikat) dan dikatakan kepadanya: Sedekahmu benar-benar telah diterima. Boleh jadi wanita pezina itu akan menghentikan perbuatan zinanya, karena sedekahmu, orang kaya dapat mengambil pelajaran dan mau memberikan sebagian apa yang telah diberikan Allah kepadanya. Dan mungkin saja si pencuri menghentikan perbuatan mencurinya, karena sedekahmu. (Shahih Muslim No.1698)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Musa ra.:\n" +
                "Dari Nabi saw., beliau bersabda: Sesungguhnya bendahara muslim lagi tepercaya adalah yang melaksanakan (kemungkinan juga beliau bersabda: memberikan) apa yang diperintahkan. Kemudian ia memberikannya sempurna dan banyak dengan jiwa yang baik, lalu ia menyerahkannya kepada orang yang diperintahkan salah seorang yang bersedekah untuk diberikan sedekah. (Shahih Muslim No.1699)\n\n" +
                "b)\tHadis riwayat Aisyah ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Apabila seorang wanita berinfak dari makanan rumahnya yang tidak rusak, maka ia mendapat pahala dari apa yang telah ia infakkan dan suaminya mendapatkan pahala dengan apa yang telah diusahakan. Demikian pula, bendahara (mendapat pahala) seperti pahala orang yang bersedekah, sebagian mereka tidak mengurangi sedikit pun pahala sebagian yang lain. (Shahih Muslim No.1700)\n\n" +
                "c)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Wanita yang suaminya ada, tidak boleh berpuasa kecuali dengan izinnya dan tidak boleh mengizinkan orang lain masuk rumah suaminya, saat suaminya ada kecuali dengan izinnya. Dan apapun yang ia infakkan dari hasil kerja suaminya tanpa perintah suaminya, maka separoh pahalanya adalah milik suaminya. (Shahih Muslim No.1704)\n");
       dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
               "Bahwa Rasulullah saw. bersabda: Barang siapa berinfak dengan sepasang (kuda, unta dan sebagainya) di jalan Allah, maka di surga ia dipanggil: Wahai hamba Allah, pintu ini adalah lebih baik. Barang siapa termasuk ahli salat, maka ia dipanggil dari pintu salat. Barang siapa termasuk ahli jihad, maka ia dipanggil dari pintu jihad. Barang siapa termasuk ahli sedekah, maka ia dipanggil dari pintu sedekah. Dan barang siapa termasuk ahli puasa, maka ia dipanggil dari pintu Rayyan. Abu Bakar Sidik bertanya: Wahai Rasulullah, apakah setiap orang pasti dipanggil dari pintu-pintu tersebut. Apakah mungkin seseorang dipanggil dari semua pintu? Rasulullah saw. bersabda: Ya, dan aku berharap engkau termasuk di antara mereka (yang dipanggil dari semua pintu). (Shahih Muslim No.1705)\n");
        dataDetailHadits.add("a)\tHadis riwayat Asma binti Abu Bakar ra., ia berkata:\n" +
                "Rasulullah saw. bersabda kepadaku: Berinfaklah atau memberilah dan jangan menghitung-hitung, karena Allah akan memperhitungkannya untukmu. (Shahih Muslim No.1708)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Bahwa Rasulullah saw. pernah bersabda: Wahai para wanita muslimah, jangan sekali-kali seseorang meremehkan pemberian tetangganya, meskipun hanya berupa teracak (kuku) kambing. (Shahih Muslim No.1711)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Dari Nabi saw., beliau bersabda: Ada tujuh golongan yang bakal dinaungi oleh Allah di bawah naungan-Nya, pada hari yang tidak ada naungan kecuali naungan-Nya, yaitu: Pemimpin yang adil, pemuda yang tumbuh dengan ibadah kepada Allah (selalu beribadah), seseorang yang hatinya bergantung kepada mesjid (selalu melakukan salat jamaah di dalamnya), dua orang yang saling mengasihi di jalan Allah, keduanya berkumpul dan berpisah karena Allah, seorang yang diajak perempuan berkedudukan dan cantik (untuk berzina), tapi ia mengatakan: Aku takut kepada Allah, seseorang yang memberikan sedekah kemudian merahasiakannya sampai tangan kanannya tidak tahu apa yang dikeluarkan tangan kirinya dan seseorang yang berzikir (mengingat) Allah dalam kesendirian, lalu meneteskan air mata dari kedua matanya. (Shahih Muslim No.1712)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Seorang lelaki datang kepada Rasulullah saw. lalu berkata: Wahai Rasulullah, sedekah manakah yang paling agung? Rasulullah saw. bersabda: Engkau bersedekah ketika engkau engkau sehat lagi kikir dan sangat memerlukan, engkau takut miskin dan sangat ingin menjadi kaya. Jangan engkau tunda-tunda sampai nyawa sudah sampai di kerongkongan, baru engkau berpesan: Berikan kepada si fulan sekian dan untuk si fulan sekian. Ingatlah, memang pemberian itu hak si fulan. (Shahih Muslim No.1713)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abdullah bin Umar ra.:\n" +
                "Bahwa Rasulullah saw. ketika berada di atas mimbar, beliau menuturkan tentang sedekah dan menjaga diri dari meminta. Beliau bersabda: Tangan yang di atas lebih baik dari tangan yang di bawah. Tangan yang di atas adalah yang memberi dan yang di bawah adalah yang meminta. (Shahih Muslim No.1715)\n\n" +
                "b)\tHadis riwayat Hakim bin Hizam ra.:\n" +
                "Bahwa Rasulullah saw. bersabda: Sedekah yang paling utama atau sedekah yang paling baik adalah sedekah dari harta yang cukup. Tangan yang di atas lebih baik dari tangan yang di bawah. Mulailah dari orang yang engkau tanggung (nafkahnya). (Shahih Muslim No.1716)\n");
        dataDetailHadits.add("Hadis riwayat Muawiyah ra., ia berkata:\n" +
                "Aku mendengar Rasulullah saw. bersabda: Sesungguhnya aku ini hanyalah bendaharawan, maka barang siapa aku berikan dan kebaikan hatiku, maka ia mendapat keberkahan dan barang siapa yang aku berikan karena ia meminta, maka ia seperti orang yang makan dan tidak akan kenyang. (Shahih Muslim No.1719)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Bahwa Rasulullah saw. bersabda: Orang miskin itu bukanlah orang yang berkeliling meminta-minta kepada manusia, lalu ia diberikan sesuap, dua suap, sebuah dan dua buah kurma. Para sahabat bertanya: Kalau begitu, siapakah orang miskin itu, wahai Rasulullah? Rasulullah saw. bersabda: Orang yang tidak menemukan harta yang mencukupinya tapi orang-orang tidak tahu (karena kesabarannya, ia menyembunyikan keadaannya dan tidak meminta-minta kepada orang lain), lalu diberi sedekah tanpa meminta sesuatu pun kepada manusia. (Shahih Muslim No.1722)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abdullah bin Umar ra.:\n" +
                "Bahwa Nabi saw. bersabda: Masih saja seorang engkau meminta-minta hingga ia bertemu Allah dengan wajah tidak berdaging (karena hinanya). (Shahih Muslim No.1724)\n" +
                "b)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Aku mendengar Rasulullah saw. bersabda: Sungguh, jika salah seorang di antara kalian berangkat pagi untuk mencari kayu yang ia panggul di atas punggungnya, lalu ia menyedekahkannya dan tidak memerlukan pemberian manusia, maka itu adalah lebih baik daripada ia meminta kepada seseorang, baik orang lain itu memberinya ataupun tidak. Karena, tangan yang di atas (yang memberi) lebih utama dari tangan yang di bawah (yang menerima). Dan mulailah dengan orang yang engkau tanggung. (Shahih Muslim No.1727)\n");
        dataDetailHadits.add("a)\tHadis riwayat Umar bin Khathab ra., ia berkata:\n" +
                "Rasulullah saw. pernah memberiku suatu pemberian, lalu aku berkata: Berikanlah saja kepada orang yang lebih memerlukannya dariku. Pada lain kali beliau memberiku uang, aku berkata: Berikanlah kepada orang yang lebih memerlukannya dariku. Lalu Rasulullah saw. bersabda: Ambillah! Apapun harta yang datang kepadamu, sedangkan engkau tidak tamak dan tidak meminta, maka ambillah dan apa yang datang kepadamu, maka janganlah engkau jiwamu mengikutinya. (Shahih Muslim No.1731)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Bahwa Nabi saw. bersabda: Hati orang tua menjadi muda karena mencintai dua hal; suka dengan kehidupan dan harta. (Shahih Muslim No.1734)\n\n" +
                "b)\tHadis riwayat Anas bin Malik ra., ia berkata:\n" +
                "Rasulullah saw. bersada: Anak cucu Adam menjadi semakin tua, kecuali pada dua hal yang membuatnya menjadi muda, yaitu loba terhadap harta dan loba terhadap umur. (Shahih Muslim No.1736)\n");
        dataDetailHadits.add("a)\tHadis riwayat Anas bin Malik ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Seandainya anak cucu Adam mempunyai dua lembah harta, tentu ia masih menginginkan yang ketiga. Padahal yang memenuhi perut anak cucu Adam hanyalah tanah. Dan Allah menerima tobat orang yang mau bertobat. (Shahih Muslim No.1737)\n\n" +
                "b)\tHadis riwayat Ibnu Abbas ra., ia berkata:\n" +
                "Aku mendengar Rasulullah saw. bersabda: Seandainya anak cucu Adam mempunyai harta sepenuh lembah, tentu ia masih ingin memiliki yang ketiga. Padahal yang mengisi perut anak cucu Adam itu hanyalah tanah. Dan Allah selalu menerima tobat orang-orang yang mau bertobat. (Shahih Muslim No.1739)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Rasulullah saw. bersabda: Kaya itu bukanlah lantaran banyak harta. Tetapi, kaya itu adalah kaya hati. (Shahih Muslim No.1741)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Said Al-Khudri ra., ia berkata:\n" +
                "Rasulullah saw. berdiri berkhutbah kepada kaum muslimin. Beliau bersabda: Tidak, demi Allah, aku tidak khawatir atas kalian, wahai manusia, kecuali terhadap keindahan dunia yang dikeluarkan Allah untuk kalian. Seseorang bertanya: Wahai Rasulullah, apakah kebaikan dapat mendatangkan keburukan? Rasulullah, saw. diam sejenak, kemudian beliau bersabda: Apa yang engkau tanyakan? Aku mengulangi pertanyaan: Wahai Rasulullah, apakah kebaikan itu dapat mendatangkan keburukan? Rasulullah saw. menjawab: Kebaikan (yang hakiki) itu hanya akan mendatangkan kebaikan. Apakah dapat dikatakan kebaikan, yang engkau dapat dari keindahan dunia itu? Setiap yang tumbuh pada musim semi itu dapat membunuh karena kekenyangan atau nyaris membunuh, kecuali ternak yang makan. Ternak itu makan, sampai ketika kedua lambungnya telah penuh, ia menghadap ke arah matahari untuk membuang kotoran encer atau kencing, kemudian memamah dan kembali makan. Barang siapa mengambil harta sesuai dengan haknya, maka ia diberkati dalam harta itu. Dan barang siapa mengambil harta tidak menurut haknya, maka ia seperti orang yang makan tapi tidak pernah kenyang. (Shahih Muslim No.1742)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Said Al-Khudri ra.:\n" +
                "Bahwa sebagian orang Ansar meminta kepada Rasulullah saw., maka beliau memberi mereka. Kemudian mereka meminta lagi, beliau pun memberi mereka, sampai ketika telah habis sesuatu yang ada pada beliau, beliau bersabda: Apapun kebaikan yang ada padaku, maka aku tidak akan menyembunyikannya dari kalian. Barang siapa menjaga kehormatan diri, maka Allah akan menjaga kehormatan dirinya. Barang siapa yang merasa cukup, maka Allah akan mencukupinya. Barang siapa yang bersabar, maka Allah akan membuatnya sabar. Seseorang tidak diberi suatu pemberian yang lebih baik dan lebih luas daripada kesabaran. (Shahih Muslim No.1745)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Rasulullah saw. berdoa: \"Ya Allah jadikan rezeki keluarga Muhammad cukup untuk satu hari saja\". (Shahih Muslim No.1747)\n");

        dataDetailHadits.add("a)\tHadis riwayat Anas bin Malik ra., ia berkata:\n" +
                "Aku pernah berjalan bersama Rasulullah saw. Beliau mengenakan selendang dari Najran yang kasar pinggirnya. Tiba-tiba seorang badui berpapasan dengan beliau, lalu menarik selendang beliau dengan kuat. Ketika aku memandang ke sisi leher Rasulullah saw. ternyata pinggiran selendang telah membekas di sana, karena kuatnya tarikan. Orang itu kemudian berkata: Hai Muhammad, berikan aku sebagian dari harta Allah yang ada padamu. Rasulullah saw. berpaling kepadanya, lalu tertawa dan memberikan suatu pemberian kepadanya. (Shahih Muslim No.1749)\n\n" +
                "b)\tHadis riwayat Miswar bin Makhramah ra., ia berkata\n" +
                "Rasulullah saw. membagi-bagikan pakaian luar, tetapi tidak memberikan sesuatu pun kepada Makhramah. Lalu Makhramah berkata kepadaku (Miswar): Wahai anakku, marilah berangkat bersamaku menemui Rasulullah saw. Aku berangkat bersamanya. Ia berkata: Masuklah dan panggilkan beliau untukku. Aku memanggilkannya, lalu beliau keluar dengan membawa selembar pakaian luar dan bersabda: Aku menyimpan ini untukmu. Aku memandang beliau, lalu beliau bersabda: Mudah-mudahan Makhramah senang. (Shahih Muslim No.1750)\n");
        dataDetailHadits.add("a)\tHadis riwayat Anas bin Malik ra.:\n" +
                "Bahwa pada waktu perang Hunain, ketika Allah menganugerahkan fa'i jarahan kepada Rasulullah saw., berupa harta-harta kabilah Hawazin, ketika Rasulullah saw. mulai membagikan para pemuka Quraisy seratus ekor unta, orang-orang Ansar berkata: Semoga Allah mengampuni Rasulullah saw., beliau memberikan para pemuka Quraisy dan meninggalkan kami (tidak memberi kami), sedangkan pedang-pedang kami masih meneteskan darah mereka. Anas bin Malik berkata: Rasulullah saw. diceritakan tentang ucapan mereka. Lalu beliau memanggil orang-orang Ansar. Beliau mengumpulkan mereka dalam sebuah kemah dari kulit yang disamak. Setelah semua berkumpul, Rasulullah saw. datang dan bertanya: Pembicaraan apa yang sampai kepadaku dari kalian? Orang Ansar yang paham menjawab: Orang-orang yang paham di antara kami wahai Rasulullah, tidak mengatakan apa-apa. Sedangkan orang-orang yang masih muda di antara kami mengatakan: Semoga Allah mengampuni Rasul-Nya, beliau memberi orang Quraisy dan meninggalkan kami, sedangkan pedang-pedang kami masih meneteskan darah mereka. Rasulullah saw. bersabda: Sungguh, aku memberikan (harta rampasan) kepada orang-orang yang baru saja meninggalkan kekafiran adalah untuk mengokohkan hati mereka. Tidakkah kalian rela jika mereka pergi mendapatkan harta, sedangkan kalian kembali ke rumah kalian bersama Rasul (utusan Allah)? Demi Allah, apa yang kalian bawa pulang itu lebih baik dari apa yang mereka bawa. Mereka berkata: Ya, wahai Rasulullah, kami rela. Beliau bersabda: Sungguh, kalian akan mendapati pilihan berat, maka bersabarlah kalian hingga kalian bertemu Allah dan Rasul-Nya (sampai mati) dan berada di telaga. Mereka berkata: Kami akan bersabar (tetap bersama baginda). (Shahih Muslim No.1753)\n\n" +
                "b)\tHadis riwayat Abdullah bin Zaid ra.:\n" +
                "Bahwa Rasulullah saw. membagi-bagikan harta rampasan perang ketika memenangkan perang Hunain. Beliau memberi orang-orang yang hendak dibujuk hatinya (orang yang baru masuk Islam). Lalu sampai berita kepadanya bahwa orang-orang Ansar ingin mendapatkan seperti apa yang diperoleh oleh mereka. Maka Rasulullah saw. berdiri menyampaikan pidato kepada mereka. Setelah memuji dan menyanjung Allah, beliau bersabda: Hai orang-orang Ansar, bukankah aku temukan kalian dalam keadaan sesat, lalu Allah menunjuki kalian dengan sebab kau? Bukankah aku temukan kalian dalam keadaan miskin, lalu Allah membuat kalian kaya dengan sebab aku? Bukankah aku temukan kalian dalam keadaan terpecah-belah, lalu Allah mempersatukan kalian dengan sebab aku? orang-orang Ansar menjawab: Allah dan Rasul-Nya lebih berhak mengungkit-ungkit. Kemudian beliau bersabda: Mengapa kalian tidak menjawabku? Mereka berkata: Allah dan Rasul-Nya lebih berhak mengungkit-ungkit. Beliau bersabda: Kalian boleh saja berkata begini dan begini pada masalah begini dan begini. (Beliau menyebutkan beberapa hal. Amru, perawi hadis mengira ia tidak dapat menghafalnya). Selanjutnya beliau bersabda: Tidakkah kalian rela jika orang lain pergi dengan membawa kambing-kambing dan unta dan kalian pergi bersama Rasulullah ke tempat kalian? Orang-orang Ansar itu bagaikan pakaian dalam dan orang lain seperti pakaian luar (maksudnya orang Ansarlah yang paling dekat di hati Nabi saw.) Seandainya tidak ada hijrah, tentu aku adalah salah seorang di antara golongan Ansar. Seandainya orang-orang melalui lembah dan lereng, tentu aku melalui lembah dan celah orang-orang Ansar. Kalian pasti akan menemukan keadaan yang tidak disukai sepeninggalku. Karena itu, bersabarlah kalian hingga kalian bertemu denganku di atas telaga (pada hari kiamat). (Shahih Muslim No.1758)\n\n" +
                "\n" +
                "c)\tHadis riwayat Abdullah bin Masud ra., ia berkata:\n" +
                "Ketika hari perang Hunain, Rasulullah saw. mengutamakan beberapa orang dalam pembagian. Beliau memberi Aqra` bin Habis seratus ekor unta, memberikan kepada Uyainah dan beberapa para memuka Arab. Ketika itu beliau saw. mengutamakan mereka dalam pembagian. Lalu seseorang berkata: Demi Allah, sungguh ini adalah pembagian yang sama sekali tidak adil dan tidak dikehendaki Allah. Aku (Abdullah) berkata: Demi Allah, aku pasti akan menyampaikannya kepada Rasulullah saw. Aku datang kepada Rasulullah saw. dan memberitahu beliau tentang ucapan orang tersebut. Mendengar itu, wajah beliau berubah kemerah-merahan, kemudian bersabda: Siapa lagi yang dapat berbuat adil, jika Allah dan Rasul-Nya tidak berbuat adil? Kemudian beliau melanjutkan: Semoga Allah memberikan rahmat kepada Nabi Musa. Dia telah disakiti hatinya (oleh kaumnya) lebih banyak dari ini, tetapi ia tetap sabar. Aku berkata: Sesudah ini aku tidak melaporkan pembicaraan apapun kepada beliau. (Shahih Muslim No.1759)\n");
        dataDetailHadits.add("a)\tHadis riwayat Jabir bin Abdullah ra., ia berkata:\n" +
                "Seseorang datang kepada Rasulullah saw. di Ji`ranah sepulang dari perang Hunain. Pada pakaian Bilal terdapat perak. Dan Rasulullah saw. mengambilnya untuk diberikan kepada manusia. Orang yang datang itu berkata: Hai Muhammad, berlaku adillah! Beliau bersabda: Celaka engkau! Siapa lagi yang bertindak adil, bila aku tidak adil? Engkau pasti akan rugi, jika aku tidak adil. Umar bin Khathab ra. berkata: Biarkan aku membunuh orang munafik ini, wahai Rasulullah. Beliau bersabda: Aku berlindung kepada Allah dari pembicaraan orang bahwa aku membunuh sahabatku sendiri. Sesungguhnya orang ini dan teman-temannya memang membaca Alquran, tetapi tidak melampaui tenggorokan mereka. Mereka keluar dari Islam secepat anak panah melesat dari busurnya. (Shahih Muslim No.1761)\n\n" +
                "b)\tHadis riwayat Abu Said Al-Khudri ra., ia berkata:\n" +
                "Ali ra. yang sedang berada di Yaman, mengirimkan emas yang masih dalam bijinya kepada Rasulullah saw., kemudian Rasulullah saw. membagikannya kepada beberapa orang, Aqra` bin Habis Al-Hanzhali, Uyainah bin Badr Al-Fazari, Alqamah bin Ulatsah Al-Amiri, seorang dari Bani Kilab, Zaidul Khair At-Thaiy, seorang dari Bani Nabhan. Orang-orang Quraisy marah dan berkata: Apakah baginda memberi para pemimpin Najed, dan tidak memberikan kepada kami? Rasulullah saw. bersabda: Aku melakukan itu adalah untuk mengikat hati mereka. Kemudian datang seorang lelaki yang berjenggot lebat, kedua tulang pipinya menonjol, kedua matanya cekung, jidatnya jenong dan kepalanya botak. Ia berkata: Takutlah kepada Allah, ya Muhammad! Rasulullah saw. bersabda: Siapa lagi yang taat kepada Allah jika aku mendurhakai-Nya? Apakah Dia mempercayai aku atas penduduk bumi, sedangkan kamu tidak mempercayai aku? Lalu laki-laki itu pergi. Seseorang di antara para sahabat minta izin untuk membunuh laki-laki itu (diriwayatkan bahwa orang yang ingin membunuh itu adalah Khalid bin Walid), tetapi Rasulullah saw. bersabda: Sesungguhnya diantara bangsaku ada orang-orang yang membaca Alquran tapi tidak melampaui tenggorokan mereka. Mereka membunuh orang Islam dan membiarkan penyembah berhala. Mereka keluar dari Islam secepat anak panah melesat dari busurnya. Sungguh, jika aku mendapati mereka, pasti aku akan bunuh mereka seperti terbunuhnya kaum Aad. (Shahih Muslim No.1762)\n");
        dataDetailHadits.add("a)\tHadis riwayat Ali ra., ia berkata:\n" +
                "Aku mendengar Rasulullah saw. bersabda: Di akhir zaman akan muncul kaum yang muda usia dan lemah akal. Mereka berbicara dengan pembicaraan yang seolah-olah berasal dari manusia yang terbaik. Mereka membaca Alquran, tetapi tidak melampaui tenggorokan mereka. Mereka keluar dari agama, secepat anak panah meluncur dari busur. Apabila kalian bertemu dengan mereka, maka bunuhlah mereka, karena membunuh mereka berpahala di sisi Allah pada hari kiamat. (Shahih Muslim No.1771)\n");
        dataDetailHadits.add("a)\tHadis riwayat Sahal bin Hunaif ra.:\n" +
                "Dari Yusair bin Amru, ia berkata: Saya berkata kepada Sahal: Apakah engkau pernah mendengar Nabi saw. menyebut-nyebut Khawarij? Sahal menjawab: Aku mendengarnya, ia menunjuk dengan tangannya ke arah Timur, mereka adalah kaum yang membaca Alquran dengan lisan mereka, tetapi tidak melampaui tenggorokan mereka. Mereka keluar dari agama secepat anak panah melesat dari busurnya. (Shahih Muslim No.1776)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra., ia berkata:\n" +
                "Suatu ketika Hasan bin Ali mengambil sebuah kurma dari kurma sedekah (zakat) dan hendak memasukkannya ke dalam mulutnya, kemudian Rasulullah saw. bersabda: Hai, hai, buang itu! Tidakkah engkau tahu bahwa kita tidak boleh makan sedekah (zakat)?. (Shahih Muslim No.1778)\n\n" +
                "b)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Dari Rasulullah saw. bahwa beliau bersabda: Aku kembali kepada keluargaku, lalu aku menemukan sebuah kurma yang jatuh di atas pembaringanku. Kemudian aku mengambilnya untuk aku makan, tetapi aku khawatir kurma itu kurma sedekah, maka aku membuangnya. (Shahih Muslim No.1779)\n\n" +
                "c)\tHadis riwayat Anas bin Malik ra.:\n" +
                "Bahwa Nabi saw. menemukan sebuah kurma, lalu beliau bersabda: Seandainya kurma itu bukan kurma sedekah, maka aku akan memakannya. (Shahih Muslim No.1781)\n");
       dataDetailHadits.add("a)\tHadis riwayat Anas ra., ia berkata:\n" +
               "Barirah menghadiahkan daging kepada Nabi saw. Daging tersebut adalah sedekah untuknya (Barirah). Rasulullah saw. bersabda: Daging itu baginya adalah sedekah, sedangkan bagi kami adalah hadiah. (Shahih Muslim No.1786)\n\n" +
               "b)\tHadis riwayat Aisyah ra.:\n" +
               "Bahwa Nabi saw. diberi daging sapi dan dikatakan: Ini adalah daging yang disedekahkan kepada Barirah. Beliau bersabda: Baginya adalah sedekah dan bagi kami adalah hadiah. (Shahih Muslim No.1787)\n\n" +
               "\n" +
               "c)\tHadis riwayat Ummu Athiyyah ra., ia berkata:\n" +
               "Rasulullah saw. mengirimkan kambing sedekah (zakat). Lalu aku mengirimkan sebagiannya kepada Aisyah ra. Ketika Rasulullah saw. datang kepada Aisyah ra. beliau bertanya: Apakah kalian mempunyai sesuatu? Aisyah ra. menjawab: Tidak, kecuali bahwa Nusaibah (Ummu Athiyyah) mengirimkan kepada kita sebagian kambing yang baginda kirimkan kepadanya. Rasulullah saw. bersabda: Kambing itu telah mencapai kehalalannya (hilang hukum sedekah sehingga menjadi halal bagi kita). (Shahih Muslim No.1789)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abu Hurairah ra.:\n" +
                "Bahwa Nabi saw. biasanya bila dibawakan makanan, beliau selalu menanyakannya terlebih dahulu. Jika dikatakan bahwa makanan itu adalah hadiah, maka beliau memakannya. Dan kalau dikatakan bahwa itu adalah sedekah, maka beliau tidak mau memakannya. (Shahih Muslim No.1790)\n");
        dataDetailHadits.add("a)\tHadis riwayat Abdullah bin Abu Aufa ra., ia berkata:\n" +
                "Rasulullah saw. bila didatangi oleh orang-orang yang membawa sedekah mereka, beliau berdoa: \"Ya Allah, rahmatilah mereka\". Ketika ayahku, Abu Aufa datang membawa sedekahnya, beliau berdoa: Ya Allah, rahmatilah keluarga Abu Aufa. (Shahih Muslim No.1791)\n");
        return dataDetailHadits.get(position).toString();
    }


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
