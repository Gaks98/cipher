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

    }
}
