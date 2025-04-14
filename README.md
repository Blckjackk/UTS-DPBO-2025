# LAPORAN TUGAS UTS DPBO

## 📚 Mata Kuliah
**Desain Pemrograman Berorientasi Objek**

## 🧪 Materi Pengujian
Interface, Abstract Class, dan Konsep OOP lainnya

---

## 👤 Identitas Mahasiswa

- **Nama:** Ahmad Izzuddin Azzam  
- **NIM:** 2300492  
- **Kelas:** Ilmu Komputer C2 - 2023  
- **Tugas:** Ujian Tengah Semester (UTS)  

### 📝 Janji Mahasiswa
> _“Saya Ahmad Izzuddin Azzam dengan NIM 2300492 mengerjakan Ujian Tengah Semester dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.”_

---

## 🧩 Penjelasan Diagram & Konsep OOP

Program ini mengimplementasikan sebuah sistem pendataan **produk dan perusahaan** berbasis **Object-Oriented Programming**. Komponen penting dalam struktur program ini meliputi:

- **3 Interface**
- **1 Abstract Class**
- **Berbagai kelas saling terhubung**: Produk, Perusahaan, Karyawan, Pemilik, dsb.

### ✨ Struktur Kelas:

- **`Person`**: Abstract class, superclass untuk `Karyawan` dan `PemilikPerusahaan`.
- **`Perusahaan`**: Mengimplementasikan interface `MemproduksiProduk` dan `MemilikiKaryawan`.
- **`Marketplace` & `PerusahaanPengiriman`**: Subclass dari `Perusahaan`.
- **`PerusahaanPengiriman`**: Juga mengimplementasikan interface `DapatMengirimkanPaket`.
- **Komposisi**: Perusahaan menyimpan array of object untuk daftar **Karyawan** dan **Produk**.
- **`PaketPengiriman`**: Berelasi komposisi dengan `PerusahaanPengiriman`.

---

## 🔍 Penjelasan Fitur Searching

Program menyediakan 2 opsi pencarian data:

1. **Berdasarkan Nama Perusahaan**  
   - Menampilkan data lengkap perusahaan, karyawan, dan produk jika ditemukan.

2. **Berdasarkan ID Produk**  
   - Menampilkan **nama produk dan harga** jika ID produk ditemukan.

Jika input tidak valid, program akan memberi peringatan.

---

## 🧠 Penjelasan `Main.java`

1. **Data Pemilik Perusahaan** (5 data)
2. **Data Perusahaan** (6 data)
3. **Asosiasi Pemilik ↔ Perusahaan**
4. **Perusahaan Pengiriman** (5 data)
5. **Data Karyawan** (10 data)
6. **Data Produk** (10 data)
7. **Paket Pengiriman** (5 data)
8. **Output & Tampilan Informasi Lengkap**

---

## ⚙️ Penjelasan Interface

| Interface             | Fungsi Utama                                                    | Diimplementasikan Oleh          |
|-----------------------|------------------------------------------------------------------|---------------------------------|
| `DapatMengirimkanPaket` | Mengirimkan paket (`kirimPaket()`)                             | `PerusahaanPengiriman`         |
| `MemilikiKaryawan`     | Menambahkan & menampilkan karyawan (`tambahKaryawan()`, `tampilkanKaryawan()`) | `Perusahaan`                   |
| `MemproduksiProduk`    | Produksi & tampilan produk (`produksiBarang()`, `tampilkanProduk()`) | `Perusahaan`                   |

---

## 🧱 Penjelasan Abstract Class

- **`Person`** adalah abstract class.
- Tidak bisa diinstansiasi langsung.
- Menjadi dasar bagi kelas seperti `Karyawan` dan `PemilikPerusahaan`.

---

## 📸 Dokumentasi

> *(Tambahkan screenshot dari hasil running program di folder /images atau tampilkan di sini jika perlu)*

---
