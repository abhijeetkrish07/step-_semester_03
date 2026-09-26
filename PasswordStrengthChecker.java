public class PasswordStrengthChecker {

    // Private password - cannot be accessed directly
    private final String password;

    // Constructor
    public PasswordStrengthChecker(String password) {
        this.password = password;
    }

    // Returns only the strength, never the password
    public String getStrength() {

        int length = password.length();

        if (length < 6) {
            return "Weak";
        } 
        else if (length <= 9) {
            return "Medium";
        } 
        else {
            return "Strong";
        }
    }

    public static void main(String[] args) {

        PasswordStrengthChecker pc =
                new PasswordStrengthChecker("abcd");

        PasswordStrengthChecker pc2 =
                new PasswordStrengthChecker("abcdefghij");

        PasswordStrengthChecker pc3 =
                new PasswordStrengthChecker("abcdefghijkl");

        System.out.println(pc.getStrength());
        System.out.println(pc2.getStrength());
        System.out.println(pc3.getStrength());
    }
}
