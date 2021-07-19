package com.example.catcareapp;

import java.util.ArrayList;

public class PetFoodContents {
    private static String[] foodNames = {
            "Usia 1-12 bulan",
            "Usia 1+ tahun",
            "Usia 7+ tahun",
            "Hamil",
    };

    private static String[] foodDetails = {
            "Usia 1–4 minggu, anak kucing Anda akan mendapatkan semua nutrisi yang mereka butuhkan dari induknya ketika mereka menyusu.\n\n" +
                    "Usia 4–12 minggu, sebaiknya beri makan sebanyak 4 kali sehari dengan takaran 25-80 gr. Berikan susu anak kucing atau air sampai tingkat kelunakan yang tepat sehingga anak kucing Anda dapat memakannya dengan mudah, atau gunakan makanan basah sebagai gantinya.\n\n" +
                    "Usia 12 minggu ke atas, sebaiknya beri makan sebanyak 3 kali sehari dengan takaran 45-105 gr.\n\n" +
                    "Usia 6 bulan ke atas, secara alami kucing akan suka mencari makan, dan akan makan 15 hingga 20 kali sehari dalam porsi sangat kecil. Anda dapat menentukan takaran porsi sekitar 55-125 gr dan membiarkan mereka mendatangi lagi mangkuknya.",
            "Usia 1 tahun ke atas, kucing dewasa perlu diberi dua kali sehari dengan takaran 65-130 gr sesuai dengan berat badan. Pastikan kamu selalu menyediakan jumlah air yang cukup dan rajin mengganti air dalam wadahnya, karena kucing suka minum di air segar.",
            "Usia 7 tahun ke atas, kucing dianggap sudah cukup tua. Seiring bertambahnya usia kucing, takaran kebutuhan makannya sekitar 70-135 gr sesuai pada berat badan. Makanan ini mungkin memiliki lebih sedikit protein dan keseimbangan mineral dan vitamin yang dirancang menjaganya agar tetap sehat.",
            "Pada kucing betina yang sedang hamil, usia kehamilan berlangsung sekitar 65 hari, bisa juga mencapai 61 hingga 72 hari. Pada awal kehamilan, Anda harus memberikan induk diet kaya lemak, yang dirancang khusus guna mendukung kehamilan serta produksi susu untuk memberi makan anak-anaknya. Kebutuhan energi induk akan meningkat sekitar 10% setiap minggu.",
    };

    private static int[] foodThumbnailsImages = {
            R.drawable.food_thumbnail2,
            R.drawable.food_thumbnail,
            R.drawable.food_thumbnail3,
            R.drawable.food_thumbnail4,
    };

    static ArrayList<PetFood> getListData(){
        ArrayList<PetFood> list = new ArrayList<>();
        for(int position = 0; position < foodNames.length; position++){
            PetFood petFood = new PetFood();
            petFood.setName(foodNames[position]);
            petFood.setDetail(foodDetails[position]);
            petFood.setPhotoThumbnail(foodThumbnailsImages[position]);
            list.add(petFood);
        }
        return list;
    }
}
