package com.example.catcareapp;

import java.util.ArrayList;

public class PetMedicContents {
    private static String[] medicNames = {
            "Kutu dan Cacing",
            "Flu Kucing",
            "Gigi Sehat",
            "Vaksin",
            "Neuter"
    };

    private static String[] medicDetails = {
            "Kutu sangat mudah untuk dilihat. Kabar baiknya, mereka juga mudah untuk diobati. Mereka berwarna coklat-kehitaman, dan kamu dapat melihatnya di bulu - bulu rambut anak kucingmu. Mungkin terdapat kutu dengan bintik hitam, dan kamu juga dapat melihat anak kucingmu menggaruk atau menggigiti dirinya sendiri. Kamu dapat meminta saran kepada dokter atau mendapatkan perawatan dari toko hewan - pastikan bahwa obat yang kamu beli cocok untuk anak kucing.\n\n" +
                    "Selain kutu, terdapat dua jenis cacing yang harus diperhatikan. Cacing gelang dapat membuat perut anak kucingmu sedikit bengkak, dalam beberapa kejadian, dapat menyebabkan muntah. Cacing pita terlihat sangat kecil seperti butir beras, biasanya berada di dalam wadah buang air, atau di sekitar pantat anak kucing. Jika kamu melihatnya dengan jeli, jangan khawatir." +
                    "Biasanya kamu dapat mencegah cacing dengan memberinya obat setiap dua minggu sekali ketika berumur 5 - 12 minggu dan setiap 3 - 6 bulan setelahnya. Berbicaralah dengan dokter untuk saran dan kepastian yang kamu butuhkan.",

            "Flu adalah penyakit menular, jika kamu memiliki hewan peliharaan lainnya, jauhkan dia dari yang mereka. Jika anak kucingmu tidak ingin makan terlalu banyak, pastikan kamu menyediakan makanan dan minuman yang segar untuknya. Sebagian besar gejala ringan, dan harus ditanggapi sehati - hati mungkin di mana kamu harus memanjakannya! Jika kamu membutuhkan saran lebih lanjut, segera tanyakan kepada dokter hewanmu.",

            "Gigi anak kucingmu harus selalu bersih dan bebas dari endapan. Gusi yang sehat harus berwarna merah muda. Jika kamu melihat adanya kemerahan di sekitar gigi dan gusi anak kucingmu, tanyakan kepada dokter hewan anda– terkadang makanan dan bakteri dapat menjadi plak di gigi.\n" +
                    "Biasakan untuk selalu memeriksa mulut anak kucingmu sejak dini – hal ini akan memudahkan kamu untuk membersihkannya di kemudian hari.\n\n" +
                    "Untuk membersihkan giginya, kamu akan membutuhkan sikat gigi berukuran kecil dan odol khusus untuk anak kucing. Kamu dapat membelinya dari toko hewan, atau tanyakan kepada dokter. Biarkan anak kucingmu menjilat odolnya, sehingga dia terbiasa dengan rasanya. Kemudian, gosoklah gigi bagian belakang dengan sikat gigi. Lakukan kebiasaan ini seminggu sekali.",

            "Sebagai pemilik yang bertanggung jawab, kamu harus memastikan bahwa anak kucingmu merasa senang dan selalu sehat. Vaksin menjadi hal yang sangat penting, ini akan membantunya untuk melawan berbagai macam penyakit. Ketika anak kucing kamu telah diberi vaksin, kamu dapat meyakinkan dirimu bahwa dia mendapatkan perlindungan terbaik.\n\n" +
                    "Anak kucingmu akan mendapatkan vaksin pertamanya pada minggu ke 9, lalu vaksin kedua akan dilakukan pada minggu ke 12. Beberapa jenis vaksin akan mempunyai waktu yang berbeda - beda, tanyakan kepada dokter hewanmu waktu yang paling tepat. Setelah vaksin selesai dilakukan, anak kucingmu akan membutuhkan waktu hingga dua minggu agar sistem kekebalan tubuhnya, sepenuhnya berhasil. Selama itu, pastikan kamu menjaganya agar tetap berada di dalam rumah.",
            "Melakukan kebiri akan melindungi dan meningkatkan kesehatan anak kucingmu. Prosedur ini akan membantu angka kelahiran anak kucing yang berlebihan. Anak kucing jantanmu akan memiliki dorongan untuk menaburkan benihnya dan menandai wilayahnya. Dan para betina pada musim kawin akan menjadi lebih berisik dan gelisah, sering menggeliat dan berguling-guling di lantai. Kebiri dapat membantu mencegah perilaku – perilaku tersebut.\n\n" +
                    "Waktu terbaik untuk melakukan kebiri kepada anak kucingmu – jantan atau betina – saat mereka berumur 6 bulan. Pada saat itu, teman kecilmu ini sedang berada di masa di mana mereka menjadi dewasa secara seksual. Tanyakan kepada dokter mengenai saran dan informasi lebih lanjut mengenai proses ini."
    };

    private static int[] medicThumbnailsImages = {
            R.drawable.medic1_thumbnail,
            R.drawable.medic2_thumbnail,
            R.drawable.medic3_thumbnail,
            R.drawable.medic4_thumbnail,
            R.drawable.medic5_thumbnail
    };

    static ArrayList<PetMedic> getListData(){
        ArrayList<PetMedic> list = new ArrayList<>();
        for(int position = 0; position < medicNames.length; position++){
            PetMedic petMedic = new PetMedic();
            petMedic.setName(medicNames[position]);
            petMedic.setDetail(medicDetails[position]);
            petMedic.setPhotoThumbnail(medicThumbnailsImages[position]);
            list.add(petMedic);
        }
        return list;
    }
}
