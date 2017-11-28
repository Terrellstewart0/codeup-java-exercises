package util;

public class InputTest {

    public static void main(String[] args) {

        Input in = new Input();

        System.out.println(in.test);

        System.out.println("How are you feeling?");
        String userfeeling = in.getString();
        System.out.println("cool man i know how " + userfeeling + " feels!");


        System.out.println(" are you awake?");
        boolean userIsAwake = in.yesNo();
        if (userIsAwake){
            System.out.println("user is awake.");
        } else {
            System.out.println("user is asleep");
        }


        System.out.println("please inter an integer");
        int userInput = in.getInt();
        System.out.println("your integer is " + userInput);


        System.out.println("please enter a number 1-10");
        userInput = in.getInt(1, 10);
        System.out.println("integer is " + userInput);


        System.out.println("please enter a number between 0 and 1:");
        double pants = in.getDouble(0, 1);
        System.out.println(" number is " + pants);

    }
}
