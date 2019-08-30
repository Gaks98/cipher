public class Cipher {
    private String mPlainText;
    private int mShift;
    private String cipherText;
    private  String decryptMessage ;

    public Cipher(String plainText, int shift) {
        mPlainText = plainText;
        mShift = shift;
        cipherText = "";
        decryptMessage = "";
    }

    public String getmPlainText() {
        return mPlainText;
    }

    public int getmShift() {
        return mShift;
    }

    public static String encrypt(Cipher cipher) {
        char alphabet;

        for (int i = 0; i < cipher.mPlainText.length(); i++) {
            //shift one character at a time.
            alphabet = cipher.mPlainText.charAt(i);

            // if alphabet lies between a and z
            if (alphabet >= 'a' && alphabet <= 'z') {
                //shift the alphabet
                alphabet = (char) (alphabet + cipher.mShift);

                //or if alphabet is more than 'z' :
                if (alphabet > 'z') {
                    // re-shift to starting position
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                cipher.cipherText = cipher.cipherText + alphabet;
            }
            // if alphabet lies between A and Z
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + cipher.mShift);

                // or if alphabet is more than 'Z' :
                if (alphabet>'Z'){
                    // re-shift to starting position
                    alphabet = (char)(alphabet + 'A'- 'Z' - 1);
                }
                cipher.cipherText = cipher.cipherText + alphabet;
            }
            else {
                cipher.cipherText = cipher.cipherText + alphabet;
            }
        }
        return cipher.cipherText;
    }

    //DECRYPT
    public String decrypt(Cipher cipher){
        return decryptMessage;
    }
}