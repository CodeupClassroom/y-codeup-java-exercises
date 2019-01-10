public class MethodBonus {
    public static void main(String[] args) {
        String input = "Thursday";
        System.out.println(countVowels(input));
    }

    public static boolean isVowel(String input) {
        if(input.length() > 1) {
            return false;
        }

        return input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u");
    }

    public static boolean hasVowels(String input) {
        String letter = "";

        for(int i = 0; i < input.length(); i++) {

            letter = input.charAt(i) + "";
            if(isVowel(letter)) {
                return true;
            }
        }

        return false;
    }

    public static int countVowels(String input) {
        int count = 0;
        String letter = "";
        for(int i = 0; i < input.length(); i++) {
            letter = input.charAt(i) + "";
            if(isVowel(letter)) {
                count++;
            }
        }
        return count;
    }
}
