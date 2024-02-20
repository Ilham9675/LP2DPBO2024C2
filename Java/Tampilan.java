import java.util.ArrayList;

// Kelas Tampilan bertanggung jawab untuk menampilkan tabel data dan menu ke layar.
class Tampilan {
    
    // Metode untuk menampilkan tabel dengan data yang diberikan.
    void Tampilan_tabel(ArrayList<String> nama_headar, ArrayList<Shirt> data, String nama_tabel, ArrayList<Integer> kolom) {
        // Inisialisasi variabel i dan j untuk penggunaan dalam loop.
        int i = 0, j = 0;
        
        // Mengatur lebar kolom berdasarkan panjang header dan data.
        for (i = 0; i < nama_headar.size(); i++) {
            if (kolom.get(i) < (nama_headar.get(i).length() + 2)) {
                kolom.set(i, nama_headar.get(i).length() + 2);
            }
        }
        
        // Menghitung panjang total kolom.
        int panjang_kolom = 0;
        for (i = 0; i < kolom.size(); i++) {
            panjang_kolom += kolom.get(i);
        }
        panjang_kolom += 8; // Menambahkan ruang untuk batas tabel.
        
        // Mencetak batas atas tabel.
        System.out.print("|");
        for (i = 0; i < panjang_kolom; i++) {
            System.out.print("=");
        }
        System.out.println("|");
        
        // Mencetak nama tabel di tengah.
        System.out.print("|");
        for (i = 0; i < (panjang_kolom - nama_tabel.length()) / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(nama_tabel);
        for (i = 0; i < (panjang_kolom - nama_tabel.length()) / 2; i++) {
            System.out.print(" ");
        }
        if ((panjang_kolom - nama_tabel.length()) % 2 == 1) {
            System.out.print(" ");
        }
        System.out.println("|");
        
        // Mencetak batas atas nama tabel.
        System.out.print("|");
        for (i = 0; i < panjang_kolom; i++) {
            System.out.print("=");
        }
        System.out.println("|");
        
        // Mencetak header tabel.
        System.out.print("| ");
        for (i = 0; i < nama_headar.size(); i++) {
            System.out.print(nama_headar.get(i));
            for (j = 0; j < (kolom.get(i) - 2) - nama_headar.get(i).length(); j++) {
                System.out.print(" ");
            }
            if (i + 1 != nama_headar.size()) {
                System.out.print(" | ");
            }
        }
        System.out.println(" |");
        
        // Mencetak batas atas header tabel.
        System.out.print("|");
        for (i = 0; i < panjang_kolom; i++) {
            System.out.print("=");
        }
        System.out.println("|");

        // Mencetak data ke dalam tabel.
        for (i = 0; i < data.size(); i++) {
            System.out.print("| ");
            // Melakukan pencetakan data setiap kolom dengan padding yang sesuai.
            
            System.out.print(data.get(i).get_idProduct());
            for(j = 0;j <  (kolom.get(0) - 2) - data.get(i).get_idProduct().length();j++){
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(data.get(i).get_name());
            for(j = 0;j <  (kolom.get(1) - 2) - data.get(i).get_name().length();j++){
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(data.get(i).get_brand());
            for(j = 0;j <  (kolom.get(2) - 2) - data.get(i).get_brand().length();j++){
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(data.get(i).get_price());
            for(j = 0;j <  (kolom.get(3) - 2) - String.valueOf(data.get(i).get_price()).length();j++){
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(data.get(i).get_size());
            for(j = 0;j <  (kolom.get(4) - 2) - String.valueOf(data.get(i).get_size()).length();j++){
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(data.get(i).get_material());
            for(j = 0;j <  (kolom.get(5) - 2) - data.get(i).get_material().length();j++){
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(data.get(i).get_gender());
            for(j = 0;j <  (kolom.get(6) - 2) - data.get(i).get_gender().length();j++){
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(data.get(i).get_color());
            for(j = 0;j <  (kolom.get(7) - 2) - data.get(i).get_color().length();j++){
                System.out.print(" ");
            }
            System.out.print(" | ");

            System.out.print(data.get(i).get_sleeve_type());
            for(j = 0;j <  (kolom.get(8) - 2) - data.get(i).get_sleeve_type().length();j++){
                System.out.print(" ");
            }

            System.out.println(" |");
        }
        
        // Mencetak batas bawah tabel.
        System.out.print("|");
        for (i = 0; i < panjang_kolom; i++) {
            System.out.print("=");
        }
        System.out.println("|");
    }

    // Metode untuk menampilkan header menu.
    void header_menu() {
        System.out.println();
        System.out.println("|===================================|");
        System.out.println("| Selamat datang di Pusat Manajemen |");
        System.out.println("|         & Tampilan Produk         |");
        System.out.println("|===================================|");  
    }

    // Metode untuk menampilkan pilihan menu utama.
    void pilihan_menu_home() {
        System.out.println("| 1 | Tambahkan data                |");
        System.out.println("| 2 | Tampilkan data                |");
        System.out.println("| 3 | Keluar Program                |");
        System.out.println("|===================================|");
    }

    // Metode untuk menampilkan pilihan menu data.
    void pilihan_menu_data() {
        System.out.println("| 1 | Kemeja                        |");
        System.out.println("| 2 | Suit                          |");
        System.out.println("| 3 | Mantel                        |");
        System.out.println("| 4 | back                          |");
        System.out.println("|===================================|");
    }
}
