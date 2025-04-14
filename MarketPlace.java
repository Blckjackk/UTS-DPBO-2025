// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

import java.util.ArrayList;

class MarketPlace extends Perusahaan {
    private String idMarketPlace;
    private ArrayList<PerusahaanPengiriman> daftarPerusahaan = new ArrayList<>();

    public MarketPlace(String id, String nama, String alamat, String noTelp, String idMarketPlace) {
        super(id, nama, alamat, noTelp);
        this.idMarketPlace = idMarketPlace;
    }

    public String getIdMarketPlace() { return idMarketPlace; }
    public void setIdMarketPlace(String idMarketPlace) { this.idMarketPlace = idMarketPlace; }


    public void tambahEkspedisi(PerusahaanPengiriman ekspedisi) {
        daftarPerusahaan.add(ekspedisi);
    }

    public void tampilkanEkspedisi() {
        System.out.println("==========================================");
        System.out.println("    Daftar Ekspedisi di " + getNamaPerusahaan());
        System.out.println("==========================================");
    
        if (daftarPerusahaan.isEmpty()) {
            System.out.println("Belum ada ekspedisi yang terdaftar.");
        } else {
            int nomor = 1;
            for (PerusahaanPengiriman ekspedisi : daftarPerusahaan) {
                System.out.println(nomor + ". " + ekspedisi.getNamaPerusahaan());
                nomor++;
            }
        }
    
        System.out.println("==========================================\n");
    }
    
}