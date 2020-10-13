import java.util.*;
import java.io.*;
import java.util.Scanner;

public class ATLAQuiz {
    public static void main(String[] args) throws Exception {
        // initialize scanner
        Scanner userinput = new Scanner(System.in);

        int userScore = 0;

        // initialize dictionary
        Dictionary<String, Integer> characterScore = new Hashtable<String, Integer>();

        // putting values into the dictionary
        characterScore.put("Aang", 0);
        characterScore.put("Katara", 0);
        characterScore.put("Sokka", 0);
        characterScore.put("Toph", 0);
        characterScore.put("Zuko", 0);

        // Question 1
        System.out.println("Question 1: ");
        System.out.println("Which Element would you choose? Enter the number.");
        System.out.println("1. Air");
        System.out.println("2. Earth");
        System.out.println("3. Fire");
        System.out.println("4. Water");
        System.out.println("5. Non-Bender");

        // get the users answer
        userScore = userinput.nextInt();
        String characterChoice;
        // store users answer in dictionary
        switch (userScore) {
            case 1:
                characterChoice = "Aang";
                break;
            case 2:
                characterChoice = "Toph";
                break;
            case 3:
                characterChoice = "Zuko";
                break;
            case 4:
                characterChoice = "Katara";
                break;
            case 5:
                characterChoice = "Sokka";
                break;
            default:
                throw new Exception();
        }
        // get value from switch cases to store in dictionary
        int tempScore = characterScore.get(characterChoice);
        tempScore++;
        characterScore.put(characterChoice, tempScore);

        // Question 2
        System.out.println("Question 2: ");
        System.out.println("What do you rely on most? Enter the number.");
        System.out.println("1. Strength");
        System.out.println("2. Level-headedness");
        System.out.println("3. Ingenuity");
        System.out.println("4. Senses");
        System.out.println("5. Talents");

        // get the users answer
        userScore = userinput.nextInt();
        // store users answer in dictionary
        switch (userScore) {
            case 1:
                characterChoice = "Zuko";
                break;
            case 2:
                characterChoice = "Aang";
                break;
            case 3:
                characterChoice = "Sokka";
                break;
            case 4:
                characterChoice = "Toph";
                break;
            case 5:
                characterChoice = "Katara";
                break;
            default:
                throw new Exception();
        }
        // get value from switch cases to store in dictionary
        tempScore = characterScore.get(characterChoice);
        tempScore++;
        characterScore.put(characterChoice, tempScore);

    }
}