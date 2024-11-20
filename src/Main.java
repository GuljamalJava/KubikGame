import Game.Computer;
import Game.User;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  todo       User:
        for (int j = 1; j <= 2; j++) {
            System.out.println("--------------"+  + j + "-" + " tour"+ "--------------");
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Predict amount of points(2...12): ");
//            int predictNum = scanner.nextInt();
//            char s = scanner.next().charAt(0);
//            System.out.println("Do you want to cheat? (Y/N): " +s);
            User user = new User();;
            int i = user.UserDice();
            int y = user.getSum();
            int resUser = user.GetResult(i, y);

            //  todo      Computer:
            User comp = new Computer();
            int a = comp.UserDice();
            int b = comp.getSum();
            int resComp = comp.GetResult(a, b);
            //  todo      Этап 2;
            if (resUser > resComp) {
                int sum = 0;
                int sum1 = 0;
                sum = resUser - resComp;
                System.out.println("-------------Current score-------------------");
                System.out.print(" User: " + resUser + " points");
                System.out.println(" Computer : " + resComp + "  points");
                System.out.println(" User ahead for: " + sum + " points");
                System.out.println("------------------------------------------");
            } else if (resComp > resUser) {
                int sum1 = resComp - resUser;
                System.out.println("----------Current score-------------------");
                System.out.println(" Computer : " + resComp + " points");
                System.out.println(" User: " + resUser + "  points");
                System.out.println("Computer aheads  for: " + sum1 + " points");
                System.out.println("------------------------------------------");
            } else if (resComp == resUser) {
                System.out.println("Game is a draw!");
            }

        } // todo       этап   3;
        System.out.println("------------ 3 - tour "+ "--------------");
        User user = new User();
        int i = user.UserDice();//user san
        int y = user.getSum();
        int resUser = user.GetResult(i, y);
        int userRes = resUser + resUser + resUser;
        User comp = new Computer();
        int a = comp.UserDice();
        int b = comp.getSum();
        int resComp = comp.GetResult(a, b);
        int compRes = resComp + resComp + resComp;


        System.out.printf("""       
                                      +---------------Finish game----------------+
                                      |          |               |               |
                                      | Round    |      User     |   Computer    | 
                                      |----------|-------------  |---------------+
                                      |          |Predicted:%s   |  Predicted:%s   |  
                                      |    -1-   |Dice:%s        |  Dice:%s        | 
                                      |          |Result:%s     | Result:%s     |
                                      |----------+---------------+---------------+         
                                      |          |Predicted:%s   |  Predicted:%s   |
                                      |    -2-   |Dice:%s        |  Dice:%s        |
                                      |          |Result:%s      | Result:%s     |
                                      | ---------+-------------+-----------------+
                                      |          |Predicted:%s   |Predicted:%s     |          
                                      |    -3-   |Dice:%s        |Dice:%s         |
                                      |          |Result:%s      |Result:%s       | 
                                      +----------+-------------+-----------------+
                                      |  Total:  |Points:%s     |Points:%s       |
                                      +----------+-------------+-----------------+    
                """, i, a, y, b, resUser, resComp, i, a, y, b, resUser, resComp, i, a, y, b, resUser, resComp, userRes, compRes);

        if (userRes > compRes) {
            int diff = userRes - compRes;
            System.out.println("User win " + diff + " " + " points more. Congratulation!");
        } else if (compRes > userRes) {
            int diff2 = compRes - userRes;
            System.out.println("Computer min " + diff2 + " " + " points more. Congratulation!");
        }



        }





    }
