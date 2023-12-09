import java.util.Scanner;

public class Tambahan{
    private int addIns;
    private String addOns;
    public String getAddOns() {return addOns;}

    public Tambahan(Scanner scanner) {
        String[] addList = {"", "Caramel Sauce", "Vanilla Creamer", "Coffee Ice Cubes",
                "Iced Coffee Sphere", "Caramel Coffee Bomb", "Milk & Honey Ice Cubes",
                "Hot Cocoa Stirring Spoons"};

        System.out.println("=== MENU DERN COFFEE | ADD INS ===");
        System.out.println("1. Caramel Sauce");
        System.out.println("2. Vanilla Creamer");
        System.out.println("3. Coffee Ice Cubes");
        System.out.println("4. Iced Coffee Sphere");
        System.out.println("5. Caramel Coffee Bomb");
        System.out.println("6. Milk & Honey Ice Cubes");
        System.out.println("7. Hot Cocoa Stirring Spoons");
        System.out.println("8. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
        addIns = scanner.nextInt();
        addOns = addList[addIns];
    }
}
