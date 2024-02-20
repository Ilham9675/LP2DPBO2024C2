import java.util.Scanner;
import java.util.ArrayList;

// Kelas utama yang berisi metode main untuk menjalankan program.
public class Main {
    public static void main(String[] args){
        
        // Deklarasi variabel input
        String input_string = "";
        int input_int = 0,i = 0,n = 0,m= 0;
        
        // Membuat ArrayList untuk menyimpan panjang kolom untuk setiap header tabel
        ArrayList<Integer> kolom = new ArrayList<>();
        for(i = 0;i < 9;i++){
            kolom.add(0);
        }

        // Membuat ArrayList untuk menyimpan data kemeja, setelan, dan mantel
        ArrayList<ArrayList<Shirt>> data = new ArrayList<>();
        
        data.add(0,new ArrayList<>());
        data.add(1,new ArrayList<>());
        data.add(2,new ArrayList<>());
        
        // Inisialisasi scanner untuk menerima input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Membuat objek Tampilan untuk menampilkan menu dan tabel
        Tampilan tampilan = new Tampilan();
        ArrayList<String> nama_header = new ArrayList<>();
        nama_header.add("idProduct");
        nama_header.add("name");
        nama_header.add("brand");
        nama_header.add("price");

        nama_header.add("size");
        nama_header.add("material");
        nama_header.add("gender");

        nama_header.add("color");
        nama_header.add("jenis lengan");
        int cek = 0;

        // Memulai loop program
        do{
            // Menampilkan header menu utama
            tampilan.header_menu();
            tampilan.pilihan_menu_home();
            System.out.print("Masukan Pilihan : ");
        
            // Menerima input dari pengguna untuk memilih opsi menu utama
            try{
                n = sc.nextInt(); 
            }
            catch(Exception e){
                System.out.println("The input is not an integer!"); 
            }

            switch (n) {
                case 1:
                    // Menampilkan header menu untuk memilih jenis produk
                    tampilan.header_menu();
                    tampilan.pilihan_menu_data();
                    System.out.print("Masukan Pilihan : ");
        

                    try{
                        m = sc.nextInt(); 
                    }
                    catch(Exception e){
                        System.out.println("The input is not an integer!"); 
                    }

                    if(0 < m && m < 4){
                        // Membuat objek baru untuk menyimpan data kemeja, setelan, atau mantel
                        Shirt temp = new Shirt();
                        sc.nextLine();
                        System.out.print("masukan data id Product : ");
                        input_string = sc.nextLine(); 
                        temp.set_idProduct(input_string);
                        if(kolom.get(0) < input_string.length() + 2){
                            kolom.set(0, input_string.length() + 2);
                        }
                        
                        System.out.print("masukan data name : ");
                        input_string = sc.nextLine(); 
                        temp.set_name(input_string);
                        if(kolom.get(1) < input_string.length() + 2){
                            kolom.set(1, input_string.length() + 2);
                        }
                        
                        System.out.print("masukan data brand : ");
                        input_string = sc.nextLine(); 
                        temp.set_brand(input_string);
                        if(kolom.get(2) < input_string.length() + 2){
                            kolom.set(2, input_string.length() + 2);
                        }
                        System.out.print("masukan data price : ");
                        input_int = sc.nextInt(); 
                        
                        temp.set_price(input_int);
                        if(kolom.get(3) < String.valueOf(input_int).length() + 2){
                            kolom.set(3, String.valueOf(input_int).length() + 2);
                        }
                        System.out.print("masukan data size : ");
                        input_int = sc.nextInt(); 
                        
                        temp.set_size(input_int);
                        if(kolom.get(4) < String.valueOf(input_int).length() + 2){
                            kolom.set(4, String.valueOf(input_int).length() + 2);
                        }
                        sc.nextLine();
                        System.out.print("masukan data material : ");
                        input_string = sc.nextLine(); 
                        
                        temp.set_material(input_string);
                        if(kolom.get(5) < input_string.length() + 2){
                            kolom.set(5, input_string.length() + 2);
                        }
                        
                        System.out.print("masukan data gender : ");
                        input_string = sc.nextLine(); 
                        
                        temp.set_gender(input_string);
                        if(kolom.get(6) < input_string.length() + 2){
                            kolom.set(6, input_string.length() + 2);
                        }
                        
                        System.out.print("masukan data color : ");
                        input_string = sc.nextLine(); 
                        
                        temp.set_color(input_string);
                        if(kolom.get(7) < input_string.length() + 2){
                            kolom.set(7, input_string.length() + 2);
                        }
                        
                        System.out.print("masukan data jenis lengan : ");
                        input_string = sc.nextLine(); 
                        if(kolom.get(8) < input_string.length() + 2){
                            kolom.set(8, input_string.length() + 2);
                        }
                        temp.set_sleeve_type(input_string);
                        ArrayList<Shirt> sem = new ArrayList<>(data.get(m-1));
                        sem.add(temp);
                        data.set(m-1, sem);
                        
                        System.out.println(m-1);
                    }
                    break;
                case 2:
                    // Menampilkan header menu untuk memilih jenis produk yang akan ditampilkan
                    tampilan.header_menu();
                    tampilan.pilihan_menu_data();
                    System.out.print("Masukan Pilihan : ");
        

                    try{
                        m = sc.nextInt(); 
                    }
                    catch(Exception e){
                        System.out.println("The input is not an integer!"); 
                    }

                    switch (m) {
                        case 1:
                            // Menampilkan tabel untuk produk kemeja
                            tampilan.Tampilan_tabel(nama_header,data.get(0),"Produk Kemeja",kolom);
                            break;

                        case 2:
                            // Menampilkan tabel untuk produk setelan
                            tampilan.Tampilan_tabel(nama_header,data.get(1),"Produk Suit",kolom);
                        break;
                        case 3:
                            // Menampilkan tabel untuk produk mantel
                            tampilan.Tampilan_tabel(nama_header,data.get(2),"Produk Mantel",kolom);
                        break;
                        default:
                            break;
                    }
                    break;
                default:
                    cek = 1;
                    break;
            }

        } while(cek == 0);   
    }
}
