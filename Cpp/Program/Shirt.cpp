#include <string>
#include "Clothing.cpp"

class Shirt : public Clothing{
private:
    string color;       // Warna kemeja
    string sleeve_type; // Jenis lengan kemeja

public:
    // Konstruktor default untuk kelas Shirt.
    Shirt() {
        // Inisialisasi atribut kemeja ke nilai default.
        color = "";         // Mengatur warna kemeja menjadi string kosong
        sleeve_type = "";   // Mengatur jenis lengan kemeja menjadi string kosong
    }

    // Metode setter untuk mengatur warna kemeja.
    void set_color(string color) {
        this->color = color;  // Mengatur warna kemeja dengan nilai dari parameter.
    }

    // Metode setter untuk mengatur jenis lengan kemeja.
    void set_sleeve_type(string sleeve_type) {
        this->sleeve_type = sleeve_type;  // Mengatur jenis lengan kemeja dengan nilai dari parameter.
    }

    // Metode getter untuk mendapatkan warna kemeja.
    string get_color() {
        return this->color;  // Mengembalikan warna kemeja.
    }

    // Metode getter untuk mendapatkan jenis lengan kemeja.
    string get_sleeve_type() {
        return this->sleeve_type;  // Mengembalikan jenis lengan kemeja.
    }
};
