import java.util.Scanner;

// Topik: membaca input dari pengguna dengan Scanner.
public class Topik03InputScanner {
    public static void main(String[] args) {
        // Scanner membaca data yang diketik di terminal.
        Scanner input = new Scanner(System.in);

        System.out.print("Siapa nama kamu? ");
        String nama = input.nextLine(); // Membaca satu baris teks.

        System.out.print("Berapa umur kamu? ");
        int umur = input.nextInt(); // Membaca bilangan bulat.

        System.out.println("Halo, " + nama + "!");
        System.out.println("Tahun depan umur kamu " + (umur + 1) + " tahun.");

        // Tutup Scanner setelah input selesai digunakan.
        input.close();
    }
}

// Latihan:
// 1. Minta pengguna memasukkan kota tempat tinggalnya.
// 2. Tampilkan kalimat yang menyebutkan nama dan kota pengguna.
