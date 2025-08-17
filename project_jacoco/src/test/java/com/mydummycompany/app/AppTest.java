package com.mydummycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello World!", App.getMessage());
    }
}

