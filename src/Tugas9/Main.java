package Tugas9;

// Kode utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        // Memanggil metode suara dari masing-masing objek
        kucing.suara();
        anjing.suara();
    }
}
