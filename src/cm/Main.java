package cm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] listMahasiswa = new Mahasiswa[3];
        listMahasiswa[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        listMahasiswa[1] = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        listMahasiswa[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        MataKuliah[] listMataKuliah = new MataKuliah[3];
        listMataKuliah[0] = new MataKuliah("MK001", "Strktur Data", 3);
        listMataKuliah[1] = new MataKuliah("MK002", "Basis Data", 3);
        listMataKuliah[2] = new MataKuliah("MK003", "Desain Web", 3);

        Penilaian[] listPenilaian = new Penilaian[5];
        listPenilaian[0] = new Penilaian(listMahasiswa[0], listMataKuliah[0], 80, 85, 90);
        listPenilaian[1] = new Penilaian(listMahasiswa[0], listMataKuliah[1], 60, 75, 70);
        listPenilaian[2] = new Penilaian(listMahasiswa[1], listMataKuliah[0], 75, 70, 80);
        listPenilaian[3] = new Penilaian(listMahasiswa[2], listMataKuliah[1], 85, 90, 95);
        listPenilaian[4] = new Penilaian(listMahasiswa[2], listMataKuliah[2], 80, 90, 65);

        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            System.out.println();

            int pilihan = sc.nextInt();
            sc.nextLine();
            if (pilihan == 1) {
                System.out.println("Daftar mahasiswa");
                for (Mahasiswa mahasiswa : listMahasiswa) {
                    mahasiswa.tampilMahasiswa();
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar matakuliah");
                for (MataKuliah matakuliah : listMataKuliah) {
                    matakuliah.tampilMataKuliah();
                }
            } else if (pilihan == 3) {
                System.out.println("=== DATA PENILAIAN ===");
                for (Penilaian penilaian : listPenilaian) {
                    penilaian.HitungNilaiAkhir();
                    System.out.println(penilaian.mahasiswa.nama + " | " + penilaian.mataKuliah.namaMK
                            + " | Nilai Akhir: " + penilaian.nilaiAkhir);
                }
            } else if (pilihan == 4) {
                // Hitung nilai akhir jika belum dihitung
                if (listPenilaian[0].nilaiAkhir == 0) {
                    for (Penilaian penilaian : listPenilaian) {
                        penilaian.HitungNilaiAkhir();
                    }
                }
                // Sorting nilai akhir dengan bubble sort
                int jmlData = listPenilaian.length;
                for (int i = 0; i < jmlData - 1; i++) {
                    for (int j = 1; j < jmlData - i; j++) {
                        if (listPenilaian[j - 1].nilaiAkhir < listPenilaian[j].nilaiAkhir) {
                            Penilaian temp = listPenilaian[j];
                            listPenilaian[j] = listPenilaian[j - 1];
                            listPenilaian[j - 1] = temp;
                        }
                    }
                }
                System.out.println("Data Penilaian:");
                for (Penilaian penilaian : listPenilaian) {
                    System.out.println(penilaian.mahasiswa.nama + " | " + penilaian.mataKuliah.namaMK
                            + " | Nilai Akhir: " + penilaian.nilaiAkhir);
                }
            } else if (pilihan == 5) {
                System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                String NIM = sc.nextLine();
                int index = cariMahasiswa(listMahasiswa, NIM);
                if (index == -1) {
                    System.out.println("Mahasiswa tidak ditemukan");
                } else {
                    listMahasiswa[index].tampilMahasiswa();
                }
            } else if (pilihan == 0) {
                break;
            }
        }
    }

    public static int cariMahasiswa(Mahasiswa[] listMahasiswa, String NIM) {
        for (int i = 0; i < listMahasiswa.length; i++) {
            if (listMahasiswa[i].NIM.equals(NIM)) {
                return i;
            }
        }
        return -1;
    }
}
