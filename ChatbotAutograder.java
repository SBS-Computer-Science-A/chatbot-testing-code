import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class ChatbotAutograder
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        int decider = 0;
        if (args.length > 0){
            try{
                decider = Integer.valueOf(args[0]);
            }
            catch (Exception e){}
        }
        Chatbot unbiased = new Chatbot();
        Chatbot biased = new Chatbot("checkers");

        if (decider <= 1) {
            System.out.println(unbiased.getGreeting());
            System.out.println(unbiased.getResponse(""));
            System.out.println(unbiased.getResponse(" "));
            System.out.println(unbiased.getResponse("  "));
            System.out.println(unbiased.getResponse("Hello"));
            System.out.println(unbiased.getResponse("What is your name?"));


            System.out.println(unbiased.getGreeting());
            System.out.println(unbiased.getResponse("  "));
            System.out.println(unbiased.getResponse("Hello"));
        }
        if(decider ==2){
            System.out.println(unbiased.findKeyword("this pin is here", "pin",0));
            System.out.println(unbiased.findKeyword("this hat is here", "pin",0));
            System.out.println(unbiased.findKeyword("this pin is here under the pin", "pin",0));
            System.out.println(unbiased.findKeyword("this pin is here under the pin", "pin",5));
            System.out.println(unbiased.findKeyword("this pin is here under the pin", "pin",6));
            System.out.println(unbiased.findKeyword("this spin is here under the pin", "pin",0));
            System.out.println(unbiased.findKeyword("pin is the word", "pin",0));
            System.out.println(unbiased.findKeyword("pin is the word", "pin",2));
            System.out.println(unbiased.findKeyword("pin is the word", "pin",80));
            System.out.println(unbiased.findKeyword("Pin is the word", "pin",0));
            System.out.println(unbiased.findKeyword("can you find the pin?", "pin",0));
            System.out.println(unbiased.findKeyword("FIND THE PIN", "pin",0));
        }
        if(decider == 3){
            System.out.println(unbiased.getResponse("I hate potatoes"));
            System.out.println(unbiased.getResponse("Do you know what I hate about potatoes?"));
            System.out.println(biased.getResponse("Hate is a strong word"));
            System.out.println(unbiased.getResponse("I am stupid"));
            System.out.println(biased.getResponse("Stupidity is the root of all evil"));
            System.out.println(unbiased.getResponse("I dislike broccoli"));
            System.out.println(biased.getResponse("I hate and dislike elves"));
            System.out.println(unbiased.getResponse("I do not know that man"));
            System.out.println(unbiased.getResponse("Do not eat the muffins"));
            System.out.println(biased.getResponse("I admire trees"));
            System.out.println(unbiased.getResponse("Do you not know the answer?"));

            System.out.println(unbiased.getResponse("My mother is tall."));
            System.out.println(unbiased.getResponse("Brother John is my friend."));
            System.out.println(biased.getResponse("I have been grandfathered in to that clause."));
            System.out.println(biased.getResponse("Don't mess with my sister."));
            System.out.println(unbiased.getResponse("My father and my brother are visiting"));
            System.out.println(unbiased.getResponse("My goodness, sister, how you have grown!"));
            System.out.println(unbiased.getResponse("My sister, how you have grown!"));
            System.out.println(biased.getResponse("I went to go visit my mother!"));
            System.out.println(unbiased.getResponse("I hate my brother."));
        }
        if (decider == 4){
            Chatbot newUnbiased = new Chatbot();
            System.out.println(newUnbiased.getResponse("Tell me about yourself."));
            System.out.println(biased.getResponse("Tell me about yourself."));

            System.out.println(newUnbiased.getResponse("I think you should like rainbows."));
            System.out.println(newUnbiased.getResponse("I think you should like snails."));
            System.out.println(biased.getResponse("I think you should like King Kong."));

            System.out.println(newUnbiased.getResponse("I hate snails"));
            System.out.println(newUnbiased.getResponse("Do you know what I hate about rainbows?"));
            System.out.println(biased.getResponse("King Kong is hard to hate"));
            System.out.println(newUnbiased.getResponse("Snails are stupid"));
            System.out.println(biased.getResponse("Stupidity is the root of all evil"));
            System.out.println(unbiased.getResponse("I dislike broccoli"));
            System.out.println(biased.getResponse("I hate and dislike elves"));
            System.out.println(biased.getResponse("I do not know that man"));
        }
    }
}
