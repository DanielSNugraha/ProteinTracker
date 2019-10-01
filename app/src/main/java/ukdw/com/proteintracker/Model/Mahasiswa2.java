package ukdw.com.proteintracker.Model;

public class Mahasiswa2 {
    private String nama;
    private String nim;
    private String gender;
    private String hobi;
    private String citacita;
    private String motto;
    private int foto;

    public Mahasiswa2(String nama, String nim, String gender, String hobi,
                       String citacita, String motto, int foto) {
        this.nama = nama;
        this.nim = nim;
        this.gender = gender;
        this.hobi = hobi;
        this.citacita = citacita;
        this.motto = motto;
        this.foto = foto;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() { return nim; }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobi() { return hobi; }
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getCita() { return citacita; }
    public void setCita(String citacita) {
        this.citacita = citacita;
    }

    public String getMotto() {
        return motto;
    }
    public void setMotto(String motto) {
        this.motto = motto;
    }

    public int getFoto() { return foto; }
    public void setFoto(int imageResource) { this.foto = foto;
    }
}
