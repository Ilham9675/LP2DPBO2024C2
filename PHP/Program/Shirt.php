<?php
// Membuat kelas Shirt yang merupakan subclass dari kelas Clothing untuk merepresentasikan kemeja.
require ('Clothing.php');
class Shirt extends Clothing {
    // Mendeklarasikan variabel instance private untuk menyimpan atribut kemeja.
    private $color;        // Warna kemeja
    private $sleeve_type;  // Jenis lengan kemeja

    // Konstruktor default untuk kelas Shirt.
    public function __construct() {
        // Memanggil konstruktor kelas induk (Clothing).
        parent::__construct();
        // Inisialisasi atribut kemeja ke nilai default.
        $this->color = "";         // Mengatur warna kemeja menjadi string kosong
        $this->sleeve_type = "";   // Mengatur jenis lengan kemeja menjadi string kosong
    }

    // Metode setter untuk mengatur warna kemeja.
    public function set_color($color) {
        $this->color = $color;  // Mengatur warna kemeja dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur jenis lengan kemeja.
    public function set_sleeve_type($sleeve_type) {
        $this->sleeve_type = $sleeve_type;  // Mengatur jenis lengan kemeja dengan nilai dari parameter.
    }

    // Metode getter untuk mendapatkan warna kemeja.
    public function get_color() {
        return $this->color;  // Mengembalikan warna kemeja.
    }

    // Metode getter untuk mendapatkan jenis lengan kemeja.
    public function get_sleeve_type() {
        return $this->sleeve_type;  // Mengembalikan jenis lengan kemeja.
    }
}
?>
