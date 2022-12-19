public class Person {
    private String name;
    private int score;
    public Person(){
        name = "hi";
        score = 0;
    }
    public Person(String n, int s){
        name = n;
        score = s;
    }
    //returns name
public String getName(){
    return name;
}
//returns person score
public int getScore(){
    return score;
}
//sets people name
public void setName(String n){
    name= n;
}
//sets person's score
public void setScore(int s){
    score=s;
}
//System.out.println("\033[H\033[2J");

}
