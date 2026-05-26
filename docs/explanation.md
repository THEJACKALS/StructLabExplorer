# Penjelasan Konsep Struktur Data

## Struktur Data yang Digunakan

Project ini menggunakan **Binary Search Tree (BST)**.

BST adalah struktur data pohon biner yang menyimpan data dengan aturan berikut:

- Nilai di subtree kiri lebih kecil dari node saat ini.
- Nilai di subtree kanan lebih besar atau sama dengan node saat ini.

Aturan ini membuat pencarian dan traversal menjadi lebih mudah dipahami untuk tujuan pembelajaran.

## Komponen Utama

### Node

Setiap node menyimpan:

- `value`: data integer.
- `leftChild`: referensi ke node kiri.
- `rightChild`: referensi ke node kanan.

### BinaryTree

Class `BinaryTree` mengelola seluruh operasi pohon, seperti:

- menambahkan data,
- mencari data,
- menghitung jumlah node,
- menghitung tinggi pohon,
- menghasilkan traversal.

## Alur Operasi

### 1. Insert

Saat user menambahkan angka baru:

1. Program mulai dari root.
2. Jika node masih kosong, angka baru menjadi root.
3. Jika angka lebih kecil, program bergerak ke kiri.
4. Jika angka lebih besar atau sama, program bergerak ke kanan.
5. Proses berulang sampai menemukan posisi kosong.

### 2. Search

Saat mencari data:

1. Program membandingkan nilai yang dicari dengan node aktif.
2. Jika sama, data ditemukan.
3. Jika lebih kecil, pencarian ke kiri.
4. Jika lebih besar, pencarian ke kanan.
5. Jika node kosong, data tidak ditemukan.

### 3. Traversal

Project ini menampilkan tiga traversal standar BST:

- **Pre Order**: root, kiri, kanan.
- **In Order**: kiri, root, kanan.
- **Post Order**: kiri, kanan, root.

Traversal digunakan untuk melihat urutan data berdasarkan struktur pohon.

## Validasi Input

Program membaca input sebagai teks lalu mencoba mengubahnya ke integer.

Jika input bukan angka bulat, program akan meminta user mengulang.

Ini membuat program lebih aman untuk digunakan dari terminal.

## Kenapa BST Cocok untuk Project Ini

- Mudah dijelaskan secara visual dan logis.
- Cocok untuk tugas Struktur Data.
- Menunjukkan konsep rekursi.
- Memiliki operasi dasar yang umum dipelajari di kelas.