public class DosenMain25 {
    public static void main(String[] args) {

        Dosen25 d1 = new Dosen25();
        d1.idDosen = "D001";
        d1.nama = "Dr. Budi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Algoritma";

        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");

        System.out.println("\n====================\n");

        Dosen25 d2 = new Dosen25(
                "D002",
                "Prof. Andi",
                true,
                2010,
                "Struktur Data"
        );

        d2.tampilInformasi();
    }
}

