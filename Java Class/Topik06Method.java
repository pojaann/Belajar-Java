// Topik: membuat method agar kode dapat digunakan kembali.
public class Topik06Method {
    public static void main(String[] args) {
        sapa("Arief");

        int hasil = jumlahkan(7, 5);
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    // Method void melakukan tugas tetapi tidak mengembalikan nilai.
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // Method int mengembalikan bilangan bulat dengan return.
    static int jumlahkan(int angkaPertama, int angkaKedua) {
        return angkaPertama + angkaKedua;
    }
}

// Latihan:
// 1. Buat method kali yang menerima dua int dan mengembalikan hasilnya.
// 2. Panggil method tersebut dari dalam main.
