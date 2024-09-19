# Implementasi Struktur Data Graph untuk Katalog Kendaraan Bermotor

**Proyek ini mengimplementasikan struktur data Graph menggunakan bahasa pemrograman Java untuk membantu calon pembeli menentukan kendaraan yang sesuai dengan tipe dan spesifikasi yang mereka butuhkan.** Dengan memanfaatkan kekuatan Graph, sistem ini menyediakan pencarian yang efisien serta perbandingan antara berbagai kendaraan berdasarkan tipe, fitur, dan spesifikasi yang diinginkan oleh pembeli.

## Deskripsi Proyek

Tujuan utama dari proyek ini adalah untuk meningkatkan pengalaman pengguna dalam mencari kendaraan bermotor yang ideal. Dengan menggunakan struktur data **Graph**, proyek ini memungkinkan pencarian kendaraan berdasarkan hubungan dan keterkaitan antar-tipe dan spesifikasi kendaraan. Setiap kendaraan direpresentasikan sebagai simpul (node) dalam Graph, sedangkan relasi antara spesifikasi atau tipe kendaraan diwakili oleh sisi (edge).

Melalui pendekatan ini, pengguna dapat dengan cepat mendapatkan rekomendasi kendaraan berdasarkan preferensi dan kriteria tertentu, seperti jenis mesin, kapasitas, efisiensi bahan bakar, atau fitur lainnya. Ini membuat proses pencarian kendaraan menjadi lebih efisien dan terorganisir.

## Fitur Utama

1. **Struktur Data Graph untuk Kendaraan**  
   Menggunakan struktur data Graph, setiap kendaraan dikelompokkan berdasarkan tipe dan spesifikasi. Graph memudahkan untuk mencari dan membandingkan kendaraan dengan tipe atau fitur yang serupa.

2. **Pencarian Kendaraan Berdasarkan Kriteria**  
   Pengguna dapat melakukan pencarian kendaraan berdasarkan tipe atau spesifikasi seperti jenis mesin, konsumsi bahan bakar, kapasitas penumpang, atau fitur keamanan. Hasil pencarian menampilkan daftar kendaraan yang sesuai dengan preferensi pengguna.

3. **Perbandingan Kendaraan**  
   Proyek ini memungkinkan pengguna untuk melakukan perbandingan langsung antar-kendaraan. Struktur data Graph memungkinkan untuk dengan cepat menavigasi dan membandingkan kendaraan yang memiliki spesifikasi atau tipe yang mirip.

4. **Efisiensi Pencarian**  
   Dengan struktur data Graph, sistem memaksimalkan efisiensi dalam pencarian kendaraan. Hal ini memastikan bahwa pengguna mendapatkan hasil yang relevan dengan cepat tanpa perlu memeriksa setiap kendaraan satu per satu.

## Teknologi yang Digunakan

- **Java**: Bahasa pemrograman utama yang digunakan untuk mengimplementasikan struktur data Graph dan algoritma pencarian.
- **Struktur Data Graph**: Digunakan untuk mengelola keterkaitan antar-kendaraan berdasarkan spesifikasi dan tipe.
- **Algoritma Pencarian**: Algoritma pencarian seperti **DFS** (Depth-First Search) dan **BFS** (Breadth-First Search) digunakan untuk menjelajahi Graph dan mencari kendaraan yang sesuai dengan kriteria yang diinginkan pengguna.

## Diagram Representasi

Proyek ini menggunakan diagram Graph untuk merepresentasikan hubungan antar-tipe kendaraan dan spesifikasinya. Berikut adalah contoh visualisasi Graph untuk beberapa kendaraan:

<div style="display: flex; align-items: center;">
  <img src="https://github.com/RusdyZain/StrukturDataGraph/assets/99545514/54f86756-4b3c-41d4-90c7-ff1f84e6a663" alt="Diagram Kendaraan" style="max-width: 50%;">
  <img src="https://github.com/RusdyZain/StrukturDataGraph/assets/99545514/5b1a5cdc-3c92-47a0-a446-9a6a02e6ea76" alt="Visualisasi Graph" style="max-width: 50%;">
</div>

## Cara Kerja

1. **Pembuatan Graph**  
   Setiap kendaraan dimasukkan sebagai node dalam Graph, dengan tipe dan spesifikasi yang relevan dihubungkan melalui edge. Ini memungkinkan sistem untuk menyimpan dan mengelola berbagai kendaraan dengan efisien.

2. **Algoritma Pencarian**  
   Pengguna memasukkan kriteria pencarian seperti tipe kendaraan atau fitur tertentu. Algoritma pencarian kemudian bekerja untuk menemukan semua node yang memenuhi kriteria tersebut.

3. **Perbandingan dan Rekomendasi**  
   Setelah pencarian selesai, sistem memberikan rekomendasi kendaraan yang memenuhi spesifikasi yang diinginkan. Pengguna juga dapat memilih beberapa kendaraan untuk dibandingkan secara langsung.

## Cara Memulai

Untuk menjalankan proyek ini di lingkungan lokal Anda, ikuti langkah-langkah berikut:

1. **Clone repositori**:
   ```bash
   git clone https://github.com/RusdyZain/StrukturDataGraph.git
   ```

2. **Import proyek ke IDE**:  
   Anda dapat menggunakan IDE seperti **IntelliJ IDEA** atau **Eclipse** untuk membuka proyek.

3. **Compile dan Jalankan**:
   - Pastikan Java Development Kit (JDK) sudah terinstall.
   - Compile kode dan jalankan program menggunakan perintah:
     ```bash
     javac Main.java
     java Main
     ```

4. **Tes Pencarian**:  
   Masukkan tipe atau spesifikasi kendaraan yang Anda inginkan, dan sistem akan menampilkan hasil pencarian sesuai dengan kriteria tersebut.

## Pengembangan Lebih Lanjut

Beberapa pengembangan yang dapat dilakukan pada proyek ini meliputi:
- **Penambahan Kendaraan Baru**: Memperluas katalog kendaraan dengan lebih banyak tipe dan spesifikasi kendaraan.
- **Visualisasi Graph**: Menambahkan fitur visualisasi Graph yang lebih interaktif agar pengguna dapat melihat keterkaitan antar-kendaraan dengan lebih jelas.
- **Integrasi dengan Database**: Menyimpan data kendaraan dan spesifikasinya dalam database untuk memudahkan pengelolaan dan mempercepat pencarian.

## Kontribusi

Kami sangat terbuka terhadap kontribusi dari komunitas! Jika Anda ingin berkontribusi pada proyek ini, silakan ikuti langkah berikut:

1. **Fork repositori ini**.
2. Buat branch baru untuk fitur yang ingin Anda tambahkan (`git checkout -b fitur-baru`).
3. Commit perubahan Anda (`git commit -m 'Menambahkan fitur baru'`).
4. Push branch ke repositori (`git push origin fitur-baru`).
5. Buat pull request dan kami akan meninjau kontribusi Anda.
