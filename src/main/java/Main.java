import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String generatePassword(int size) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-/.,<>?;':\\\"[]{}\\\\|";

        String password = "";
        Random random = new Random();

        while (password.length() < size) {
            int index = (int) (random.nextFloat() * characters.length());
            password += characters.charAt(index);
        }
        return password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of password: ");
        int size = scanner.nextInt();

        String password = generatePassword(size);
        System.out.println(password);
    }
}
