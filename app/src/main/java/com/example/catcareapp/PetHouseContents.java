package com.example.catcareapp;

import java.util.ArrayList;

public class PetHouseContents {
    private static String[] houseNames = {
            "Alat dan Bahan Yang Harus Disiapkan",
            "Mengenalkan Kucing dengan Kotak Pasir",
            "Owner Rajin Memmbersihkan Kotak Pasir",
            "Jika Kucing Menolak Memakai Kotak Pasir",
    };

    private static String[] houseDetails = {
            "Sebelum mulai melatih kucing buang air, kamu harus menyiapkan alat dan bahan yang diperlukan. Berikut ini di antaranya.\n\n"+
                    "Litter box atau kotak pasir. Di tahap awal, sebaiknya siapkan lebih dari satu wadah di setiap area rumahmu.\n" +
                    "Pasir kucing atau cat litter. Gunakanlah pasir yang bertekstur halus dan tidak memiliki bau atau wangi apa pun. Kamu bisa mencoba beberapa jenis untuk mengetahui pasir seperti apa yang disukai si kucing;\n" +
                    "Taruhlah koran atau kain di bawah kotak pasir. Ini tidak wajib, namun tujuannya adalah agar kamu mudah membersihkan pasir yang tercecer di sekitar kotak. ",

            "Pertama, tunjukkan kepada kucing setiap kotak pasir yang telah kamu siapkan. Biarkan mereka mengendusnya. Pastikan kamu tidak menggerak-gerakkan kotak ketika mereka mengeceknya.\n\n" +
                    "Coba masukkan kucing ke dalam kotak pasir. Pada umumnya, secara otomatis mereka akan menggali-gali. Namun jika tidak, beri contoh dengan cara mengaduk-aduk pasir dengan jarimu.\n\n" +
                    "Setelah itu, kamu harus mengajak mereka masuk ke kotak pasir setelah makan, minum, dan bangun tidur. Lakukan ini sampai mereka menggunakan wadah tersebut dengan sendirinya.\n\n" +
                    "Berikanlah hadiah setiap kali mereka menggunakan kotak pasir dengan benar. Kamu bisa memberikan mainan, makanan, atau pujian;",

            "Jika kucingmu telah berhasil menggunakan kotak pasir sendiri, jangan malas untuk membersihkannya. Kamu sebaiknya mengambil kotoran yang ditinggalkan kucing dengan sekop setiap hari. Setelah itu, tambahkan pasir baru untuk menjaga kedalamannya.\n\n" +
                    "Dilansir Hill's Pet, kamu harus membuang pasir yang telah digunakan, mencuci kotak, dan mengisinya kembali setidaknya seminggu sekali. Ini dilakukan agar kotak pasir tidak berbau.",

            "Pertama, coba pindahkan kotak pasir ke area yang lebih sering dilalui kucing. Periksa adakah halangan yang mencegah kucing menggunakannya. Misal area itu dipakai hewan lain, kurang tertutup, atau terlalu berisik.\n\n" +
                    "Kedua, Coba gunakan jenis pasir yang berbeda.\n" +
                    "Kamu harus lebih sering mengambil kotoran kucing dan mengganti pasir. Lakukan setiap kali mereka buang air." +
                    "Kamu bisa mencoba memakai spray feromon untuk kucing. Semprotkan ke sekitar kotak pasir. Dengan begitu, mereka tidak stres dan lebih nyaman untuk menggunakannya.\n" +
                    "Coba konsultasikan dengan dokter hewan. Apakah kucing membawa parasit, menderita penyakit saluran kencing, atau gangguan lain yang membuatnya tidak mau menggunakan kotak pasir."
    };

    private static int[] houseThumbnailsImages = {
            R.drawable.bag1_thumbnail,
            R.drawable.bag2_thumbnail,
            R.drawable.bag4_thumbnail,
            R.drawable.bag5_thumbnail
    };

    static ArrayList<PetHouse> getListData(){
        ArrayList<PetHouse> list = new ArrayList<>();
        for(int position = 0; position < houseNames.length; position++){
            PetHouse petHouse = new PetHouse();
            petHouse.setName(houseNames[position]);
            petHouse.setDetail(houseDetails[position]);
            petHouse.setPhotoThumbnail(houseThumbnailsImages[position]);
            list.add(petHouse);
        }
        return list;
    }
}
