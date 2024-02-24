from Clothing import Clothing  # Import kelas Clothing dari file Clothing.py

class Shirt(Clothing):
    def __init__(self):
        super().__init__()  # Memanggil konstruktor dari kelas induk Clothing
        self.color = ""       # Warna kemeja
        self.sleeve_type = "" # Jenis lengan kemeja

    # Metode setter untuk mengatur warna kemeja.
    def set_color(self, color):
        self.color = color

    # Metode setter untuk mengatur jenis lengan kemeja.
    def set_sleeve_type(self, sleeve_type):
        self.sleeve_type = sleeve_type

    # Metode getter untuk mendapatkan warna kemeja.
    def get_color(self):
        return self.color

    # Metode getter untuk mendapatkan jenis lengan kemeja.
    def get_sleeve_type(self):
        return self.sleeve_type
