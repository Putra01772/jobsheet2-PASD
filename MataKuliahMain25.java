public class MataKuliahMain25 {
    public static void main(String[] args) {

        MataKuliah25 mk1 = new MataKuliah25();
        mk1.kodeMK = "MK001";
        mk1.nama = "Algoritma";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println("\n====================\n");

        MataKuliah25 mk2 = new MataKuliah25(
                "MK002",
                "Struktur Data",
                3,
                6
        );

        mk2.tampilInformasi();
    }
}
