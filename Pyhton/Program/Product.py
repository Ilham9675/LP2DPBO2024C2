class Product:
    def __init__(self):
        self.idProduct = ""  # ID produk
        self.name = ""       # Nama produk
        self.brand = ""      # Merek produk
        self.price = 0       # Harga produk

    # Metode setter untuk mengatur ID produk.
    def set_idProduct(self, idProduct):
        self.idProduct = idProduct

    # Metode setter untuk mengatur nama produk.
    def set_name(self, name):
        self.name = name

    # Metode setter untuk mengatur merek produk.
    def set_brand(self, brand):
        self.brand = brand

    # Metode setter untuk mengatur harga produk.
    def set_price(self, price):
        self.price = price

    # Metode getter untuk mendapatkan ID produk.
    def get_idProduct(self):
        return self.idProduct

    # Metode getter untuk mendapatkan nama produk.
    def get_name(self):
        return self.name

    # Metode getter untuk mendapatkan merek produk.
    def get_brand(self):
        return self.brand

    # Metode getter untuk mendapatkan harga produk.
    def get_price(self):
        return self.price
