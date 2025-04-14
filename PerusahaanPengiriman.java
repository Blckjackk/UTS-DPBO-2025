// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

class PerusahaanPengiriman extends Perusahaan implements DapatMengirimkanPaket {
    private String wilayahLayanan;
    private String tarifPengiriman;

    public String getWilayahLayanan() { return wilayahLayanan; }
    public String getTarifPengiriman() { return tarifPengiriman; }
    public void setWilayahLayanan(String wilayah) { this.wilayahLayanan = wilayah; }
    public void setTarifPengiriman(String tarif) { this.tarifPengiriman = tarif; }


    public PerusahaanPengiriman(String id, String nama, String alamat, String noTelp, String wilayah, String tarif) {
        super(id, nama, alamat, noTelp);
        this.wilayahLayanan = wilayah;
        this.tarifPengiriman = tarif;
    }

    public void kirimPaket() {
        System.out.println("Paket dikirim...");
    }
}