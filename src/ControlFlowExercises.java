import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {



//
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//
//        int i=0;
//        do{
//            System.out.println(i);
//            i+= 2;
//        }while(i<=100);


//        int i=100;
//        do{
//            System.out.println(i);
//            i-= 5;
//        }while(i>=-10);

//        long i=2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i<=1000000L);


//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else  if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 ){
//                System.out.println("Fizz");
//            }
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("what number would you like to go up to?");
        int userInt = sc.nextInt();
//        System.out.println(userInt);

        for (int i = 1; i <= userInt; i += 1) {
            System.out.println(i);
            System.out.println(i * i);
            System.out.println(i * i * i);
        }


//        String firstName = "Fread";
//        short memberId = 1425;
//        System.out.printf("Memeber" %);

    }
}


