import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution hitung = new Solution();

        int hasil = 0, totalBatu;
        int[] stones;

        System.out.println("Masukkan jumlah batu: ");
        if (input.hasNextInt()) {
            totalBatu = input.nextInt();

            stones = new int[totalBatu];
            if (0 < totalBatu && totalBatu < 31) {
                for (int i = 0; i < totalBatu; i++) {
                    System.out.printf("Masukkan berat batu ke-%d: ", i+1);
                    if (input.hasNextInt()) {
                        stones[i] = input.nextInt();
                        if (0 > stones[i] || stones[i] > 1001) {
                            i -= 1;
                            System.out.println("Masukkan antara 1 sampai 1000");
                        }
                    } else {
                        System.out.println("Masukan angka");
                    }
                }
            } else {
                System.out.println("Minimal jumlah batu adalah 1 dan maksimal jumlah batu adalah 30");
            }
            hitung.lastStoneWeight(stones);
        } else {
            System.out.println("Masukkan angka");
        }

        input.close();
    }
}