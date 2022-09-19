package PetNames;
//Create a program that asks the user how many pets
// they have. Once you know how many pets they have,
// ask them what kind of pet each one is,
// along with each pet's name.
// For now your program should
// just hold onto the user input and print
// out the list at the end;
// we'll modify this in part 3.

import java.util.Scanner;
//import scanner class

public class NamesPet {
    public static void main(String[] args) {
        //create new scanner object to invoke
        Scanner pets = new Scanner(System.in);
        System.out.println("How many pet's do you have?");
        int numPet = pets.nextInt();
        pets.nextLine();
        System.out.println("What kind of pets do you have?");
        String petType = pets.nextLine();
        String petType1 = pets.nextLine();
        String petType2 = pets.nextLine();
        System.out.println("& What are your pets names?");
        String name = pets.nextLine();
        String name1 = pets.nextLine();
        String name2 = pets.nextLine();
        System.out.println("I have " + numPet + " pets."+"\n" + "My pets names are " + name+"," + name1 +","+"& "+name2+"."+"\n" + "They are a "+ petType+","+petType1+","+"& "+petType2+".");
        pets.close();
    }
}
