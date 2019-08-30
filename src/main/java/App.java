import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to caesar-cipher, this is an encryption software \n" +
                "\nEnter a word and the number of shift you would like to switch each letter to:\n" +
                "\nEnter a word :");
        String word = scanner.nextLine();
        System.out.println("Enter number of shift(s) :");
        int shift = scanner.nextInt();
        Cipher encryption = new Cipher(word,shift);
        String encrypted = Cipher.encrypt(encryption);

        System.out.println("Encryption version :" + encrypted);
        Cipher decryption = new Cipher(encrypted,shift);
        String decrypted = Cipher.decrypt(decryption);
        System.out.println("Decrypted version : " + decrypted);
    }
}

