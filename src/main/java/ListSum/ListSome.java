package ListSum;
import java.util.Scanner;
import java.util.ArrayList;
public class ListSome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> players = new ArrayList<>();

        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            players.add(number);
        }

        int sum = calculateSum(players);

        System.out.println("The sum of the list is: " + sum);

        scanner.close();
    }

    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}