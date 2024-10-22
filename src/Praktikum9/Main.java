package Praktikum9;

// Kode utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();

        // Memanggil metode dari objek
        mobil.berjalan();
        sepeda.berjalan();
        mobil.info();
        sepeda.info();
    }
}
