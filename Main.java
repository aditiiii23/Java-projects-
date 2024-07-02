


import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Hello!!! ");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("and you have to guess what it is? well just enter zero to continue");
        Scanner sc = new Scanner(System.in);
        int mynumber = (int) (Math.random()*100);
        int usernumber = sc.nextInt();


        do {
            System.out.println("Guess my number (0-100)");
            usernumber = sc.nextInt();
            if ( usernumber == mynumber ) {
                System.out.println("WOHOHOHO!!! CORRECT NUMBER");
                break;
            }
            else if ( usernumber > mynumber){
                System.out.println("Your number is too large");


            }
            else {
                System.out.println("Your number is too small");

            }

        } while (usernumber >= 0);

        System.out.print("My number is: ");
        System.out.println(mynumber);
    }
}