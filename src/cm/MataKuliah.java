package cm;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliah(){

    }

    MataKuliah(String kd, String nm, int sk){
        kodeMK = kd;
        namaMK = nm;
        sks = sk;
    }

    void tampilMataKuliah(){
        System.out.println("Kode MK: " + this.kodeMK + " | Nama: " + this.namaMK + " | SKS: " + this.sks);
    }
}
