import java.util.Scanner;

public class ConditionalStatement {
    public static void main (String[] args) {

        // Q1: If a person is eligible to Vote
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("NOT Eligible to Vote");
        }

        
        // Q2: Given 2 numbers, Find the max of them
        int a = scan.nextInt();
        int b = scan.nextInt();

        if ( a > b ) {
            System.out.println(a + " is Maximum of " + a +" & " + b);
        }
        else if (a < b) {
            System.out.println(b + " is Maximum of " + a +" & " + b);
        }
        else {
            System.out.println("Neither of " + a +" & " + b + " is Maximum");
        }


        /* Q3:
         * Read the temp of a person & print if he has fever or not
         *      optimal temp -> [98.2, 98.9] -> Person doesn't have fever
         *      ex1: 105.9 -> person has fever
         *      ex2: 94.2 -> person has a low temp
        */
        float temp = scan.nextFloat();

        if (temp > 98.9) {
            System.out.println("Person HAS Fever");
        }
        else if (temp >= 98.2) {
            System.out.println("Person Doesn't Has Fever");
        }
        else {
            System.out.println("Person has LOW Fever");
        }


        /* Q4:
         * Read the spO2 levels of a person & print if the person's oxygen levels is
         *      Normal - [96 - 100]
         *      Slightly below normal - [90 - 95]
         *      Alarmingly below Normal - [ < 90 ]
        */
        int spO2 = scan.nextInt();

        if (spO2 < 90) {
            System.out.println("Alarmingly below Normal");
        }
        else if (spO2 <= 95) {
            System.out.println("Sligthly below Normal");
        }
        else {
            System.out.println("Normal");
        }


        /* Q7: [AMAZON]
         * Given a Number, print 
         *      "Fizz" if it is divisible by 3
         *      "Buzz" if it is divisible by 5
         *      "FizzBuzz" if it is divisible by both 3 & 5
        */
        int num = scan.nextInt();

        if (num % 15 == 0 ) {   
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("Neither 'Fizz' nor 'Buzz' nor 'FizzBuzz'");
        }
        /**
         * if a num is dividible by both 3 && 5, then it will be divisible by 15 too which is 3*5
         * We can also use condition (num%3 == 0 && num%5 == 0 )
         * 
         * The trick here, the condition (num%3 == 0 && num%5 == 0 ) must be checked 1st
         * else, it will fail
         * cuzz, if num is divisible by either 5 (or) 3, then it will get executed & exit the flow
         * And it won't check the condition of (num%3 == 0 && num%5 == 0 )
        */


        System.out.println(-4%7);   // -4 [ in java, But remainder will never be -ve ]
        
        scan.close();
    }
}