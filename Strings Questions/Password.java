//criterias to be fulfilled
// 1. password must have atleast 8 characters.
// 2. password must contain only letters and digits.
// 3. password must contain atleast 2 digits.

public class Password {
    public static void main(String[] args) {
        String password = "yashraj12";

        // Check minimum length
        if (password.length() < 8) {
            System.out.println("Invalid Password. A password must contain at least 8 characters.");
            return;
        }

        // Check for valid characters and count digits
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check if character is not a letter or digit
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("Invalid Password. A password can contain only letters and digits.");
                return;
            }

            // Count digits
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Check if there are at least 2 digits
        if (digitCount < 2) {
            System.out.println("Invalid Password. A password must contain at least 2 digits.");
        } else {
            System.out.println("Password Generated.");
        }
    }
}
