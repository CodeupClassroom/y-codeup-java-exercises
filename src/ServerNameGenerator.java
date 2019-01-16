import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {
            "fast",
            "tiny",
            "ambitious",
            "funky",
            "cool",
            "blue",
            "bald",
            "untoward",
            "bewildered",
            "sleepy",
            "awake"};
    private static String[] nouns = {
            "rodeo",
            "aardvark",
            "koala",
            "city",
            "dog",
            "panda",
            "shoes",
            "macbook",
            "sea-otter",
            "cat",
            "rat"
    };

    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println(
                adjectives[rnd.nextInt(adjectives.length-1)]
                + " " +
                nouns[rnd.nextInt(nouns.length-1)]);
    }

}
