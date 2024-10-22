package Tugas9;

// Kelas turunan dari Hewan untuk Kucing
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong");
    }
}