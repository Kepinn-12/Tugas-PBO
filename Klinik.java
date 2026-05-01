package minggu10;
import java.util.ArrayList;
import java.util.List;

public class Klinik {
    private String NamaKlinik ;
    private List<Dokter> DaftarDokter;
    private List<Ruangan> DaftarRuangan;

    Klinik (String NamaKlinik, List<Dokter> DaftarDokter){
        this.NamaKlinik = NamaKlinik;

        this.DaftarDokter = DaftarDokter ;

        this.DaftarRuangan = new ArrayList<>();
        this.DaftarRuangan.add(new Ruangan("R-001"));
        this.DaftarRuangan.add(new Ruangan("R-002"));
        this.DaftarRuangan.add(new Ruangan("R-003"));
    }

    void tampilkanInfo(){
        System.out.println("Nama klinik : " + NamaKlinik );
        
        System.out.println();

        //agregasi
        System.out.println("Nama Dokter :");
        for(Dokter dokter : DaftarDokter){
            System.out.println("-" + dokter.getNama());
        }

        //komposisi
        System.out.println("\n Daftar Ruangan :");
        for(Ruangan ruangan: DaftarRuangan){
            System.out.println("-" + ruangan.getNomorRuangan());
        }
    }
}
