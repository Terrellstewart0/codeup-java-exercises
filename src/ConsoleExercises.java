import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter a thing: ");
//        int userInt = sc.nextInt();
//        System.out.println(userInt);
//
//        System.out.print("Please enter 3 words: ");
//        String firstWord, secondWord, thirdWord;
//        firstWord = sc.next();
//        secondWord = sc.next();
//        thirdWord = sc.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);
//
//
//        System.out.println("Enter a sentence: ");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);


        System.out.println("Enter a length: ");
        String lengthString = sc.nextLine();
        System.out.println(lengthString);

        double length = Double.parseDouble(lengthString);
        System.out.println(length);



    }

}