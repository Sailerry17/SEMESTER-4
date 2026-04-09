class Tabungan {
    double saldo;

    void tambah(double jumlah) {
        saldo += jumlah;
    }

    void ambil(double jumlah) {
        saldo -= jumlah;
    }

    void infoSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}

public class contoh {
    public static void main(String[] args) {
        Tabungan Adhit = new Tabungan();
        Adhit.tambah(100000);
        Adhit.ambil(50000);// Output: Saldo saat ini: 1000.0
        Adhit.infoSaldo(); // Output: Saldo saat ini: 800.0
    }
}