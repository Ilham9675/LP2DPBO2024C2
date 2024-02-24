# LP2DPBO2024C2
## janji
Saya ilham akbar NIM [2201017] mengerjakan Latihan Praktikum 2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.


## Deskripsi Program

Program ini adalah implementasi dari paradigma Pemrograman Berorientasi Objek (OOP) yang dikembangkan dalam empat bahasa pemrograman utama: C++, Java, Python, dan PHP. Program ini memanfaatkan konsep Multi-level Inheritance, sebuah fitur penting dalam OOP.

Struktur kelas dalam program ini dimulai dengan kelas Product sebagai kelas dasar. Kelas Clothing mewarisi kelas Product, menambahkan atribut dan metode yang spesifik untuk produk pakaian. Selanjutnya, kelas Shirt mewarisi dari kelas Clothing, memperluas fungsionalitasnya dengan atribut dan metode yang khusus untuk jenis pakaian ‘kemeja’.

Selain itu, ada juga kelas Tampilan yang bertugas untuk menampilkan informasi produk. Ini mencakup detail seperti nama produk, harga, ukuran, dan lainnya. Kelas Tampilan ini memastikan bahwa informasi produk disajikan dengan cara yang konsisten dan rapi kepada pengguna.

## Desain Program

![Screenshot 2024-02-24 225019](https://github.com/Ilham9675/LP2DPBO2024C2/assets/117561201/3778fe0f-100c-4467-8d06-c30de21c7f89)

## Penjelasan Desain Program 

Program ini terdiri dari empat kelas utama: Product, Clothing, Shirt, dan Display. Tiga dari kelas ini (Product, Clothing, dan Shirt) mengimplementasikan konsep Multi-level Inheritance, menunjukkan hubungan hierarkis antara berbagai jenis produk.

Kelas Product adalah superclass bagi Clothing dan merupakan kelas dasar dalam hierarki ini. Kelas ini mendefinisikan atribut umum seperti idProduct, name, brand, dan price. Semua atribut ini bersifat private untuk mencegah akses langsung dari luar kelas, dan metode public disediakan untuk mengatur dan mengambil nilai atribut ini.

Kelas Clothing adalah subclass dari Product dan superclass bagi Shirt. Kelas ini mewarisi semua atribut dari Product dan menambahkan atribut spesifik seperti size, material, dan gender. Seperti Product, semua atribut ini bersifat private dan metode public disediakan untuk mengatur dan mengambil nilai atribut ini.

Kelas Shirt adalah subclass dari Clothing dan mewarisi semua atribut dari Clothing dan Product. Kelas ini menambahkan atribut lebih spesifik seperti color dan sleeve_type. Metode public disediakan untuk mengatur dan mengambil nilai atribut ini.

Kelas Display berdiri sendiri dan tidak mewarisi dari kelas lain. Kelas ini bertanggung jawab untuk menampilkan informasi tentang objek Shirt dalam format yang mudah dibaca. Meskipun kelas ini tidak memiliki atribut sendiri, ia memiliki metode untuk menampilkan menu pilihan dan tabel informasi produk.

Fitur utama yang disediakan oleh program ini adalah kemampuan untuk menambahkan dan menampilkan objek, memanfaatkan struktur kelas dan metode yang telah didefinisikan.

## Dokumentasi Program
Cpp, java dan Python

![Screenshot (579)](https://github.com/Ilham9675/LP2DPBO2024C2/assets/117561201/ffdda0a3-0016-4a6b-8ad3-a682884e852a)

php

![Screenshot (567)](https://github.com/Ilham9675/LP2DPBO2024C2/assets/117561201/8bc11177-7d2b-4cfb-a1d1-50bfb51c5f9b)