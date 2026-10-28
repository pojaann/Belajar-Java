// Topik: perulangan for dan while.
public class Topik05Perulangan {
    public static void main(String[] args) {
        // for cocok ketika jumlah pengulangan diketahui.
        System.out.println("Hitung dengan for:");
        for (int angka = 1; angka <= 5; angka++) {
            System.out.println(angka);
        }

        // while mengulang selama kondisinya bernilai true.
        System.out.println("Hitung mundur dengan while:");
        int hitungMundur = 3;
        while (hitungMundur > 0) {
            System.out.println(hitungMundur);
            hitungMundur--; // Kurangi satu agar perulangan berhenti.
        }
        System.out.println("Mulai!");
    }
}

// Latihan:
// 1. Ubah perulangan for agar menampilkan angka 1 sampai 10.
// 2. Buat perulangan yang hanya menampilkan angka genap.
