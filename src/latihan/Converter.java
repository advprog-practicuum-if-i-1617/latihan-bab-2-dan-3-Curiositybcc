package latihan;

public class Converter {

    private String[] terbilang = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

    public int convert(String bilang) {
        int angka = 0;
        if (bilang.contains("Seribu")) {
            angka = angka + 1000;
        }
        if (bilang.contains("Ratus") && bilang.contains("Puluh")) {
            String split[] = bilang.split("( Ratus )|( Puluh )");
            for (int i = 2; i < 10; i++) {
                if (split[0].contains(terbilang[i])) {
                    angka = angka + (i * 100);
                }
                if (split[1].contains(terbilang[i])) {
                    angka = angka + (i * 10);
                }
            }
            if (split.length == 3) {
                for (int i = 1; i < 10; i++) {
                    if (split[2].contains(terbilang[i])) {
                        angka = angka + i;
                    }
                }
            }
        } else if (bilang.contains("Seratus")) {
            angka = angka + 100;
            if (bilang.contains("Puluh")) {
                String split[] = bilang.split(" Puluh ");
                for (int i = 2; i < 10; i++) {
                    if (split[0].contains(terbilang[i])) {
                        angka = angka + (i * 10);
                    }
                }
                if (split.length > 1) {
                    for (int i = 1; i < 10; i++) {
                        if (split[1].contains(terbilang[i])) {
                            angka = angka + i;
                        }
                    }
                }

            } else if (bilang.contains("Sepuluh")) {
                angka = angka + 10;
            } else if (bilang.contains("Sebelas")) {
                angka = angka + 11;
            } else if (bilang.contains("Belas")) {
                for (int i = 2; i < 10; i++) {
                    if (bilang.contains(terbilang[i])) {
                        angka = angka + (i + 10);
                    }
                }
            } else {
                for (int i = 1; i < 10; i++) {
                    if (bilang.contains(terbilang[i])) {
                        angka = angka + i;
                    }
                }
            }
        } else if (bilang.contains("Ratus")) {
            String split[] = bilang.split(" Ratus ");
            for (int i = 2; i < 10; i++) {
                if (split[0].contains(terbilang[i])) {
                    angka = angka + (i * 100);
                }
            }
            if (split.length > 1) {
                if (split[1].contains("Sepuluh")) {
                    angka = angka + 10;
                } else if (split[1].contains("Sebelas")) {
                    angka = angka + 11;
                } else if (split[1].contains("Belas")) {
                    for (int i = 2; i < 10; i++) {
                        if (split[1].contains(terbilang[i])) {
                            angka = angka + (i + 10);
                        }
                    }
                } else {
                    for (int i = 1; i < 10; i++) {
                        if (split[1].contains(terbilang[i])) {
                            angka = angka + i;
                        }
                    }
                }
            }
        } else if (bilang.contains("Puluh")) {
            String split[] = bilang.split(" Puluh ");
            for (int i = 2; i < 10; i++) {
                if (split[0].contains(terbilang[i])) {
                    angka = angka + (i * 10);
                }
            }
            if (split.length > 1) {
                for (int i = 1; i < 10; i++) {
                    if (split[1].contains(terbilang[i])) {
                        angka = angka + i;
                    }
                }
            }
        } else if (bilang.contains("Sepuluh")) {
            angka = angka + 10;
        } else if (bilang.contains("Sebelas")) {
            angka = angka + 11;
        } else if (bilang.contains("Belas")) {
            for (int i = 2; i < 10; i++) {
                if (bilang.contains(terbilang[i])) {
                    angka = angka + (i + 10);
                }
            }
        } else {
            for (int i = 1; i < 10; i++) {
                if (bilang.contains(terbilang[i])) {
                    angka = angka + i;
                }
            }
        }
        return angka;
    }

    public String convert(int angka) {
        if (angka < 12) {
            return terbilang[angka];
        } else if (angka >= 12 && angka <= 19) {
            return terbilang[angka % 10] + " Belas";
        } else if (angka >= 20 && angka <= 99) {
            return convert(angka / 10) + " Puluh " + terbilang[angka % 10];
        } else if (angka >= 100 && angka <= 199) {
            return "Seratus " + convert(angka % 100);
        } else if (angka >= 200 && angka <= 999) {
            return convert(angka / 100) + " Ratus " + convert(angka % 100);
        } else if (angka >= 1000 && angka <= 1999) {
            return "Seribu " + convert(angka % 1000);
        } else if (angka >= 2000 && angka <= 999999) {
            return convert(angka / 1000) + " Ribu " + convert(angka % 1000);
        } else {
            return "";
        }
    }
}
