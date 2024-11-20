package Game;
import java.util.Random;
import static java.lang.Math.abs;
public  class Computer extends User {

    public Computer() {
    }

    @Override
    public int UserDice() {
        Random random = new Random();
        System.out.println("-------      Start Game       ---------");
        System.out.println("Computer predicted : ");
        System.out.println("Computer rolls the Dice:");
        int y = random.nextInt(2, 12) + 1;
        getSum();
        System.out.println("Computer point: " + y);
        return y;
    }

    @Override
    public int getSum() {
        Random random = new Random();
        System.out.println("Computer over the Dices: ");
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            int randomDice = random.nextInt(6) + 1;
            sum += randomDice;
            printDice(randomDice);
            System.out.println("sum of Dices:" + sum);

        }
        return sum;

    }

    @Override
    public void printDice(int randomsan) {

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


        @Override    //brosokRansan ,komputer
        public int GetResult ( int x, int y){
            int res = x - abs(x - y) * 2;
            if (res > 0) {
                System.out.println("On the dice fell: " + x + " points");
                System.out.println("Result is " + x + "-" + "abs" + "(" + x + "-" + y + ")" + "*" + 2 + "=" + res + " points");
                System.out.println("Computer Wins");
            } else {
                System.out.println("Computer Lost");
            }

            return res;


        }
       public  void getChance(){




       }








    }




