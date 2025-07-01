import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Hello! I'm your chatbot. Ask me something.");

        while (true) {
            System.out.print("You: ");
            input = scanner.nextLine().toLowerCase();

            if (input.contains("hi") || input.contains("hello")) {
                System.out.println("Bot: Hello there!");
            } else if (input.contains("how are you")) {
                System.out.println("Bot: I'm just a bot, but I'm doing fine!");
            } else if (input.contains("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            } else {
                System.out.println("Bot: I'm not sure how to respond to that.");
            }
        }

        scanner.close();
    }
}
