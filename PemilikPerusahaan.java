// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

import java.util.ArrayList;

class PemilikPerusahaan extends Person {
    private String alamat;
    private ArrayList<Perusahaan> daftarPerusahaan = new ArrayList<>();

    public PemilikPerusahaan(String id, String nama, String noKTP, String alamat) {
        super(id, nama, noKTP);
        this.alamat = alamat;
    }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }


    public void tambahPerusahaan(Perusahaan p) {
        daftarPerusahaan.add(p);
    }

    public ArrayList<Perusahaan> getDaftarPerusahaan() {
        return daftarPerusahaan;
    }
    
    

    public void tampilkanPerusahaan() {

        
        System.out.println("Perusahaan milik " + getNama() + ":");
        if (daftarPerusahaan.isEmpty()) {
            System.out.println("Tidak ada perusahaan yang terdaftar.");
        } else {
            for (Perusahaan p : daftarPerusahaan) {
                System.out.println("- " + p.getNamaPerusahaan());
            }
          
        }
    
    }
    
}