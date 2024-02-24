<?php
// Membuat kelas Product untuk merepresentasikan suatu produk.
class Product {
    // Mendeklarasikan variabel instance private untuk menyimpan atribut produk.
    private $idProduct;  // ID produk
    private $name;       // Nama produk
    private $brand;      // Merek produk
    private $price;      // Harga produk

    // Konstruktor default untuk kelas Product.
    public function __construct() {
        // Inisialisasi atribut produk ke nilai default.
        $this->idProduct = "";  // Mengatur ID produk menjadi string kosong
        $this->name = "";       // Mengatur nama produk menjadi string kosong
        $this->brand = "";      // Mengatur merek produk menjadi string kosong
        $this->price = 0;       // Mengatur harga produk menjadi 0
    }

    // Metode setter untuk mengatur ID produk.
    public function set_idProduct($idProduct) {
        $this->idProduct = $idProduct;  // Mengatur ID produk dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur nama produk.
    public function set_name($name) {
        $this->name = $name;  // Mengatur nama produk dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur merek produk.
    public function set_brand($brand) {
        $this->brand = $brand;  // Mengatur merek produk dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur harga produk.
    public function set_price($price) {
        $this->price = $price;  // Mengatur harga produk dengan nilai dari parameter.
    }

    // Metode getter untuk mendapatkan ID produk.
    public function get_idProduct() {
        return $this->idProduct;  // Mengembalikan ID produk.
    }

    // Metode getter untuk mendapatkan nama produk.
    public function get_name() {
        return $this->name;  // Mengembalikan nama produk.
    }

    // Metode getter untuk mendapatkan merek produk.
    public function get_brand() {
        return $this->brand;  // Mengembalikan merek produk.
    }

    // Metode getter untuk mendapatkan harga produk.
    public function get_price() {
        return $this->price;  // Mengembalikan harga produk.
    }
}
?>

