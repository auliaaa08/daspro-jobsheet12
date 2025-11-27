import java.util.Scanner;
public class Kafe06 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon sebesar 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon sebesar 30%!");
        } else {
            System.out.println("Kode promo tidak valid!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("================================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        double diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5 * hargaTotal;
            System.out.println("Kode promo valid! Diskon 50%: Rp" + (int)diskon);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3 * hargaTotal;
            System.out.println("Kode promo valid! Diskon 30%: Rp" + (int)diskon);
        } else {
            System.out.println("Kode promo tidak valid!");
        }

        return (int)(hargaTotal - diskon);
    }

    public static void main(String[] args) {
    Menu("Budi", true, "DISKON30");

    Scanner sc = new Scanner(System.in);

    int totalKeseluruhan = 0;
    char lagi;

    do {
        System.out.print ("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print ("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, "DISKON30");
        totalKeseluruhan += totalHarga;

        System.out.print("Apakah Anda ingin memesan lagi? (y/n): ");
        lagi = sc.next().charAt(0);
    } while (lagi == 'y' || lagi == 'Y');
    
    System.out.println("\nTotal keseluruhan harga pesanan Anda: Rp" + totalKeseluruhan);
    }
}