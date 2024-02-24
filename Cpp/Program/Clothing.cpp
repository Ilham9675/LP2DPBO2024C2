#include <string>
#include "Product.cpp"

class Clothing : public Product{
private:
    int size;              // Ukuran pakaian
    string material;  // Material pakaian
    string gender;    // Jenis kelamin yang ditargetkan oleh pakaian

public:
    // Konstruktor default untuk kelas Clothing.
    Clothing() {
        // Inisialisasi atribut pakaian ke nilai default.
        size = 0;            // Mengatur ukuran pakaian menjadi 0
        material = "";       // Mengatur material pakaian menjadi string kosong
        gender = "";         // Mengatur jenis kelamin yang ditargetkan oleh pakaian menjadi string kosong
    }

    // Metode setter untuk mengatur ukuran pakaian.
    void set_size(int size) {
        this->size = size;  // Mengatur ukuran pakaian dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur material pakaian.
    void set_material(string material) {
        this->material = material;  // Mengatur material pakaian dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur jenis kelamin yang ditargetkan oleh pakaian.
    void set_gender(string gender) {
        this->gender = gender;  // Mengatur jenis kelamin yang ditargetkan oleh pakaian dengan nilai dari parameter.
    }

    // Metode getter untuk mendapatkan ukuran pakaian.
    int get_size() {
        return this->size;  // Mengembalikan ukuran pakaian.
    }

    // Metode getter untuk mendapatkan material pakaian.
    std::string get_material() {
        return this->material;  // Mengembalikan material pakaian.
    }

    // Metode getter untuk mendapatkan jenis kelamin yang ditargetkan oleh pakaian.
    std::string get_gender() {
        return this->gender;  // Mengembalikan jenis kelamin yang ditargetkan oleh pakaian.
    }
};
