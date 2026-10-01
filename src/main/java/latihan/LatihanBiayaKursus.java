package latihan;

public class LatihanBiayaKursus {
  public static void main(String[] args) { // main method

        // Variabel
        String kode = "JAVA-BSC";
        String nama = "Java Desktop Fundamental";
        double biaya = 2_575_000;
        double registrasi = 500_000;

        // Menghitung total sebelum diskon
        double totalSebelumDiskon = biaya + registrasi;

        // Menentukan diskon
        double diskon;
        
        if (totalSebelumDiskon >= 3_500_000) {
            diskon = 0.15; // diskon 15%
        } else if (totalSebelumDiskon >= 1_500_000) {
            diskon = 0.10; // diskon 10%
        } else {
            diskon = 0.05; // diskon 5%
        }
        
        // Menghitung potongan dan total akhir
        double potongan = totalSebelumDiskon * diskon;
        double total = totalSebelumDiskon - potongan;

        // Menentukan status
        String status;

        if (total >= 3_500_000) {
            status = "MAHAL";
        } else if (total >= 1_500_000) {
            status = "STANDAR";
        } else {
            status = "TERJANGKAU";
        }
        
        // Output
        System.out.println("Kode                : " + kode);
        System.out.println("Kursus              : " + nama);
        System.out.printf("Biaya Kursus        : Rp%,.0f%n", biaya);
        System.out.printf("Biaya Registrasi    : Rp%,.0f%n", registrasi);
        System.out.printf("Total Sebelum Diskon: Rp%,.0f%n", totalSebelumDiskon);
        System.out.printf("Diskon              : %.0f%%%n", diskon * 100);
        System.out.printf("Potongan            : Rp%,.0f%n", potongan);
        System.out.printf("Total Akhir         : Rp%,.0f%n", total);
        System.out.println("Status              : " + status);
    }
}