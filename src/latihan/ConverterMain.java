package latihan;

import java.util.*;

public class ConverterMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Converter convert = new Converter();
        boolean run = true;
        String pilihan, terbilang;
        int angka;
        while (run) {
            System.out.println("1. Konversi Angka -> Terbilang");
            System.out.println("2. Konversi Terbilang -> Angka");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilihan = input.next();
            if (pilihan.equals("1")) {
                System.out.print("Masukkan Angka Yang Ingin Di Konversi : ");
                angka = input.nextInt();
                System.out.println("Hasil Konversi : " + convert.convert(angka));
            }
            if (pilihan.equals("2")) {
                System.out.print("Masukkan Terbilang Yang Ingin Di Konversi : ");
                input.nextLine();
                terbilang = input.nextLine();
                System.out.println("Hasil Konversi : " + convert.convert(terbilang));
            }
            if (pilihan.equals("3")) {
                run = false;
            }
        }

    }
}
