public class MahasiswaMainNo25 {
    public static void main(String[] args) {
        MahasiswaNo25 mhs1 = new MahasiswaNo25(
            "2241720171",
            "Muhammad Ali Farhan",
            "SI 2J",
            3.55
        );

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();


        MahasiswaNo25 mhs2 = new MahasiswaNo25(
            "2141720160",
            "Annisa Nabila",
            "TI 2L",
            3.25
        );

        mhs2.ubahKelas("TI 2M");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
