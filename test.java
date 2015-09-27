import java.util.Scanner;


class name {
String name;

void setName (String n) {
        name = n;
}

}



public class test {

public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        name user = new name();

        System.out.println("Welcome to test! What is your name?");

        user.setName(scan.nextLine());

        System.out.println("Hello " + user.name + "! \nWelcome to Test! I am a program that does nothing useful!");

        boolean run = true;

        while(run) {

                System.out.println("\nMain Menu:\n\n1. Name Spam\n2. Name Flip\n3. Quit\n(1,2,3)");

                int choice = scan.nextInt();

                switch(choice) {

                case 1:

                        break;
                case 2:

                        break;
                case 3:

                        break;
                default:
                        System.out.println("Sorry that's not a valid choice");

                }

        }
}

}
