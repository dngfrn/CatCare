package com.example.catcareapp;

import java.util.ArrayList;

public class PetFunContents {
    private static String[] funNames = {
            "Beri Makanan Sehat",
            "Kunjungi Dokter Hewan",
            "Sediakan Hiburan",
            "Peliharalah Kucing Lain",
            "Siapkan Ruangan Terbaik"
    };

    private static String[] funDetails = {
            "Menu makanan yang tepat sangat penting untuk kesehatan kucing. Obesitas adalah penyebab utama masalah kesehatan untuk hewan peliharaan. Carilah makanan kucing yang berkualitas di toko peliharaan terdekat dan pastikan Anda membeli makanan yang sudah dicocokan dengan usia kucing.\n\n" +
                    "Untuk kuantitasnya, ikutilah instruksi yang tertera pada kemasan makanan. Tetapi, instruksi tersebut hanyalah panduan. Sering kali, pabrik pembuat makanan kucing menaksir kuantitasnya terlalu tinggi, maka instruksi pada kemasan harus dipahami dan dicocokan dengan keadaan kucing, apakah berat badan kucing akan berkurang atau bertambah jika diberi makanan sebanyak itu.\n\n" +
                    "Jika Anda tidak tahu merek apa yang harus dipilih, berbicaralah dengan dokter hewan Anda. Ia akan membantu Anda dengan senang hati.",
            "Kucing bisa terjangkit berbagai macam penyakit baik di dalam maupun di luar rumah. Sangat penting untuk membawa kucing ke dokter hewan setidaknya dua kali dalam setahun untuk pemeriksaan umum.\n\n" +
                    "Jangan lupa untuk meminta perawatan terhadap cacing dan kutu yang teratur, terutama jika kucing menghabiskan banyak waktu di luar rumah. Kucing tidak akan merasa bahagia jika harus menggaruk setiap saat!",

            "Kucing adalah hewan yang mandiri dan bisa menghibur diri saat Anda sedang bekerja. Tetapi, Anda bisa memastikan bahwa kucing peliharaan Anda memiliki mainan yang cukup untuk menyibukkan diri.\n" +
                    "Anda juga bisa membuat mainan kucing sendiri. Ikatkan sehelai benang di gagang pintu dan biarkan kucing menggila saat memainkannya.\n" +
                    "Selain itu, Anda bisa menggunakan bola. Kucing akan mengejarnya seperti saat mengejar tikus.\n" +
                    "Jangan lupa untuk menyediakan tiang garukan karena jika tidak, sofa Anda yang jadi korbannya.\n" +
                    "Nyalakan laser atau senter dan arahkan ke lantai, kucing akan berusaha menangkap cahaya tersebut dan akan merasa bersemangat.",

            "Kucing memang bisa hidup sendiri, tetapi ia akan senang jika memiliki teman.",

            "Sebuah ruang yang aman untuk kucing tidak perlu berupa ruang terpisah, tapi bisa jadi hanya lemari kosong, sudut kamar tidur Anda dengan layar pelindung, atau kamar mandi yang jarang digunakan.\n\n" +
                    " Hal terpenting adalah kucing baru Anda memiliki tempat yang disebut 'rumah', tempat ia dapat beristirahat. Kucing bisa memilih untuk bersembunyi ataupun bergaul dengan pemilik rumah. Mungkin diperlukan beberapa hari atau bahkan beberapa minggu untuk beradaptasi."
    };

    private static int[] funThumbnailsImages = {
            R.drawable.fun1_thumbnail,
            R.drawable.fun2_thumbnail,
            R.drawable.fun3_thumbnail,
            R.drawable.fun4_thumbnail,
            R.drawable.fun5_thumbnail

    };

    static ArrayList<PetFun> getListData(){
        ArrayList<PetFun> list = new ArrayList<>();
        for(int position = 0; position < funNames.length; position++){
            PetFun petFun = new PetFun();
            petFun.setName(funNames[position]);
            petFun.setDetail(funDetails[position]);
            petFun.setPhotoThumbnail(funThumbnailsImages[position]);
            list.add(petFun);
        }
        return list;
    }
}
