package org.example; //DO NOT DELETE

//IMPORT STATEMENTS
import java.text.NumberFormat;
import java.util.Scanner;

//CLASS 
public class Main {
    //main METHOD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("Options:");
        System.out.println("1 - Further Substring Fun");
        System.out.println("2 - Run of Integers");
        System.out.println("3 - Sum of a Range of Sequential Integers");
        System.out.println("4 - Repeatedly Echo a Word");
        System.out.println("5 - Words Separated by Dots");
        System.out.println("6 - Adding up Integers");
        System.out.println("7 - Shipping Cost Calculator");

        int choice;

        do {
            System.out.print("Enter your choice (1-7): ");
            choice = input.nextInt();
        } while (choice < 1 || choice > 7);

        input.nextLine();

        switch (choice) {
            case 1:
                String original;
                do {
                    System.out.print("Enter a string: ");
                    original = input.nextLine();
                } while (original.length() < 1);

                int beg;
                do {
                    System.out.print("Enter beginning index: ");
                    beg = input.nextInt();
                } while (beg < 0);


                int end;
                do {
                    System.out.print("Enter ending index: ");
                    end = input.nextInt();
                } while (end > original.length());

                System.out.println("Original string: " + original);
                System.out.println("Substring: " + original.substring(beg, end));
                break;
            case 2:
                System.out.print("Enter Start: ");
                int Start = input.nextInt();
                System.out.print("Enter End: ");
                int End = input.nextInt();

                for (int i = Start; i <= End; i++) {
                    System.out.println(i);
                }
                break;
            case 3:
                System.out.print("Enter low: ");
                int low = input.nextInt();
                System.out.print("Enter high: ");
                int high = input.nextInt();

                int sum1 = (high * (high + 1)) / 2;
                int sum2 = ((low - 1) * (low)) / 2;
                
                System.out.println("Sum = " + (sum1 - sum2));
                break;
            case 4:
                System.out.print("Enter a word: ");
                String word = input.nextLine();

                for (int i = 0; i < word.length(); i++) {
                    System.out.println(word);
                }
                break;

            case 5: 
                System.out.print("Enter first word: ");
                String word1 = input.nextLine();

                System.out.print("Enter second word: ");
                String word2 = input.nextLine();

                int dots = 30 - word1.length() - word2.length();

                for (int i = 0; i < dots; i++) {
                    word1 += ".";
                }
                word1 += word2;

                System.out.println(word1);

                break;
            case 6:
                System.out.print("How many integers will be added: ");
                int nums = input.nextInt();
                
                int numSum = 0;
                for (int i = 0; i < nums; i++) {
                    System.out.print("Enter an integer: ");
                    numSum += input.nextInt();
                }

                System.out.println("The sum is " + numSum);
                break;
            case 7:
                int weight;
                double cost;
                
                do {
                    cost = 3.0;
                    System.out.print("Weight of Order: ");
                    weight = input.nextInt();
                    
                    if (weight > 10) {
                        cost += (weight - 10) * 0.25;
                    }
                    
                    System.out.println("Shipping Cost: " + money.format(cost));

                } while (weight != 0);

                System.out.println("bye");
                break;
        }


    }
}


