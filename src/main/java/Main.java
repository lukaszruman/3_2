import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj pierwszy znak: ");
        char char1 = scanner.next().charAt(0);
        System.out.print("podaj drugi znak: ");
        char char2 = scanner.next().charAt(0);
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i % 2 == 0 ? char2 : char1) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}