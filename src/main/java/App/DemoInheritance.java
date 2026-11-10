package app;

import java.util.ArrayList;
import model.Instruktur;
import model.Orang;
import model.Peserta;

public class DemoInheritance {
    public static void main(String[] args) {

        ArrayList<Orang> daftarOrang = new ArrayList<>();

        daftarOrang.add(new Peserta(
                1, "Haechan", "081234567890",
                "252001", "Informatika"));

        daftarOrang.add(new Peserta(
                2, "Mingyu", "081298765432",
                "252002", "Informatika"));

        Peserta pesertaUji = new Peserta(
                3, "Jeonghan", "080000000000",
                "252003", "Informatika");

        pesertaUji.setNama("Jaemin");
        daftarOrang.add(pesertaUji);

        daftarOrang.add(new Instruktur(
                101, "Jeno", "081211110001",
                "Java Desktop"));

        daftarOrang.add(new Instruktur(
                102, "Jaehyun", "081211110002",
                "Data Science"));

        System.out.println("=== DATA SIKURSUS ===");

        for (Orang orang : daftarOrang) {
            System.out.println(orang.getInfo());
        }

        System.out.println("Jumlah object: " + daftarOrang.size());
    }
}