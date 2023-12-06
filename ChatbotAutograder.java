import java.util.Scanner;

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
        if (decider == 5) {
            System.out.println(unbiased.getResponse("I want to eat pie."));
            System.out.println(biased.getResponse("I want to go fishing!"));
            System.out.println(biased.getResponse("Willow and I want to skip rocks."));
            System.out.println(unbiased.getResponse("I really want to a lot of money."));
            System.out.println(unbiased.getResponse("I want to go swimming, unless Paul doesn't want to?"));
            System.out.println(biased.getResponse("I want to throw a party!"));

            System.out.println(unbiased.getResponse("I want pie."));
            System.out.println(biased.getResponse("I want a million bucks!"));
            System.out.println(biased.getResponse("I don't think I want to go today."));
            System.out.println(unbiased.getResponse("I want unconditional love."));
            System.out.println(biased.getResponse("I want many things for Christmas."));
        }
        if (decider == 6){
            Chatbot newBot = new Chatbot();
            System.out.println(newBot.getResponse("What was the last thing I said?"));
            System.out.println(newBot.getResponse("Can you repeat that?"));
            Chatbot newBot2 = new Chatbot();
            System.out.println(newBot2.getResponse("Can you repeat that?"));
            newBot.getResponse("What is the meaning of life?");
            System.out.println(newBot.getResponse("Can you repeat that?"));
            newBot.getResponse("I love SBS!");
            System.out.println(newBot.getResponse("What was the last thing I said?"));
        }
        if (decider == 7){
            System.out.println(unbiased.getResponse("You complete me!"));
            System.out.println(unbiased.getResponse("You annoy me so much."));
            System.out.println(biased.getResponse("You cannot compete with me."));
            System.out.println(biased.getResponse("He doesn't understand why you try to play with me."));
            System.out.println(biased.getResponse("It's a known fact that you can eat more than me."));
            System.out.println(unbiased.getResponse("You are very mad at me."));
            System.out.println(unbiased.getResponse("You seem to take issue with me."));
            System.out.println(unbiased.getResponse("Your cousin is friends with me."));
            System.out.println(biased.getResponse("Your cousin is friends with me."));

 
            System.out.println(unbiased.getResponse("I create music for you!"));
            System.out.println(biased.getResponse("I feel strongly about you."));
            System.out.println(unbiased.getResponse("It's too bad that I bake so much better than you."));
            System.out.println(unbiased.getResponse("It's insane how I am so much cooler than you."));
            System.out.println(biased.getResponse("I can think of many things to do to you!"));
            System.out.println(unbiased.getResponse("I'm on the train to see you."));
            System.out.println(biased.getResponse("It's great to see your accomplishments."));
        }
        }
}
