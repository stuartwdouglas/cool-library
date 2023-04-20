package org.coollibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoolStuffTest {

    @Test
    public void testSayHello() {
        Assertions.assertEquals("Hello", DoCoolStuff.sayHello());
    }

    @Test
    public void testSayGoodbye() {
        Assertions.assertEquals("Goodbye", DoCoolStuff.sayGoodbye());
    }
}
