import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class AIChatbot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI Chatbot =====");
        System.out.println("Type 'exit' to quit.");

        while(true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if(input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! Welcome.");
            }

            else if(input.contains("name")) {
                System.out.println("Bot: I am CodeAlpha AI Chatbot.");
            }

            else if(input.contains("time")) {
                System.out.println("Bot: Current Time: " + LocalTime.now());
            }

            else if(input.contains("date")) {
                System.out.println("Bot: Today's Date: " + LocalDate.now());
            }

            else if(input.contains("java")) {
                System.out.println("Bot: Java is an Object Oriented Programming Language.");
            }

            else if(input.contains("bye") || input.contains("exit")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}