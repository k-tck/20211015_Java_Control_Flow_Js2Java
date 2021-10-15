// Exercise #1_Part 2
// https://github.com/generation-org/JS/tree/master/JS-03%20-%20Control%20Flow
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number of the year (1 - 365)");
        int yearDayNumber = scanner.nextInt();
        int janFirstDayNumber = yearDayNumber % 7;

        if (janFirstDayNumber == 0) {
            System.out.println("Sunday");
            return;
        }
        if (janFirstDayNumber == 1) {
            System.out.println("Monday");
            return;
        }
        if (janFirstDayNumber == 2) {
            System.out.println("Tuesday");
            return;
        }
        if (janFirstDayNumber == 3) {
            System.out.println("Wednesday");
            return;
        }
        if (janFirstDayNumber == 4) {
            System.out.println("Thursday");
            return;
        }
        if (janFirstDayNumber == 5) {
            System.out.println("Friday");
            return;
        }
        if (janFirstDayNumber == 6) {
            System.out.println("Saturday");
            return;
        }
    }
}