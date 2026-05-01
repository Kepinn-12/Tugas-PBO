package minggu10;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
        Dokter d1 = new Dokter("Dr.Kevin");
        Dokter d2 = new Dokter("Dr.Gifar");
        Dokter d3 = new Dokter("Dr.Adit");
        
        List<Dokter> DaftarDokter = new ArrayList<>();
        DaftarDokter.add(d1);
        DaftarDokter.add(d2);
        DaftarDokter.add(d3);
        
        //Membuat objek KebunBinatang
        //Daftar penjaga yang dimasukkan ke constructor
        Klinik kl = new Klinik("Klinik NAHUB ", DaftarDokter);
        
        //menampilkan informasi kebun binatang
        //aggregasi
        kl.tampilkanInfo();
        
        Pasien p1 = new Pasien("Leon", "Tipes");
        Pasien p2 = new Pasien("Wafi", "Flu")
        
        //asosiasi
        //dokter memeriksa Pasien 
        System.out.println("\nAsosiasi");
        
        System.out.println("\nAktivitas Dokter:");
        d1.periksaPasien(p1);
        d2.PeriksaPasien(p2);
    }
}
