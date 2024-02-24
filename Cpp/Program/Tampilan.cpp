#include <iostream>
#include <vector>
#include "Shirt.cpp" 

class Tampilan {
public:
    // Metode untuk menampilkan tabel dengan data yang diberikan.
    void Tampilan_tabel(vector<string> nama_header, vector<Shirt> data, string nama_tabel, vector<int> kolom) {
        // Inisialisasi variabel i dan j untuk penggunaan dalam loop.
        int i = 0, j = 0;

        // Mengatur lebar kolom berdasarkan panjang header dan data.
        for (i = 0; i < nama_header.size(); i++) {
            if (kolom[i] < (nama_header[i].length() + 2)) {
                kolom[i] = nama_header[i].length() + 2;
            }
            
        }

        // Menghitung panjang total kolom.
        int panjang_kolom = 0;
        for (i = 0; i < kolom.size(); i++) {
            panjang_kolom += kolom[i];
        }
        panjang_kolom += 8; // Menambahkan ruang untuk batas tabel.

        // Mencetak batas atas tabel.
        cout << "|";
        for (i = 0; i < panjang_kolom; i++) {
            cout << "=";
        }
        cout << "|" << endl;

        // Mencetak nama tabel di tengah.
        cout << "|";
        for (i = 0; i < (panjang_kolom - nama_tabel.length()) / 2; i++) {
            cout << " ";
        }
        cout << nama_tabel;
        for (i = 0; i < (panjang_kolom - nama_tabel.length()) / 2; i++) {
            cout << " ";
        }
        if ((panjang_kolom - nama_tabel.length()) % 2 == 1) {
            cout << " ";
        }
        cout << "|" << endl;

        // Mencetak batas atas nama tabel.
        cout << "|";
        for (i = 0; i < panjang_kolom; i++) {
            cout << "=";
        }
        cout << "|" << endl;

        // Mencetak header tabel.
        cout << "| ";
        for (i = 0; i < nama_header.size(); i++) {
            cout << nama_header[i];
            for (j = 0; j < (kolom[i] - 2) - nama_header[i].length(); j++) {
                cout << " ";
            }
            if (i + 1 != nama_header.size()) {
                cout << " | ";
            }
        }
        cout << " |" << endl;

        // Mencetak batas atas header tabel.
        cout << "|";
        for (i = 0; i < panjang_kolom; i++) {
            cout << "=";
        }
        cout << "|" << endl;

        // Mencetak data ke dalam tabel.
        for (i = 0; i < data.size(); i++) {
            cout << "| ";
            // Melakukan pencetakan data setiap kolom dengan padding yang sesuai.
            cout << data[i].get_idProduct();
            for (j = 0; j < (kolom[0] - 2) - data[i].get_idProduct().length(); j++) {
                cout << " ";
            }
            cout << " | ";

            cout << data[i].get_name();
            for (j = 0; j < (kolom[1] - 2) - data[i].get_name().length(); j++) {
                cout << " ";
            }
            cout << " | ";

            cout << data[i].get_brand();
            for (j = 0; j < (kolom[2] - 2) - data[i].get_brand().length(); j++) {
                cout << " ";
            }
            cout << " | ";

            cout << data[i].get_price();
            for (j = 0; j < (kolom[3] - 2) - to_string(data[i].get_price()).length(); j++) {
                cout << " ";
            }
            cout << " | ";

            cout << data[i].get_size();
            for (j = 0; j < (kolom[4] - 2) - to_string(data[i].get_size()).length(); j++) {
                cout << " ";
            }
            cout << " | ";

            cout << data[i].get_material();
            for (j = 0; j < (kolom[5] - 2) - data[i].get_material().length(); j++) {
                cout << " ";
            }
            cout << " | ";

            cout << data[i].get_gender();
            for (j = 0; j < (kolom[6] - 2) - data[i].get_gender().length(); j++) {
                cout << " ";
            }
            cout << " | ";

            cout << data[i].get_color();
            for (j = 0; j < (kolom[7] - 2) - data[i].get_color().length(); j++) {
                cout << " ";
            }
            cout << " | ";

            cout << data[i].get_sleeve_type();
            for (j = 0; j < (kolom[8] - 2) - data[i].get_sleeve_type().length(); j++) {
                cout << " ";
            }

            cout << " |" << endl;
        }

        // Mencetak batas bawah tabel.
        cout << "|";
        for (i = 0; i < panjang_kolom; i++) {
            cout << "=";
        }
        cout << "|" << endl;
    }

    // Metode untuk menampilkan header menu.
    void header_menu() {
        cout << endl;
        cout << "|===================================|" << endl;
        cout << "| Selamat datang di Pusat Manajemen |" << endl;
        cout << "|         & Tampilan Produk         |" << endl;
        cout << "|===================================|" << endl;
    }

    // Metode untuk menampilkan pilihan menu utama.
    void pilihan_menu_home() {
        cout << "| 1 | Tambahkan data                |" << endl;
        cout << "| 2 | Tampilkan data                |" << endl;
        cout << "| 3 | Keluar Program                |" << endl;
        cout << "|===================================|" << endl;
    }

    // Metode untuk menampilkan pilihan menu data.
    void pilihan_menu_data() {
        cout << "| 1 | Kemeja                        |" << endl;
        cout << "| 2 | Suit                          |" << endl;
        cout << "| 3 | Mantel                        |" << endl;
        cout << "| 4 | back                          |" << endl;
        cout << "|===================================|" << endl;
    }
};
