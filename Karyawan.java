// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

class Karyawan extends Person {
    private String tempatKerja;
    private String gajiPerBulan;

    public Karyawan(String id, String nama, String noKTP, String tempatKerja, String gajiPerBulan) {
        super(id, nama, noKTP);
        this.tempatKerja = tempatKerja;
        this.gajiPerBulan = gajiPerBulan;
    }

    public String getTempatKerja() { return tempatKerja; }
    public String getGajiPerBulan() { return gajiPerBulan; }
    public void setTempatKerja(String tempatKerja) { this.tempatKerja = tempatKerja; }
    public void setGajiPerBulan(String gajiPerBulan) { this.gajiPerBulan = gajiPerBulan; }
  
    public void tampilkanInfoKaryawan() {
        System.out.println("=====================================");
        System.out.println("         Informasi Karyawan          ");
        System.out.println("=====================================");
        System.out.println("ID Karyawan     : " + getId());
        System.out.println("Nama            : " + getNama());
        System.out.println("No KTP          : " + getNoKTP());
        System.out.println("Tempat Kerja    : " + tempatKerja);
        System.out.println("Gaji Per Bulan  : Rp" + gajiPerBulan);
        System.out.println("=====================================\n");
    }
    
}