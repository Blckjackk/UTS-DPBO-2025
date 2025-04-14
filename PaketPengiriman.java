// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

class PaketPengiriman {
    private String idPaket;
    private String namaPenerima;
    private String alamatTujuan;
    private String noTeleponPenerima;
    private PerusahaanPengiriman perusahaanPengirim;

    public PaketPengiriman(String id, String nama, String alamat, String noTelp, PerusahaanPengiriman perusahaan) {
        this.idPaket = id;
        this.namaPenerima = nama;
        this.alamatTujuan = alamat;
        this.noTeleponPenerima = noTelp;
        this.perusahaanPengirim = perusahaan;
    }

    public void tampilkanInfoPaket() {

    
        System.out.println("Paket ID      : " + idPaket);
        System.out.println("Penerima      : " + namaPenerima + " (" + noTeleponPenerima + ")");
        System.out.println("Alamat Tujuan : " + alamatTujuan);
        System.out.println("Dikirim Oleh  : " + perusahaanPengirim.getNamaPerusahaan());
        System.out.println("==========================================");
    }
    
}
