package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. Buat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();



        // TODO 5. Masukkan data ke List
        for (int i=0; i< 5; i++) {
            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Olahan Cumi Ala Resto");
            resep1.setPoster(R.drawable.cumigorengtelurasin);
            resep1.setSummary("Hidangan ini akan cukup mudah untuk anda olah dan dipraktikan di rumah. " +
                    "Betapa tidak, resep kali ini telah kami rangkum sesederhana mungkin sehingga mampu memberikan sajian " +
                    "yang mudah untuk ditiru.");
            resep1.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan : 15 menit\n" +
                    "Memasak : 20 menit\n" +
                    "Total : 35 Menit\n" +
                    "\n" +
                    "Bahan-Bahan:\n" +
                    "\n" +
                    "500 gram cumi\n" +
                    "minyak goreng untuk menggoreng\n" +
                    "1/2 sendok makan air jeruk nipis\n" +
                    "3/4 sendok teh garam\n\n" +
                    "Bahan Pelapis:\n" +
                    "50 gram tepung terigu\n" +
                    "1/4 sendok teh garam\n" +
                    "50 gram maizena\n" +
                    "25 gram tepung sagu\n" +
                    "1/4 sendok teh merica\n\n" +
                    "Bahan Pencelup:\n" +
                    "\n" +
                    "150 ml air es\n" +
                    "Bahan Tumisan:\n" +
                    "\n" +
                    "4 siung bawang putih, cincang halus\n" +
                    "2 buah kuning telur, dihaluskan\n" +
                    "2 buah cabai hijau besar, dicincang halus\n" +
                    "1/4 sendok teh merica bubuk\n" +
                    "3 buah kuning telur asin, dihaluskan\n" +
                    "1 batang daun bawang, diiris halus\n" +
                    "1/2 sendok teh kecap asin\n" +
                    "2 sendok makan minyak goreng untuk menumis\n" +
                    "Persiapan Membuat Cumi Goreng Telur Asin yang Sedap:\n" +
                    "\n" +
                    "Untuk yang pertama, kita akan lakukan langkah kali ini dengan terlebih dahulu membersihkan cuminya secara merata. Hal ini akan penting sekali untuk dilakukan karena cumi perlu dalam keadaan bersih. Untuk itu, maka silahkan masukkan cumi kedalam baskom atau wadah. Untuk selanjutnya silahkan bawa ke tempat cucian untuk selanjutnya bersihkan secara merata.\n" +
                    "Ditempat cucian pastikan cumi dibersihkan dengan menggunakan air bersih secara merata. Lalu, remas-remas dengan menggunakan tangan. Untuk membersihkan bagian dalamnya secara merata.\n" +
                    "Bila sudah bersih dan selesai, silahkan ambil dan masukkan kembali kedalam baskom. Selanjutnya, buang air yang masih menggenang lalu sisihkan dalam wadah dan tiriskan.\n" +
                    "Dalam baskom, silahkan bumbui cumi dengan mengguankan air jeruk nipis. Lalu taburi dengan menggunakan garam secara merata. Kemudian aduk-aduk sampai semua bahan ini tercampur dan teraduk.\n" +
                    "Cara diatas dilakukan agar bau amis pada cumi menjadi lebih berkurang secara merata. Untuk itu, sisihkan sementara sampai meresap selama kurang lebih 15 menit.\n" +
                    "\nCara Membuat Cumi Goreng Telur Asin yang Sedap:\n" +
                    "\n" +
                    "Bila bahan sajian diatas sudah dicampur dan diaduk secara merata. Selanjutnya kita akan buat cumi krispi dan digoreng.\n" +
                    "Untuk itu, kita akan buat terlebih dahulu bahan pelapis untuk membuat sajian cumi kali ini. Caranya, silahkan aduk secara merata tepung terigu bersama dengan tepung sagu, merica dan juga garam secara merata. Lalu tambahkan tepung mazeina kedalamnya. Kemudian aduk-aduk kembali sampai semua bahan tercampur secara merata.\n" +
                    "Setelah itu, lumuti cumi dengan bahan pelapis sampai semua daging cumi terbaluti dengan bumbu tersebut secara merata.\n" +
                    "Setelah itu, celupkan pada bahan celupan secara merata dan tercampur. Lalu gulingkan kembali pada bahan pelapis sampai terbaluti merata.\n" +
                    "Bila semua cumi sudah dibaluti dengan bahan pelapis secara merata. Sekarang siapkan sebuah wajan dan masukkan minyak goreng kedalamnya. Untuk kemudian tunggu samapi minyak menjadi lebih panas secara merata.\n" +
                    "Goreng cumi sampai merata dan lebih krispi kecoklatan. Setelah itu, angkat dan sisihkan sementara agar minyaknya lebih tiris.\n" +
                    "Untuk membuat bumbu telur asin kali ini, silahkan kembali panaskan secukupnya minyak dalam wajan. Tunggu sampai panas, selanjutnya masukkan bawang putih bersama dengan cabai hijau. Masak sajian ini sampai matang secara merata hingga harum.\n" +
                    "Lalu tambahkan dengan menggunakan kecap asin dan juga merica bubuk kedalamnya. Aduk-aduk sampai semua sajian ini menjadi rata secara keseluruhan.\n" +
                    "Tambahkan kuning telur asin kedalamnya dan kuning telur biasa. Lalu aduk-aduk semua bahan ini secara merata dan tambahkan cumi yang sudah anda goreng kedalamnya.\n" +
                    "Masukkan daun bawang dan masak semua sajian ini sampai cumi terbaluti dengan bumbu secara keseluruhan.");
            listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Dendeng Daging Sapi");
            resep2.setPoster(R.drawable.dendengkering);
            resep2.setSummary("Sajian dendeng sapi kering adalah salah satu sajian makanan dari daging yang enak.\n" +
                    "Hidangan ini juga cukup praktis dibuat dan bisa diawetkan dalam lemari es untuk beberapa waktu.");
            resep2.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 40 menit\n" +
                    "\n" +
                    " \n" +
                    "Memasak: 180 menit\n" +
                    "\n" +
                    "Total: 240 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "12 Porsi\n" +
                    "\n" +
                    "Bahan-Bahan yang Diperlukan Untuk Membuat Sajian Dendeng Daging Sapi Kering Enak dan Empuk\n" +
                    "\n" +
                    "Bahan Utama Membuat Dendeng Daging Sapi Kering:\n" +
                    "\n" +
                    "1 kg daging sapi\n" +
                    "Bahan dan Bumbu Dendeng Sapi Kering:\n" +
                    "\n" +
                    "8 siung bawang putih, kupas\n" +
                    "4 buah cabe merah, diulek kasar\n" +
                    "1/2  sdm asam jawa\n" +
                    "1 sdt merica bubuk\n" +
                    "2 sdm garam\n" +
                    "1/2 ons ketumbar\n" +
                    "300 gr gula merah\n" +
                    "Air kaldu dari rebusan daging\n" +
                    "1 liter air untuk merebus daging\n" +
                    "\nCara Membuat Dendeng Daging Sapi Kering Enak dan Empuk\n" +
                    "\n" +
                    "Cara Mengolah Daging Sapi Sebelum Diberikan Bumbu:\n" +
                    "\n" +
                    "Hal pertama yang bisa dilakukan terlebih dahulu adalah dengan memotong-motong daging sapi yang sudah anda siapkan dengan bentuk sesuai dengan selera. Hanya saja, usahakan untuk memotong daging melawan arah serat daging agar ketika daging dimasak tidak mudah hancur, selain itu, daging yang dipotong dengan arah melawan serat akan membuat daging menjadi lebih mudah empuk.\n" +
                    "Setelah selesai memotong-motong daging, selanjutnya silahkan masukan potongan daging kedalam wadah atau mangkuk berukuran besar.\n" +
                    "Siapkan talenan atau berikan alas yang bersih dibagian bawah daging, kemudian ambil pemukul daging dan pipihkan daging dengan menggunakan pemukul hingga daging menjadi bentuk pipih.\n" +
                    "Setelah dipipihkan, masukkan kembali daging kedalam wadah atau mangkuk dan sisihkan sementara sebelum kita olah dan dibumbui dengan rempah.\n" +
                    "\nCara Membuat Dendeng Daging Sapi Kering:\n" +
                    "\n" +
                    "Siapkan panci, berikan air secukupnya dan masukkan potongan daging kedalam panci tersebut kemudian masukkan bawang putih dan rebus daging hingga teksturnya menjadi lebih empuk dan hampir matang serta kuah rebusan daging menjadi menyusut lebih sedikit.\n" +
                    "Selanjutnya, silahkan haluskan semua bumbu hingga bumbu benar-benar halus secara merata.\n" +
                    "Masukkan bumbu yang telah dihaluskan tersebut kedalam wadah dan angkat daging dari rebusan kemudian lumuri smeua permukaan daging dengan bumbu halus ini. Pastikan jika semua bagian permukaan daging dibersihkan dengan baik.\n" +
                    "Setelah itu, diamkan terlebih dahulu daging selama kurang lebih 2-3 jam sampai bumbu yang dilumuri pada daging bisa meresap secara keseluruhan kedalam daging.\n" +
                    "Selesai didiamakan selama waktu yang telah ditentukan, sekarang jemur daging dibawah terik sinar matahari sampai dendeng daging menjadi benar-benar kering secara merata dan tidak ada kandungan air pada daging.\n" +
                    "Setelah daging kering dari jemuran, sekarang siapkan minyak diatas wajan yang panas dan tunggu hingga minyak panas. Kemudian goreng dendeng hingga matang, jangan dulu membalikan dendeng, biarkan terlebih dahulu hingga kering dan baru balikan.");
            listResep.add(resep2);

            resep3.setJudul(" Ikan Jambal Roti");
            resep3.setPoster(R.drawable.ikanjambal);
            resep3.setSummary("Dengan racikan bumbu special dan komposisinya yang pas, maka anda akan dengan mudah membuat sajian ini. Inilah dia resep membuat ikan jambal roti masak tahu kering pedas.");
            resep3.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 25 menit\n" +
                    "\n" +
                    "Memasak: 45 menit\n" +
                    "\n" +
                    "Total: 70 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "6 Porsi\n" +
                    "\n" +
                    "Bahan-Bahan yang Diperlukan Untuk Membuat Ikan Jambal Roti Masak Tahu Kering Pedas yang Asli Enak dan Gurih\n" +
                    "\n" +
                    "Bahan dan Bumbu Ikan:\n" +
                    "\n" +
                    "300 gram ikan jambal\n" +
                    "200 gram tahu coklat\n" +
                    "2 lembar daun salam\n" +
                    "2 cm lengkuas, dimemarkan\n" +
                    "1/2 sendok teh gula pasir\n" +
                    "1 sendok teh jeruk nipis\n" +
                    "150 ml air\n" +
                    "3 lembar daun jeruk, dibuang tulang daunnya\n" +
                    "2 sendok makan minyak, untuk menumis\n" +
                    "\nBumbu yang Dicincang Kasar:\n" +
                    "\n" +
                    "5 butir bawang merah\n" +
                    "7 buah cabai merah besar\n" +
                    "3 siung bawang putih\n" +
                    "2 buah cabai rawit merah\n" +
                    "3 buah cabai merah keriting\n" +
                    "\n" +
                    "Tips Mempersiapkan Bahan-Bahan Sebelum Dimasak:\n" +
                    "\n" +
                    "Pertama, kita akan bersihkan dan persiapkan terlebih dahulu ikan jambal roti yang sudah anda dapatkan. Kita cuci bersih terlebih dahulu ikan jambal dengan menggunakan air yang mengalir dan pastikan jika anda membersihkan kotoran pada ikan secara merata.\n" +
                    "Selanjutnya, potong-potong ikan jambal yang berukuran besar menjadi bentuk kotak kecil sesuai dengan ukuran yang anda inginkan.\n" +
                    "Kemudian, rendam terlebih dahulu ikan asin jambal pada mangkuk dengan menggunakan air bersih. Hal ini difungsikan untuk menghilangkan kelebihan garam pada ikan. Diamkan selama kurang lebih 10 menit.\n" +
                    "Setelah 10 menit, goreng ikan jambal pada wajan yang diberikan minyak goreng dan goreng ikan hingga matang secara merata. Angkat ikan dan sisihkan sementara.\n" +
                    "Sekarang kita persiapkan tahu coklat. Ambil tahu coklat yang sudah anda beli dan potong tahu menjadi dua bagian.\n" +
                    "Selanjutnya siapkan kembali wajan dan tuangkan minyak kedalamnya. Gunakan minyak ini untuk menggoreng tahu coklat hingga kering dan krispi namun tidak gosong.\n" +
                    "Angkat tahu yang sudah kering dan tiriskan minyaknya terlebih dahulu sebelum kita masak bumbunya.");
            listResep.add(resep3);
            resep4.setJudul("Kroket Kentang Isi Sayuran");
            resep4.setPoster(R.drawable.kroket);
            resep4.setSummary("Sajian ini begitu sangat menggoda, tidak hanya dijadikan sebagai hidangan di kala makan bersama di keluarga.");
            resep4.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 45 menit\n" +
                    "\n" +
                    "Memasak: 45 menit\n" +
                    "\n" +
                    "Total: 90 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "10 Orang\n" +
                    "Bahan yang Diperlukan Untuk Membuat Sajian Sedap Kroket Kentang Isi Sayuran\n" +
                    "\n" +
                    "Bahan Utama\n" +
                    "\n" +
                    "250 gram kentang segar, kupas lalu goreng dan haluskan\n" +
                    "Bawang Putih bubuk secukupnya\n" +
                    "1 sendok makan tepung terigu\n" +
                    "1 sendok makan susu bubuk\n" +
                    "Merica Halus secukupnya\n" +
                    "Air panas secukupnya\n" +
                    "1 sendok teh garam\n" +
                    "Aneka Bahan Isian\n" +
                    "\n" +
                    "1 sendok teh gula pasir\n" +
                    "Garam halus secukupnya\n" +
                    "Merica bubuk secukupnya\n" +
                    "100 gram daging sapi giling\n" +
                    "2 sendok makan Margarine\n" +
                    "1 sendok makan kecap manis\n" +
                    "4 siung bawang putih, cincang halus\n" +
                    "4 butir bawang merah, cincang halus\n" +
                    "100 gram wortel, potong dadu kemudian rebus sebentar\n" +
                    "\nLapisan Kroket\n" +
                    "\n" +
                    "2 Putih Telur, Kocok\n" +
                    "Tepung roti secukupnya\n" +
                    "Minyak goreng secukupnya\n" +
                    "2 sendok makan tepung terigu\n" +
                    "\nLangkah dan Cara yang Harus Anda Lakukan Utnuk Megolah Sajian Kroket Kentang Isi Sayuran\n" +
                    "\n" +
                    "\nLangkah Pembuatan Isi\n" +
                    "\n" +
                    "Siapkan wajan dan panaskan margarine atau mentega kemudian anda lanjutkan dengan menumis beberapa bahan seperti bawang putih dan merah sampai dengan wangi.\n" +
                    "Setelah wangi anda bisa memasukan daging sapi giling. Aduk sampai sajian tersebut merata.\n" +
                    "Lanjutkan dengan memasukan bahan isian lainnya dan masak sampai matang.\n" +
                    "Langkah Pembuatan Kulit\n" +
                    "\n" +
                    "Siapkan sebuah wadah dan semua bahan kulit.\n" +
                    "Lanjutkan dengan mencampur semua bahan sampai menjadi satu.\n" +
                    "\nLangkah Pembuatan Kroket\n" +
                    "\n" +
                    "Ambil adoanan kulit yang sudah anda buat kemudian lanjutkan dengan memipihkan adonan tersebut.\n" +
                    "Ambil isian yang sudah anda buat kemudian letakan di atas adonan pipih, sesuaikan dengan kulitnya kemudian anda gulung bentuk lonjong memanjang bentuk kroket. Lakukan samapai isian dan adonan habis.\n" +
                    "Setelah itu, gulingkan kroket tersebut ke dalam tepung terigu, lanjutkan dengan membalut kroket tersebut dengan tepung terigu dan terakhir gulingkan di atas tepung panir.\n" +
                    "Siapkan wajan dan minyak panas. Setelah panas barulah lanjutkan dengan menggoreng kroket tersebut sampai berwarna kuning kecoklatan dan matang.\n" +
                    "Setelah matang anda angkat dan tata di atas piring saji.\n" +
                    "Hidangkan di saat panas dengan hiasan menarik.");
            listResep.add(resep4);

        }
        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        recycler.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

    }
}
