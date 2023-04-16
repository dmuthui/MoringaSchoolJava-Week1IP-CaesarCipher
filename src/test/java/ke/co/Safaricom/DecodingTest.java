package ke.co.Safaricom;

import ke.co.Safaricom.Decoding;
import ke.co.Safaricom.Encoding;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {

    //Logic to test if Decoding code is working as required
    @Test
    @DisplayName("Decoding works as required")
    void decode() {
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", Decoding.decode("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23));
        assertEquals("B@#", Encoding.encode("A@#", 1));

    }
}