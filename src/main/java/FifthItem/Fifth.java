package FifthItem;
import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner water = new Scanner(System.in);
        ArrayList<String> waterBottles = new ArrayList<>();

        while(true) {
            System.out.print("Enter a water bottle name (or 'Enter' to stop): ");
            String bottleName = water.nextLine();

            if(bottleName.equalsIgnoreCase("")) {
                break;
            }

            waterBottles.add(bottleName);
        }

        if (waterBottles.size() >= 5) {
            System.out.println("The fifth string entered was: " + waterBottles.get(4));
        } else {
            System.out.println("Not enough strings entered.");
        }
        water.close();
    }
}