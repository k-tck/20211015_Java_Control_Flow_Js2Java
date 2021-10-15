// Exercise #1_Part 1
// https://github.com/generation-org/JS/tree/master/JS-03%20-%20Control%20Flow

import java.util.Scanner;

public class Part1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number (Enter 0 to 6 / 0=sun to 6=sat): ");
        int dayNumInput = scanner.nextInt();

        if (dayNumInput == 0 || dayNumInput == 6) {
            System.out.println("We are Close");
            return;
        }
        else {
            System.out.print("Enter Hour (24hr format/ 0 to 23): ");
            int hourInput = scanner.nextInt();
            if (hourInput >= 9 && hourInput <= 18) {
                System.out.println("We are OPEN!");
                return;
            } else {
                System.out.println("We are CLOSE!");
            }
        }
    }
}
