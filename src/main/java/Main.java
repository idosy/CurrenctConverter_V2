import Tools.Coin;
import Tools.CoinFactory;
import Tools.Coins;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
public class Main {



    private static Coin coinChoice() {
        System.out.println("Please choose an option (1/2):\n1. Dollars to Shekels\n2. Shekels to Dollars\n3. Euros to Shekels");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
        int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    return CoinFactory.getCoinInstance(Coins.USD);
                case 2:
                    return CoinFactory.getCoinInstance(Coins.ILS);
                case 3:
                    return CoinFactory.getCoinInstance(Coins.EURO);
                default:
                    return null;
            }
        } else {
            return null;
        }

    }
    private static double returnIngut(){
        System.out.println("Please enter an amount to convert");
        Scanner scanner1 = new Scanner(System.in);
        double amount = scanner1.nextDouble();
        return amount;

    }


    public static void main(String[] args) {
        boolean runProgram= true;
        ArrayList<Double> arrayResult = new ArrayList<Double>();
        System.out.println("Welcome to currency converter");
        while (runProgram != false){
        Coin coinChoice = coinChoice();
        if (coinChoice == null){
            System.out.println("Invalid choice please try again");
            break;
          //  coinChoice = coinChoice();
        }else {
            double amount = returnIngut();
            arrayResult.add(coinChoice.calculate(amount));

            System.out.println(arrayResult.get(arrayResult.size() - 1));
            System.out.println("Do you want to convert again Y / N.");
            Scanner scanner2 = new Scanner(System.in);
            String tryAgain = scanner2.next();
            tryAgain = tryAgain.toUpperCase();
            switch (tryAgain) {
                case "Y":
                    break;
                case "N" :
                    System.out.println("Thanks for using our currency converter");
                    for (Double i : arrayResult) {
                        System.out.println(i);
                    }
                    FileUpload write = new FileUpload();
                    write.FileUpload(arrayResult);
                    runProgram= false;
                    break;
                default:
                    System.out.println("invalid Choice\nplease try again");
                    break;


            }

        }}



    }




}
