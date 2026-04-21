import java.util.Arrays;
import java.util.Scanner;

public class MoodSnapshot{
    public static void main(String[] args) {

        String name, mood;
        int energyLevel;
        final int maxEnergy = 10, minEnergy = 0;
        String[] moodList = {"Happy", "Sad", "Calm", "Angry"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digital Mood Snapshot\n");

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.println("What's your mood? Here's a list of mood's to help you as examples:");
        System.out.println(Arrays.toString(moodList));
        System.out.print("What's your mood: ");
        mood = scanner.nextLine();

        System.out.print("On a scale of 1-10, what's your energy level: ");
        energyLevel = scanner.nextInt();

        if (energyLevel > maxEnergy) {
            System.out.println("Energy levels must be lower than 10");
            System.out.print("Energy level: ");
            energyLevel = scanner.nextInt();
        } else if (energyLevel < minEnergy) {
            System.out.println("Energy levels must be higher than 0");
            System.out.print("Energy level: ");
            energyLevel = scanner.nextInt();
        }

        System.out.println("\n--- Mood Snapshot ---");
        System.out.println("Name: " + name);
        System.out.println("Mood: " + mood);
        System.out.println("Energy Level: " + energyLevel + "/10");

    }
}