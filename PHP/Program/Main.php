<?php
    // Mengimpor kelas Tampilan dan Shirt
    require ('Tampilan.php');
    require ('Shirt.php');
    
    // Membuat objek 1 untuk setiap jenis pakaian: kemeja, setelan (suit), dan mantel
    $Kemeja[] = new Shirt();
    $Suit[] = new Shirt();
    $Mantel[] = new Shirt();

    $Kemeja[0]->set_idProduct("004");
    $Kemeja[0]->set_name("Kemeja Denim Levis");
    $Kemeja[0]->set_brand("Levis");
    $Kemeja[0]->set_price("500000");
    $Kemeja[0]->set_size("40");
    $Kemeja[0]->set_material("Denim");
    $Kemeja[0]->set_gender("Laki-laki");
    $Kemeja[0]->set_color("Biru");
    $Kemeja[0]->set_sleeve_type("Panjang");


    $Suit[0]->set_idProduct("005");
    $Suit[0]->set_name("Suit Bisnis Hugo Boss");
    $Suit[0]->set_brand("Hugo Boss");
    $Suit[0]->set_price("2000000");
    $Suit[0]->set_size("50");
    $Suit[0]->set_material("Wool");
    $Suit[0]->set_gender("Laki-laki");
    $Suit[0]->set_color("Hitam");
    $Suit[0]->set_sleeve_type("Panjang");

 
    $Mantel[0]->set_idProduct("006");
    $Mantel[0]->set_name("Mantel Musim Dingin Columbia");
    $Mantel[0]->set_brand("Columbia");
    $Mantel[0]->set_price("1200000");
    $Mantel[0]->set_size("46");
    $Mantel[0]->set_material("Fleece");
    $Mantel[0]->set_gender("Perempuan");
    $Mantel[0]->set_color("Abu-abu");
    $Mantel[0]->set_sleeve_type("Panjang");

    // Membuat objek 2 untuk setiap jenis pakaian: kemeja, setelan (suit), dan mantel
    $Kemeja[] = new Shirt();
    $Suit[] = new Shirt();
    $Mantel[] = new Shirt();
   
    $Kemeja[1]->set_idProduct("007");
    $Kemeja[1]->set_name("Kemeja Kasual Uniqlo");
    $Kemeja[1]->set_brand("Uniqlo");
    $Kemeja[1]->set_price("350000");
    $Kemeja[1]->set_size("38");
    $Kemeja[1]->set_material("Katun");
    $Kemeja[1]->set_gender("Perempuan");
    $Kemeja[1]->set_color("Putih");
    $Kemeja[1]->set_sleeve_type("Pendek");


    $Suit[1]->set_idProduct("008");
    $Suit[1]->set_name("Suit Pernikahan Gucci");
    $Suit[1]->set_brand("Gucci");
    $Suit[1]->set_price("4000000");
    $Suit[1]->set_size("52");
    $Suit[1]->set_material("Silk");
    $Suit[1]->set_gender("Laki-laki");
    $Suit[1]->set_color("Putih");
    $Suit[1]->set_sleeve_type("Panjang");


    $Mantel[1]->set_idProduct("009");
    $Mantel[1]->set_name("Mantel Musim Dingin North Face");
    $Mantel[1]->set_brand("North Face");
    $Mantel[1]->set_price("1300000");
    $Mantel[1]->set_size("48");
    $Mantel[1]->set_material("Fleece");
    $Mantel[1]->set_gender("Laki-laki");
    $Mantel[1]->set_color("Hitam");
    $Mantel[1]->set_sleeve_type("Panjang");


    // Membuat objek 3 untuk setiap jenis pakaian: kemeja, setelan (suit), dan mantel
    $Kemeja[] = new Shirt();
    $Suit[] = new Shirt();
    $Mantel[] = new Shirt();

    $Kemeja[2]->set_idProduct("010");
    $Kemeja[2]->set_name("Kemeja Oxford Brooks Brothers");
    $Kemeja[2]->set_brand("Brooks Brothers");
    $Kemeja[2]->set_price("600000");
    $Kemeja[2]->set_size("42");
    $Kemeja[2]->set_material("Oxford");
    $Kemeja[2]->set_gender("Laki-laki");
    $Kemeja[2]->set_color("Putih");
    $Kemeja[2]->set_sleeve_type("Panjang");


    $Suit[2]->set_idProduct("011");
    $Suit[2]->set_name("Suit Formal Armani");
    $Suit[2]->set_brand("Armani");
    $Suit[2]->set_price("3000000");
    $Suit[2]->set_size("54");
    $Suit[2]->set_material("Wool");
    $Suit[2]->set_gender("Laki-laki");
    $Suit[2]->set_color("Hitam");
    $Suit[2]->set_sleeve_type("Panjang");


    $Mantel[2]->set_idProduct("012");
    $Mantel[2]->set_name("Mantel Hujan Patagonia");
    $Mantel[2]->set_brand("Patagonia");
    $Mantel[2]->set_price("900000");
    $Mantel[2]->set_size("50");
    $Mantel[2]->set_material("Waterproof");
    $Mantel[2]->set_gender("Perempuan");
    $Mantel[2]->set_color("Hijau");
    $Mantel[2]->set_sleeve_type("Panjang");


    // Membuat objek 4 untuk setiap jenis pakaian: kemeja, setelan (suit), dan mantel
    $Kemeja[] = new Shirt();
    $Suit[] = new Shirt();
    $Mantel[] = new Shirt();

    $Kemeja[3]->set_idProduct("013");
    $Kemeja[3]->set_name("Kemeja Linen Zara");
    $Kemeja[3]->set_brand("Zara");
    $Kemeja[3]->set_price("400000");
    $Kemeja[3]->set_size("44");
    $Kemeja[3]->set_material("Linen");
    $Kemeja[3]->set_gender("Perempuan");
    $Kemeja[3]->set_color("Biru");
    $Kemeja[3]->set_sleeve_type("Pendek");


    $Suit[3]->set_idProduct("014");
    $Suit[3]->set_name("Suit Bisnis Tommy Hilfiger");
    $Suit[3]->set_brand("Tommy Hilfiger");
    $Suit[3]->set_price("2500000");
    $Suit[3]->set_size("56");
    $Suit[3]->set_material("Wool");
    $Suit[3]->set_gender("Laki-laki");
    $Suit[3]->set_color("Abu-abu");
    $Suit[3]->set_sleeve_type("Panjang");


    $Mantel[3]->set_idProduct("015");
    $Mantel[3]->set_name("Mantel Musim Dingin H&M");
    $Mantel[3]->set_brand("H&M");
    $Mantel[3]->set_price("700000");
    $Mantel[3]->set_size("52");
    $Mantel[3]->set_material("Fleece");
    $Mantel[3]->set_gender("Laki-laki");
    $Mantel[3]->set_color("Coklat");
    $Mantel[3]->set_sleeve_type("Panjang");


    // Membuat objek 5 untuk setiap jenis pakaian: kemeja, setelan (suit), dan mantel
    $Kemeja[] = new Shirt();
    $Suit[] = new Shirt();
    $Mantel[] = new Shirt();
    $Kemeja[4]->set_idProduct("016");
    $Kemeja[4]->set_name("Kemeja Denim Gap");
    $Kemeja[4]->set_brand("Gap");
    $Kemeja[4]->set_price("450000");
    $Kemeja[4]->set_size("46");
    $Kemeja[4]->set_material("Denim");
    $Kemeja[4]->set_gender("Perempuan");
    $Kemeja[4]->set_color("Biru");
    $Kemeja[4]->set_sleeve_type("Panjang");


    $Suit[4]->set_idProduct("017");
    $Suit[4]->set_name("Suit Pernikahan Versace");
    $Suit[4]->set_brand("Versace");
    $Suit[4]->set_price("5000000");
    $Suit[4]->set_size("58");
    $Suit[4]->set_material("Silk");
    $Suit[4]->set_gender("Laki-laki");
    $Suit[4]->set_color("Putih");
    $Suit[4]->set_sleeve_type("Panjang");


    $Mantel[4]->set_idProduct("018");
    $Mantel[4]->set_name("Mantel Hujan Columbia");
    $Mantel[4]->set_brand("Columbia");
    $Mantel[4]->set_price("1100000");
    $Mantel[4]->set_size("54");
    $Mantel[4]->set_material("Waterproof");
    $Mantel[4]->set_gender("Perempuan");
    $Mantel[4]->set_color("Kuning");
    $Mantel[4]->set_sleeve_type("Panjang");

    // Menampilkan data dalam tabel HTML untuk setiap jenis pakaian
    $tabel = new Tampilan();
    $nama_header = array("idProduct", "name", "brand", "price", "size", "material", "gender", "color", "jenis lengan");

    // Menampilkan data untuk kemeja
    echo "Data 1";
    $tabel->tampilanTabel($nama_header,$Kemeja,"Kemeja");

    // Menampilkan data untuk setelan (suit)
    echo "Data 2";
    $tabel->tampilanTabel($nama_header,$Suit,"Suit");

    // Menampilkan data untuk mantel
    echo "Data 3";
    $tabel->tampilanTabel($nama_header,$Mantel,"Mantel");
    


?>