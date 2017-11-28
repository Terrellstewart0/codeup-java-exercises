package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

   public String test;

    public Input() {
        this.sc = new Scanner(System.in);
        test = "working";

    }
        public String getString() {
        return  sc.nextLine();
        }


       public boolean yesNo() {
        String userChoice = sc.next();
        return userChoice.equalsIgnoreCase( "y") || userChoice.equalsIgnoreCase("yes");


       }


   public int getInt() {
       int userInput = sc.nextInt();

       if (sc.hasNextInt()) {
           return sc.nextInt();
       } else {
           System.out.println("not an int");
           sc.next();
           return getInt();
       }
   }



    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("not in range");
            sc.next();
            return getInt();
        }
    }


    public double getDouble() {
        double userInput = sc.nextDouble();

        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("not an Double");
            sc.next();
            return getDouble();
        }
    }



    public double getDouble(int min, int max) {
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("not in range");
            sc.next();
            return getDouble();
        }
    }

//       public double getDouble(){ }

//        double getDouble(double min, double max)


    }

