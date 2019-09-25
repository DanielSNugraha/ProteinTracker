package ukdw.com.proteintracker.Model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String nohp;

    public Mahasiswa(String nama, String nim, String nohp){
        this.nama = nama;
        this.nim = nim;
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNpm() {
        return nim;
    }
    public void setNpm(String npm) {
        this.nim = npm;
    }
    public String getNohp() {
        return nohp;
    }
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
