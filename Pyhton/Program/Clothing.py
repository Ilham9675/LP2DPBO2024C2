from Product import Product  # Import kelas Product dari file Product.py

class Clothing(Product):
    def __init__(self):
        super().__init__()  # Memanggil konstruktor dari kelas induk Product
        self.size = 0        # Ukuran pakaian
        self.material = ""   # Material pakaian
        self.gender = ""     # Jenis kelamin yang ditargetkan oleh pakaian

    # Metode setter untuk mengatur ukuran pakaian.
    def set_size(self, size):
        self.size = size

    # Metode setter untuk mengatur material pakaian.
    def set_material(self, material):
        self.material = material

    # Metode setter untuk mengatur jenis kelamin yang ditargetkan oleh pakaian.
    def set_gender(self, gender):
        self.gender = gender

    # Metode getter untuk mendapatkan ukuran pakaian.
    def get_size(self):
        return self.size

    # Metode getter untuk mendapatkan material pakaian.
    def get_material(self):
        return self.material

    # Metode getter untuk mendapatkan jenis kelamin yang ditargetkan oleh pakaian.
    def get_gender(self):
        return self.gender
