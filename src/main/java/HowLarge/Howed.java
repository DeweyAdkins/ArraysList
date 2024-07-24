package HowLarge;
import java.util.Scanner;
import java.util.ArrayList;
public class Howed {
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
            System.out.println("You have entered " + waterBottles.size() + " water bottles.");

            water.close();
        }
    }
