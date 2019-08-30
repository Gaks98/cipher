import org.junit.*;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void Cipher_instantiatesCorrectly_true() {
        Cipher testCipher = new Cipher("hello",3);
        assertEquals(true,testCipher instanceof Cipher);
    }

    @Test
    public void getmPlainText_getsPlainText_true() {
        Cipher testCipher = new Cipher("hello",3);
        assertEquals("hello", testCipher.getmPlainText());
    }

    @Test
    public void getmShift_getsShift_3() {
        Cipher testCipher = new Cipher("hello",3);
        assertEquals(3, testCipher.getmShift());
    }

    @Test
    public void encrypt_returnsEncryptedString_String() {
        Cipher testCaesar = new Cipher("name",1);
        assertEquals("obnf", Cipher.encrypt(testCaesar));
    }

    @Test
    public void decrypt_returnsString_name () {
        Cipher testCaesar = new Cipher("obnf",1);
        assertEquals("name",Cipher.decrypt(testCaesar));
    }
}