import static org.junit.Assert.*;

import org.junit.Test;

import com.gcbootcamp.midterm1.Decryption;
import com.gcbootcamp.midterm1.EncrytionMain;

public class EncryptionTest {

	@Test
	public void shouldEncryptMessage() {
		char[] returnedvalue = Decryption.decryptMessage(6,"abcde");
		String newString = new String(returnedvalue);
		assertEquals("ghijk", newString);
	}

}
