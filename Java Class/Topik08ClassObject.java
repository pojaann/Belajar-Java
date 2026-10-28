// Topik: class sebagai cetak biru dan object sebagai hasil pembuatannya.
public class Topik08ClassObject {
    public static void main(String[] args) {
        // Membuat dua object dari class Mobil.
        Mobil mobilPertama = new Mobil("Merah", "Toyota");
        Mobil mobilKedua = new Mobil("Hitam", "Honda");

        mobilPertama.tampilkanInfo();
        mobilKedua.tampilkanInfo();
    }
}

// Class Mobil mendefinisikan data dan perilaku sebuah mobil.
class Mobil {
    String warna;
    String merek;

    // Constructor dipanggil saat object dibuat dengan kata kunci new.
    Mobil(String warna, String merek) {
        this.warna = warna;
        this.merek = merek;
    }

    void tampilkanInfo() {
        System.out.println("Mobil " + merek + " berwarna " + warna + ".");
    }
}

// Latihan:
// 1. Tambahkan field tahun bertipe int ke class Mobil.
// 2. Tampilkan tahun tersebut di dalam method tampilkanInfo.
