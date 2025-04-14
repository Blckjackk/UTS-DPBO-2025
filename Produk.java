// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

class Produk {
    private String idProduk;
    private String namaProduk;
    private String hargaProduk;
    private String beratProduk;
    private Perusahaan perusahaanPembuat;

    public Produk(String idProduk, String namaProduk, String hargaProduk, String beratProduk, Perusahaan perusahaanPembuat) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.beratProduk = beratProduk;
        this.perusahaanPembuat = perusahaanPembuat;
    }

    public String getIdProduk() { return idProduk; }
    public String getBeratProduk() { return beratProduk; }
    public Perusahaan getPerusahaanPembuat() { return perusahaanPembuat; }
    public String getNamaProduk() { return namaProduk; }
    public String getHargaProduk() { return hargaProduk; }
    public void setIdProduk(String idProduk) { this.idProduk = idProduk; }
    public void setBeratProduk(String beratProduk) { this.beratProduk = beratProduk; }
    public void setPerusahaanPembuat(Perusahaan perusahaanPembuat) { this.perusahaanPembuat = perusahaanPembuat; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    public void setHargaProduk(String hargaProduk) { this.hargaProduk = hargaProduk; }

    public void tampilkanInfoProduk() {
        System.out.println("==========================================");
        System.out.println("          Informasi Produk ");
        System.out.println("==========================================");
    
        System.out.println("ID Produk       : " + idProduk);
        System.out.println("Nama Produk     : " + namaProduk);
        System.out.println("Harga           : " + hargaProduk);
        System.out.println("Berat           : " + beratProduk);
        System.out.println("Dibuat oleh     : " + perusahaanPembuat.getNamaPerusahaan());
    
        System.out.println("==========================================");
    }
    
}