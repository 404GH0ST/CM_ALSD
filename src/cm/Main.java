package cm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");

            int pilihan = sc.nextInt();
            if (pilihan == 1) {
                continue;
            } else if (pilihan == 2) {
                continue;
            } else if (pilihan == 3) {
                continue;
            } else if (pilihan == 4) {
                continue;
            } else if (pilihan == 5) {
                continue;
            } else if (pilihan == 0) {
                break;
            }
        }
    }
}
