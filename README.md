# Frozen King

Aplikasi desktop berbasis **Java Swing** untuk membantu pengelolaan operasional usaha Frozen King. Aplikasi ini menggunakan **MySQL** sebagai basis data dan menyediakan modul pengelolaan data, transaksi, serta laporan.

## Fitur

Berdasarkan struktur source code yang tersedia, aplikasi mencakup:

- **Autentikasi pengguna**: login dan pendaftaran akun.
- **Data master**: barang, jenis barang, member, supplier, dan pengguna.
- **Persediaan**: transaksi barang masuk dan barang keluar.
- **Pemesanan**: pencatatan pemesanan beserta detailnya.
- **Penjualan**: pencatatan transaksi penjualan beserta detailnya.
- **Laporan**: laporan data barang, barang masuk, barang keluar, pemesanan, dan penjualan.
- **Pengaturan akun**: pengaturan aplikasi dan penggantian password.

## Teknologi

- Java (source/target compatibility: **Java 8**)
- Java Swing — antarmuka desktop
- MySQL — penyimpanan data
- JDBC / MySQL Connector — koneksi database
- NetBeans Ant Project — pengelolaan dan build project
- JasperReports — pembuatan laporan
- JCalendar dan library UI pendukung

## Persyaratan

Sebelum menjalankan aplikasi, siapkan:

1. JDK 8 atau versi yang kompatibel dengan project.
2. NetBeans IDE yang mendukung Java Ant Project.
3. MySQL Server (misalnya melalui XAMPP).
4. Database bernama `frozenking`.
5. Library/dependency yang tercantum di project, termasuk MySQL Connector dan JasperReports.

## Konfigurasi Database

Secara default, koneksi database berada di:

`src/config/koneksi.java`

Konfigurasi bawaan:

| Pengaturan | Nilai |
|---|---|
| Host | `localhost` |
| Port | `3306` |
| Database | `frozenking` |
| Username | `root` |
| Password | kosong |

Pastikan MySQL berjalan dan database `frozenking` sudah dibuat serta diisi dengan struktur tabel yang sesuai dengan model/DAO aplikasi.

Contoh membuat database kosong melalui MySQL:

```sql
CREATE DATABASE frozenking;
```

**Catatan:** Arsip project yang diberikan tidak menyertakan file dump/skema SQL. Perintah di atas hanya membuat databasenya; tabel dan data awal tetap perlu disiapkan sesuai kebutuhan aplikasi. Jangan menganggap database kosong sudah cukup untuk menjalankan seluruh fitur.

Untuk penggunaan di lingkungan lain, sesuaikan URL, username, dan password pada `koneksi.java`. Sebaiknya kredensial tidak ditulis langsung di source code untuk deployment produksi.

## Menjalankan Project di NetBeans

1. Ekstrak folder project `Frozen King`.
2. Buka NetBeans IDE.
3. Pilih **File → Open Project**, lalu pilih folder `Frozen King`.
4. Pastikan library/dependency project terdeteksi. Periksa bagian **Libraries** jika ada library yang belum tersedia.
5. Jalankan MySQL dan siapkan database `frozenking` beserta tabel-tabel yang dibutuhkan.
6. Periksa konfigurasi koneksi pada `src/config/koneksi.java`.
7. Jalankan project dengan **Run Project (F6)**.

Class utama aplikasi:

```text
kingfrozen.frozenKing
```

Saat dijalankan, aplikasi akan membuka form login.

## Build dan Menjalankan JAR

Project menggunakan sistem build Ant dari NetBeans. Untuk membuat file distribusi:

1. Klik kanan project di NetBeans.
2. Pilih **Clean and Build**.
3. Hasil build akan berada di folder `dist/`.

Jika JAR dan seluruh library distribusinya sudah tersedia, aplikasi dapat dijalankan dari folder `dist` dengan:

```bash
java -jar Frozen_King.jar
```

Pastikan folder `dist/lib` tetap berada bersama JAR apabila dibutuhkan oleh manifest/classpath aplikasi.

## Struktur Direktori

```text
Frozen King/
├── src/
│   ├── Main/       # Dashboard dan navigasi utama
│   ├── View/       # Form dan tampilan aplikasi
│   ├── config/     # Konfigurasi koneksi database
│   ├── dao/        # Akses data ke database
│   ├── model/      # Model/representasi data
│   ├── service/    # Logika layanan aplikasi
│   ├── tabelmodel/ # TableModel untuk JTable
│   ├── report/     # Template dan file laporan JasperReports
│   └── util/       # Fungsi utilitas
├── lib/            # Library pendukung
├── nbproject/      # Konfigurasi project NetBeans
├── build.xml       # Konfigurasi build Ant
└── dist/           # Hasil build/distribusi
```

## Catatan

- README ini disusun berdasarkan source code dan konfigurasi yang terdapat di arsip project.
- File SQL untuk membuat seluruh tabel tidak ditemukan di dalam arsip. Siapkan skema database yang cocok sebelum menjalankan aplikasi.
- Konfigurasi koneksi saat ini menggunakan kredensial default lokal (`root` tanpa password). Ubah sesuai konfigurasi MySQL milik Anda.
- Beberapa library eksternal mungkin perlu ditambahkan kembali melalui NetBeans apabila path library pada komputer pengembang berbeda.

## Pengembang

**Frozen King**  
Aplikasi desktop manajemen persediaan, pemesanan, dan penjualan.
