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

        System.out.println("\n Main Menu:\n1. Name Spam\n2. ");

}

}
