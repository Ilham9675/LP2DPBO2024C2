// Membuat kelas Product untuk merepresentasikan suatu produk.
class Product {
    // Mendeklarasikan variabel instance private untuk menyimpan atribut produk.
    private String idProduct;  // ID produk
    private String name;       // Nama produk
    private String brand;      // Merek produk
    private int price;         // Harga produk

    // Konstruktor default untuk kelas Product.
    void Product() {
        // Inisialisasi atribut produk ke nilai default.
        idProduct = "";  // Mengatur ID produk menjadi string kosong
        name = "";       // Mengatur nama produk menjadi string kosong
        brand = "";      // Mengatur merek produk menjadi string kosong
        price = 0;       // Mengatur harga produk menjadi 0
    }

    // Metode setter untuk mengatur ID produk.
    void set_idProduct(String idProduct) {
        this.idProduct = idProduct;  // Mengatur ID produk dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur nama produk.
    void set_name(String name) {
        this.name = name;  // Mengatur nama produk dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur merek produk.
    void set_brand(String brand) {
        this.brand = brand;  // Mengatur merek produk dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur harga produk.
    void set_price(int price) {
        this.price = price;  // Mengatur harga produk dengan nilai dari parameter.
    }

    // Metode getter untuk mendapatkan ID produk.
    String get_idProduct() {
        return this.idProduct;  // Mengembalikan ID produk.
    }

    // Metode getter untuk mendapatkan nama produk.
    String get_name() {
        return this.name;  // Mengembalikan nama produk.
    }

    // Metode getter untuk mendapatkan merek produk.
    String get_brand() {
        return this.brand;  // Mengembalikan merek produk.
    }

    // Metode getter untuk mendapatkan harga produk.
    int get_price() {
        return this.price;  // Mengembalikan harga produk.
    }
}
