import java.lang.Math;

public class playGame {
    public static void main(String args[]) {
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());

    }

    private void moveRobber(){

    }

    private static double rollDice(){
        return Math.round((Math.random()*6) + 0.5);
    }
}
