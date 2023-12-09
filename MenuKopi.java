import java.util.Scanner;

public class MenuKopi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int espresso;
        String[] menuList = {"", "Cafe Americano", "Caramel Macchiato", "Asian Dolce Latte",
                              "Vanilla Latte", "Caffe Latte", "Capuccino", "Caffe Mocha"};

        System.out.println("=== MENU DERN COFFEE || HANDCRAFTED ESPRESSO ===");
        System.out.println("1. Cafe Americano");
        System.out.println("2. Caramel Macchiato");
        System.out.println("3. Asian Dolce Latte");
        System.out.println("4. Vanilla Latte");
        System.out.println("5. Caffe Latte");
        System.out.println("6. Capuccino");
        System.out.println("7. Caffe Mocha");
        System.out.println("8. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
        espresso = scanner.nextInt();

        if(espresso <= 7)
        {
            System.out.println("Pilihan kopi Anda : " + menuList[espresso] + ".");

            Tambahan t1 = new Tambahan(scanner);
            System.out.println("Tambahan pesanan Anda : " + t1.getAddOns() + ".");

            LevelEs p1 = new LevelEs(scanner);
            System.out.println("Pilihan level es Anda : " + p1.getMenuName() + ".");

            System.out.println("Terima kasih atas pesanannya. Pesanan Anda adalah " + menuList[espresso] +
                               " dengan tambahan " + t1.getAddOns() + " dan level es "
                               + p1.getMenuName() + ".");
        }
        else if(espresso == 8)
        {
            System.out.println("Terima kasih, Anda telah selesai memilih.");
        }
        else
        {
            System.out.println("Maaf, pilihan Anda tidak valid. Silahkan coba lagi.");
        }

        scanner.close();
    }
}