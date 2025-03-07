import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    /**
     * Question 14
     */
    public void printOneRandom() {
        Random rand = new Random();
        int randomNum = rand.nextInt();
        System.out.println(randomNum);
    }
    
    /**
     * Question 14
     */public void printMultiRandom(int howMany) {
        Random rand = new Random();
        for (int i = 0; i < howMany; i++) {
            int randomNum = rand.nextInt();  // Generates a random integer
            System.out.println(randomNum);
        }
    }
    
    /**
     * Q16
     */public int throwDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;  // Generates a number between 1 and 6
    }
    
    // Method to return a random response: "yes", "no", or "maybe"
    /**
     * Q17
     * Q18
     */public String getResponse() {
        ArrayList<String> responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("always");
        responses.add("never");
        // You can add as many responses as you like here

        Random rand = new Random();
        int randomIndex = rand.nextInt(responses.size());  // Generates a random index from 0 to the size of the list - 1

        return responses.get(randomIndex);
    }
    
    /**
     * Q19
     * Q20
     */
    public int generateRandomInRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
    
    /**
     * Q20
     */
    public int generateRandomInRange(int max) {
        return generateRandomInRange(1, max);  // Calls the new method with min = 1
    }
}

