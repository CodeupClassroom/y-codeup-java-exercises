import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println(rollDie(2));

        System.out.println("Welcome to the dice rolling application!");

        String hitPointRoll = "5d4";
        System.out.println("For your roll, we are rolling " + hitPointRoll);

        int hitPoints = dndRoll(hitPointRoll);
        System.out.println(hitPoints);

    }

    public static int rollDie(int side) {
        int random = (int) Math.ceil(Math.random() * side);
        return random;

    }
    public static int rollTwoDice(int sides) {
        int firstNum = rollDie(sides);
        int secondNum = rollDie(sides);
        return firstNum + secondNum;
    }

    public static int dndRoll(String input) {
        int indexOfD = input.indexOf('d');

        String firstPart = input.substring(0, indexOfD);
        String secondPart = input.substring(indexOfD + 1);

        int numberOfDice = Integer.parseInt(firstPart);
        int numberOfSides = Integer.parseInt(secondPart);

        int result = 0;
        int dieRoll;

        do {
            dieRoll = rollDie(numberOfSides);
            System.out.println("A die rolled a: " + dieRoll);

            result += dieRoll;
            numberOfDice--;

        } while(numberOfDice > 0);

        return result;
    }
}
