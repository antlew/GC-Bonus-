import static org.junit.Assert.*;

import org.junit.Test;

import com.gcbootcamp.midterm1.Encryption;

public class EncryptionTest {

	@Test
	public void shouldEncryptMessage() {
		char[] returnedvalue = Encryption.encryptMessage(6,"abcde");
		String newString = new String(returnedvalue);
		assertEquals("ghijk", newString);
	}

}
