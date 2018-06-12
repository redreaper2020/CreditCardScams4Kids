import java.util.Scanner;
/**
 * John Davison
 * UserInput.java
 * This program will teach us how to use a Scanner
 */
public class UserInput{
    public static void main(){    
       //To use an object from a class that was imported we first need to
       //instantiate an object of that class (create it!)
       
       Scanner sc = new Scanner(System.in);
       
       //** you must open the terminal window before using the scanner**
       System.out.println("Hello, what is your name?");
       String name = sc.nextLine();
       
       System.out.println("Nice to meet you " + name + ", my name is Mickey Mouse");
       
       System.out.println("How old are you?");
       int age = sc.nextInt();
       if (age > 18) {
           System.out.println("Scram");    
        }
       if(age < 18){
           System.out.println("Can you find your parent's credit card? heehee");
           int number = sc.nextInt();
           if (number >0){
               System.out.println("A big thanks from the whole gang at the Mickey Mouse Clubhouse!!");
               System.out.println("                        .d88888888bo.");
               System.out.println("                      .d8888888888888b.");
               System.out.println("                      8888888888888888b");
               System.out.println("                      888888888888888888");
               System.out.println("                      888888888888888888");
               System.out.println("                       Y8888888888888888");
               System.out.println("                 ,od888888888888888888P");
               System.out.println("              .'`Y8P'```'Y8888888888P'");
               System.out.println("            .'_   `  _     'Y88888888b");
               System.out.println("           /  _`    _ `      Y88888888b   ____");
               System.out.println("        _  | /  \\  /  \\      8888888888.d888888b.");
               System.out.println("       d8b | | /|  | /|      8888888888d8888888888b");
               System.out.println("      8888_\\ \\_|/  \\_|/      d888888888888888888888b");
               System.out.println("      .Y8P  `'-.            d88888888888888888888888");
               System.out.println("     /          `          `      `Y8888888888888888");
               System.out.println("     |                        __    888888888888888P");
               System.out.println("      \\                       / `   dPY8888888888P'");
               System.out.println("       '._                  .'     .'  `Y888888P`");
               System.out.println("          `'''-.,__    ___.-'    .-'");
               System.out.println("              `-._````  __..--'`");
               System.out.println("                  ``````");
            }  
       }
        }
    }

    