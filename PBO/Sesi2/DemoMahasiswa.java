class Mahasiswa {
    // === Atribut (Property) ===
    // "private" artinya hanya bisa diakses di dalam kelas ini saja
    private String nama;
    private int umur;

    // === Constructor ===
    // Constructor akan otomatis dipanggil saat object baru dibuat dengan keyword
    // "new"
    // Parameter didalam constructor digunakan untuk mengisi nilai awal dari atribut
    Mahasiswa(String nama, int umur) {
        // Kata kunci "this" dipakai untuk membedakan
        // antara atribut class (this.nama) dengan parameter method (namacon)
        this.nama = nama;
        this.umur = umur;
    }

    // === Getter ===
    // Getter dipakai untuk "membaca"/mengambil nilai dari atribut yang bersifat
    // private
    String getNama() {
        return this.nama; // "this.nama" merujuk pada atribut nama di dalam kelas ini
    }

    public int getUmur() {
        return this.umur;
    }

    // === Setter ===
    // Setter dipakai untuk "menulis"/mengubah nilai atribut dari luar kelas
    public void setNama(String nama) {
        // Gunakan "this" agar jelas bahwa yang dikiri adalah atribut
        // yang di kanan parameter
        this.nama = nama;
    }

    public void setUmur(int umur) {
        // Bisa ditambahkan logika sederhana (misalnya validasi)
        if (umur > 0) {
            this.umur = umur;
        }
    }

    // Method tambahan untuk menampilkan info mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }
}

// Class utama yang memiliki method main (titik awal program java)
public class DemoMahasiswa {
    public static void main(String[] args) {
        // === Membuat Object ===
        // Memanggil constructor : Mahasiswa(String nama, int umur)
        Mahasiswa mhs1 = new Mahasiswa("Budi", 20);
        Mahasiswa mhs2 = new Mahasiswa("Siti", 19);

        // === Menggunakan Getter ===
        System.out.println("Data awal:");
        System.out.println("Mahasiswa 1:" + mhs1.getNama() + "," + mhs1.getUmur() + "tahun");
        System.out.println("Mahasiswa 2:" + mhs2.getNama() + "," + mhs2.getUmur() + "tahun");

        // === Menggunakan Setter ===
        mhs1.setNama("Budi Santoso");
        mhs1.setUmur(21);

        mhs2.setNama("Siti Rahmawati");
        mhs2.setUmur(20);

        // === Memanggil method lain di class ===
        System.out.println("\nSetelah diubah (menggunakan setter):");
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}