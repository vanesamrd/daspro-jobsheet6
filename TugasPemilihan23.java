import java.util.Scanner;

public class TugasPemilihan23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hari, tipeBuku;
        int totalDiskon = 0, hargaBuku = 20000, totalHarga, jmlBuku;

        System.out.print("Masukkan Hari\t\t: ");
        hari = input.nextLine();
        System.out.print("Masukkan Tipe Buku\t: ");
        tipeBuku = input.nextLine();
        System.out.print("Masukkan Jumlah Buku\t: ");
        jmlBuku = input.nextInt();

        
        if (hari.equalsIgnoreCase("rabu") && tipeBuku.equalsIgnoreCase("kamus")) {
            totalDiskon += 10;  
            if (jmlBuku > 2) {
                totalDiskon += 2;  
            }
        } else if (hari.equalsIgnoreCase("rabu") && tipeBuku.equalsIgnoreCase("novel")) {
            totalDiskon += 7;  
            if (jmlBuku > 3) {
                totalDiskon += 2;  
            } else if (jmlBuku <= 3) {
                totalDiskon += 1;  
            }
        } else if (hari.equalsIgnoreCase("rabu") && jmlBuku > 3 && !tipeBuku.equalsIgnoreCase("kamus") && !tipeBuku.equalsIgnoreCase("novel")) {
            totalDiskon += 5;  
        }

        
        totalHarga = jmlBuku * hargaBuku;

        
        int jumlahDiskon = (totalHarga * totalDiskon) / 100;
        totalHarga = totalHarga - jumlahDiskon;

        
        System.out.println("---- Output ----");
        System.out.println("Total Harga \tRp." + totalHarga);
        System.out.println("Total Diskon \t" + totalDiskon + "%");
    }
}