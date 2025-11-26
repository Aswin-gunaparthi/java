import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio_Output {

    public static void main(String[] args) {

        String filePath = "src/good for the ghost - Alge.wav";
        File file = new File(filePath);

        try (Scanner sc = new Scanner(System.in)) {

            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);

            String response = "";

            while (!response.equals("Q")) {

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = sc.next().toUpperCase();

                switch (response) {
                    case "P":
                        clip.start();
                        break;

                    case "S":
                        clip.stop();
                        break;

                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;

                    case "Q":
                        clip.close();
                        break;

                    default:
                        System.out.println("Invalid option");
                }
            }
        }
        catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Bye");
        }
    }
}

