public class Cipher {
    private String mPlainText;
    private int mShift;

    public Cipher(String plainText,int shift){
        mPlainText = plainText;
        mShift = shift;
    }

    public String getmPlainText() {
        return mPlainText;
    }

    public int getmShift() {
        return mShift;
    }

    public static String encrypt(Cipher cipher) {
        char alphabet;

        for (int i = 0; i<cipher.mPlainText.length(); i++) {
            //shift one character at a time.
//            alphabet = cipher.mPlainText.charAt(i);
        }
    }
}
