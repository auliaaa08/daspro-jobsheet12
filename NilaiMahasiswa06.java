import java.util.Scanner;
public class NilaiMahasiswa06 {

    public static void isianArray(int[] arr, int N) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
    }

    public static void tampilArray(int[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int nilai : arr) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N (jumlah mahasiswa): ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        isianArray(nilai, N);
        tampilArray(nilai);
        int totalNilai = hitTot(nilai);

        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);

        input.close();
    }
}