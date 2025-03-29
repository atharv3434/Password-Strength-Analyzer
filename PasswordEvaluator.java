import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

public class PasswordEvaluator {
    private static final int MIN_LENGTH = 8;
    private static final String COMMON_PASSWORDS_FILE = "common_passwords.txt";

    public static String evaluate(String password) {
        if (password.length() < MIN_LENGTH) return "❌ Weak (Too Short)";
        if (isCommonPassword(password)) return "❌ Weak (Common Password)";
        if (!Pattern.compile("[A-Z]").matcher(password).find()) return "⚠️ Medium (No Uppercase)";
        if (!Pattern.compile("[a-z]").matcher(password).find()) return "⚠️ Medium (No Lowercase)";
        if (!Pattern.compile("[0-9]").matcher(password).find()) return "⚠️ Medium (No Numbers)";
        if (!Pattern.compile("[!@#$%^&*()_+\\-=]").matcher(password).find()) return "⚠️ Medium (No Special Characters)";

        return "✅ Strong (Secure)";
    }

    private static boolean isCommonPassword(String password) {
        try {
            List<String> commonPasswords = Files.readAllLines(Paths.get(COMMON_PASSWORDS_FILE));
            return commonPasswords.contains(password);
        } catch (IOException e) {
            System.out.println("❌ Error reading common passwords file.");
            return false;
        }
    }
}
