import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AdderTest {

    @Test
    public void testSumWith() throws Exception {
        // given
        Adder adder = new Adder(2);

        // when
        int result = adder.sumWith(10);

        // then
        assertEquals( result, 12 );
    }
}