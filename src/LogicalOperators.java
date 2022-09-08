import java.util.Random;

public class LogicalOperators {

    public static void main(String [] args){

        Random r = new Random();

        int coinflip = r.nextInt(2);

        if (coinflip == 0){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

        int die1 = r.nextInt(6) + 1;
        int die2 = r.nextInt(6) + 1;

        if (die1 == 1 && die2 == 1){
            System.out.println("Snake eyes 👀");
        }
        if (die1 >= 2 && die1 <= 5){
            System.out.println("Between 2 and 5 inclusive");
        }
        if (die1 != 1 || die2 != 1){
            System.out.println("At least one die was not a one");
        }
        if (die1 == 1 || die2 == 1){
            if (die1 != die2){
                System.out.println("Only one die rolled was a 1.");
            }
        }
    }

}
