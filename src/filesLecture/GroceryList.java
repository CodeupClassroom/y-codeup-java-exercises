package filesLecture;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GroceryList {
    static Input input = new Input();
    static String directory = "src/filesLecture/data";
    static String filename = "list.txt";

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("Welcome to the Grocery Lister!");
        menu();
    }

    public static void menu() {

        System.out.println("Please select an option");
        System.out.println("1 - View items");
        System.out.println("2 - Add a new item");
        System.out.println("3 - Exit");
        int selection = input.getInt(1, 3);

        if(selection == 1) {

            try {
                showItems();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if(selection == 2) {

            try {
                addNewItem();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Thank you for using Grocery Lister!");
            System.exit(0);
        }

    }

    public static void showItems() throws IOException {
        // We use Paths.get to get a Java Path object
        Path groceriesPath = Paths.get("src/filesLecture/data", "list.txt");

        // .readAllLines returns a List type
        List<String> groceryList = Files.readAllLines(groceriesPath);

        System.out.println("Here's the grocery list:");

        for(String item : groceryList) {
            System.out.println(item);
        }
        System.out.println();

        menu();

    }

    public static void addNewItem() throws IOException {

        // open the file and add a new item to the file
        Path groceriesPath = Paths.get(directory, filename);

        // if the file does not exist, then create it
        if(Files.notExists(groceriesPath)) {
            Files.createFile(groceriesPath); // similar to "touch" on the cli
        }

//         assigns lines to hold all of the strings already in the file
        List<String> lines = Files.readAllLines(Paths.get(directory, filename));

        String item = input.getString("Please input the new item to get at the store:");

        lines.add(item);


        Files.write(groceriesPath, lines);

        menu();
    }
}
