
package enums;

import java.util.Scanner;


public class Enums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String userInput;
        Teams userTeam = null;
        System.out.println("Enter team or city name in Central Division: ");
        userInput = input.nextLine().substring(0, 2);
        
        
        for(Teams t : Teams.values())
        {
            if(userInput.equalsIgnoreCase(t.getCity().substring(0, 2)) || userInput.equalsIgnoreCase(t.getTeam().substring(0, 2)))
            {
                userTeam = t;
            }
        }
        printTeam(userTeam);
        
        
    }
    public static void printTeam(Teams t)
    {
        String output = "";
        output = t.getCity() + " " + t.getTeam();
        if(output.isEmpty())
        {
            System.out.println("No match found.");
        }
        System.out.println(output);
    }
    
}
