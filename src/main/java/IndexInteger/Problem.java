package IndexInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class Problem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<java.lang.Integer> numbers = new ArrayList<>();

            while (true) {
                System.out.print("Enter an integer (0 to stop): ");
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                numbers.add(number);
            }

            System.out.println("You are done adding integers to the list.");

            System.out.print("Enter the number you are looking for: ");
            int searchNumber = scanner.nextInt();

            int index = numbers.indexOf(searchNumber);
            if (index != -1) {
                System.out.println("The index of " + searchNumber + " is: " + index);
            } else {
                System.out.println(searchNumber + " is not in the list.");
            }

            scanner.close();
        }
    }
