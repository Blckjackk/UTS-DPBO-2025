// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

import java.util.ArrayList;

class Perusahaan implements MemilikiKaryawan, MemproduksiProduk {
    private String idPerusahaan;
    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String noTeleponPerusahaan;
    private ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    public Perusahaan(String id, String nama, String alamat, String noTelp) {
        this.idPerusahaan = id;
        this.namaPerusahaan = nama;
        this.alamatPerusahaan = alamat;
        this.noTeleponPerusahaan = noTelp;
    }

    public String getIdPerusahaan() { return idPerusahaan; }
    public String getAlamatPerusahaan() { return alamatPerusahaan; }
    public String getNoTeleponPerusahaan() { return noTeleponPerusahaan; }
    public String getNamaPerusahaan() { return namaPerusahaan; }
    public void setIdPerusahaan(String id) { this.idPerusahaan = id; }
    public void setAlamatPerusahaan(String alamat) { this.alamatPerusahaan = alamat; }
    public void setNoTeleponPerusahaan(String noTelp) { this.noTeleponPerusahaan = noTelp; }
    public void setNamaPerusahaan(String nama) { this.namaPerusahaan = nama; }


    public void tambahKaryawan(Karyawan k) {
        daftarKaryawan.add(k);
    }

    public void tampilkanKaryawan() {
        System.out.println("          Daftar Karyawan " + namaPerusahaan);
    
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Tidak ada karyawan terdaftar.");
        } else {
            for (Karyawan k : daftarKaryawan) {
                System.out.println("- " + k.getNama());
            }
            System.out.println("\n");

        }
    
    }

    public ArrayList<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }

    public void setDaftarKaryawan(ArrayList<Karyawan> daftarKaryawan) {
        this.daftarKaryawan = daftarKaryawan;
    }

    public void setDaftarProduk(ArrayList<Produk> daftarProduk) {
        this.daftarProduk = daftarProduk;
    }


    public ArrayList<Produk> getDaftarProduk() {
        return daftarProduk;
    }
    

    public void produksiBarang(Produk p) {
        daftarProduk.add(p);
    }

    public void tampilkanProduk() {
        System.out.println("     Daftar Produk " + namaPerusahaan);
    
        if (daftarProduk.isEmpty()) {
            System.out.println("Tidak ada produk yang diproduksi.");
        } else {
            for (Produk p : daftarProduk) {
                System.out.println("- " + p.getNamaProduk() + " (" + p.getHargaProduk() + ")");
            }
            System.out.println("\n");

        }
    
    }
}
