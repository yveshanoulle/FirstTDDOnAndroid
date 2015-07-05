package be.hanoulle.android.firsttddonandroid.core;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
@Test
public void testHelloWorld() throws Exception {
    assertEquals("42", new HelloWorld().message());
}
    @Test
    public void testSum2And3( ) throws Exception {
        assertEquals(5, new HelloWorld().sum(2,3));
    }
    @Test
    public void testSum3And4( ) throws Exception {
        assertEquals(7, new HelloWorld().sum(3,4));
    }


}
