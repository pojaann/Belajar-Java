// Topik: variabel dan tipe data dasar.
public class Topik02Variabel {
    public static void main(String[] args) {
        // Variabel menyimpan nilai yang dapat digunakan oleh program.
        String nama = "Arief";       // Teks
        int umur = 20;               // Bilangan bulat
        double tinggi = 1.70;        // Bilangan desimal
        boolean sedangBelajar = true; // Nilai benar atau salah
        char nilaiHuruf = 'A';       // Satu karakter, gunakan petik tunggal

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi + " meter");
        System.out.println("Sedang belajar Java: " + sedangBelajar);
        System.out.println("Nilai huruf: " + nilaiHuruf);

        // Operator aritmetika dasar.
        int angkaPertama = 10;
        int angkaKedua = 3;
        System.out.println("Penjumlahan: " + (angkaPertama + angkaKedua));
        System.out.println("Sisa pembagian: " + (angkaPertama % angkaKedua));
    }
}

// Latihan:
// 1. Ubah nilai nama, umur, dan tinggi.
// 2. Buat variabel harga bertipe double, lalu tampilkan ke layar.
