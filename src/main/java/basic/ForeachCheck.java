package basic;

public class ForeachCheck {

    static String[] myArray = {"muthu", "serma", "bala", "appa", "appa", "rubini"};

    public static void main(String[] args) {
        System.out.println("Individual pick " + myArray[3]);

        for (String m : myArray
        ) {
            System.out.println("output from for each " + m);
        }
    }
}
