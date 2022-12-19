import java.util.Scanner;
import java.util.ArrayList;
public class studentMain {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        //this choice is whether you want to replace a menu item or not "Y" for yes "N" for no
        String choice = "Y";
        
        //player's score
        int score = 0;
        
        
        //ask for player's name and set it as person's name. Make sure to return/greet the person with their name afterwards

        //make the starting menu by making an array with 20 food/drink items
        
        //print out the menu in a numbered list using a loop
        
        //ask player if they want to change an item on the menu and set choice = to Y or N 
        while (choice.equals ("Y")){

            //ask player what number menu item they would like to change and replace it then ask if they want to replace another
            
        }
        if(!choice.equals("Y")&&!choice.equals("N")){
           
            //print something that says it isn't a choice
        
        }
        if (!choice.equals("Y")){

            //print out the customer's current menu for them to review
            // print out the rules of the game and then ask if they are ready to begin

        }

        //create a new array list to be the customer's order

        /*make a for loop that runs the length of the menu
            -each time it loops you should make the order one item longer
                -ex. round one order: iceCream, round two order: noodles,lemonade
            -each item on the order should be randomly chosen out of the 20 on the menu
            -print out the customer's order and then ask for player to "make" the order by typing the order
            -compare order with player's answer
                -if right, +5 to player's score
                -if wrong, print out the right answer and +0 score
         */
        
         //after completing the game, if the player scored higher than 75 the did good, in between 75 and 50 is ok, and below 50 is bad
            //print their result back to them
    }
}
