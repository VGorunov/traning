package by.gsu.epamlab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new FileReader("src/in.txt"))) {
            sc.useLocale(Locale.ENGLISH);
            final int PURCHASES_NUMBER = sc.nextInt();
            Purchase[] purchases = new Purchase[PURCHASES_NUMBER];

            //2. Initialize this array by the file data.
            for (int i = 0; i < PURCHASES_NUMBER; i++) {
                int numberOfPurchasedUnits = sc.nextInt();
                double discountPercent = sc.nextDouble();
                int weekDay = sc.nextInt();

                purchases[i] = new Purchase(numberOfPurchasedUnits, discountPercent, weekDay);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
