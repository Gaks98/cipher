import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to caesar-cipher, this is an encryption software \n" +
                "enter a word and the number of shift you would like to switch each letter to:\n" +
                "Enter word ");
        String word = scanner.nextLine();
        System.out.println("Enter shift :");
        int shift = scanner.nextInt();
        Cipher cipher = new Cipher(word,shift);

        System.out.println("Encryption version :" + cipher.encrypt(cipher));
//        System.out.println("Decrypted version : " + cipher.decrypt(cipher.encrypt(plainText)));
    }
}

