import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        Person person = new Person();
        System.out.println("Hi, what is your name?");
        String name = sc.next();
        person.setName(name);
        System.out.println("hi "+ person.getName()+ '\n');
        String choice = "Y";
        //creates the intitial menu
        String [] menu = {"cake", "donut", "iceCream","pizza", "steak" , "milkshake", "pasta", "avocado", "soda", "chickenAlfredo", "salad", "pinaColada", "rice", "fruitBowl", "cabbage", "pear", "potato", "turkey", "popsicle", "water"};
        System.out.println("This is you current menu: ");
        int score = 0;
        //prints out the menu in a numbered list
        for (int x = 0; x<menu.length; x++){
            System.out.println(x+1 + ". " + menu[x] + '\n');
        }
        System.out.println("Would you like to replace any item on your menu? Y or N");
        choice  = sc.next();
        //if user wants to replace an item on the menu they choose the number item on the list to replace and then replace it
        while (choice.equals ("Y")){
            if (choice.equals("Y")){
                System.out.println("What menu number item would your like to replace?");
                int number = sc.nextInt();
                if (number>=1 && number<= 20){
                    System.out.println("What would you like to replace "+ menu[number-1] + " with?");
                    String replace = sc.next();
                    menu[number-1] = replace;
                    System.out.println("Would you like to replace another item on your menu? Y or N");
                    choice = sc.next();
                }
                //if they choose not Y or N
                else{
                    System.out.println("Sorry, this number is not on the menu");
                }
            }
            else if (!choice.equals("Y")&& !choice.equals("N")){
                System.out.println("You did not chose Y or N");
                choice = "Y";
            }
        }
        //if they choose a choice that is not Y or N it first prints this
        if(!choice.equals("Y")&&!choice.equals("N")){
            System.out.println("That wasn't a choice. However you have lost the ability to change the menu :(");
        }
        //it choice is not Y then it prints the current menu and asks the player to begin *it doesn't really matter what they say
        if (!choice.equals("Y")){
            System.out.println('\n'+"---------------------------------"+'\n');
            System.out.println("This is your current menu: " );
            for (int x = 0; x<menu.length; x++){
                System.out.println(x+1 + ". " + menu[x] + '\n');
            }
            System.out.println("Let the game begin! Here are the instructions: ");
            System.out.println("Every round a customer will come and order one more item than the last. Seperate an order with multiple things using commas but NO SPACES. remember, Spelling and Spacing are important!");
            System.out.println("Are you Ready? Y or N");
            choice = sc.next();
            if (choice.equals("N")){
                System.out.println("Too bad :)");
            }
            else if (choice.equals("Y")){
                System.out.println("Great! let's begin");
            }
            else{
                System.out.println("That wasn't a choice but it's fine since you never had a choice to begin with");
            }
        }
        //create a new array list
        ArrayList <String> toCook = new ArrayList <String> ();
        //every round the order gets one item longer
        for (int i = 1; i<=menu.length; i++){
            int x = i;
            System.out.println('\n' + "-------------------------------");
            System.out.println('\n'+ "Round " + i);
            System. out.println ("A new customer has entered and has ordered " +i+ " item(s)" + '\n');
            //adds a random item from the menu to the order for the number of times needed for the round
            while (x>0){
                int menuItem = (int)(Math.random()*20);
                toCook.add (menu[menuItem]);
                x--;
            }
            //prints out what the customer has ordered
            System.out.println("The customer has ordered " + toCook);
            //turns the array list into a string
            String cook = String.join(",",toCook);
            if (i==1){
                System.out.println("Repeat the customer's order in order to earn a 5 star rating, get it wrong and you get 0 stars :( ");
            }
            System.out.println("repeat the customer's menu");
            String answer = sc.next();
            //checks if answer was same as menu. if yes, gets 5 points
            if (answer.equals (cook)){
                System.out.println("Congrats you got it right! Your customer gave you 5 stars!");
                score += 5;
                person.setScore(score);
            }
            //prints the correct order if wrong
            else{
                System.out.println("thats wrong...");
                System.out.println("the correct answer was: " + cook+ '\n');
            }
            int b = 0;
            //clears the order after each round
            while (b <= i-1){
                toCook.remove((i-1)-b);
                b++;
            }
            b = 0;
        }
        //after 20 rounds this is the end if above 75 score, it's good, if between 50 and 75 its fine, if less than 50 bad
        System.out.println("----------------------------------"+ '\n');
        System.out.println("Congrats you reached the end of the game!"+ '\n'+ "This is your score:" + person.getScore());
        if (person.getScore()>=75){
            System.out.println("Congrats " +person.getName()+" you passed!");
        }
        else if (person.getScore()<75 && person.getScore()>=50){
            System.out.println("well you didn't fail ig. Good job "+ person.getName());
        }
        else if (person.getScore()<50){
            System.out.println("You suck "+person.getName()+". Due to the low ratings of your restraunt you go bankrupt");
        }
    }

}