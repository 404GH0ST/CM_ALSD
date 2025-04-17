package cm;

public class Matakuliah {
    String kodeMK;
    String namaMK;
    int sks;

    Matakuliah(){

    }

    Matakuliah(String kd, String nm, int sk){
        kodeMK = kd;
        namaMK = nm;
        sks = sk;
    }

    void tampilMatakuliah(){
        System.out.println("KodeMK: " + kodeMK);
        System.out.println("NamaMK:" + namaMK);
        System.out.println("SKS:" + sks);
    }
}
