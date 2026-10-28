import java.util.Scanner;

// Topik: pengambilan keputusan dengan if, else if, dan else.
public class Topik04Kondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();

        // Kondisi diperiksa dari atas ke bawah.
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai harus berada di antara 0 dan 100.");
        } else if (nilai >= 80) {
            System.out.println("Hasil: A");
        } else if (nilai >= 70) {
            System.out.println("Hasil: B");
        } else if (nilai >= 60) {
            System.out.println("Hasil: C");
        } else {
            System.out.println("Hasil: perlu belajar lagi.");
        }

        input.close();
    }
}

// Latihan:
// 1. Tambahkan kondisi untuk nilai D.
// 2. Ubah batas nilai untuk mendapatkan hasil A.
