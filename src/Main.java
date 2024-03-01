import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write something...");
            String input = scanner.nextLine();
            StringBuilder reversedStr = new StringBuilder();

            if (input.isBlank() || input.length() < 2) {
                System.out.println("Invalid input.");
                continue;
            }

            for (int i = 0; i < input.length(); i++) {
                reversedStr.insert(0, input.charAt(i));
            }

            System.out.println("String Output: "+ reversedStr);
            break;
        }
    }
}
