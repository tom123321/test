import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class SubstractorTest {

    @Test
    public void testSubstractBy() throws Exception {
        // given
        Substractor substractor = new Substractor(10);

        // when
        int result = substractor.substractBy(12);

        // then
        assertEquals(result, -2);
    }
}