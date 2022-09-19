package temperatureHw;
//Prompt a user to enter if they think the temperature is High, Low or Humid
//Based on the user's input print out one of these
//High: print out " sunblock may be needed"
//Low : print out " a coat may be needed"
//Humid: print out " it's muggy!"
import java.util.Scanner;
//import scanner class
public class tempHw {
    //create main method
    public static void main(String[] args) {
        while(true) {

            Scanner temp = new Scanner(System.in);
            //create new scanner object
            System.out.println("What is the temperature outside?");
            //print line that asks for temperature
            String temp1 = temp.nextLine();
            //give temperature a name to invoke/call for all different temps
            //create if statement to start the loop
            //print out messages for the temperature
            //create else if statement for different temperature names
            //create else statement in the end, so you can only enter correct temperature names

            if (temp1.equals("High")||temp1.equals("high")) {
                System.out.println("Sunblock may be needed!");
            } else if (temp1.equals("Low")||temp1.equals("low")) {
                System.out.println("A coat may be needed!");
            } else if (temp1.equals("Muggy")||temp1.equals("muggy")) {
                System.out.println("It's muggy!");
                break;
            } else {
                System.out.println("Invalid Entry");
            }

        }
    }
}