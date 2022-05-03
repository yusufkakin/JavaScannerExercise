import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.\nWho is the hero of our story?");
        String hero = scanner.nextLine();
        System.out.println("What is their superpower?");
        String superPower = scanner.nextLine();

        System.out.println("There once was a superhero named "+hero+", who had a power of "+superPower+".\nAs they grew older, " + hero + " saw that world needed them.\n" +hero+ " used their ability to "+ superPower + " to save the world."  );

    }
}
