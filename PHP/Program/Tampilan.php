<?php
// Kelas Tampilan bertanggung jawab untuk menampilkan tabel data dan menu ke layar.
class Tampilan {
    
    // Metode untuk menampilkan tabel dengan data yang diberikan.
    public function tampilanTabel($nama_header, $data, $nama_tabel) {
        echo "<table border='1'>";
        echo "<tr>";
        for($i = 0;$i < count($nama_header);$i++) {
            echo "<td>".$nama_header[$i]."</td>";
        }
        echo "</tr>";
        // Mengisi baris tabel dengan data
        for ($i = 0; $i < count($data); $i++) {
            echo "<tr>";
            echo "<td>".$data[$i]->get_idProduct()."</td>";
            echo "<td>".$data[$i]->get_name()."</td>";
            echo "<td>".$data[$i]->get_brand()."</td>";
            echo "<td>".$data[$i]->get_price()."</td>";

            echo "<td>".$data[$i]->get_size()."</td>";
            echo "<td>".$data[$i]->get_material()."</td>";
            echo "<td>".$data[$i]->get_gender()."</td>";

            echo "<td>".$data[$i]->get_color()."</td>";
            echo "<td>".$data[$i]->get_sleeve_type()."</td>";
            echo "</tr>";
        }

        // Menutup tabel
        echo "</table>";
    }

    
}
?>
