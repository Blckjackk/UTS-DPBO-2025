// Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam 
// mata kuliah Desain Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan 
// kecurangan seperti yang telah dispesifikasikan. Aamiin.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Disini kita akan membuat 5 orang pemilik Perusahaanbung
        PemilikPerusahaan pemilik1 = new PemilikPerusahaan("PML01", "Budi", "320123456", "Bandung");
        PemilikPerusahaan pemilik2 = new PemilikPerusahaan("PML02", "Joko", "320654321", "Jakarta");
        PemilikPerusahaan pemilik3 = new PemilikPerusahaan("PML03", "Siti", "321234567", "Surabaya");
        PemilikPerusahaan pemilik4 = new PemilikPerusahaan("PML04", "Agus", "321765432", "Yogyakarta");
        PemilikPerusahaan pemilik5 = new PemilikPerusahaan("PML05", "Ani", "320987654", "Medan");

        // Membuat 10 perusahaan untuk nanti seorang pemilik memiliki 1 perusahaan (tapi bisa aja sih seorang pemilik memiliki lebih dari 1 perusahaan)
        Perusahaan p1 = new Perusahaan("P001", "PT Maju", "Jakarta", "021123");
        Perusahaan p2 = new Perusahaan("P002", "PT Sejahtera", "Bandung", "022456");
        Perusahaan p3 = new Perusahaan("P003", "PT Karya", "Surabaya", "031789");
        Perusahaan p4 = new Perusahaan("P004", "PT Sukses", "Yogyakarta", "027890");
        Perusahaan p5 = new Perusahaan("P005", "PT Bangkit", "Medan", "061234");
        Perusahaan p6 = new Perusahaan("P006", "PT TigaCantik", "Jakarta", "021234");

        // Ini menambahkan dari pemilik perusahaan tertentunya
        System.out.println("[ MENAMBAHKAN PERUSAHAAN KE PEMILIK ]");
        pemilik1.tambahPerusahaan(p1);
        pemilik2.tambahPerusahaan(p2);
        pemilik3.tambahPerusahaan(p3);
        pemilik4.tambahPerusahaan(p4);
        pemilik5.tambahPerusahaan(p5);
        pemilik5.tambahPerusahaan(p6);

        // Membuat 10 perusahaan pengiriman
        PerusahaanPengiriman ekspedisi1 = new PerusahaanPengiriman("E001", "JNE", "Jakarta", "021111", "Nasional", "9000");
        PerusahaanPengiriman ekspedisi2 = new PerusahaanPengiriman("E002", "SiCepat", "Bandung", "022222", "Jawa", "8000");
        PerusahaanPengiriman ekspedisi3 = new PerusahaanPengiriman("E003", "Gojek", "Surabaya", "031333", "Jawa", "7500");
        PerusahaanPengiriman ekspedisi4 = new PerusahaanPengiriman("E004", "Grab", "Yogyakarta", "027444", "Nasional", "8500");
        PerusahaanPengiriman ekspedisi5 = new PerusahaanPengiriman("E005", "TIKI", "Medan", "061555", "Sumatra", "7000");

        // Membuat 10 karyawan
        Karyawan k1 = new Karyawan("K001", "Andi", "330011", "PT Maju", "5000000");
        Karyawan k2 = new Karyawan("K002", "Budi", "330022", "PT Sejahtera", "5500000");
        Karyawan k3 = new Karyawan("K003", "Cici", "330033", "PT Karya", "6000000");
        Karyawan k4 = new Karyawan("K004", "Dewi", "330044", "PT Sukses", "4500000");
        Karyawan k5 = new Karyawan("K005", "Eka", "330055", "PT Bangkit", "4800000");
        Karyawan k6 = new Karyawan("K006", "Fani", "330066", "PT Cemerlang", "5300000");
        Karyawan k7 = new Karyawan("K007", "Gilang", "330077", "PT Sejahtera Makmur", "5200000");
        Karyawan k8 = new Karyawan("K008", "Hadi", "330088", "PT Mandiri", "4900000");
        Karyawan k9 = new Karyawan("K009", "Indra", "330099", "PT Raya", "4700000");
        Karyawan k10 = new Karyawan("K010", "Januar", "330110", "PT Padu", "4600000");

        // Menambahkan karyawan ke perusahaan
        System.out.println("[ MENAMBAHKAN KARYAWAN KE PERUSAHAAN ]");
        p1.tambahKaryawan(k1);
        p2.tambahKaryawan(k2);
        p3.tambahKaryawan(k3);
        p4.tambahKaryawan(k4);
        p5.tambahKaryawan(k5);
        p1.tambahKaryawan(k6);
        p1.tambahKaryawan(k7);
        p2.tambahKaryawan(k8);
        p4.tambahKaryawan(k9);
        p5.tambahKaryawan(k10);

        // Membuat 10 produk
        Produk prod1 = new Produk("PR01", "Mouse", "50000", "0.3kg", p1);
        Produk prod2 = new Produk("PR02", "Keyboard", "150000", "1kg", p2);
        Produk prod3 = new Produk("PR03", "Monitor", "300000", "5kg", p3);
        Produk prod4 = new Produk("PR04", "Laptop", "800000", "2kg", p4);
        Produk prod5 = new Produk("PR05", "Smartphone", "200000", "0.5kg", p5);
        Produk prod6 = new Produk("PR06", "Tablet", "700000", "1.2kg", p2);
        Produk prod7 = new Produk("PR07", "Headphone", "100000", "0.3kg", p2);
        Produk prod8 = new Produk("PR08", "Printer", "600000", "3kg", p3);
        Produk prod9 = new Produk("PR09", "Camera", "500000", "1kg", p1);
        Produk prod10 = new Produk("PR10", "Speaker", "250000", "2kg", p4);

        // Menambahkan produk ke perusahaan
        System.out.println("[ MENAMBAHKAN PRODUK KE PERUSAHAAN ]");
        p1.produksiBarang(prod1);
        p2.produksiBarang(prod2);
        p3.produksiBarang(prod3);
        p4.produksiBarang(prod4);
        p5.produksiBarang(prod5);
        p2.produksiBarang(prod6);
        p2.produksiBarang(prod7);
        p3.produksiBarang(prod8);
        p1.produksiBarang(prod9);
        p4.produksiBarang(prod10);

        // Membuat 5 paket pengiriman
        PaketPengiriman paket1 = new PaketPengiriman("PKT001", "Susi", "Jl. Merdeka 10", "081234567", ekspedisi1);
        PaketPengiriman paket2 = new PaketPengiriman("PKT002", "Rina", "Jl. Raya 20", "081234568", ekspedisi2);
        PaketPengiriman paket3 = new PaketPengiriman("PKT003", "Doni", "Jl. Kemenangan 30", "081234569", ekspedisi3);
        PaketPengiriman paket4 = new PaketPengiriman("PKT004", "Tina", "Jl. Harmoni 40", "081234570", ekspedisi4);
        PaketPengiriman paket5 = new PaketPengiriman("PKT005", "Omar", "Jl. Pelita 50", "081234571", ekspedisi5);

        // Tampilkan semua data
        System.out.println("[ DAFTAR PEMILIK PERUSAHAAN ]");
        System.out.println("Pemilik 1: " + pemilik1.getNama());
        System.out.println("Pemilik 2: " + pemilik2.getNama());
        System.out.println("Pemilik 3: " + pemilik3.getNama());
        System.out.println("Pemilik 4: " + pemilik4.getNama());
        System.out.println("Pemilik 5: " + pemilik5.getNama());
        System.out.println("[ END DAFTAR PEMILIK PERUSAHAAN || END DAFTAR PEMILIK PERUSAHAAN ]");


        System.out.println("\n[ DAFTAR PERUSAHAAN ]");
        System.out.println("==========================================");
        System.out.println("     Daftar Perusahaan yang Dimiliki");
        System.out.println("==========================================");
        pemilik1.tampilkanPerusahaan();
        pemilik2.tampilkanPerusahaan();
        pemilik3.tampilkanPerusahaan();
        pemilik4.tampilkanPerusahaan();
        pemilik5.tampilkanPerusahaan();
        System.out.println("==========================================");

        System.out.println("[ END DAFTAR PERUSAHAAN || END DAFTAR PERUSAHAAN ]");
        


        System.out.println("\n[ DAFTAR KARYAWAN ]");
        p1.tampilkanKaryawan();
        p2.tampilkanKaryawan();
        p3.tampilkanKaryawan();
        p4.tampilkanKaryawan();
        p5.tampilkanKaryawan();
        System.out.println("==========================================");

        System.out.println("[ END DAFTAR KARYAWAN || END DAFTAR KARYAWAN ]");



        System.out.println("\n[ DAFTAR PRODUK ]");
        p1.tampilkanProduk();
        p2.tampilkanProduk();
        p3.tampilkanProduk();
        p4.tampilkanProduk();
        p5.tampilkanProduk();
        System.out.println("[ END DAFTAR PRODUK || END DAFTAR PRODUK ]");
        

        System.out.println("\n[ DAFTAR PAKET PENGIRIMAN ]");
        System.out.println("==========================================");
        System.out.println("            Informasi Paket");
        System.out.println("==========================================");
        paket1.tampilkanInfoPaket();
        paket2.tampilkanInfoPaket();
        paket3.tampilkanInfoPaket();
        paket4.tampilkanInfoPaket();
        paket5.tampilkanInfoPaket();
        System.out.println("[ END DAFTAR PENGIRIMAN || END DAFTAR PENGIRIMAN ]");
        
        
        // DISINI BAGIAN PENCARIAN DATA MENGGUNAKAN SCANNER
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n[ PENCARIAN DATA ]");
        System.out.println("1. Cari berdasarkan Nama Perusahaan");
        System.out.println("2. Cari berdasarkan ID Produk");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihanScannernya = scanner.nextInt();
        scanner.nextLine();  // Untuk Scan satu baris line (Termasuk sepasi)

        if (pilihanScannernya == 1) {
            System.out.print("Masukkan Nama Perusahaan: ");
            String namaPerusahaan = scanner.nextLine();
            boolean ditemukanTidak = false;
            for (PemilikPerusahaan pemilik : new PemilikPerusahaan[]{pemilik1, pemilik2, pemilik3, pemilik4, pemilik5}) {
                for (Perusahaan perusahaan : pemilik.getDaftarPerusahaan()) {
                    if (perusahaan.getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                      
                        System.out.println("\n=============================== Perusahaan Ditemukan ===============================");
                        System.out.println("ID Perusahaan      : " + perusahaan.getIdPerusahaan());
                        System.out.println("Nama Perusahaan    : " + perusahaan.getNamaPerusahaan());
                        System.out.println("Alamat Perusahaan  : " + perusahaan.getAlamatPerusahaan());
                        System.out.println("No Telepon Perusahaan : " + perusahaan.getNoTeleponPerusahaan());

                        System.out.println("\n---------------------------- Daftar Karyawan --------------------------------------");
                        if (perusahaan.getDaftarKaryawan().isEmpty()) {
                            System.out.println("Tidak ada karyawan terdaftar.");
                        } else {
                            System.out.println("Berikut adalah daftar karyawan yang terdaftar:");
                            for (Karyawan k : perusahaan.getDaftarKaryawan()) {
                                System.out.println("  - " + k.getNama());
                            }
                        }

                        System.out.println("\n---------------------------- Daftar Produk ---------------------------------------");
                        if (perusahaan.getDaftarProduk().isEmpty()) {
                            System.out.println("Tidak ada produk yang diproduksi.");
                        } else {
                            System.out.println("Berikut adalah daftar produk yang diproduksi:");
                            for (Produk p : perusahaan.getDaftarProduk()) {
                                System.out.println("  - " + p.getNamaProduk() + " (Harga: " + p.getHargaProduk() + ")");
                            }
                        }
                        System.out.println("====================================================================================");

                        
                        ditemukanTidak = true;
                    }
                }
            }
            if (!ditemukanTidak) {
                System.out.println("Perusahaan dengan nama tersebut tidak ditemukan.");
            }
        }
         else if (pilihanScannernya == 2) {
            System.out.print("Masukkan ID Produk: ");
            String idProduk = scanner.nextLine();
            boolean ditemukanTidak = false;
            for (Perusahaan p : new Perusahaan[]{p1, p2, p3, p4, p5}) {
                for (Produk prod : p.getDaftarProduk()) {
                    if (prod.getIdProduk().equalsIgnoreCase(idProduk)) {
                        System.out.println("Produk ditemukan: " + prod.getNamaProduk() + ", Harga: " + prod.getHargaProduk());
                        ditemukanTidak = true;
                    }
                }
            }
            if (!ditemukanTidak) {
                System.out.println("Produk dengan ID tersebut tidak ditemukan.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}
