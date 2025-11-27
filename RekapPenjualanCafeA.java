import java.util.Scanner;
public class RekapPenjualanCafeA {
    
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    public static void inputData(int[][] data) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanTabel(int[][] data) {
        System.out.println("\n=== DATA PENJUALAN ===");

        System.out.print("Menu/Hari\t");
        for (int h = 1; h <= 7; h++) System.out.print("H" + h + "\t");
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void tampilkanTertinggi(int[][] data) {
        int maxTotal = 0;
        int indeksMenu = 0;

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[0].length; j++) {
                total += data[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indeksMenu = i;
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menu[indeksMenu] + " = " + maxTotal);
    }

    public static void tampilkanRataRata(int[][] data) {
        System.out.println("\nRata-rata penjualan tiap menu:");

        for (int i = 0; i < data.length; i++) {
            int total = 0;

            for (int j = 0; j < data[0].length; j++) {
                total += data[i][j];
            }

            double rata = (double) total / data[0].length;
            System.out.println(menu[i] + " = " + rata);
        }
    }

    public static void main(String[] args) {

        int[][] penjualan = new int[5][7];

        inputData(penjualan);
        tampilkanTabel(penjualan);
        tampilkanTertinggi(penjualan);
        tampilkanRataRata(penjualan);
    }
}
