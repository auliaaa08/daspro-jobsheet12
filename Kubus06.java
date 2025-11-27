import java.util.Scanner;
public class Kubus06 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, LP, vol;

        System.out.println("Masukkan sisi kubus");
        s = input.nextInt();

        LP = hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah " + LP);

        vol = hitungVolume(s);
        System.out.println("Volume balok adalah " + vol);

        input.close();
    }

    static int hitungLuasPermukaan(int s) {
        int luasPermukaan = 6 * s * s;
        return luasPermukaan;
    }
    static int hitungVolume(int s) {
        int volume = s * s * s;
        return volume;
    }
}