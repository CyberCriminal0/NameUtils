//Created by Jack Eller
import java.util.Scanner;

class logic {

String name;

public logic(String n){
        this.name = n;
}

public void spam(){

        Scanner scan = new Scanner(System.in);

        System.out.println("How many times would you like your name spammed?");

        int spam = scan.nextInt();

        for(int x = 0; x < spam; x++) {
                System.out.println(name);
        }

}

public void flip(){

String flip = new StringBuffer(name).reverse().toString();

System.out.println("Your name flipped is:\n\n" + flip);

}

}

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

        logic logic = new logic(user.name);

        boolean run = true;

        while(run) {

                System.out.println("\nMain Menu:\n\n1. Name Spam\n2. Name Flip\n3. Quit\n(1,2,3)");

                int choice = scan.nextInt();

                switch(choice) {

                case 1:
                        logic.spam();
                        break;
                case 2:
                        logic.flip();
                        break;
                case 3:
                        System.out.println("Bye Bye");
                        System.exit(0);
                        break;
                default:
                        System.out.println("\nSorry that's not a valid choice");

                }

        }
}
}
