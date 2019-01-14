package util;

public class InputTest {
    public static void main(String[] args) {
        // dataType variableName = new ClassName();
        Input input = new Input();

        if(input.yesNo("Do you want to enter a number?")) {
            int favoriteNumber = input.getInt("What is your favorite number?");
            System.out.println("You said " + favoriteNumber);

        }

        if(input.yesNo("Do you want to exit the application?")) {
            System.exit(0);
        }

        String name = input.getString("What is your name?");
        System.out.println("Hello, " + name + "!");

    }
}
