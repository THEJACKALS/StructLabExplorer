# StructLab Explorer - Data Structure Operation Simulator

StructLab Explorer adalah versi refactor dari tugas Struktur Data lama yang sebelumnya hanya menampilkan demo Binary Search Tree secara hardcoded. Versi ini dibuat sebagai project portfolio kecil yang tetap ringan, berjalan di terminal, dan lebih mudah dipelajari.

## Ringkasan

Project ini menggunakan bahasa pemrograman Java dan fokus pada implementasi Binary Search Tree (BST). Pengguna dapat menambahkan data, mencari data, melihat traversal, melihat ringkasan pohon, dan mereset data melalui menu CLI.

## Fitur

- Menu utama berbasis terminal.
- Insert data ke Binary Search Tree.
- Pencarian data di dalam BST.
- Traversal Pre Order, In Order, dan Post Order.
- Ringkasan pohon: akar, jumlah node, dan tinggi pohon.
- Validasi input agar program tidak mudah error.
- Reset pohon untuk mengulang simulasi.

## Struktur Folder

```text
StructLab-Explorer/
├── README.md
├── src/
│   ├── Main.java
│   ├── BinaryTree.java
│   └── Node.java
├── docs/
│   └── explanation.md
└── examples/
    └── sample-output.txt
```

## Cara Menjalankan

### Opsi 1 - Menggunakan file .bat di Windows

1. Klik dua kali file `run.bat`.
2. Script akan meng-compile file Java dari folder `src`.
3. Program akan langsung dijalankan di terminal.

### Opsi 2 - Manual lewat terminal

```bash
javac -d build src/*.java
java -cp build Main
```

Jika folder `build` belum ada, Java akan membuatnya saat kompilasi jika perintah dijalankan dengan tool yang mendukung, atau buat folder tersebut secara manual terlebih dahulu.

## Cara Menggunakan Program

1. Jalankan program.
2. Pilih menu yang tersedia.
3. Masukkan angka saat diminta.
4. Gunakan menu traversal untuk melihat urutan data pada pohon.
5. Gunakan menu reset jika ingin mengosongkan pohon.

## Catatan Implementasi

- Nilai yang lebih kecil masuk ke kiri.
- Nilai yang sama dan lebih besar masuk ke kanan.
- Traversal ditampilkan dengan pemisah `->` agar lebih rapi.
- Input menu dan angka divalidasi dengan `Scanner` dan parsing manual.

## Output Contoh

Lihat file [examples/sample-output.txt](examples/sample-output.txt).

## Dokumen Konsep

Lihat file [docs/explanation.md](docs/explanation.md).

## Shortcut Windows

Gunakan file `run.bat` untuk compile dan menjalankan program dengan satu klik.

## Lisensi

Project ini dibuat untuk tujuan pembelajaran dan portfolio akademik.