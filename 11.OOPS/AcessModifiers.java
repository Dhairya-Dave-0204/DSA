public class AcessModifiers {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.username = "john_doe";
        // account.password = qwertyuiop; // This line would cause an error because password is private
        account.setPassword("securePassword123"); // Correct way to set the password
    }
}

class BankAccount {
    String username;
    private String password;

    public void setPassword(String newPassword) {
        password = newPassword;
    }
}
