// Membuat kelas Clothing yang merupakan subclass dari kelas Product untuk merepresentasikan pakaian.
class Clothing extends Product {
    // Mendeklarasikan variabel instance private untuk menyimpan atribut pakaian.
    private int size;        // Ukuran pakaian
    private String material; // Material pakaian
    private String gender;   // Jenis kelamin yang ditargetkan oleh pakaian

    // Konstruktor default untuk kelas Clothing.
    void Clothing() {
        // Inisialisasi atribut pakaian ke nilai default.
        this.size = 0;        // Mengatur ukuran pakaian menjadi 0
        this.material = "";  // Mengatur material pakaian menjadi string kosong
        this.gender = "";    // Mengatur jenis kelamin yang ditargetkan oleh pakaian menjadi string kosong
    }

    // Metode setter untuk mengatur ukuran pakaian.
    void set_size(int size) {
        this.size = size;  // Mengatur ukuran pakaian dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur material pakaian.
    void set_material(String material) {
        this.material = material;  // Mengatur material pakaian dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur jenis kelamin yang ditargetkan oleh pakaian.
    void set_gender(String gender) {
        this.gender = gender;  // Mengatur jenis kelamin yang ditargetkan oleh pakaian dengan nilai dari parameter.
    }

    // Metode getter untuk mendapatkan ukuran pakaian.
    int get_size() {
        return this.size;  // Mengembalikan ukuran pakaian.
    }

    // Metode getter untuk mendapatkan material pakaian.
    String get_material() {
        return this.material;  // Mengembalikan material pakaian.
    }

    // Metode getter untuk mendapatkan jenis kelamin yang ditargetkan oleh pakaian.
    String get_gender() {
        return this.gender;  // Mengembalikan jenis kelamin yang ditargetkan oleh pakaian.
    }
}
