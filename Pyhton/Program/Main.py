from Tampilan import Tampilan  # Import kelas Tampilan dari file Tampilan.py
from Shirt import Shirt  # Import kelas Shirt dari file Shirt.py


# Membuat objek Tampilan untuk menampilkan menu dan tabel
tampilan = Tampilan()

# Membuat objek list untuk menyimpan panjang kolom untuk setiap header tabel
kolom = [0] * 9

# Membuat objek list untuk menyimpan data kemeja, setelan, dan mantel
data = [[] for _ in range(3)]

# Membuat objek list untuk menyimpan nama header
nama_header = ["idProduct", "name", "brand", "price",
                "size", "material", "gender",
                "color", "jenis lengan"]

# Memulai loop program
while True:
    # Menampilkan header menu utama
    
    tampilan.header_menu()
    tampilan.pilihan_menu_home()
    n = int(input("Masukan Pilihan : "))

    if n == 3:
        break

    if n == 1:
        # Menampilkan header menu untuk memilih jenis produk
        tampilan.header_menu()
        tampilan.pilihan_menu_data()
        m = int(input("Masukan Pilihan : "))

        if 1 <= m <= 3:
            # Membuat objek baru untuk menyimpan data kemeja, setelan, atau mantel
            temp = Shirt()

            print("masukan data id Product : ", end="")
            input_string = input()
            temp.set_idProduct(input_string)
            kolom[0] = max(kolom[0], len(input_string) + 2)

            print("masukan data name : ", end="")
            input_string = input()
            temp.set_name(input_string)
            kolom[1] = max(kolom[1], len(input_string) + 2)

            print("masukan data brand : ", end="")
            input_string = input()
            temp.set_brand(input_string)
            kolom[2] = max(kolom[2], len(input_string) + 2)

            print("masukan data price : ", end="")
            input_int = int(input())
            temp.set_price(input_int)
            kolom[3] = max(kolom[3], len(str(input_int)) + 2)

            print("masukan data size : ", end="")
            input_int = int(input())
            temp.set_size(input_int)
            kolom[4] = max(kolom[4], len(str(input_int)) + 2)

            print("masukan data material : ", end="")
            input_string = input()
            temp.set_material(input_string)
            kolom[5] = max(kolom[5], len(input_string) + 2)

            print("masukan data gender : ", end="")
            input_string = input()
            temp.set_gender(input_string)
            kolom[6] = max(kolom[6], len(input_string) + 2)

            print("masukan data color : ", end="")
            input_string = input()
            temp.set_color(input_string)
            kolom[7] = max(kolom[7], len(input_string) + 2)

            print("masukan data jenis lengan : ", end="")
            input_string = input()
            temp.set_sleeve_type(input_string)
            kolom[8] = max(kolom[8], len(input_string) + 2)

            data[m - 1].append(temp)
    elif n == 2:
        # Menampilkan header menu untuk memilih jenis produk yang akan ditampilkan
        tampilan.header_menu()
        tampilan.pilihan_menu_data()
        m = int(input("Masukan Pilihan : "))

        if 1 <= m <= 3:
            if m == 1:
                # Menampilkan tabel untuk produk kemeja
                tampilan.Tampilan_tabel(nama_header, data[0], "Produk Kemeja", kolom)
            elif m == 2:
                # Menampilkan tabel untuk produk setelan
                tampilan.Tampilan_tabel(nama_header, data[1], "Produk Setelan", kolom)
            elif m == 3:
                # Menampilkan tabel untuk produk mantel
                tampilan.Tampilan_tabel(nama_header, data[2], "Produk Mantel", kolom)

