import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MultiplerTest {

    @Test
    public void testMultiplyBy() throws Exception {
        // given
        Multipler multipler = new Multipler(3);

        // when
        int result = multipler.multiplyBy(7);

        // then
        assertEquals(result, 21);
    }
}