import java.util.Random;

/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 * Q2: class documentations include sections such as class declaration, descriptions, method summaries,etc.
 * they help us understand the class its methods and how to use them.
 * Q3: I'd say they have the same use except the one with the int toffset just allows us to choose where
 * the code starts to check
 * Q4: endsWith(String suffix) and the return type is boolean
 * Q5: length() and the return type is int
 * Q6: I would say it is easy to find if you know what to look for since you need to know the methods name
 * however you could use google to find the methods name and then use java api to help explain it to you
 * Q7: public String trim() 
 * String text= "Goodbye!";
 * String trimmedtext=text.trim();
 * Q10: boolean
 * Q12: it generates random pseudo-numbers and is in the java util package
 * Random rand = new Random();
 * int randomInt = rand.nextInt();
 * Q15: nextInt(int bound), when calling nextInt(100)  the numbers generated will be any number 0 to 99
 * Q21: you can use it as instead of the random class however its said its better for cryptography.
 * random numbers are important for cryptographic security to ensure strong unpredictable keys to protect
 * against cyber attacks and hackings.
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder; 
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();
            input=input.trim();
            input=input.toLowerCase();
            if(input.equals("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
