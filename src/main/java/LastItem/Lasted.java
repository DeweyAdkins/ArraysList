package LastItem;

import java.util.ArrayList;
import java.util.Scanner;

public class Lasted {
    public static void main(String[] args) {
        Scanner water = new Scanner(System.in);
        ArrayList<String> waterBottles = new ArrayList<>();

        while (true) {
            System.out.print("Enter a water bottle name (or press 'Enter' to stop): ");
            String bottleName = water.nextLine();

            if (bottleName.isEmpty()) {
                if (waterBottles.size() > 0) {
                    System.out.println("The last thing entered was: " + waterBottles.get(waterBottles.size() - 1));
                } else {
                    System.out.println("No strings were entered.");
                }
                break;
            }

            waterBottles.add(bottleName);
        }
        water.close();
    }
}
