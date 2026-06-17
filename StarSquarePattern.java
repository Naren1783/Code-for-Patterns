import java.util.Scanner;

public class StarSquarePattern{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Size : ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
