package minggu10;

public class Pasien {
    private String Nama, Penyakit ;

    
    Pasien (String Nama, String Penyakit){
        this.Nama = Nama ;
        this.Penyakit = Penyakit;
    }

    public String getNama() {
        return Nama;
    }

    public String getPenyakit() {
        return Penyakit;
    }
}
