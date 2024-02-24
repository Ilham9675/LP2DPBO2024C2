<?php
// Membuat kelas Clothing yang merupakan subclass dari kelas Product untuk merepresentasikan pakaian.
require ('Product.php');
class Clothing extends Product {
    // Mendeklarasikan variabel instance private untuk menyimpan atribut pakaian.
    private $size;        // Ukuran pakaian
    private $material;    // Material pakaian
    private $gender;      // Jenis kelamin yang ditargetkan oleh pakaian

    // Konstruktor default untuk kelas Clothing.
    public function __construct() {
        // Memanggil konstruktor kelas induk (Product).
        parent::__construct();
        // Inisialisasi atribut pakaian ke nilai default.
        $this->size = 0;        // Mengatur ukuran pakaian menjadi 0
        $this->material = "";   // Mengatur material pakaian menjadi string kosong
        $this->gender = "";     // Mengatur jenis kelamin yang ditargetkan oleh pakaian menjadi string kosong
    }

    // Metode setter untuk mengatur ukuran pakaian.
    public function set_size($size) {
        $this->size = $size;  // Mengatur ukuran pakaian dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur material pakaian.
    public function set_material($material) {
        $this->material = $material;  // Mengatur material pakaian dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur jenis kelamin yang ditargetkan oleh pakaian.
    public function set_gender($gender) {
        $this->gender = $gender;  // Mengatur jenis kelamin yang ditargetkan oleh pakaian dengan nilai dari parameter.
    }

    // Metode getter untuk mendapatkan ukuran pakaian.
    public function get_size() {
        return $this->size;  // Mengembalikan ukuran pakaian.
    }

    // Metode getter untuk mendapatkan material pakaian.
    public function get_material() {
        return $this->material;  // Mengembalikan material pakaian.
    }

    // Metode getter untuk mendapatkan jenis kelamin yang ditargetkan oleh pakaian.
    public function get_gender() {
        return $this->gender;  // Mengembalikan jenis kelamin yang ditargetkan oleh pakaian.
    }
}
?>
