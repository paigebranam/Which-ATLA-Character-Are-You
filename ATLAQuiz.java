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
        String characterChoice = matchToQuestion(userinput, "Which Element would you choose? Enter the number.",
                new String[] { "1. Air", "2. Earth", "3. Fire", "4. Water", "5. Non-Bender" },
                new String[] { "Aang", "Toph", "Zuko", "Katara", "Sokka" });

        // increment value in dictionary
        incrementScore(characterScore, characterChoice);

        // Question 2
        System.out.println("Question 2: ");
        characterChoice = matchToQuestion(userinput, "What do you rely on most? Enter the number.",
                new String[] { "1. Strength", "2. Level-headedness", "3. Ingenuity", "4. Senses", "5. Talents" },
                new String[] { "Zuko", "Aang", "Sokka", "Toph", "Katara" });

        incrementScore(characterScore, characterChoice);

        // Question 3
        System.out.println("Question 3: ");
        characterChoice = matchToQuestion(userinput, "What do you fight for? Enter the number.",
                new String[] { "1. Revenge", "2. Love", "3. Honor", "4. Balance", "5. Equality" },
                new String[] { "Katara", "Sokka", "Zuko", "Aang", "Toph" });

        incrementScore(characterScore, characterChoice);

        // Question 4
        System.out.println("Question 4: ");
        characterChoice = matchToQuestion(userinput, "Choose an animal? Enter the number.",
                new String[] { "1. Air Bison", "2. Dragon", "3. Koi", "4. Badgermole", "5. Otter Penguin" },
                new String[] { "Aang", "Zuko", "Sokka", "Toph", "Katara" });

        incrementScore(characterScore, characterChoice);

        // Question 5
        System.out.println("Question 5: ");
        characterChoice = matchToQuestion(userinput, "Who's your favorite Avatar? Enter the number.",
                new String[] { "1. Wan", "2. Aang", "3. Kyoshi", "4. Korra", "5. Roku" },
                new String[] { "Sokka", "Aang", "Toph", "Katara", "Zuko" });

        incrementScore(characterScore, characterChoice);

        // Question 6
        System.out.println("Question 6: ");
        characterChoice = matchToQuestion(userinput, "Where would you rather visit? Enter the number.",
                new String[] { "1. Ba sing sei", "2. Fire Nation Palace", "3. Southern Water Tribe Palace",
                        "4. Northern Air Temple", "5. The Swamp" },
                new String[] { "Sokka", "Zuko", "Katara", "Aang", "Toph" });

        incrementScore(characterScore, characterChoice);

        // Question 7
        System.out.println("Question 7: ");
        characterChoice = matchToQuestion(userinput, "Choose something to overcome. Enter the number.",
                new String[] { "1. I must restore my honor", "2. My mother died for me",
                        "3. My girlfriend turned into the moon", "4. I'm the last airbender",
                        "5. No one believes in me because I'm blind" },
                new String[] { "Zuko", "Katara", "Sokka", "Aang", "Toph" });

        incrementScore(characterScore, characterChoice);

        // Question 8
        System.out.println("Question 8: ");
        characterChoice = matchToQuestion(userinput, "Who is your compliment? Enter the number.",
                new String[] { "1. Bumi", "2. Iroh", "3. Azula", "4. Suki", "5. Yue" },
                new String[] { "Sokka", "Aang", "Katara", "Toph", "Zuko" });

        incrementScore(characterScore, characterChoice);

        userResult(characterScore, new String[] { "Sokka", "Aang", "Toph", "Katara", "Zuko" });
    }

    // method to print user score
    public static void userResult(Dictionary<String, Integer> characterScore, String[] names) {
        int maxValue = 0;
        String currentMatch = "";
        for (int i = 0; i < names.length; i++) {
            int dictionaryScore = characterScore.get(names[i]);
            if (dictionaryScore > maxValue) {
                maxValue = dictionaryScore;
                currentMatch = names[i];
            }
        }
        System.out.println("Your match is: " + currentMatch);
    }

    public static void incrementScore(Dictionary<String, Integer> characterScore, String characterChoice) {
        // get value from switch cases to store in dictionary
        int tempScore = characterScore.get(characterChoice);
        tempScore++;
        characterScore.put(characterChoice, tempScore);

    }

    // creating a function to optimize question and answer process.
    public static String matchToQuestion(Scanner userInput, String question, String[] answers, String[] names)
            throws Exception {
        // print question
        System.out.println(question);
        // answers to questions stored in an array. Print answers stored in array.
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
        // get the users answer
        int userScore = userInput.nextInt();
        String characterChoice;

        switch (userScore) {
            case 1:
                characterChoice = names[0];
                break;
            case 2:
                characterChoice = names[1];
                break;
            case 3:
                characterChoice = names[2];
                break;
            case 4:
                characterChoice = names[3];
                break;
            case 5:
                characterChoice = names[4];
                break;
            default:
                throw new Exception();
        }

        return characterChoice;

    }
}