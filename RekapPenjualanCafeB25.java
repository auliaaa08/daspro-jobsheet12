import java.util.Scanner;
public class RekapPenjualanCafeB25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jumlahMenu];
        int[][] data = new int[jumlahMenu][jumlahHari];

        System.out.println("\nMasukkan nama setiap menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== DATA PENJUALAN ===");
        System.out.print("Menu/Hari\t");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

        int maxTotal = 0;
        int index = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                index = i;
            }
        }

        System.out.println("\nMenu penjualan tertinggi: " + menu[index] + " = " + maxTotal);

        System.out.println("\nRata-rata tiap menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            int tot = 0;
            for (int j = 0; j < jumlahHari; j++) {
                tot += data[i][j];
            }

            System.out.println(menu[i] + " = " + ((double) tot / jumlahHari));
        }
    }
}
