import java.util.Scanner;
/**
 * Pemilihan2Percobaan223
 */
public class Pemilihan2Percobaan223 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int menu23;
        String member;
        String pembayaran;
        double diskon = 0;
        double harga = 0;
        double totalBayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        menu23 = input23.nextInt();
        input23.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input23.nextLine();
        System.out.println("Pilih metode pembayaran (cash/qris) = ");
        pembayaran = input23.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu23 == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }else if (menu23 == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
        }else if (member.equalsIgnoreCase("n")) {
            if (menu23 == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }else if (menu23 == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if (menu23 == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);

        }else {
            System.out.println("Member tidak valid");
        }

        if (pembayaran.equalsIgnoreCase("qris")) {
            double diskonQRIS = 1000;
            diskon += diskonQRIS;
            System.out.println("Besar diskon QRIS = " + diskonQRIS);
        } else if (pembayaran.equalsIgnoreCase("cash")) {
            System.out.println("Input metode pembayaran tidak valid");
        }

        totalBayar = harga - diskon;
        if (totalBayar < 0) {
            totalBayar = 0;
        }
        System.out.println("--------------------------------------");
        System.out.println("Total bayar = " + totalBayar);
        System.out.println("-------------------------");
    }
}