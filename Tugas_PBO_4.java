import java.util.Scanner;

// Parent Class
class Bank {

    // Method Overloading
    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("\nTransfer ke rekening: " + rekeningTujuan);
        System.out.println("Jumlah: " + jumlah);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = 4000; // default biaya antar bank
        System.out.println("\nTransfer ke rekening: " + rekeningTujuan);
        System.out.println("Bank Tujuan: " + bankTujuan);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Biaya Transfer: " + biaya);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        int biaya = 4000;
        System.out.println("\nTransfer ke rekening: " + rekeningTujuan);
        System.out.println("Bank Tujuan: " + bankTujuan);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Berita: " + berita);
        System.out.println("Biaya Transfer: " + biaya);
    }

    void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
}

// Child Class BNI
class BankBNI extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = 5000;

        System.out.println("\nTransfer ke rekening: " + rekeningTujuan);
        System.out.println("Bank Tujuan: " + bankTujuan);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Biaya Transfer: " + biaya);
    }
}

// Child Class BCA
class BankBCA extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga BCA adalah 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BCA";
        int biaya = 6500;

        System.out.println("\nTransfer ke rekening: " + rekeningTujuan);
        System.out.println("Bank Tujuan: " + bankTujuan);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Biaya Transfer: " + biaya);
    }
}

// Main Class (HARUS sama dengan nama file)
public class Tugas_PBO_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM TRANSFER BANK ===");
        System.out.println("1. Bank Umum");
        System.out.println("2. Bank BNI");
        System.out.println("3. Bank BCA");
        System.out.print("Pilih Bank: ");
        int pilih = input.nextInt();

        System.out.print("Masukkan Nomor Rekening Tujuan: ");
        String rek = input.next();

        System.out.print("Masukkan Jumlah Transfer: ");
        int jumlah = input.nextInt();

        if (pilih == 1) {
            Bank bank = new Bank();

            System.out.println("\n=== PILIH JENIS TRANSFER ===");
            System.out.println("1. Tanpa Bank Tujuan");
            System.out.println("2. Dengan Bank Tujuan");
            System.out.println("3. Dengan Berita");
            System.out.print("Pilih: ");
            int jenis = input.nextInt();

            if (jenis == 1) {
                bank.transferUang(jumlah, rek);
            } else if (jenis == 2) {
                System.out.print("Masukkan Nama Bank Tujuan: ");
                String bankTujuan = input.next();
                bank.transferUang(jumlah, rek, bankTujuan);
            } else if (jenis == 3) {
                System.out.print("Masukkan Nama Bank Tujuan: ");
                String bankTujuan = input.next();
                input.nextLine(); // buang enter
                System.out.print("Masukkan Berita: ");
                String berita = input.nextLine();
                bank.transferUang(jumlah, rek, bankTujuan, berita);
            }

            bank.sukuBunga();

        } else if (pilih == 2) {
            BankBNI bni = new BankBNI();
            bni.transferUang(jumlah, rek, "bebas");
            bni.sukuBunga();

        } else if (pilih == 3) {
            BankBCA bca = new BankBCA();
            bca.transferUang(jumlah, rek, "bebas");
            bca.sukuBunga();

        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}