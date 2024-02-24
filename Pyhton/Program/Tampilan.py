class Tampilan:
    # Metode untuk menampilkan tabel dengan data yang diberikan.
    def Tampilan_tabel(self, nama_header, data, nama_tabel, kolom):
        # Inisialisasi variabel i dan j untuk penggunaan dalam loop.
        
        for i in range(len(nama_header)):
            if kolom[i] < len(nama_header[i]) + 2:
                kolom[i] = len(nama_header[i]) + 2
        panjang_kolom = sum(kolom) + 8  # Menghitung panjang total kolom.
        
        
        
        # Mencetak batas atas tabel.
        print("|" + "=" * panjang_kolom + "|")
        
        # Mencetak nama tabel di tengah.
        print("|" + " " * ((panjang_kolom - len(nama_tabel)) // 2) + nama_tabel, end="")
        if (panjang_kolom - len(nama_tabel)) % 2 == 1:
            print(" ", end="")
        print(" " * ((panjang_kolom - len(nama_tabel)) // 2) + "|")
        
        # Mencetak batas atas nama tabel.
        print("|" + "=" * panjang_kolom + "|")
        
        # Mencetak header tabel.
        print("| ", end="")
        for i in range(len(nama_header)):
            print(nama_header[i] + " " * (kolom[i] - (len(nama_header[i]) + 2)) + " |", end=" ")
        print()
        
        # Mencetak batas atas header tabel.
        print("|" + "=" * panjang_kolom + "|")
        
        # Mencetak data ke dalam tabel.
        for row in data:
            print("| ", end="")
            
            print(row.get_idProduct() + " " * (kolom[0] - (len(row.get_idProduct()) + 2)) + " |", end=" ")
            print(row.get_name() + " " * (kolom[1] - (len(row.get_name()) + 2)) + " |", end=" ")
            print(row.get_brand() + " " * (kolom[2] - (len(row.get_brand()) + 2)) + " |", end=" ")
            print(str(row.get_price()) + " " * (kolom[3] - (len(str(row.get_price())) + 2)) + " |", end=" ")
            
            print(str(row.get_size()) + " " * (kolom[4] - (len(str(row.get_size())) + 2)) + " |", end=" ")
            print(row.get_material() + " " * (kolom[5] - (len(row.get_material()) + 2)) + " |", end=" ")
            print(row.get_gender() + " " * (kolom[6] - (len(row.get_gender()) + 2)) + " |", end=" ")
            
            print(row.get_color() + " " * (kolom[7] - (len(row.get_color()) + 2)) + " |", end=" ")
            print(row.get_sleeve_type() + " " * (kolom[8] - (len(row.get_sleeve_type()) + 2)) + " |", end=" ")
            
            print()
        
        # Mencetak batas bawah tabel.
        print("|" + "=" * panjang_kolom + "|")

    # Metode untuk menampilkan header menu.
    def header_menu(self):
        print("\n|===================================|")
        print("| Selamat datang di Pusat Manajemen |")
        print("|         & Tampilan Produk         |")
        print("|===================================|")

    # Metode untuk menampilkan pilihan menu utama.
    def pilihan_menu_home(self):
        print("| 1 | Tambahkan data                |")
        print("| 2 | Tampilkan data                |")
        print("| 3 | Keluar Program                |")
        print("|===================================|")

    # Metode untuk menampilkan pilihan menu data.
    def pilihan_menu_data(self):
        print("| 1 | Kemeja                        |")
        print("| 2 | Suit                          |")
        print("| 3 | Mantel                        |")
        print("| 4 | back                          |")
        print("|===================================|")
