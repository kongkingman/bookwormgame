import java.util.Scanner;
public class Bookworm {
        public static void main(String[] args) throws InterruptedException {
            //Seperator para mas maganda yung output. System.out.println(seperator); lang para magamit
            String seperator = "---------------------------------------";
            
            //Start ng laro dito
            //Name input and welcome message
            Scanner inputName = new Scanner(System.in);
            System.out.println("Welcome to ByteBeacon: A Bookworm Game!");
            Thread.sleep(1000);
            System.out.println(seperator);
            System.out.println("Please enter your name: ");
            String name = inputName.nextLine();
            System.out.println(seperator);
            System.out.println("Welcome " + name + "!");

            //Wait for 1 second bago i-execute yung next line
              Thread.sleep(1000);
            
            //Game instructions
            System.out.println("The goal of the game is type in the longest word you can find in the given set of random letters.");
                Thread.sleep(2000);
                System.out.println(seperator);
            System.out.println("The longer the word, the more damage you do to the enemy.");
                Thread.sleep(2000);
                System.out.println(seperator);
            System.out.println("You have 30 seconds to type in the word everytime it's your turn.");
                Thread.sleep(2000);
                System.out.println(seperator);

            Scanner input = new Scanner(System.in);
            System.out.println("Have you understood the instructions? (Y/N)");
            String answer = input.nextLine();
            if (answer.equals("Y")) {
                System.out.println(seperator);
                System.out.println("Let's start the game!");
            } else if (answer.equals("N")) {
                System.out.println(seperator);
                System.out.println("Please read the instructions again.");
            } else {
                System.out.println(seperator);
                System.out.println("Please enter Y or N only.");
            }


    
            /* TODO: 
            •	Create a simple enemy of the game with HP bar. (10%)
            •	Random words will be generated in which the user should type the longest word they could find from it. (30% -- Hanggang dito muna)
            •	Insert input words from the user that will be used as the weapon -- Haggang dito muna yung game. (50%)
            •	Enemy HP bar will be depleted depending on the word length (80%)
            •	The player will win if the enemy HP bar is depleted. (100%)
            */
        }
    }