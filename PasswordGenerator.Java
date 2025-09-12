import java.util.*;
import java.security.SecureRandom;

public class password_generator {

    String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String DIGITS = "0123456789";
    String SPECIALS = "!@#$%^&*()-_=+[]{}|;:,.<>?/";

    int num_Lchar, num_uchar, num_digits, num_spec;

    StringBuilder sort_pass = new StringBuilder();
    StringBuilder main_pass = new StringBuilder();

    SecureRandom random = new SecureRandom();
    Scanner sc = new Scanner(System.in);

    void makePassString() {
        System.out.print("Number of lowercase letters: ");
        num_Lchar = sc.nextInt();

        System.out.print("Number of uppercase letters: ");
        num_uchar = sc.nextInt();

        System.out.print("Number of digits: ");
        num_digits = sc.nextInt();

        System.out.print("Number of special characters: ");
        num_spec = sc.nextInt();

        for (int i = 0; i < num_Lchar; i++) {
            sort_pass.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        }

        for (int i = 0; i < num_uchar; i++) {
            sort_pass.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        }

        for (int i = 0; i < num_digits; i++) {
            sort_pass.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        }

        for (int i = 0; i < num_spec; i++) {
            sort_pass.append(SPECIALS.charAt(random.nextInt(SPECIALS.length())));
        }

        while (sort_pass.length() > 0) {
            int index = random.nextInt(sort_pass.length());
            main_pass.append(sort_pass.charAt(index));
            sort_pass.deleteCharAt(index);
        }

        System.out.println(main_pass);
    }

    public static void main(String[] args) {
        password_generator pg = new password_generator();
        pg.makePassString();
    }
}