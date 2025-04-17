package cm;

public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah,double nilaiTugas, double nilaiUTS, double nilaiUAS, double nilaiAkhir) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double HitungNilaiAkhir() {
        double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        this.nilaiUAS = nilaiAkhir;
        return nilaiAkhir;
    }
}
