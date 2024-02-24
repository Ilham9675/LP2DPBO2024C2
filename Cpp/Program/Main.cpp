#include <iostream>
#include <vector>
#include <string>
#include "Tampilan.cpp" 

using namespace std;

int main() {
    // Deklarasi variabel input
    string input_string = "";
    int input_int = 0, n = 0, m = 0;

    // Membuat objek Tampilan untuk menampilkan menu dan tabel
    Tampilan tampilan;
    
    // Membuat objek vector untuk menyimpan panjang kolom untuk setiap header tabel
    vector<int> kolom(9, 0);

    // Membuat objek vector untuk menyimpan data kemeja, setelan, dan mantel
    vector<vector<Shirt>> data(3);

    // Membuat objek vector untuk menyimpan nama header
    vector<string> nama_header = {"idProduct", "name", "brand", "price",
                                            "size", "material", "gender",
                                            "color", "jenis lengan"};

    // Memulai loop program
    do {
        // Menampilkan header menu utama
        tampilan.header_menu();
        tampilan.pilihan_menu_home();
        cout << "Masukan Pilihan : ";
        cin >> n;

        switch (n) {
            case 1:
                // Menampilkan header menu untuk memilih jenis produk
                tampilan.header_menu();
                tampilan.pilihan_menu_data();
                cout << "Masukan Pilihan : ";
                cin >> m;

                if (m > 0 && m < 4) {
                    // Membuat objek baru untuk menyimpan data kemeja, setelan, atau mantel
                    Shirt temp;

                    cin.ignore(); // Ignore newline character left by previous input operation

                    cout << "masukan data id Product : ";
                    getline(cin, input_string);
                    temp.set_idProduct(input_string);
                    if (kolom[0] < input_string.length() + 2) {
                        kolom[0] = input_string.length() + 2;
                    }

                    cout << "masukan data name : ";
                    getline(cin, input_string);
                    temp.set_name(input_string);
                    if (kolom[1] < input_string.length() + 2) {
                        kolom[1] = input_string.length() + 2;
                    }

                    cout << "masukan data brand : ";
                    getline(cin, input_string);
                    temp.set_brand(input_string);
                    if (kolom[2] < input_string.length() + 2) {
                        kolom[2] = input_string.length() + 2;
                    }

                    cout << "masukan data price : ";
                    cin >> input_int;
                    temp.set_price(input_int);
                    if (kolom[3] < to_string(input_int).length() + 2) {
                        kolom[3] = to_string(input_int).length() + 2;
                    }

                    cout << "masukan data size : ";
                    cin >> input_int;
                    temp.set_size(input_int);
                    if (kolom[4] < to_string(input_int).length() + 2) {
                        kolom[4] = to_string(input_int).length() + 2;
                    }

                    cin.ignore(); // Ignore newline character left by previous input operation

                    cout << "masukan data material : ";
                    getline(cin, input_string);
                    temp.set_material(input_string);
                    if (kolom[5] < input_string.length() + 2) {
                        kolom[5] = input_string.length() + 2;
                    }

                    cout << "masukan data gender : ";
                    getline(cin, input_string);
                    temp.set_gender(input_string);
                    if (kolom[6] < input_string.length() + 2) {
                        kolom[6] = input_string.length() + 2;
                    }

                    cout << "masukan data color : ";
                    getline(cin, input_string);
                    temp.set_color(input_string);
                    if (kolom[7] < input_string.length() + 2) {
                        kolom[7] = input_string.length() + 2;
                    }

                    cout << "masukan data jenis lengan : ";
                    getline(cin, input_string);
                    temp.set_sleeve_type(input_string);
                    if (kolom[8] < input_string.length() + 2) {
                        kolom[8] = input_string.length() + 2;
                    }

                    data[m - 1].push_back(temp);
                }
                break;
            case 2:
                // Menampilkan header menu untuk memilih jenis produk yang akan ditampilkan
                tampilan.header_menu();
                tampilan.pilihan_menu_data();
                cout << "Masukan Pilihan : ";
                cin >> m;

                switch (m) {
                    case 1:
                        // Menampilkan tabel untuk produk kemeja
                        tampilan.Tampilan_tabel(nama_header, data[0], "Produk Kemeja", kolom);
                        break;
                    case 2:
                        // Menampilkan tabel untuk produk setelan
                        tampilan.Tampilan_tabel(nama_header, data[1], "Produk Setelan", kolom);
                        break;
                    case 3:
                        // Menampilkan tabel untuk produk mantel
                        tampilan.Tampilan_tabel(nama_header, data[2], "Produk Mantel", kolom);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

    } while (n != 3);

    return 0;
}
