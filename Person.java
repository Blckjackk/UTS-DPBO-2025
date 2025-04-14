// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

abstract class Person {
    private String id;
    private String nama;
    private String noKTP;

    public Person(String id, String nama, String noKTP) {
        this.id = id;
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() { return nama; }
    public String getNoKTP() { return noKTP; }
    public String getId() { return id; }
    public void setNama(String nama) { this.nama = nama; }
    public void setNoKTP(String noKTP) { this.noKTP = noKTP; }
    public void setId(String id) { this.id = id; }
    
}
