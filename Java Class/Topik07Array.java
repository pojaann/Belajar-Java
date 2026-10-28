// Topik: array untuk menyimpan beberapa nilai dengan tipe yang sama.
public class Topik07Array {
    public static void main(String[] args) {
        // Indeks array dimulai dari 0, jadi nilai pertama ada di indeks 0.
        String[] buah = {"Apel", "Jeruk", "Mangga"};
        System.out.println("Buah pertama: " + buah[0]);
        System.out.println("Jumlah buah: " + buah.length);

        // for-each membaca setiap elemen tanpa mengelola indeks sendiri.
        System.out.println("Daftar buah:");
        for (String namaBuah : buah) {
            System.out.println("- " + namaBuah);
        }

        // Array angka juga bisa digunakan untuk perhitungan.
        int[] nilai = {80, 90, 75};
        int total = 0;
        for (int angka : nilai) {
            total += angka;
        }
        double rataRata = (double) total / nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}

// Latihan:
// 1. Tambahkan satu buah ke array buah.
// 2. Hitung dan tampilkan nilai terbesar dari array nilai.
