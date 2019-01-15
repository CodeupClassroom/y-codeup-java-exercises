import util.Input;

public class ArrayDemo {
    public static void main(String[] args) {
        // example: make an array of 4 integers
        // declare an array of integers
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 9;
        numbers[2] = 8;
        numbers[3] = 7;

        // java foreach
        for(int x : numbers) {
            System.out.println(x*1000);
        }

        Input input = new Input();
        int numberOfNames = input.getInt("how many names?");

        String[] names = new String[numberOfNames];

        int i = 0;
        do {
            names[i] = input.getString("What is the name?");
            i++;
        } while(i < names.length);

        // Java's forEach loop
        for(String name: names) {
            System.out.println("-----");
            System.out.println(name);
        }
    }
}
