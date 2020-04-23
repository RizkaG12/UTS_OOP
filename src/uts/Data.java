
package uts;


public class Data {
    private String nama;
    private String nim;
    private String kelas; 
    private String alamat;

    public Data() {
        nama = "";
        nim = "";
        kelas = "";
        alamat = "";
    }

    public Data(String nama, String nim, String kelas, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.alamat = alamat;
    }

    public void setNama(String nama) { this.nama = nama; }

    public void setNim(String nim) { this.nim = nim; }

    public void setKelas(String kelas) { this.kelas = kelas; }

    public void setAlamat(String tujuan) { this.alamat = alamat; }

    public String getNama() { return nama; }

    public String getNim() { return nim; }

    public String getKelas() { return kelas; }
    
    public String getAlamat() { return alamat; }

}
