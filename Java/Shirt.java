// Membuat kelas Shirt yang merupakan subclass dari kelas Clothing untuk merepresentasikan kemeja.
class Shirt extends Clothing {
    // Mendeklarasikan variabel instance private untuk menyimpan atribut kemeja.
    private String color;       // Warna kemeja
    private String sleeve_type; // Jenis lengan kemeja

    // Konstruktor default untuk kelas Shirt.
    void Shirt() {
        // Inisialisasi atribut kemeja ke nilai default.
        this.color = "";         // Mengatur warna kemeja menjadi string kosong
        this.sleeve_type = "";   // Mengatur jenis lengan kemeja menjadi string kosong
    }

    // Metode setter untuk mengatur warna kemeja.
    void set_color(String color) {
        this.color = color;  // Mengatur warna kemeja dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur jenis lengan kemeja.
    void set_sleeve_type(String sleeve_type) {
        this.sleeve_type = sleeve_type;  // Mengatur jenis lengan kemeja dengan nilai dari parameter.
    }

    // Metode getter untuk mendapatkan warna kemeja.
    String get_color() {
        return this.color;  // Mengembalikan warna kemeja.
    }

    // Metode getter untuk mendapatkan jenis lengan kemeja.
    String get_sleeve_type() {
        return this.sleeve_type;  // Mengembalikan jenis lengan kemeja.
    }
}
