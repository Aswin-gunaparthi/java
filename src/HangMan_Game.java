import java.util.ArrayList;
import java.util.Scanner;

public class HangMan_Game {
    public static void main(String[] args){

        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        String line

        String word = "mouse";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for (int i = 0; i < word.length(); i++){
            wordState.add('_');
        }
        System.out.println("WELCOME TO JAVA HANGMAN");

        while (wrongGuess < 6){

            System.out.println(getHangmanArt(wrongGuess));

            System.out.print("Word: ");
            for (char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0){
                System.out.println("Correct Guess\n");

                for (int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("YOU WIN");
                    System.out.println("the word was: " + word);
                    break;
                }
            }
            else {
                wrongGuess++;
                System.out.println("Wrong guess");
            }

        }

        if (wrongGuess >= 6){
            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("GAME OVER");
            System.out.println("the word was: " + word);
        }
        scanner.close();
    }

    static String getHangmanArt(int wrongGuess){
        return switch (wrongGuess){
          case 0 ->"""
                   
                   
                   
                   """  ;
          case 1 ->"""
                    o
                  
                  
                  """;
          case 2 ->"""
                    o
                    |
                  
                  """;
          case 3 ->"""
                     o
                    |\\
                  
                  """;
          case 4 ->"""
                     o
                    /|\\
                  
                  """;
          case 5 ->"""
                     o
                    /|\\
                    /
                  """;
          case 6 ->"""
                     o
                    /|\\
                    / \\
                  """;
            default -> "";
        };
    }
}
