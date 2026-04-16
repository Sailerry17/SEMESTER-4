import java.util.Scanner;

// Parent class
class Mahasiswa {
    String nim;
    String nama;
    int nilai;

    void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM   : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama  : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
    }
}

// Child class (Inheritance)
class NilaiMahasiswa extends Mahasiswa {
    char grade;
    String keterangan;

    void hitungGrade() {
        if (nilai >= 80 && nilai <= 100) {
            grade = 'A';
            keterangan = "Lulus";
        } else if (nilai >= 70) {
            grade = 'B';
            keterangan = "Lulus";
        } else if (nilai >= 60) {
            grade = 'C';
            keterangan = "Lulus";
        } else if (nilai >= 50) {
            grade = 'D';
            keterangan = "Tidak Lulus";
        } else if (nilai >= 0) {
            grade = 'E';
            keterangan = "Tidak Lulus";
        } else {
            System.out.println("Input nilai anda salah");
        }
    }

    void tampilData() {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai      : " + nilai);
        System.out.println("Grade      : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        NilaiMahasiswa mhs = new NilaiMahasiswa();

        mhs.inputData();
        mhs.hitungGrade();
        mhs.tampilData();
    }
}