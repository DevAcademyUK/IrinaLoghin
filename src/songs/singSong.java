package songs;

import java.util.Scanner;

public class singSong {
    public static void main(String[] args) {
        singSong singsing = new singSong();
        singsing.sing();
    }

    private void sing() {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("How many bottle of beer are there on the wall?");
        int bottles = myscanner.nextInt();

        String word = "bottles";
        for (int i = bottles; i > 0; i--) {
            System.out.println(i + " " + word + " of beer on the wall.");
            System.out.println(i + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it arround.");
            if (i == 1) {
                System.out.println("No more bottles of beer on the wall");
            } else {
                int newNum = i - 1;
                if (newNum == 1) {
                    word = "bottle";
                }
                System.out.println(newNum + " " + word + " of beer on the wall");
                System.out.println();
            }
        }
    }
}
