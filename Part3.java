// Exercise #1_Part 3
// https://github.com/generation-org/JS/tree/master/JS-03%20-%20Control%20Flow
import java.util.Scanner;

public class Part3 {
    public static void chkTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Hour (24hr format/ 0 to 23): ");
        int hourInput = scanner.nextInt();
        if (hourInput >= 9 && hourInput <= 18) {
            System.out.println("We are OPEN!");
            return;
        } else {
            System.out.println("We are CLOSE!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day number of the year (1 - 365)");
        int yearDayNumber = scanner.nextInt();
        int janFirstDayNumber = yearDayNumber % 7;

        if (janFirstDayNumber == 0 || janFirstDayNumber == 6) {
            System.out.println("We are closed on weekend!");
            return;
        }
        if (janFirstDayNumber == 1) {
            System.out.println("Monday");
            Part3.chkTime();
        }
        if (janFirstDayNumber == 2) {
            System.out.println("Tuesday");
            Part3.chkTime();
        }
        if (janFirstDayNumber == 3) {
            System.out.println("Wednesday");
            Part3.chkTime();
        }
        if (janFirstDayNumber == 4) {
            System.out.println("Thursday");
            Part3.chkTime();
        }
        if (janFirstDayNumber == 5) {
            System.out.println("Friday");
            Part3.chkTime();
        }
    }
}
