import java.util.Scanner;

public class PasswordAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🔐 AI-Powered Password Strength Analyzer 🔍");

        while (true) {
            System.out.println("\n1. Analyze Password");
            System.out.println("2. Generate Secure Password");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nEnter your password: ");
                    String password = sc.nextLine();
                    String strength = PasswordEvaluator.evaluate(password);
                    System.out.println("\n🔎 Password Strength: " + strength);
                    break;
                case 2:
                    System.out.println("\n✅ Suggested Strong Password: " + PasswordGenerator.generateStrongPassword());
                    break;
                case 3:
                    System.out.println("Exiting... Stay Secure! 🔐");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
