package minggu10;

public class Dokter {
    private String Nama ;

    Dokter (String Nama) {
        this.Nama = Nama ;
    }

    public String getNama() {
        return Nama;
    }

    void PeriksaPasien(Pasien pasien) {
        if ( pasien == null) {
            System.out.println("Pasien tidak ditemukan");
        }

        System.out.println("Dokter " + Nama + " " + "sedang memeriksa  " + pasien.getPenyakit() + " "
                + "bernama " + pasien.getNama());
    }
}
