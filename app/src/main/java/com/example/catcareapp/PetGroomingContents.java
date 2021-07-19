package com.example.catcareapp;

import java.util.ArrayList;

public class PetGroomingContents {
    private static String[] wayNames = {
            "Tahap Pertama : Potong Kuku dan Sikat Bulu",
            "Tahap Kedua : Siapkan Sampo dan Air Hangat",
            "Tahap Ketiga : Siapkan Handuk dan Hair Dryer",
    };

    private static String[] wayDetails = {
            "Sebelum mulai memandikan, ada baiknya jika kamu memotong kuku kucing terlebih dahulu. Hal ini untuk meminimalkan rasa panik dan tegang kucing saat terkena air. Kamu harus super hati-hati agar tidak memotong kuku terlalu pendek sehingga bisa menyebabkan rasa sakit dan pendarahan.\n\n"+
                    "Langkah selanjutnya yang tidak boleh dilewatkan adalah menyikat bulu kucing. Menyikat berguna untuk menyingkirkan bulu yang kusut dan simpul yang lebih sulit dilepaskan dan lebih menyakitkan ketika dalam kondisi basah. Ada beberapa kucing yang suka ketika disikat bulunya dan mereka justru tertidur karena merasa nyaman. Namun, ketika kucing cenderung memberontak ketika disikat, berikan snack sebagai treat bagi kucing." +
                    "Ingat, jangan melewatkan langkah ini, ya!",

            "Kapan waktu yang pas untuk memandikan kucing? Disarankan agar memandikan kucing dalam keadaan mereka lelah sehabis bermain. Ini supaya kucing tidak memberontak, menggigit atau kabur saat dimandikan. Kamu juga bisa memandikan kucing setelah mereka kekenyangan sehabis makan.\n\n" +
                    "Selanjutnya, mari kita siapkan bak mandi dengan air hangat. Pastikan suhunya aman untuk kucing, tidak terlalu panas dan tidak terlalu dingin ya. Gunakan sampo khusus kucing, lalu mulai basuh dari leher kucingmu ke arah ekor. Hindari area wajah, mata, dan telinga mereka.",

            "Setelah usai dimandikan, kini saatnya mengeringkan kucing. Ambil handuk dan lingkarkan ke tubuh kucing. Tepuk-tepuk handuk supaya air menyerap dan mengeringkan bulu kucing yang basah.\n\n" +
                    "Jika kucingmu berbulu pendek, maka mengeringkannya dengan handuk sudah cukup. Namun, jika kucingmu berbulu panjang, maka kamu perlu menggunakan pengering rambut (hair dryer) dan atur dengan suhu hangat. Sembari dikeringkan dengan hair dryer, kamu bisa menyisir bulu kucing supaya tidak kusut."
    };

    private static int[] wayThumbnailsImages = {
            R.drawable.tahap1_thumbnail,
            R.drawable.tahap2_thumbnail,
            R.drawable.tahap3_thumbnail,
    };

    static ArrayList<PetGrooming> getListData(){
        ArrayList<PetGrooming> list = new ArrayList<>();
        for(int position = 0; position < wayNames.length; position++){
            PetGrooming petGrooming = new PetGrooming();
            petGrooming.setName(wayNames[position]);
            petGrooming.setDetail(wayDetails[position]);
            petGrooming.setPhotoThumbnail(wayThumbnailsImages[position]);
            list.add(petGrooming);
        }
        return list;
    }
}
