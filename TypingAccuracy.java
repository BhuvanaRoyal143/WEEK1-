import java.util.Scanner;

public class TypingAccuracy {

    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int minLength = Math.min(original.length(), typed.length());

        for (int i = 0; i < minLength; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else {
                System.out.println("First mismatch at position: " + (i + 1));
                break;
            }
        }

        double accuracy = ((double) matched / original.length()) * 100;

        System.out.printf("Typing Accuracy: %.2f%%\n", accuracy);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original text: ");
        String original = sc.nextLine();

        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();

        checkTypingAccuracy(original, typed);

        sc.close();
    }
}