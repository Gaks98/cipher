import org.junit.*;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void Cipher_instantiatesCorrectly_true() {
        Cipher testCipher = new Cipher("hello",3);
        assertEquals(true,testCipher instanceof Cipher);
    }

    @Test
    public void CipherInstantiatesWithPlainText_true() {
        Cipher testCipher = new Cipher("hello",3);
        assertEquals("hello", testCipher.getmPlainText());
    }

    @Test
    public void CipherInstantiatesWithShift_true() {
        Cipher testCipher = new Cipher("hello",3);
        assertEquals(3, testCipher.getmShift());
    }
}