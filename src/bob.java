import java.util.Scanner;

public class bob {

    public static void main(String[] args) {


        System.out.println(" say something to Bob");
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        boolean questionMark = userInput.endsWith("?");
        boolean isYelling = userInput.equals(userInput.toUpperCase());
        boolean sayNothing = userInput.isEmpty();

        if (sayNothing) {
            System.out.println("fine, be that way");
        } else if (isYelling) {
            System.out.println("chill out man!");
        } else if (questionMark) {
            System.out.println(" sure man");
        } else {
            System.out.println("whatever");
        }



    }

}
