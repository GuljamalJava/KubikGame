package Game;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;
public class User {


    public  int UserDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------Start Game--------------");
        System.out.println("Predict amount of points(2...12): ");
        System.out.println("User rolls the Dice:");
        int y = scanner.nextInt();
        getSum();
        System.out.println("User point: " + y);
        return y;
    }




    public  int getSum() {
        Random random = new Random();   //2
        System.out.println("User over the Dices: ");
        int sum = 0;
        for (int i = 0; i < 2; i++) {
          var randomDice = random.nextInt(6) + 1; // 2 kubika
            sum += randomDice;
            printDice(randomDice);     //kubike salundu
            System.out.println("sum of Dices:" + sum);

        }
        return sum;

    }

    public  void printDice(int randomsan) {
        switch (randomsan) {
                case 1 -> {
                    System.out.print("""
                            +-------+  
                            | #     |                
                            |       |
                            |       |
                            |       |
                            |       | 
                            +-------+  """);
                }
                case 2 -> {
                    System.out.print("""
                            +-------+   
                            | #     |
                            |       |
                            |       | 
                            |       |
                            |     # |
                            +-------+
                            """);
                }
                case 3 -> {
                    System.out.print("""
                            +-------+   
                            | #     |
                            |       |
                            |   #   |
                            |       |
                            |     # |
                            +-------+
                            """);
                }
                case 4 -> {
                    System.out.print("""
                            +-------+   
                            | #   # |
                            |       |
                            |       |
                            |       |
                            | #   # |
                            +-------+
                            """);
                }
                case 5 -> {
                    System.out.print("""
                            +-------+   
                            | #   # |
                            |       |
                            |   #   |
                            |       |
                            | #   # |
                            +-------+
                            """);

                }
                case 6 -> {
                    System.out.print("""
                            +-------+   
                            | # # # |
                            |       |
                            |       |
                            |       |
                            | # # # |
                            +-------+
                            """);

                }
                default -> System.out.println("not found!");
            }

    }
                        //brosok  zagadannoe chislo
    public  int GetResult(int x, int y) {

        int res = x - abs(x - y) * 2;
        if (res > 0) {
            System.out.println("On the dice fell: " + x + " points");
            System.out.println("Result is " + x + "-" + "abs" +"("+x +"-"+ y+")" + "*"+ 2+ "=" + res + " points");
            System.out.println("User Wins");
        } else {
            System.out.println("User Lost");
        }

        return res;



        }






    }































