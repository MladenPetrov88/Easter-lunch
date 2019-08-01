import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunaci = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double kozunaciPrice = kozunaci * 3.20;
        double eggsPrice = eggs * 4.35;
        double cookiesPrice = cookies * 5.40;
        double eggsPaintPrice = eggs * 12 * 0.15;

        double totalPrice = kozunaciPrice + eggsPrice + cookiesPrice + eggsPaintPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
