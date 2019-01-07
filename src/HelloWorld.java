public class HelloWorld {
    public static void main(String[] args){
        int myFavoriteNumber = 1;
        String myString = "Fer";
        float myNumber = 3.14f;

        System.out.println(myNumber);
        System.out.println(myString);
        System.out.println("Mendoza");

//        int x = 5;
//        System.out.println(++x);

        String theNumberThree = "3";
        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

        int three = Integer.parseInt("3");
        System.out.println(three);

//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        int newNumber = Integer.MAX_VALUE +1;
        System.out.println(newNumber);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}