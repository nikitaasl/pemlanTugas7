public class Main {
    public static void main(String[] args) {
        Kue[] daftar = new Kue[20];
        
        //10 kue pesanan
        daftar[0] = new KuePesanan("Brownies Coklat", 2000, 1.1);
        daftar[1] = new KuePesanan("Kue Cubit", 2000, 1.2);
        daftar[2] = new KuePesanan("Brownies Keju", 2000, 1.3);
        daftar[3] = new KuePesanan("Bika Ambon", 2000, 1.4);
        daftar[4] = new KuePesanan("Kue Putu", 2000, 1.5);
        daftar[5] = new KuePesanan("Kue Lumpur", 2000, 1.6);
        daftar[6] = new KuePesanan("Kue Cucur", 2000, 1.7);
        daftar[7] = new KuePesanan("Kue Lemper", 2000, 1.8);
        daftar[8] = new KuePesanan("Kue Bolu", 2000, 1.9);
        daftar[9] = new KuePesanan("Kue Pisang", 2000, 2.0);

        //10 kue jadi
        daftar[10] = new KueJadi("Donat Coklat", 1100, 2);
        daftar[11] = new KueJadi("Kue Nastar", 1300, 3);
        daftar[12] = new KueJadi("Donat Keju", 1500, 4);
        daftar[13] = new KueJadi("Kue Pastel", 1700, 5);
        daftar[14] = new KueJadi("Kur Sus", 1900, 6);
        daftar[15] = new KueJadi("Kue coklat", 2100, 7);
        daftar[16] = new KueJadi("Risol Mayo", 2300, 8);
        daftar[17] = new KueJadi("Hotdog", 2500, 9);
        daftar[18] = new KueJadi("Kue Pandan", 2700, 10);
        daftar[19] = new KueJadi("Kue Pukis", 2900, 11);


        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        Kue kueTermahal = daftar[0];

        for (int i = 0; i < daftar.length; i++){
            Kue kue = daftar[i];
            System.out.println(kue);

            double harga = kue.hitungHarga();
            totalHarga += harga;

            if (kue instanceof KuePesanan){
                totalHargaPesanan += harga;
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaJadi += harga;
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }

            if (harga > kueTermahal.hitungHarga()){
                kueTermahal = kue;
            }
        }

        //Menampilkan hasil akhir
        System.out.println("\nTotal Harga Semua Kue: " + totalHarga);
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan);
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);
        System.out.println("\nKue dengan Harga Termahal:");
        System.out.println(kueTermahal);
    }
}
