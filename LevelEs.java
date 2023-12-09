import java.util.Scanner;

public class LevelEs {
    private int iceLevel;
    private String menuName;
    public String getMenuName() {
        return menuName;
    }

    public LevelEs(Scanner scan){
        String[] ice = {"", "Normal Ice", "Less Ice", "No Ice"};

        System.out.println("=== MENU DERN COFFEE | ICE LEVEL ===");
        System.out.println("1. Normal Ice");
        System.out.println("2. Less Ice");
        System.out.println("3. No Ice");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan Anda : ");
        iceLevel = scan.nextInt();
        menuName = ice[iceLevel];
    }
}

